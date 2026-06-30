package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2;

/* renamed from: com.tencent.mm.plugin.appbrand.game.WAGameMISSignatureManager */
/* loaded from: classes7.dex */
public class C11874x3ec834d0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f159729a;

    /* renamed from: b, reason: collision with root package name */
    public long f159730b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f159731c = false;

    public C11874x3ec834d0(r45.td7 td7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f159729a = new java.lang.ref.WeakReference(c11510xdd90c2f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ca A[Catch: all -> 0x0108, TryCatch #2 {all -> 0x0108, blocks: (B:65:0x0029, B:67:0x002f, B:69:0x0039, B:72:0x0049, B:74:0x0059, B:75:0x005f, B:77:0x0077, B:79:0x0080, B:81:0x00b6, B:83:0x00bc, B:85:0x00ca, B:86:0x00d1, B:89:0x00f8, B:92:0x00fd, B:93:0x0100, B:94:0x0085, B:96:0x008c, B:98:0x0097, B:100:0x00a4, B:102:0x0101, B:88:0x00e7), top: B:64:0x0029, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d1 A[Catch: all -> 0x0108, TRY_LEAVE, TryCatch #2 {all -> 0x0108, blocks: (B:65:0x0029, B:67:0x002f, B:69:0x0039, B:72:0x0049, B:74:0x0059, B:75:0x005f, B:77:0x0077, B:79:0x0080, B:81:0x00b6, B:83:0x00bc, B:85:0x00ca, B:86:0x00d1, B:89:0x00f8, B:92:0x00fd, B:93:0x0100, B:94:0x0085, B:96:0x008c, B:98:0x0097, B:100:0x00a4, B:102:0x0101, B:88:0x00e7), top: B:64:0x0029, inners: #3 }] */
    /* renamed from: captureScreen */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m50337x73fd6752(java.lang.Object r10, java.lang.String r11, int r12, int r13, byte[] r14, byte[] r15) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.C11874x3ec834d0.m50337x73fd6752(java.lang.Object, java.lang.String, int, int, byte[], byte[]):void");
    }

    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, java.lang.String str, byte[] bArr, int i17, int i18, int i19) {
        if (c11510xdd90c2f2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WAGameMISSignatureManager", "uploadSingleSlice: runtime is null");
            return;
        }
        try {
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new r45.sq5();
            lVar.f152198b = new r45.tq5();
            lVar.f152200d = 12630;
            lVar.f152199c = "/cgi-bin/mmgame-bin/reportserverdata";
            lVar.f152201e = 0;
            lVar.f152202f = 0;
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            r45.sq5 sq5Var = (r45.sq5) a17.f152243a.f152217a;
            sq5Var.f467459d = new java.util.LinkedList();
            r45.d73 d73Var = new r45.d73();
            d73Var.f453727d = c11510xdd90c2f2.f156336n;
            d73Var.f453729f = c11510xdd90c2f2.E0().f387385r.f156932d;
            d73Var.f453728e = c11510xdd90c2f2.E0().f387385r.f33456x1c82a56c;
            d73Var.f453732i = str;
            d73Var.f453730g = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
            sq5Var.f467459d.add(d73Var);
            ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new fa1.b0(i17, i18));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WAGameMISSignatureManager", "uploadSingleSlice: exception", th6);
        }
    }

    /* renamed from: nativeCreate */
    private native long m50338x73c02ff3(java.lang.Object obj, int i17, int i18, int i19, int i27);

    /* renamed from: nativeDestroy */
    private native void m50339x23caefe3(long j17);

    /* renamed from: nativeInvoke */
    private native byte[] m50340x7dccd36f(long j17, java.lang.String str, byte[] bArr);

    /* renamed from: nativePause */
    private native void m50341x67845c1f(long j17);

    /* renamed from: nativeResume */
    private native void m50342x8ca85724(long j17);

    /* renamed from: postData */
    public static void m50343x2d17ac6a(int i17, byte[] bArr, java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.C11874x3ec834d0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.C11874x3ec834d0 c11874x3ec834d0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.C11874x3ec834d0) obj;
            synchronized (c11874x3ec834d0) {
                long j17 = c11874x3ec834d0.f159730b;
                if (j17 == 0) {
                    return;
                }
                com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x xVar = (com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class);
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar.f152197a = new r45.dq5();
                lVar.f152198b = new r45.eq5();
                lVar.f152200d = 26874;
                lVar.f152199c = "/cgi-bin/mmgame-bin/reportmisfeaturedata";
                lVar.f152201e = 0;
                lVar.f152202f = 0;
                com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
                r45.dq5 dq5Var = (r45.dq5) a17.f152243a.f152217a;
                dq5Var.f454200d = new java.util.LinkedList();
                r45.xm4 xm4Var = new r45.xm4();
                xm4Var.f471769d = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) c11874x3ec834d0.f159729a.get()).f156336n;
                xm4Var.f471771f = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) c11874x3ec834d0.f159729a.get()).E0().f387385r.f156932d;
                xm4Var.f471770e = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) c11874x3ec834d0.f159729a.get()).E0().f387385r.f33456x1c82a56c;
                xm4Var.f471774i = "MD";
                xm4Var.f471772g = i17;
                xm4Var.f471773h = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
                dq5Var.f454200d.add(xm4Var);
                ((h80.i) xVar).wi(a17, new fa1.z(c11874x3ec834d0, j17, i17));
            }
        }
    }

    public boolean a(r45.td7 td7Var) {
        boolean z17 = this.f159731c;
        if (!z17 || this.f159730b != 0) {
            return z17 && this.f159730b != 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) this.f159729a.get();
        if (c11510xdd90c2f2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WAGameMISSignatureManager", "initNativeHandle: runtime is null (GC'd)");
            return false;
        }
        this.f159730b = m50338x73c02ff3(c11510xdd90c2f2, td7Var.f467867f, td7Var.f467866e, td7Var.f467868g, td7Var.f467869h);
        int i17 = c11510xdd90c2f2.E0().f387385r.f33456x1c82a56c;
        java.lang.String str = td7Var.f467870i;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.nio.ByteBuffer order = java.nio.ByteBuffer.allocate(5).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        order.put((byte) 1);
        order.putInt(i17);
        linkedHashMap.put("gameVersion", order.array());
        byte[] bytes = str != null ? str.getBytes(java.nio.charset.StandardCharsets.UTF_8) : new byte[0];
        byte[] bArr = new byte[bytes.length + 1];
        bArr[0] = 6;
        java.lang.System.arraycopy(bytes, 0, bArr, 1, bytes.length);
        linkedHashMap.put("functionsName", bArr);
        int i18 = 4;
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            i18 += ((java.lang.String) entry.getKey()).getBytes(java.nio.charset.StandardCharsets.UTF_8).length + 2 + 1 + 4 + (((byte[]) entry.getValue()).length - 1);
        }
        java.nio.ByteBuffer order2 = java.nio.ByteBuffer.allocate(i18).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        order2.putInt(linkedHashMap.size());
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            byte[] bytes2 = ((java.lang.String) entry2.getKey()).getBytes(java.nio.charset.StandardCharsets.UTF_8);
            byte[] bArr2 = (byte[]) entry2.getValue();
            order2.putShort((short) bytes2.length);
            order2.put(bytes2);
            order2.put(bArr2[0]);
            order2.putInt(bArr2.length - 1);
            if (bArr2.length > 1) {
                order2.put(bArr2, 1, bArr2.length - 1);
            }
        }
        byte[] m50340x7dccd36f = m50340x7dccd36f(this.f159730b, "setPkgInfo", order2.array());
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        if (m50340x7dccd36f != null && m50340x7dccd36f.length >= 4) {
            try {
                java.nio.ByteBuffer order3 = java.nio.ByteBuffer.wrap(m50340x7dccd36f).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                int i19 = order3.getInt();
                if (i19 >= 0 && i19 <= 10000) {
                    for (int i27 = 0; i27 < i19 && order3.remaining() >= 7; i27++) {
                        int i28 = order3.getShort() & 65535;
                        if (order3.remaining() < i28) {
                            break;
                        }
                        byte[] bArr3 = new byte[i28];
                        order3.get(bArr3);
                        byte b17 = order3.get();
                        int i29 = order3.getInt();
                        if (i29 < 0 || i29 > 10485760 || order3.remaining() < i29) {
                            break;
                        }
                        byte[] bArr4 = new byte[i29 + 1];
                        bArr4[0] = b17;
                        order3.get(bArr4, 1, i29);
                        linkedHashMap2.put(new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8), bArr4);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WAGameMISSignatureManager", "MISBundle.deserialize: invalid count=%d", java.lang.Integer.valueOf(i19));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WAGameMISSignatureManager", "MISBundle.deserialize: exception, data may be corrupted or protocol mismatch", th6);
            }
        }
        return this.f159730b != 0;
    }

    public void b() {
        long j17;
        if (this.f159731c) {
            synchronized (this) {
                j17 = this.f159730b;
                this.f159730b = 0L;
            }
            if (j17 != 0) {
                m50339x23caefe3(j17);
            }
        }
    }

    public void c() {
        if (this.f159731c) {
            synchronized (this) {
                long j17 = this.f159730b;
                if (j17 != 0) {
                    m50341x67845c1f(j17);
                }
            }
        }
    }

    public void d() {
        if (this.f159731c) {
            synchronized (this) {
                long j17 = this.f159730b;
                if (j17 != 0) {
                    m50342x8ca85724(j17);
                }
            }
        }
    }

    /* renamed from: finalize */
    public void m50344xd764dc1e() {
        try {
            b();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: nativeBindTo */
    public native void m50345x7190a28f(long j17, long j18, long j19, long j27, int i17);

    /* renamed from: nativeSignature */
    public native boolean m50346x26609261(long j17, byte[] bArr, int i17);
}
