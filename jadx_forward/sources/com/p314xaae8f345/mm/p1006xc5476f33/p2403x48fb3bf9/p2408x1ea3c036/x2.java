package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class x2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 {

    /* renamed from: y, reason: collision with root package name */
    public static final java.util.Set f264215y;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 f264216v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f264217w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f264218x;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f264215y = hashSet;
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        hashSet.add("webpageTitle");
        hashSet.add("srcUsername");
        hashSet.add("srcDisplayname");
        hashSet.add("mode");
        hashSet.add("KTemplateId");
        hashSet.add("KPublisherId");
    }

    public x2(dp1.x xVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var) {
        super(xVar);
        this.f264216v = e0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void I() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageWebViewFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent:%s", java.lang.Integer.valueOf(this.f264216v.hashCode()));
        this.f174779u = false;
        this.f174772n.q(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void Z(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c12886x91aa2b6d.f174596x) || this.f174665d.f174596x.startsWith("http://") || this.f174665d.f174596x.startsWith("https://") || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !(str.startsWith("http://") || str.startsWith("https://"))) {
            super.Z(str);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d, gp1.r
    public void b(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageWebViewFloatBallHelper", "onCreate, type:%s, key:%s", java.lang.Integer.valueOf(i17), str);
        super.b(i17, str);
        t().f174619f = 8;
        t().f174618e = 32;
        g();
        dp1.x xVar = this.f174772n;
        if (xVar.mo54480x1e885992() != null && this.f174665d.G != null) {
            qp1.m.c(xVar.mo54480x1e885992(), this.f174665d.G, f264215y);
            g();
        }
        this.f264217w = true;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f264218x)) {
            return;
        }
        t0(this.f264218x);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4
    public boolean m0(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageWebViewFloatBallHelper", "onClose :%s", java.lang.Integer.valueOf(this.f264216v.hashCode()));
        return super.m0(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public boolean n() {
        return this.f264216v.x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4
    public void o0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageWebViewFloatBallHelper", "onDestroy :%s", java.lang.Integer.valueOf(this.f264216v.hashCode()));
        super.o0();
    }

    public void t0(java.lang.String str) {
        this.f264218x = str;
        if (this.f264217w) {
            t().f174620g = str;
            g();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public boolean v() {
        return this.f264216v.x() && this.f174772n.t();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageWebViewFloatBallHelper", "onEnterPage :%s", java.lang.Integer.valueOf(this.f264216v.hashCode()));
        super.x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageWebViewFloatBallHelper", "onExitPage :%s", java.lang.Integer.valueOf(this.f264216v.hashCode()));
        super.z();
    }
}
