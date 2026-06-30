package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.SynchronizedVideoPlayTextureView */
/* loaded from: classes15.dex */
public class C19743xb3657be5 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 {
    public final java.lang.Object K;

    public C19743xb3657be5(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = new java.lang.Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009e A[Catch: Exception -> 0x00a2, all -> 0x00ae, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a2, blocks: (B:6:0x003a, B:8:0x004d, B:11:0x0052, B:13:0x005d, B:15:0x0061, B:16:0x0091, B:17:0x0097, B:19:0x009e, B:25:0x0067, B:26:0x0078, B:28:0x007c, B:29:0x0087, B:30:0x0094), top: B:5:0x003a, outer: #1 }] */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F(android.graphics.SurfaceTexture r8, int r9, int r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.K
            monitor-enter(r0)
            java.lang.String r1 = "MicroMsg.SynchronizedVideoPlayTextureView"
            java.lang.String r2 = "%d surface[%d] available [%d, %d] pauseByDestroyed[%b]"
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lae
            int r4 = r7.hashCode()     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lae
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> Lae
            int r4 = r8.hashCode()     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lae
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lae
            r4 = 2
            r3[r4] = r9     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> Lae
            r10 = 3
            r3[r10] = r9     // Catch: java.lang.Throwable -> Lae
            boolean r9 = r7.D     // Catch: java.lang.Throwable -> Lae
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> Lae
            r10 = 4
            r3[r10] = r9     // Catch: java.lang.Throwable -> Lae
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r3)     // Catch: java.lang.Throwable -> Lae
            r7.C()     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            android.view.Surface r9 = r7.f272990t     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            r7.I(r9)     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            android.view.Surface r9 = new android.view.Surface     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            r9.<init>(r8)     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            r7.f272990t = r9     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            ph3.k r8 = r7.f272983m     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            if (r8 == 0) goto L94
            boolean r10 = r7.f272987q     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            if (r10 != 0) goto L52
            goto L94
        L52:
            r8.k(r9)     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            r8 = 23
            boolean r8 = fp.h.c(r8)     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            if (r8 == 0) goto L78
            boolean r8 = r7.D     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            if (r8 == 0) goto L67
            ph3.k r8 = r7.f272983m     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            r8.mo158546x68ac462()     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            goto L91
        L67:
            r7.E = r6     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            r8 = 0
            r7.f272991u = r8     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            ph3.k r8 = r7.f272983m     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            r8.mo158544x764d819b(r6)     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            ph3.k r8 = r7.f272983m     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            r8.mo158546x68ac462()     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            goto L91
        L78:
            boolean r8 = r7.D     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            if (r8 == 0) goto L87
            ph3.k r8 = r7.f272983m     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            int r8 = r8.l()     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            double r8 = (double) r8     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            r7.a(r8, r6)     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            goto L91
        L87:
            ph3.k r8 = r7.f272983m     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            int r8 = r8.l()     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            double r8 = (double) r8     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            r7.a(r8, r5)     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
        L91:
            r7.D = r5     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            goto L97
        L94:
            r7.H()     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
        L97:
            r7.J()     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            com.tencent.mm.pluginsdk.ui.tools.d4 r8 = r7.f272996z     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            if (r8 == 0) goto Lac
            r8.mo48230xe037649b()     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            goto Lac
        La2:
            r8 = move-exception
            java.lang.String r9 = "MicroMsg.SynchronizedVideoPlayTextureView"
            java.lang.String r10 = "onSurfaceTextureAvailable failed"
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lae
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r9, r8, r10, r1)     // Catch: java.lang.Throwable -> Lae
        Lac:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            return
        Lae:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19743xb3657be5.F(android.graphics.SurfaceTexture, int, int):void");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4
    public void G(android.graphics.SurfaceTexture surfaceTexture) {
        synchronized (this.K) {
            if (fp.h.c(23) && this.E && this.f272991u > 0) {
                ph3.k kVar = this.f272983m;
                if (kVar != null) {
                    kVar.mo158541x65825f6();
                    this.f272983m.mo158544x764d819b(this.f272988r);
                }
                this.E = false;
            }
            if (this.f272991u > 0 && this.f272994x != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SynchronizedVideoPlayTextureView", "%d notify surface update", java.lang.Integer.valueOf(hashCode()));
                this.f272994x.v();
                this.f272994x = null;
            }
            this.f272991u = java.lang.System.currentTimeMillis();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4
    public void H() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SynchronizedVideoPlayTextureView", "%d open video [%s]", java.lang.Integer.valueOf(hashCode()), this.f272982i);
        synchronized (this.K) {
            ph3.k kVar = this.f272983m;
            if (kVar != null) {
                kVar.f435962g = null;
                kVar.mo158547x360802();
                this.f272983m.mo158543x41012807();
                this.f272983m = null;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f272982i)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SynchronizedVideoPlayTextureView", "%d open video but path is null.", java.lang.Integer.valueOf(hashCode()));
                return;
            }
            try {
                this.f272987q = false;
                ph3.k kVar2 = new ph3.k(android.os.Looper.getMainLooper(), false, mo75821x38d97590());
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
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SynchronizedVideoPlayTextureView", e17, "prepare async error %s", e17.getMessage());
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = this.f272993w;
                if (a4Var != null) {
                    a4Var.mo9756xaf8aa769(-1, -1);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    public void b(double d17) {
        synchronized (this.K) {
            a(d17, true);
        }
    }

    /* renamed from: getBusinessType */
    public int mo75821x38d97590() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: pause */
    public void mo69313x65825f6() {
        synchronized (this.K) {
            super.mo69313x65825f6();
            this.f272989s = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setMute */
    public void mo69318x764d819b(boolean z17) {
        synchronized (this.K) {
            super.mo69318x764d819b(z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setVideoPath */
    public void mo69327xab3268fe(java.lang.String str) {
        synchronized (this.K) {
            super.mo69327xab3268fe(str);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: start */
    public boolean mo69330x68ac462() {
        boolean mo69330x68ac462;
        synchronized (this.K) {
            this.f272989s = true;
            mo69330x68ac462 = super.mo69330x68ac462();
        }
        return mo69330x68ac462;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: stop */
    public void mo69303x360802() {
        synchronized (this.K) {
            super.mo69303x360802();
        }
    }

    public C19743xb3657be5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.K = new java.lang.Object();
    }

    public C19743xb3657be5(android.content.Context context) {
        super(context, null);
        this.K = new java.lang.Object();
    }
}
