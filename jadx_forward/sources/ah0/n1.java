package ah0;

/* loaded from: classes.dex */
public class n1 implements gm0.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f86301d;

    public n1() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f86301d = hashMap;
        hashMap.put(-408809340, new ah0.i1(this));
        hashMap.put(-1530979959, new ah0.j1(this));
        hashMap.put(-556471228, new ah0.k1(this));
        hashMap.put(67360848, new ah0.l1(this));
        hashMap.put(-734313669, new ah0.m1(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    @Override // gm0.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.HashMap U5() {
        /*
            r14 = this;
            gm0.a0 r0 = gm0.j1.p()
            km0.b r0 = r0.a()
            android.app.Application r1 = r0.f390522c
            java.lang.String r2 = "abi64_webview_compat_sp"
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            java.lang.String r2 = "last_is_32bit_wechat"
            int r4 = r1.getInt(r2, r3)
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L1f
            r8 = r6
            goto L20
        L1f:
            r8 = r7
        L20:
            java.lang.String r9 = "MicroMsg.XWeb.PluginWebView"
            if (r5 != 0) goto L2f
            if (r4 == r6) goto L2d
            java.lang.String r0 = "Still 32Bit"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r0)
            goto Lcd
        L2d:
            r4 = r3
            goto L39
        L2f:
            if (r4 != r6) goto L38
            java.lang.String r0 = "Still 64Bit"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r0)
            goto Lcd
        L38:
            r4 = r7
        L39:
            android.app.Application r5 = r0.f390522c
            java.lang.String r6 = "/app_x5webview/GPUCache"
            java.lang.String r10 = "/app_webview/GPUCache"
            com.tencent.mm.vfs.r6 r11 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Throwable -> L90
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r12.<init>()     // Catch: java.lang.Throwable -> L90
            java.io.File r13 = r5.getFilesDir()     // Catch: java.lang.Throwable -> L90
            java.lang.String r13 = r13.getParent()     // Catch: java.lang.Throwable -> L90
            r12.append(r13)     // Catch: java.lang.Throwable -> L90
            r12.append(r10)     // Catch: java.lang.Throwable -> L90
            java.lang.String r10 = r12.toString()     // Catch: java.lang.Throwable -> L90
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L90
            hy4.a.a(r11)     // Catch: java.lang.Throwable -> L90
            com.tencent.mm.vfs.r6 r10 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Throwable -> L90
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r11.<init>()     // Catch: java.lang.Throwable -> L90
            java.io.File r12 = r5.getFilesDir()     // Catch: java.lang.Throwable -> L90
            java.lang.String r12 = r12.getParent()     // Catch: java.lang.Throwable -> L90
            r11.append(r12)     // Catch: java.lang.Throwable -> L90
            r11.append(r6)     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = r11.toString()     // Catch: java.lang.Throwable -> L90
            r10.<init>(r6)     // Catch: java.lang.Throwable -> L90
            hy4.a.a(r10)     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = "WebViewChromiumPrefs"
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r6, r3)     // Catch: java.lang.Throwable -> L90
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Throwable -> L90
            android.content.SharedPreferences$Editor r5 = r5.clear()     // Catch: java.lang.Throwable -> L90
            r5.apply()     // Catch: java.lang.Throwable -> L90
            r3 = r7
            goto L9a
        L90:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r7 = "MicroMsg.ABI64WebViewCompat"
            java.lang.String r10 = ""
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r7, r5, r10, r6)
        L9a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r6 = "result %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r6, r5)
            if (r3 == 0) goto Lb4
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences$Editor r1 = r1.putInt(r2, r8)
            r1.commit()
        Lb4:
            if (r4 == 0) goto Lb9
            r1 = 8
            goto Lbb
        Lb9:
            r1 = 9
        Lbb:
            boolean r0 = r0.a()
            if (r0 == 0) goto Lcd
            gm0.j1 r0 = gm0.j1.i()
            cw4.p r2 = new cw4.p
            r2.<init>(r1)
            r0.c(r2)
        Lcd:
            java.util.HashMap r0 = r14.f86301d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ah0.n1.U5():java.util.HashMap");
    }
}
