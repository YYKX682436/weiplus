package com.tencent.mm.modelimage.loader.impr;

/* loaded from: classes12.dex */
public class f implements p11.m {
    public static byte[] d(java.io.InputStream inputStream, long j17, boolean z17) {
        byte[] bArr = new byte[1024];
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                if (!z17) {
                    inputStream.close();
                }
                return byteArray;
            }
            byteArrayOutputStream.write(bArr, 0, read);
            if (j17 > 0 && byteArrayOutputStream.size() > j17) {
                throw new java.io.IOException(java.lang.String.format("read stream over maxFileSize:%s currentSize:%s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(byteArrayOutputStream.size())));
            }
        }
    }

    public boolean a(java.lang.String str, byte[] bArr) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DefaultImageMD5CheckListener", "hy: target md5 is null or nill. check failed");
            return false;
        }
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(bArr);
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17) || !b17.equals(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check failed. original is %s, target is %s", b17, str);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check success");
        return true;
    }

    public boolean b(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DefaultImageMD5CheckListener", "hy: filePath is null. check failed");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DefaultImageMD5CheckListener", "hy: target md5 is null or nill. check failed");
            return false;
        }
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(p17) || !p17.equals(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check failed. original is %s, target is %s", p17, str);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check success");
        return true;
    }

    public boolean c(java.lang.String str, java.io.InputStream inputStream) {
        if (inputStream == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DefaultImageMD5CheckListener", "hy: inputStream is null. check failed");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DefaultImageMD5CheckListener", "hy: target md5 is null or nill. check failed");
            return false;
        }
        try {
            inputStream.mark(inputStream.available());
            java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(d(inputStream, 0L, true));
            inputStream.reset();
            if (com.tencent.mm.sdk.platformtools.t8.K0(b17) || !b17.equals(str)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check failed. original is %s, target is %s", b17, str);
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check success");
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DefaultImageMD5CheckListener", "hy: exception: " + e17.toString());
            return false;
        }
    }
}
