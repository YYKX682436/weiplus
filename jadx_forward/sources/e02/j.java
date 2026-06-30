package e02;

/* loaded from: classes13.dex */
public abstract class j {
    public static void a(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str) {
        e02.a aVar;
        if (r6Var == null || str == null || str.length() <= 0) {
            throw new java.lang.RuntimeException("addChannelByV2 , param invalid, channel = " + str + " , apkFile = " + r6Var);
        }
        java.io.RandomAccessFile randomAccessFile = null;
        if (r6Var.m() && r6Var.A()) {
            try {
                java.io.RandomAccessFile B = com.p314xaae8f345.mm.vfs.w6.B(r6Var.u(), false);
                try {
                    android.util.Pair e17 = e02.e.e(B);
                    java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) e17.first;
                    long longValue = ((java.lang.Long) e17.second).longValue();
                    if (e02.p.c(B, longValue)) {
                        throw new e02.d("ZIP64 APK not supported");
                    }
                    long d17 = e02.e.d(byteBuffer, longValue);
                    android.util.Pair a17 = e02.e.a(B, d17);
                    java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate((int) (longValue - d17));
                    allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                    B.seek(d17);
                    B.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                    android.util.Pair create = android.util.Pair.create(allocate, java.lang.Long.valueOf(d17));
                    aVar = new e02.a();
                    aVar.f327378a = true;
                    aVar.f327379b = r6Var.C();
                    aVar.f327380c = a17;
                    aVar.f327381d = create;
                    aVar.f327382e = e17;
                    aVar.a();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Channel.V2SchemeUtil", "baseApk : " + r6Var.o() + "\nApkSectionInfo = " + aVar);
                    B.close();
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    randomAccessFile = B;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        } else {
            aVar = null;
        }
        java.util.Properties properties = new java.util.Properties();
        properties.putAll(new e02.i(str));
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(new byte[]{(byte) 250, (byte) 150});
            java.lang.String str2 = "";
            for (java.lang.Object obj : properties.keySet()) {
                str2 = str2 + obj + "=" + properties.getProperty((java.lang.String) obj) + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e;
            }
            byte[] bytes = str2.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            int length = bytes.length;
            byteArrayOutputStream.write(new byte[]{(byte) (length & 255), (byte) ((65280 & length) >> 8)});
            byteArrayOutputStream.write(bytes);
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Channel.GameComment", "encode, error: %s", e18.getMessage());
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(1903261812, wrap);
        if (linkedHashMap.isEmpty()) {
            throw new java.lang.RuntimeException("addIdValueByteBufferMap , id value pair is empty");
        }
        if (linkedHashMap.containsKey(1896449818)) {
            linkedHashMap.remove(1896449818);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Channel.IdValueWriter", "addIdValueByteBufferMap , new IdValueMap = " + linkedHashMap);
        java.util.Map a18 = e02.n.a((java.nio.ByteBuffer) aVar.f327380c.first);
        if (!a18.containsKey(1896449818)) {
            throw new e02.d("No APK V2 Signature Scheme block in APK Signing Block");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Channel.IdValueWriter", "addIdValueByteBufferMap , existed IdValueMap = " + a18);
        a18.putAll(linkedHashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Channel.IdValueWriter", "addIdValueByteBufferMap , final IdValueMap = " + a18);
        if (a18.isEmpty()) {
            throw new java.lang.RuntimeException("getNewApkV2SchemeBlock , id value pair is empty");
        }
        java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) a18;
        long j17 = 24;
        while (linkedHashMap2.entrySet().iterator().hasNext()) {
            j17 += ((java.nio.ByteBuffer) ((java.util.Map.Entry) r0.next()).getValue()).remaining() + 12;
        }
        java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate((int) (8 + j17));
        allocate2.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocate2.putLong(j17);
        for (java.util.Map.Entry entry : linkedHashMap2.entrySet()) {
            java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) entry.getValue();
            allocate2.putLong(byteBuffer2.remaining() + 4);
            allocate2.putInt(((java.lang.Integer) entry.getKey()).intValue());
            allocate2.put(byteBuffer2.array(), byteBuffer2.arrayOffset() + byteBuffer2.position(), byteBuffer2.remaining());
        }
        allocate2.putLong(j17);
        allocate2.putLong(2334950737559900225L);
        allocate2.putLong(3617552046287187010L);
        if (allocate2.remaining() > 0) {
            throw new java.lang.RuntimeException("generateNewApkV2SchemeBlock error");
        }
        allocate2.flip();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Channel.IdValueWriter", "addIdValueByteBufferMap , oldApkSigningBlock size = " + ((java.nio.ByteBuffer) aVar.f327380c.first).remaining() + " , newApkSigningBlock size = " + allocate2.remaining());
        android.util.Pair pair = aVar.f327381d;
        java.nio.ByteBuffer byteBuffer3 = (java.nio.ByteBuffer) pair.first;
        java.nio.ByteBuffer byteBuffer4 = (java.nio.ByteBuffer) aVar.f327382e.first;
        long longValue2 = ((java.lang.Long) pair.second).longValue();
        long remaining = allocate2.remaining() - ((java.nio.ByteBuffer) aVar.f327380c.first).remaining();
        e02.p.d(byteBuffer4, longValue2 + remaining);
        long j18 = aVar.f327379b + remaining;
        try {
            java.io.RandomAccessFile B2 = com.p314xaae8f345.mm.vfs.w6.B(r6Var.u(), true);
            try {
                if (!aVar.f327378a) {
                    throw null;
                }
                B2.seek(((java.lang.Long) aVar.f327380c.second).longValue());
                B2.write(allocate2.array(), allocate2.arrayOffset() + allocate2.position(), allocate2.remaining());
                B2.write(byteBuffer3.array(), byteBuffer3.arrayOffset() + byteBuffer3.position(), byteBuffer3.remaining());
                B2.write(byteBuffer4.array(), byteBuffer4.arrayOffset() + byteBuffer4.position(), byteBuffer4.remaining());
                if (B2.getFilePointer() != j18) {
                    throw new java.lang.RuntimeException("after addIdValueByteBufferMap , file size wrong , FilePointer : " + B2.getFilePointer() + ", apkLength : " + j18);
                }
                B2.setLength(j18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Channel.IdValueWriter", "addIdValueByteBufferMap , after add channel , new apk is " + r6Var.o() + " , length = " + r6Var.C());
                e02.p.d(byteBuffer4, longValue2);
                B2.close();
            } catch (java.lang.Throwable th8) {
                th = th8;
                randomAccessFile = B2;
                e02.p.d(byteBuffer4, longValue2);
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
        }
    }
}
