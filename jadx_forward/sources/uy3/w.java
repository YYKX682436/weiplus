package uy3;

/* loaded from: classes8.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final uy3.w f513532d = new uy3.w();

    public w() {
        super(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r2.f292909y != false) goto L14;
     */
    @Override // yz5.a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo152xb9724478() {
        /*
            r8 = this;
            uy3.z r0 = uy3.z.f513535a
            monitor-enter(r0)
            java.lang.String r1 = "MicroMsg.BoxWebViewPreloadManager"
            java.lang.String r2 = "preloadBoxWebViewInner cacheWebView: %s, isDestroyed: %s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L82
            com.tencent.mm.plugin.box.webview.BoxWebView r4 = uy3.z.f513536b     // Catch: java.lang.Throwable -> L82
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L82
            com.tencent.mm.plugin.box.webview.BoxWebView r4 = uy3.z.f513536b     // Catch: java.lang.Throwable -> L82
            r6 = 0
            if (r4 == 0) goto L1b
            boolean r4 = r4.f292909y     // Catch: java.lang.Throwable -> L82
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L82
            goto L1c
        L1b:
            r4 = r6
        L1c:
            r7 = 1
            r3[r7] = r4     // Catch: java.lang.Throwable -> L82
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r3)     // Catch: java.lang.Throwable -> L82
            java.lang.Object r1 = uy3.z.f513537c     // Catch: java.lang.Throwable -> L82
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L82
            com.tencent.mm.plugin.box.webview.BoxWebView r2 = uy3.z.f513536b     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L32
            com.tencent.mm.plugin.box.webview.BoxWebView r2 = uy3.z.f513536b     // Catch: java.lang.Throwable -> L7f
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2)     // Catch: java.lang.Throwable -> L7f
            boolean r2 = r2.f292909y     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L40
        L32:
            com.tencent.mm.plugin.box.webview.BoxWebView r2 = new com.tencent.mm.plugin.box.webview.BoxWebView     // Catch: java.lang.Throwable -> L7f
            android.content.MutableContextWrapper r3 = new android.content.MutableContextWrapper     // Catch: java.lang.Throwable -> L7f
            android.content.Context r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Throwable -> L7f
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7f
            uy3.z.f513536b = r2     // Catch: java.lang.Throwable -> L7f
        L40:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L82
            monitor-exit(r0)
            com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner r0 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495
            boolean r0 = r0.mo40965x320351f8()
            if (r0 != 0) goto L5a
            com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner r0 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495
            boolean r0 = r0.mo40965x320351f8()
            if (r0 != 0) goto L5a
            com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner r0 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495
            boolean r0 = r0.mo40965x320351f8()
            if (r0 == 0) goto L5b
        L5a:
            r5 = r7
        L5b:
            boolean r0 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.b()
            if (r0 == 0) goto L7c
            boolean r0 = com.p314xaae8f345.p3210x3857dc.t1.f()
            if (r0 != 0) goto L7c
            if (r5 != 0) goto L7c
            java.lang.String r0 = "MicroMsg.BoxWebViewPreloadManager"
            java.lang.String r1 = "WebView preInitChildProcess"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            r0 = 80020(0x13894, float:1.12132E-40)
            tx5.j.d(r0, r6)
            r0 = 80019(0x13893, float:1.1213E-40)
            tx5.j.d(r0, r6)
        L7c:
            jz5.f0 r0 = jz5.f0.f384359a
            return r0
        L7f:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L82
            throw r2     // Catch: java.lang.Throwable -> L82
        L82:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uy3.w.mo152xb9724478():java.lang.Object");
    }
}
