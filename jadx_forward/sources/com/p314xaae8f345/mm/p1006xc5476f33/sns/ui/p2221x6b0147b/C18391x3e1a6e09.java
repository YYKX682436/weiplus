package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b;

/* renamed from: com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView */
/* loaded from: classes15.dex */
public class C18391x3e1a6e09 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 {
    public final java.lang.Object K;

    public C18391x3e1a6e09(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = new java.lang.Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0092 A[Catch: Exception -> 0x0096, TRY_LEAVE, TryCatch #0 {Exception -> 0x0096, blocks: (B:3:0x0032, B:5:0x0040, B:8:0x0045, B:10:0x0051, B:12:0x0055, B:13:0x0085, B:14:0x008b, B:16:0x0092, B:21:0x005b, B:22:0x006c, B:24:0x0070, B:25:0x007b, B:26:0x0088), top: B:2:0x0032 }] */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F(android.graphics.SurfaceTexture r6, int r7, int r8) {
        /*
            r5 = this;
            java.lang.String r0 = "handleOnSurfaceTextureAvailable"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            int r2 = r5.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r6.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r4 = r5.D
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object[] r7 = new java.lang.Object[]{r2, r3, r7, r8, r4}
            java.lang.String r8 = "MicroMsg.Sns.SnsVideoPlayTextureView"
            java.lang.String r2 = "%d surface[%d] available [%d, %d] pauseByDestroyed[%b]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r2, r7)
            r7 = 0
            r5.C()     // Catch: java.lang.Exception -> L96
            android.view.Surface r2 = new android.view.Surface     // Catch: java.lang.Exception -> L96
            r2.<init>(r6)     // Catch: java.lang.Exception -> L96
            r5.f272990t = r2     // Catch: java.lang.Exception -> L96
            ph3.k r6 = r5.f272983m     // Catch: java.lang.Exception -> L96
            if (r6 == 0) goto L88
            boolean r3 = r5.f272987q     // Catch: java.lang.Exception -> L96
            if (r3 != 0) goto L45
            goto L88
        L45:
            r6.k(r2)     // Catch: java.lang.Exception -> L96
            r6 = 23
            boolean r6 = fp.h.c(r6)     // Catch: java.lang.Exception -> L96
            r2 = 1
            if (r6 == 0) goto L6c
            boolean r6 = r5.D     // Catch: java.lang.Exception -> L96
            if (r6 == 0) goto L5b
            ph3.k r6 = r5.f272983m     // Catch: java.lang.Exception -> L96
            r6.mo158546x68ac462()     // Catch: java.lang.Exception -> L96
            goto L85
        L5b:
            r5.E = r2     // Catch: java.lang.Exception -> L96
            r3 = 0
            r5.f272991u = r3     // Catch: java.lang.Exception -> L96
            ph3.k r6 = r5.f272983m     // Catch: java.lang.Exception -> L96
            r6.mo158544x764d819b(r2)     // Catch: java.lang.Exception -> L96
            ph3.k r6 = r5.f272983m     // Catch: java.lang.Exception -> L96
            r6.mo158546x68ac462()     // Catch: java.lang.Exception -> L96
            goto L85
        L6c:
            boolean r6 = r5.D     // Catch: java.lang.Exception -> L96
            if (r6 == 0) goto L7b
            ph3.k r6 = r5.f272983m     // Catch: java.lang.Exception -> L96
            int r6 = r6.l()     // Catch: java.lang.Exception -> L96
            double r3 = (double) r6     // Catch: java.lang.Exception -> L96
            r5.a(r3, r2)     // Catch: java.lang.Exception -> L96
            goto L85
        L7b:
            ph3.k r6 = r5.f272983m     // Catch: java.lang.Exception -> L96
            int r6 = r6.l()     // Catch: java.lang.Exception -> L96
            double r2 = (double) r6     // Catch: java.lang.Exception -> L96
            r5.a(r2, r7)     // Catch: java.lang.Exception -> L96
        L85:
            r5.D = r7     // Catch: java.lang.Exception -> L96
            goto L8b
        L88:
            r5.H()     // Catch: java.lang.Exception -> L96
        L8b:
            r5.J()     // Catch: java.lang.Exception -> L96
            com.tencent.mm.pluginsdk.ui.tools.d4 r6 = r5.f272996z     // Catch: java.lang.Exception -> L96
            if (r6 == 0) goto L9f
            r6.mo48230xe037649b()     // Catch: java.lang.Exception -> L96
            goto L9f
        L96:
            r6 = move-exception
            java.lang.String r2 = "onSurfaceTextureAvailable failed"
            java.lang.Object[] r7 = new java.lang.Object[r7]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r8, r6, r2, r7)
        L9f:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18391x3e1a6e09.F(android.graphics.SurfaceTexture, int, int):void");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4
    public void G(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleOnSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        if (fp.h.c(23) && this.E && this.f272991u > 0) {
            ph3.k kVar = this.f272983m;
            if (kVar != null) {
                kVar.mo158541x65825f6();
                this.f272983m.mo158544x764d819b(this.f272988r);
            }
            this.E = false;
        }
        if (this.f272991u > 0 && this.f272994x != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsVideoPlayTextureView", "%d notify surface update", java.lang.Integer.valueOf(hashCode()));
            this.f272994x.v();
            this.f272994x = null;
        }
        this.f272991u = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleOnSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4
    public void H() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsVideoPlayTextureView", "%d open video [%s]", java.lang.Integer.valueOf(hashCode()), this.f272982i);
        synchronized (this.K) {
            try {
                ph3.k kVar = this.f272983m;
                if (kVar != null) {
                    kVar.f435962g = null;
                    kVar.mo158547x360802();
                    this.f272983m.mo158543x41012807();
                    this.f272983m = null;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f272982i)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.SnsVideoPlayTextureView", "%d open video but path is null.", java.lang.Integer.valueOf(hashCode()));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                    return;
                }
                try {
                    this.f272987q = false;
                    ph3.k kVar2 = new ph3.k(android.os.Looper.getMainLooper(), false, 0);
                    this.f272983m = kVar2;
                    kVar2.h(this.f272982i);
                    ph3.k kVar3 = this.f272983m;
                    ph3.b bVar = this.A;
                    if (bVar != null) {
                        ph3.o oVar = kVar3.f435961f;
                        if (oVar != null) {
                            oVar.f435982l.f435940g = bVar;
                        }
                    } else {
                        kVar3.getClass();
                    }
                    this.f272983m.q(this.B);
                    this.f272983m.p(this.C);
                    ph3.k kVar4 = this.f272983m;
                    kVar4.f435962g = this.H;
                    kVar4.mo158545x42c875eb(this.f272990t);
                    this.f272983m.f435961f.f435982l.getClass();
                    if (this.f272990t != null) {
                        this.f272983m.mo158542xed060d07();
                    } else if (this.f272992v) {
                        this.f272983m.mo158542xed060d07();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Sns.SnsVideoPlayTextureView", e17, "prepare async error %s", e17.getMessage());
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = this.f272993w;
                    if (a4Var != null) {
                        a4Var.mo9756xaf8aa769(-1, -1);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                throw th6;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    public void b(double d17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("seekTo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        synchronized (this.K) {
            try {
                a(d17, true);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("seekTo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("seekTo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: pause */
    public void mo69313x65825f6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pause", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        synchronized (this.K) {
            try {
                super.mo69313x65825f6();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pause", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pause", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setMute */
    public void mo69318x764d819b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMute", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        synchronized (this.K) {
            try {
                super.mo69318x764d819b(z17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMute", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMute", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setVideoPath */
    public void mo69327xab3268fe(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoPath", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        super.mo69327xab3268fe(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoPath", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: start */
    public boolean mo69330x68ac462() {
        boolean mo69330x68ac462;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("start", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        synchronized (this.K) {
            try {
                mo69330x68ac462 = super.mo69330x68ac462();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        return mo69330x68ac462;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: stop */
    public void mo69303x360802() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        synchronized (this.K) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$001", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                super.mo69303x360802();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$001", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
    }

    public C18391x3e1a6e09(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.K = new java.lang.Object();
    }
}
