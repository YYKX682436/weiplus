package ai;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer f5038d;

    public a(com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer gCSemiSpaceTrimmer) {
        this.f5038d = gCSemiSpaceTrimmer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        r2 = java.lang.Long.parseLong(com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer.f52657i.matcher(r5).replaceAll("").trim());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        r2 = r2 * 1024;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r8 = this;
            java.lang.String r0 = "Matrix.GCSemiSpaceTrimmer"
            com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer r1 = com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer.f52656h
            r1 = 0
            r2 = -1
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L50
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L50
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = "/proc/self/status"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L50
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L50
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L50
        L18:
            java.lang.String r5 = r4.readLine()     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L42
            java.lang.String r5 = r5.toLowerCase()     // Catch: java.lang.Throwable -> L46
            java.lang.String r6 = "vmsize"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> L46
            if (r6 == 0) goto L18
            java.util.regex.Pattern r6 = com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer.f52657i     // Catch: java.lang.Throwable -> L46
            java.util.regex.Matcher r5 = r6.matcher(r5)     // Catch: java.lang.Throwable -> L46
            java.lang.String r6 = ""
            java.lang.String r5 = r5.replaceAll(r6)     // Catch: java.lang.Throwable -> L46
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Throwable -> L46
            long r2 = java.lang.Long.parseLong(r5)     // Catch: java.lang.Throwable -> L46
            r5 = 1024(0x400, double:5.06E-321)
            long r2 = r2 * r5
        L42:
            r4.close()     // Catch: java.lang.Throwable -> L50
            goto L59
        L46:
            r5 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L4b
            goto L4f
        L4b:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch: java.lang.Throwable -> L50
        L4f:
            throw r5     // Catch: java.lang.Throwable -> L50
        L50:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r6 = "read proc status failed."
            oj.j.d(r0, r4, r6, r5)
        L59:
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer r5 = r8.f5038d
            if (r4 >= 0) goto L70
            java.lang.String r2 = "Fail to read vss size, skip checking this time."
            java.lang.Object[] r1 = new java.lang.Object[r1]
            oj.j.b(r0, r2, r1)
            android.os.Handler r0 = r5.f52663e
            long r1 = r5.f52661c
            r0.postDelayed(r8, r1)
            goto Lbe
        L70:
            float r4 = (float) r2
            float r6 = r5.f52660b
            r7 = 1333788672(0x4f800000, float:4.2949673E9)
            float r6 = r6 * r7
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto La4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            float r3 = r5.f52660b
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "VmSize usage reaches above critical level, trigger native install. vmsize: %s, critical_ratio: %s"
            oj.j.c(r0, r3, r2)
            boolean r2 = com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer.a(r5)
            if (r2 == 0) goto L9c
            java.lang.String r2 = "nativeInstall triggered successfully."
            java.lang.Object[] r1 = new java.lang.Object[r1]
            oj.j.c(r0, r2, r1)
            goto Lbe
        L9c:
            java.lang.String r2 = "Fail to trigger nativeInstall."
            java.lang.Object[] r1 = new java.lang.Object[r1]
            oj.j.c(r0, r2, r1)
            goto Lbe
        La4:
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            float r2 = r5.f52660b
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "VmSize usage is under critical level, check next time. vmsize: %s, critical_ratio: %s"
            oj.j.c(r0, r2, r1)
            android.os.Handler r0 = r5.f52663e
            long r1 = r5.f52661c
            r0.postDelayed(r8, r1)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.a.run():void");
    }
}
