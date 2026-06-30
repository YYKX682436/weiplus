package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui;

/* renamed from: com.tencent.mm.plugin.webview.fts.ui.FtsVideoWrapper */
/* loaded from: classes4.dex */
public class C19251x6f79c17d extends android.widget.RelativeLayout implements com.p314xaae8f345.mm.p2470x93e71c27.ui.f1, com.p314xaae8f345.mm.p2470x93e71c27.ui.a1, com.p314xaae8f345.mm.p2470x93e71c27.ui.c1, com.p314xaae8f345.mm.p2470x93e71c27.ui.b1, c01.i {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f263588d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f263589e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 f263590f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.z0 f263591g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 f263592h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f263593i;

    /* renamed from: m, reason: collision with root package name */
    public float f263594m;

    /* renamed from: n, reason: collision with root package name */
    public int f263595n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f263596o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f263597p;

    /* renamed from: q, reason: collision with root package name */
    public final c01.k f263598q;

    public C19251x6f79c17d(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandVideoWrapper", "%d onVideoEnded", java.lang.Integer.valueOf(hashCode()));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f263590f;
        if (b1Var != null) {
            b1Var.E(str, str2);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandVideoWrapper", "%d onGetVideoSize[%d %d]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f263590f;
        if (b1Var != null) {
            b1Var.I(str, str2, i17, i18);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandVideoWrapper", "%d onError[%s %d, %d]", java.lang.Integer.valueOf(hashCode()), str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f263590f;
        if (b1Var != null) {
            b1Var.N(str, str2, str3, i17, i18);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f263590f;
        if (b1Var != null) {
            b1Var.N5(str, str2, bool);
        }
    }

    @Override // c01.i
    public void P0() {
    }

    @Override // c01.i
    public void U5() {
    }

    @Override // c01.i
    public void V3() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public boolean a(double d17, boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        if (f1Var != null) {
            return ((com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5) f1Var).a(d17, z17);
        }
        return false;
    }

    public boolean b(double d17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        if (f1Var != null) {
            return ((com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e) f1Var).S(d17);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public boolean c(float f17) {
        if (f17 <= 0.0f) {
            return false;
        }
        this.f263594m = f17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        if (f1Var != null) {
            return f1Var.c(f17);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void d() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        if (f1Var != null) {
            f1Var.d();
        }
        this.f263598q.a();
        setKeepScreenOn(false);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void e() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        if (f1Var != null) {
            f1Var.e();
        }
        this.f263598q.a();
        setKeepScreenOn(false);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void g() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        if (f1Var != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5) f1Var).g();
        }
    }

    @Override // c01.i
    public void g3() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: getCacheTimeSec */
    public int mo48226x8a3f46d8() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        if (f1Var != null) {
            return f1Var.mo48226x8a3f46d8();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: getCurrPosMs */
    public int mo64621x25784152() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        if (f1Var != null) {
            return f1Var.mo64621x25784152();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: getCurrPosSec */
    public int mo61523x898ffe25() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        if (f1Var != null) {
            return f1Var.mo61523x898ffe25();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: getPlayerType */
    public int mo64625x6b2cfdb1() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        if (f1Var != null) {
            return f1Var.mo64625x6b2cfdb1();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: getVideoDurationSec */
    public int mo61527x6d590e18() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        return f1Var != null ? f1Var.mo61527x6d590e18() : this.f263595n;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0095  */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(boolean r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.f263595n = r5
            r2.f263596o = r3
            com.tencent.mm.pointers.PString r3 = new com.tencent.mm.pointers.PString
            r3.<init>()
            r3.f38869x6ac9171 = r4
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            r2.f263597p = r4
            com.tencent.mm.pluginsdk.ui.f1 r3 = r2.f263589e
            android.content.Context r4 = r2.f263588d
            java.lang.String r5 = "%d use common video view !"
            java.lang.String r0 = "MicroMsg.AppBrandVideoWrapper"
            if (r3 != 0) goto L36
            int r3 = r2.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r5, r3)
            com.tencent.mm.pluginsdk.ui.CommonVideoView r3 = new com.tencent.mm.pluginsdk.ui.CommonVideoView
            r3.<init>(r4)
            r3.m75326x5d1e8363(r2)
            r3.mo61532x526554de(r2)
            r2.f263589e = r3
            goto L69
        L36:
            boolean r1 = r3 instanceof com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800
            if (r1 == 0) goto L6b
            com.tencent.mm.pluginsdk.ui.AbstractVideoView r3 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e) r3
            r3.mo48239x360802()
            com.tencent.mm.pluginsdk.ui.f1 r3 = r2.f263589e
            com.tencent.mm.pluginsdk.ui.AbstractVideoView r3 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e) r3
            r3.i()
            com.tencent.mm.pluginsdk.ui.f1 r3 = r2.f263589e
            android.view.View r3 = (android.view.View) r3
            r2.removeView(r3)
            int r3 = r2.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r5, r3)
            com.tencent.mm.pluginsdk.ui.CommonVideoView r3 = new com.tencent.mm.pluginsdk.ui.CommonVideoView
            r3.<init>(r4)
            r3.m75326x5d1e8363(r2)
            r3.mo61532x526554de(r2)
            r2.f263589e = r3
        L69:
            r3 = 1
            goto L84
        L6b:
            int r3 = r2.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d use last common video view !"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r4, r3)
            com.tencent.mm.pluginsdk.ui.f1 r3 = r2.f263589e
            com.tencent.mm.pluginsdk.ui.AbstractVideoView r3 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e) r3
            r3.mo48239x360802()
            r3 = 0
        L84:
            com.tencent.mm.pluginsdk.ui.e1 r4 = r2.f263592h
            r2.mo48237xebd28962(r4)
            float r4 = r2.f263594m
            r2.c(r4)
            boolean r4 = r2.f263593i
            r2.mo61536x764d819b(r4)
            if (r3 == 0) goto Lad
            com.tencent.mm.pluginsdk.ui.z0 r3 = r2.f263591g
            r2.mo64632xb9405cf9(r3)
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r4 = -1
            r5 = -2
            r3.<init>(r4, r5)
            r4 = 13
            r3.addRule(r4)
            com.tencent.mm.pluginsdk.ui.f1 r4 = r2.f263589e
            android.view.View r4 = (android.view.View) r4
            r2.addView(r4, r3)
        Lad:
            com.tencent.mm.pluginsdk.ui.f1 r3 = r2.f263589e
            boolean r4 = r2.f263596o
            java.lang.String r5 = r2.f263597p
            int r0 = r2.f263595n
            com.tencent.mm.pluginsdk.ui.CommonVideoView r3 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5) r3
            r3.h(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19251x6f79c17d.h(boolean, java.lang.String, int):void");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        hashCode();
        setKeepScreenOn(false);
        this.f263598q.a();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f263590f;
        if (b1Var != null) {
            b1Var.i(str, str2);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.c1
    /* renamed from: idkeyStat */
    public void mo69402x336bdfd8(long j17, long j18, long j19, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(j17, j18, j19, z17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: isPlaying */
    public boolean mo61531xc00617a4() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        if (f1Var != null) {
            return f1Var.mo61531xc00617a4();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public boolean j() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        if (f1Var != null) {
            return f1Var.j();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.c1
    /* renamed from: kvStat */
    public void mo69404xbd3cda5f(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(i17, str);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        hashCode();
        setKeepScreenOn(true);
        this.f263598q.c(this);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f263590f;
        if (b1Var != null) {
            b1Var.l(str, str2);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f263590f;
        if (b1Var != null) {
            b1Var.m2(str, str2, true);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandVideoWrapper", "%d onPrepared", java.lang.Integer.valueOf(hashCode()));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f263590f;
        if (b1Var != null) {
            b1Var.o(str, str2);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    /* renamed from: onSeekComplete */
    public void mo55683xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: pause */
    public boolean mo48231x65825f6() {
        if (this.f263589e == null) {
            return false;
        }
        setKeepScreenOn(false);
        this.f263598q.a();
        return this.f263589e.mo48231x65825f6();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: play */
    public boolean mo48232x348b34() {
        if (this.f263589e == null) {
            return false;
        }
        setKeepScreenOn(true);
        this.f263598q.c(this);
        return this.f263589e.mo48232x348b34();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.a1
    public void r(java.lang.String str, boolean z17) {
        boolean z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish path [%s] isPlayNow [%b]", java.lang.Integer.valueOf(hashCode()), str, java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        if (f1Var instanceof com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e) f1Var).mo48239x360802();
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e) this.f263589e).i();
            removeView((android.view.View) this.f263589e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish use common video view !", java.lang.Integer.valueOf(hashCode()));
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5 c19637x95a2b3f5 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5(this.f263588d);
            c19637x95a2b3f5.m75326x5d1e8363(this);
            c19637x95a2b3f5.mo61532x526554de(this);
            this.f263589e = c19637x95a2b3f5;
            z18 = true;
        } else {
            z18 = false;
        }
        mo48237xebd28962(this.f263592h);
        c(this.f263594m);
        mo61536x764d819b(this.f263593i);
        if (z18) {
            mo64632xb9405cf9(this.f263591g);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            addView((android.view.View) this.f263589e, layoutParams);
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5) this.f263589e).h(this.f263596o, this.f263597p, this.f263595n);
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5) this.f263589e).mo48238x68ac462();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setCover */
    public void mo64626x52d31475(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        if (f1Var != null) {
            f1Var.mo64626x52d31475(bitmap);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setFullDirection */
    public void mo64627xfa24986e(int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        if (f1Var != null) {
            f1Var.mo64627xfa24986e(i17);
        }
    }

    /* renamed from: setIMMVideoViewCallback */
    public void m74179x526554de(com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var) {
        this.f263590f = b1Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setIsShowBasicControls */
    public void mo64629xc2e9d13b(boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        if (f1Var != null) {
            f1Var.mo64629xc2e9d13b(z17);
        }
    }

    @Override // android.view.View
    public void setKeepScreenOn(boolean z17) {
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        super.setKeepScreenOn(z17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setLoop */
    public void mo48236x764cf626(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setLoopCompletionCallback */
    public void mo64630x8fda8107(com.p314xaae8f345.mm.p2470x93e71c27.ui.d1 d1Var) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setMute */
    public void mo61536x764d819b(boolean z17) {
        this.f263593i = z17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        if (f1Var != null) {
            f1Var.mo61536x764d819b(z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setScaleType */
    public void mo48237xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var) {
        this.f263592h = e1Var;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        if (f1Var != null) {
            f1Var.mo48237xebd28962(e1Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setVideoFooterView */
    public void mo64632xb9405cf9(com.p314xaae8f345.mm.p2470x93e71c27.ui.z0 z0Var) {
        this.f263591g = z0Var;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        if (f1Var != null) {
            f1Var.mo64632xb9405cf9(z0Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: start */
    public void mo48238x68ac462() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        if (f1Var != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5) f1Var).mo48238x68ac462();
            setKeepScreenOn(true);
            this.f263598q.c(this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: stop */
    public void mo48239x360802() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f263589e;
        if (f1Var != null) {
            f1Var.mo48239x360802();
            this.f263598q.a();
            setKeepScreenOn(false);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }

    public C19251x6f79c17d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f263592h = com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN;
        this.f263593i = false;
        this.f263594m = -1.0f;
        this.f263588d = context;
        this.f263598q = new c01.k();
    }
}
