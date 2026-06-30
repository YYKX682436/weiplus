package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f178621a = new java.util.HashSet();

    public static boolean a(java.lang.String str, java.util.LinkedList linkedList) {
        int read;
        boolean z17 = false;
        java.io.RandomAccessFile randomAccessFile = null;
        try {
            try {
                randomAccessFile = com.p314xaae8f345.mm.vfs.w6.A(com.p314xaae8f345.mm.vfs.z7.a(str), false);
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                java.util.Iterator it = linkedList.iterator();
                try {
                    while (it.hasNext()) {
                        d02.a aVar = (d02.a) it.next();
                        randomAccessFile.seek(aVar.f306802d);
                        long j17 = (aVar.f306803e - aVar.f306802d) + 1;
                        int min = (int) java.lang.Math.min(2048L, j17);
                        byte[] bArr = new byte[min];
                        while (j17 > 0 && (read = randomAccessFile.read(bArr, 0, (int) java.lang.Math.min(min, j17))) >= 0) {
                            j17 -= read;
                            messageDigest.update(bArr, 0, read);
                        }
                        byte[] digest = messageDigest.digest();
                        if (digest != null) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(32);
                            for (byte b17 : digest) {
                                sb6.append(java.lang.Integer.toString((b17 & 255) + 256, 16).substring(1));
                            }
                            if (sb6.toString().trim().equals(aVar.f306804f)) {
                            }
                            break;
                        }
                    }
                    break;
                    randomAccessFile.close();
                } catch (java.io.IOException unused) {
                }
                z17 = true;
                return z17;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FileDownloadMD5Manager", e17, "", new java.lang.Object[0]);
                if (randomAccessFile == null) {
                    return true;
                }
                try {
                    randomAccessFile.close();
                    return true;
                } catch (java.io.IOException unused2) {
                    return true;
                }
            }
        } catch (java.lang.Throwable th6) {
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (java.io.IOException unused3) {
                }
            }
            throw th6;
        }
    }

    public static boolean b(h02.a aVar) {
        if (aVar != null && aVar.f68434x671f82e6 != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            d02.q qVar = new d02.q();
            try {
                qVar.mo11468x92b714fd(aVar.f68434x671f82e6);
                boolean a17 = a(aVar.f68419xf1e9b966, qVar.f306889d);
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadMD5Manager", "sectionMd5Check, costTime = %d, ret = %b", java.lang.Long.valueOf(currentTimeMillis2), java.lang.Boolean.valueOf(a17));
                g02.b.c(111, new g02.c(aVar.f68404x28d45f97, aVar.f68408x32b20428, "", currentTimeMillis2, aVar.f68431x4651c731 ? 1 : 0));
                return a17;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FileDownloadMD5Manager", e17, "", new java.lang.Object[0]);
            }
        }
        return true;
    }
}
