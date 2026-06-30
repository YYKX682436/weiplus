package com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8;

/* renamed from: com.tencent.mm.plugin.newtips.NormalPluginNewTipPreference */
/* loaded from: classes11.dex */
public final class C16743x392e7150 extends com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e implements com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a {
    public final android.content.Context W;
    public android.view.View X;

    public C16743x392e7150(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean T1(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean W5() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean Y3(boolean z17) {
        if (!z17) {
            this.R = false;
            this.Q = 8;
            return true;
        }
        this.R = false;
        this.Q = 0;
        this.N = this.W.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572034wv);
        this.P = com.p314xaae8f345.mm.R.C30861xcebc809e.asx;
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        if (!z17) {
            this.R = false;
            this.Q = 8;
            return true;
        }
        this.Q = 0;
        java.lang.String str = pm6Var.f464719d + "";
        if (pm6Var.f464719d > 99) {
            str = this.W.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574837jo3);
        }
        int b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(this.f279303d, pm6Var.f464719d);
        this.N = str;
        this.P = b17;
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public void c1(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public void e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.b(this, rVar, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    /* renamed from: getPath */
    public java.lang.String mo54844xfb83cc9b() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public android.view.View h() {
        if (this.X == null) {
            this.X = new android.view.View(this.W);
        }
        return this.X;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean o0(boolean z17) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.l(z17, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean q3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        if (this.X == null) {
            this.X = u17;
        }
        return u17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean u6(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean y(boolean z17) {
        if (z17) {
            this.R = true;
        } else {
            this.R = false;
            this.Q = 8;
        }
        return true;
    }

    public C16743x392e7150(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.W = context;
    }
}
