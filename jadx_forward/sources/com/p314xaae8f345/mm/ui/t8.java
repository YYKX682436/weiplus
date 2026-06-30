package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class t8 implements com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f291417d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21442x4f06d53 f291418e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f291419f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f291420g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f291421h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f291422i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21389xb8f36d3b f291423m;

    public t8(com.p314xaae8f345.mm.ui.C21389xb8f36d3b c21389xb8f36d3b) {
        this.f291423m = c21389xb8f36d3b;
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
            this.f291420g.setText("");
            this.f291420g.setVisibility(4);
            return true;
        }
        this.f291420g.setText(this.f291423m.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k29));
        this.f291420g.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.asx);
        this.f291420g.setTextSize(0, i65.a.f(r1.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561170bc));
        this.f291420g.setVisibility(0);
        this.f291421h.setVisibility(4);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        if (!z17) {
            this.f291420g.setText("");
            this.f291420g.setVisibility(4);
            return true;
        }
        int i17 = pm6Var.f464719d;
        com.p314xaae8f345.mm.ui.C21389xb8f36d3b c21389xb8f36d3b = this.f291423m;
        if (i17 > 99) {
            this.f291420g.setText("");
            this.f291420g.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f78601xa3931aa1);
            this.f291420g.setTextSize(0, i65.a.f(c21389xb8f36d3b.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f562162ad3));
            this.f291420g.setVisibility(0);
            this.f291421h.setVisibility(4);
            return true;
        }
        this.f291420g.setText(java.lang.String.valueOf(i17));
        this.f291420g.setTextSize(0, i65.a.f(c21389xb8f36d3b.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f562162ad3) * i65.a.m(c21389xb8f36d3b.getContext()));
        this.f291420g.setVisibility(0);
        this.f291420g.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(c21389xb8f36d3b.getContext(), pm6Var.f464719d));
        this.f291421h.setVisibility(4);
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
        return this.f291422i;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public android.view.View h() {
        return this.f291417d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean o0(boolean z17) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.l(z17, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean q3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean u6(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean y(boolean z17) {
        this.f291420g.setVisibility(4);
        this.f291421h.setVisibility(z17 ? 0 : 4);
        return true;
    }
}
