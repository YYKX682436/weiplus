package ak0;

/* loaded from: classes11.dex */
public abstract class g {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ak0.e a(java.io.File r5) {
        /*
            r0 = 0
            if (r5 == 0) goto L50
            boolean r1 = r5.isFile()
            if (r1 == 0) goto L50
            long r1 = r5.length()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L14
            goto L50
        L14:
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> L50
            r1.<init>(r5)     // Catch: java.io.IOException -> L50
            java.lang.String r5 = "assets/package_meta.txt"
            java.util.zip.ZipEntry r5 = r1.getEntry(r5)     // Catch: java.lang.Throwable -> L46
            if (r5 != 0) goto L25
            r1.close()     // Catch: java.io.IOException -> L50
            goto L50
        L25:
            java.io.InputStream r5 = r1.getInputStream(r5)     // Catch: java.lang.Throwable -> L46
            java.util.Properties r2 = new java.util.Properties     // Catch: java.lang.Throwable -> L3a
            r2.<init>()     // Catch: java.lang.Throwable -> L3a
            r2.load(r5)     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L36
            r5.close()     // Catch: java.lang.Throwable -> L46
        L36:
            r1.close()     // Catch: java.io.IOException -> L50
            goto L51
        L3a:
            r2 = move-exception
            if (r5 == 0) goto L45
            r5.close()     // Catch: java.lang.Throwable -> L41
            goto L45
        L41:
            r5 = move-exception
            r2.addSuppressed(r5)     // Catch: java.lang.Throwable -> L46
        L45:
            throw r2     // Catch: java.lang.Throwable -> L46
        L46:
            r5 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L4b
            goto L4f
        L4b:
            r1 = move-exception
            r5.addSuppressed(r1)     // Catch: java.io.IOException -> L50
        L4f:
            throw r5     // Catch: java.io.IOException -> L50
        L50:
            r2 = r0
        L51:
            if (r2 != 0) goto L54
            return r0
        L54:
            ak0.f r5 = new ak0.f
            r5.<init>(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ak0.g.a(java.io.File):ak0.e");
    }
}
