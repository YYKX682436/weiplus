package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.WebVideoWrapper */
/* loaded from: classes4.dex */
public class C19430x545990ec extends android.widget.RelativeLayout implements com.p314xaae8f345.mm.p2470x93e71c27.ui.f1, com.p314xaae8f345.mm.p2470x93e71c27.ui.c1, com.p314xaae8f345.mm.p2470x93e71c27.ui.b1, c01.i {

    /* renamed from: d, reason: collision with root package name */
    public int f267267d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f267268e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 f267269f;

    /* renamed from: g, reason: collision with root package name */
    public final c01.k f267270g;

    public C19430x545990ec(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebVideoWrapper", "%d onVideoEnded", java.lang.Integer.valueOf(hashCode()));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f267269f;
        if (b1Var != null) {
            b1Var.E(str, str2);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebVideoWrapper", "%d onGetVideoSize[%d %d]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f267269f;
        if (b1Var != null) {
            b1Var.I(str, str2, i17, i18);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebVideoWrapper", "%d onError[%s %d, %d]", java.lang.Integer.valueOf(hashCode()), str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f267269f;
        if (b1Var != null) {
            b1Var.N(str, str2, str3, i17, i18);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f267269f;
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
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
        if (f1Var != null) {
            return ((com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5) f1Var).a(d17, z17);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public boolean c(float f17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var;
        if (f17 > 0.0f && (f1Var = this.f267268e) != null) {
            return ((com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5) f1Var).c(f17);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void d() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
        if (f1Var != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e) f1Var).d();
        }
        this.f267270g.a();
        setKeepScreenOn(false);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void e() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
        if (f1Var != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5) f1Var).e();
        }
        this.f267270g.a();
        setKeepScreenOn(false);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void g() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
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
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
        if (f1Var != null) {
            return f1Var.mo48226x8a3f46d8();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: getCurrPosMs */
    public int mo64621x25784152() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
        if (f1Var != null) {
            return f1Var.mo64621x25784152();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: getCurrPosSec */
    public int mo61523x898ffe25() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
        if (f1Var != null) {
            return f1Var.mo61523x898ffe25();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: getPlayerType */
    public int mo64625x6b2cfdb1() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
        if (f1Var != null) {
            return f1Var.mo64625x6b2cfdb1();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: getVideoDurationSec */
    public int mo61527x6d590e18() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
        return f1Var != null ? f1Var.mo61527x6d590e18() : this.f267267d;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void h(boolean z17, java.lang.String str, int i17) {
        this.f267267d = i17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
        if (f1Var != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5) f1Var).h(z17, str, i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        hashCode();
        setKeepScreenOn(false);
        this.f267270g.a();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f267269f;
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
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
        if (f1Var != null) {
            return ((com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e) f1Var).mo61531xc00617a4();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public boolean j() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
        if (f1Var != null) {
            return ((com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5) f1Var).j();
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
        this.f267270g.c(this);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f267269f;
        if (b1Var != null) {
            b1Var.l(str, str2);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f267269f;
        if (b1Var != null) {
            b1Var.m2(str, str2, true);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebVideoWrapper", "%d onPrepared", java.lang.Integer.valueOf(hashCode()));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f267269f;
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
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
        if (f1Var == null) {
            return false;
        }
        setKeepScreenOn(false);
        this.f267270g.a();
        return ((com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e) f1Var).mo48231x65825f6();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: play */
    public boolean mo48232x348b34() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
        if (f1Var == null) {
            return false;
        }
        setKeepScreenOn(true);
        this.f267270g.c(this);
        return ((com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e) f1Var).mo48232x348b34();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setCover */
    public void mo64626x52d31475(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
        if (f1Var != null) {
            f1Var.mo64626x52d31475(bitmap);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setFullDirection */
    public void mo64627xfa24986e(int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
        if (f1Var != null) {
            f1Var.mo64627xfa24986e(i17);
        }
    }

    /* renamed from: setIMMVideoViewCallback */
    public void m74525x526554de(com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var) {
        this.f267269f = b1Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setIsShowBasicControls */
    public void mo64629xc2e9d13b(boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
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
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
        if (f1Var != null) {
            f1Var.mo61536x764d819b(z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setScaleType */
    public void mo48237xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
        if (f1Var != null) {
            f1Var.mo48237xebd28962(e1Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setVideoFooterView */
    public void mo64632xb9405cf9(com.p314xaae8f345.mm.p2470x93e71c27.ui.z0 z0Var) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
        if (f1Var != null) {
            f1Var.mo64632xb9405cf9(z0Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: start */
    public void mo48238x68ac462() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
        if (f1Var != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5) f1Var).mo48238x68ac462();
            setKeepScreenOn(true);
            this.f267270g.c(this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: stop */
    public void mo48239x360802() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f267268e;
        if (f1Var != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e) f1Var).mo48239x360802();
            this.f267270g.a();
            setKeepScreenOn(false);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }

    public C19430x545990ec(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f267270g = new c01.k();
        if (this.f267268e == null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5 c19637x95a2b3f5 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5(context);
            c19637x95a2b3f5.m75326x5d1e8363(this);
            c19637x95a2b3f5.mo61532x526554de(this);
            mo69402x336bdfd8(600L, 200L, 1L, false);
            this.f267268e = c19637x95a2b3f5;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        addView((android.view.View) this.f267268e, layoutParams);
    }
}
