package gs4;

/* loaded from: classes8.dex */
public abstract class y {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0032, code lost:
    
        if (r1 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(java.lang.String r5) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L2b
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L29
            int r2 = r1.available()     // Catch: java.lang.Throwable -> L29
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L29
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2d
        L13:
            int r3 = r1.read(r2)     // Catch: java.lang.Throwable -> L2d
            if (r3 < 0) goto L1e
            r4 = 0
            r5.write(r2, r4, r3)     // Catch: java.lang.Throwable -> L2d
            goto L13
        L1e:
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.Throwable -> L2d
            r5.close()     // Catch: java.io.IOException -> L25
        L25:
            r1.close()     // Catch: java.io.IOException -> L35
            goto L35
        L29:
            r5 = r0
            goto L2d
        L2b:
            r5 = r0
            r1 = r5
        L2d:
            if (r5 == 0) goto L32
            r5.close()     // Catch: java.io.IOException -> L32
        L32:
            if (r1 == 0) goto L35
            goto L25
        L35:
            if (r0 == 0) goto L38
            goto L3e
        L38:
            java.lang.String r5 = ""
            byte[] r0 = r5.getBytes()
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gs4.y.a(java.lang.String):byte[]");
    }

    public static java.lang.String b() {
        byte[] a17;
        java.io.File file = new java.io.File(android.os.Environment.getExternalStorageDirectory().getAbsolutePath() + java.io.File.separator + android.os.Environment.DIRECTORY_DOWNLOADS + "/.tmfs/sk_g.dat");
        return (!file.exists() || (a17 = a(file.getAbsolutePath())) == null || a17.length <= 0) ? "" : new java.lang.String(a17);
    }

    public static java.lang.String c() {
        byte[] a17;
        java.io.File file = new java.io.File(android.os.Environment.getExternalStorageDirectory().getAbsolutePath() + "/com.tencent.qqpimsecure_TMF_4_C/files/sk_g.dat");
        return (file.exists() && (a17 = a(file.getAbsolutePath())) != null && a17.length > 0) ? new java.lang.String(a17) : "";
    }
}
