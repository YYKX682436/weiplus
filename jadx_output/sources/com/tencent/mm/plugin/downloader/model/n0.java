package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f97088a = new java.util.HashSet();

    public static boolean a(java.lang.String str, java.util.LinkedList linkedList) {
        int read;
        boolean z17 = false;
        java.io.RandomAccessFile randomAccessFile = null;
        try {
            try {
                randomAccessFile = com.tencent.mm.vfs.w6.A(com.tencent.mm.vfs.z7.a(str), false);
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                java.util.Iterator it = linkedList.iterator();
                try {
                    while (it.hasNext()) {
                        d02.a aVar = (d02.a) it.next();
                        randomAccessFile.seek(aVar.f225269d);
                        long j17 = (aVar.f225270e - aVar.f225269d) + 1;
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
                            if (sb6.toString().trim().equals(aVar.f225271f)) {
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
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FileDownloadMD5Manager", e17, "", new java.lang.Object[0]);
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
        if (aVar != null && aVar.field_sectionMd5Byte != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            d02.q qVar = new d02.q();
            try {
                qVar.parseFrom(aVar.field_sectionMd5Byte);
                boolean a17 = a(aVar.field_filePath, qVar.f225356d);
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadMD5Manager", "sectionMd5Check, costTime = %d, ret = %b", java.lang.Long.valueOf(currentTimeMillis2), java.lang.Boolean.valueOf(a17));
                g02.b.c(111, new g02.c(aVar.field_appId, aVar.field_downloadId, "", currentTimeMillis2, aVar.field_reserveInWifi ? 1 : 0));
                return a17;
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FileDownloadMD5Manager", e17, "", new java.lang.Object[0]);
            }
        }
        return true;
    }
}
