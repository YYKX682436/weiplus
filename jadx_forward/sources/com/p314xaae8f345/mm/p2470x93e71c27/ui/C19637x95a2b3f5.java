package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* renamed from: com.tencent.mm.pluginsdk.ui.CommonVideoView */
/* loaded from: classes4.dex */
public class C19637x95a2b3f5 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e {
    public boolean S;
    public java.lang.String T;
    public int U;
    public int V;
    public boolean W;

    public C19637x95a2b3f5(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V = 0;
        this.W = false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 C(android.content.Context context) {
        this.f271290z = 0;
        return new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05(context, null);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    public void D() {
        super.D();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    public void I() {
        super.I();
        this.f271272e = "MicroMsg.CommonVideoView";
        this.f271271d = "VideoView.CommonVideoView";
    }

    public void Y() {
        try {
            int mo61527x6d590e18 = mo61527x6d590e18();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "onLoopCompletion, updateUI and videoDurationSec is " + mo61527x6d590e18);
            W(mo61527x6d590e18);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.d1 d1Var = this.f271285u;
            if (d1Var != null) {
                d1Var.c();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f271272e, th6.toString());
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public boolean a(double d17, boolean z17) {
        if (!j()) {
            return super.a(d17, z17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f271272e, "%s it is live, don't seek ", N());
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public boolean c(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s set play rate [%f]", N(), java.lang.Float.valueOf(f17));
        if (!(this.f271281q instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05)) {
            return false;
        }
        H(600L, mo48229xc9e6d95a() + 13, 1L, false);
        return ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05) this.f271281q).I(f17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void e() {
        super.e();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void g() {
        super.g();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        if (f4Var == null || !(f4Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05)) {
            return;
        }
        if (this.f271283s) {
            mo48232x348b34();
        } else {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05) f4Var).F();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: getCacheTimeSec */
    public int mo48226x8a3f46d8() {
        try {
            if (!(this.f271281q instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05)) {
                return 0;
            }
            return (int) (super.mo61527x6d590e18() * ((((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05) r0).m75839xd376dc67() * 1.0f) / 100.0f));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f271272e, e17, "%s get cache time sec error", N());
            return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    /* renamed from: getReportIdkey */
    public int mo48229xc9e6d95a() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: getVideoDurationSec */
    public int mo61527x6d590e18() {
        int i17 = this.U;
        return i17 <= 0 ? super.mo61527x6d590e18() : i17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    /* renamed from: getVideoSource */
    public int mo75325x17bb2740() {
        return this.V;
    }

    public void h(boolean z17, java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s set video path isLive [%b] url [%s] durationSec [%d]", N(), java.lang.Boolean.valueOf(z17), str, java.lang.Integer.valueOf(i17));
        this.S = z17;
        this.T = str;
        this.U = i17;
        this.R.f272335i = str;
    }

    public boolean j() {
        boolean L = L();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        boolean z17 = false;
        int mo69286x51e8b0a = f4Var != null ? f4Var.mo69286x51e8b0a() : 0;
        if (this.S || (L && mo69286x51e8b0a <= 0)) {
            z17 = true;
        }
        N();
        L();
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b4
    public void k(int i17, int i18) {
        N();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.e3 e3Var = this.R;
        if (i17 == 701) {
            T();
            e3Var.f272334h++;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            e3Var.f272331e = java.lang.System.currentTimeMillis();
            H(600L, mo48229xc9e6d95a() + 40, 1L, false);
            return;
        }
        if (i17 == 702) {
            super.D();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            e3Var.f272332f = currentTimeMillis;
            long j17 = e3Var.f272331e;
            if (j17 > 0) {
                e3Var.f272333g += currentTimeMillis - j17;
            }
            R();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
        if (j()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s it is live video, do not completion", N());
            mo48239x360802();
            mo48238x68ac462();
        } else {
            super.mo9755xa6db431b();
            if (this.W) {
                a(0.0d, true);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setLoop */
    public void mo48236x764cf626(boolean z17) {
        this.W = z17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setScaleType */
    public void mo48237xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        if (f4Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05) f4Var).m75841xebd28962(e1Var);
            H(600L, mo48229xc9e6d95a() + 14, 1L, false);
        }
    }

    /* renamed from: start */
    public void mo48238x68ac462() {
        if (this.f271281q != null) {
            java.lang.String str = this.f271272e;
            java.lang.String N = N();
            java.lang.String mo69310x4edea88a = this.f271281q.mo69310x4edea88a();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "%s start path [%s] [%s]", N, mo69310x4edea88a, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f271281q.mo69310x4edea88a())) {
                this.f271281q.mo69327xab3268fe(this.T);
                T();
                Q();
            } else {
                mo48232x348b34();
            }
            H(600L, mo48229xc9e6d95a() + 1, 1L, false);
        }
    }

    public C19637x95a2b3f5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.V = 0;
        this.W = false;
    }

    public C19637x95a2b3f5(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.V = 0;
        this.W = false;
    }

    public C19637x95a2b3f5(android.content.Context context) {
        super(context, null);
        this.V = 0;
        this.W = false;
    }
}
