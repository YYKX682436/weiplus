package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class n extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f198792d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f198793e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f198794f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f198795g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f198795g = "";
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("DESC");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f198795g = stringExtra;
        android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.mcm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.icr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f198792d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById2;
        android.view.View findViewById3 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.kht);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f198793e = (android.widget.LinearLayout) findViewById3;
        android.view.View findViewById4 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.egr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f198794f = findViewById4;
        android.widget.LinearLayout linearLayout = this.f198793e;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btnContainer");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f198792d;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTv");
            throw null;
        }
        c22621x7603e017.setHint(zl2.q4.f555466a.n());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = this.f198792d;
        if (c22621x7603e0172 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTv");
            throw null;
        }
        c22621x7603e0172.setText(this.f198795g);
        android.view.View view = this.f198794f;
        if (view != null) {
            view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m(this, layoutParams2));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("optionRoot");
            throw null;
        }
    }
}
