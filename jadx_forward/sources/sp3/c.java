package sp3;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (java.lang.Long.valueOf(r3[0], 16).longValue() >= 3221225472L) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        r2.close();
        r0 = 4;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r7 = this;
            java.lang.String r0 = "[MEM] detectMaps"
            java.lang.String r1 = "MicroMsg.performance.Utils"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            r0 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L66
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L66
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L66
            java.lang.String r5 = "/proc/self/maps"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L66
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L66
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L66
        L19:
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L58
            java.lang.String r4 = "[stack]"
            boolean r4 = r3.endsWith(r4)     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L19
            java.lang.String r4 = " "
            java.lang.String[] r3 = r3.split(r4)     // Catch: java.lang.Throwable -> L5c
            int r4 = r3.length     // Catch: java.lang.Throwable -> L5c
            r5 = 1
            if (r4 < r5) goto L19
            r3 = r3[r0]     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = "-"
            java.lang.String[] r3 = r3.split(r4)     // Catch: java.lang.Throwable -> L5c
            int r4 = r3.length     // Catch: java.lang.Throwable -> L5c
            r5 = 2
            if (r4 != r5) goto L19
            r3 = r3[r0]     // Catch: java.lang.Throwable -> L5c
            r4 = 16
            java.lang.Long r3 = java.lang.Long.valueOf(r3, r4)     // Catch: java.lang.Throwable -> L5c
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L5c
            r5 = 3221225472(0xc0000000, double:1.591496843E-314)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L53
            goto L58
        L53:
            r2.close()     // Catch: java.lang.Throwable -> L66
            r0 = 4
            goto L6f
        L58:
            r2.close()     // Catch: java.lang.Throwable -> L66
            goto L6e
        L5c:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L61
            goto L65
        L61:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: java.lang.Throwable -> L66
        L65:
            throw r3     // Catch: java.lang.Throwable -> L66
        L66:
            r2 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = "MEM detectMaps failed"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r2, r3, r0)
        L6e:
            r0 = 3
        L6f:
            sp3.d.f492842c = r0
            com.tencent.mm.sdk.platformtools.o4 r0 = sp3.d.f492840a
            java.lang.String r2 = sp3.d.f492841b
            int r3 = sp3.d.f492842c
            r0.A(r2, r3)
            int r0 = sp3.d.f492842c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "[MEM] detectMaps = %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sp3.c.run():void");
    }
}
