package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class b4 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f198453d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f198454e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f198455f;

    /* renamed from: g, reason: collision with root package name */
    public az2.f f198456g;

    /* renamed from: h, reason: collision with root package name */
    public int f198457h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f198458i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f198457h = 3;
        this.f198458i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a4(this), true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        android.widget.Button button = this.f198454e;
        if (button != null) {
            return button.performClick();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f198454e = (android.widget.Button) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.etp);
        this.f198455f = (android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f566140ew3);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f7v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(progressBar);
        az2.f fVar = new az2.f();
        fVar.f97661c = 1000L;
        az2.r rVar = new az2.r();
        rVar.f97684b = progressBar;
        fVar.f97660b = rVar;
        this.f198456g = fVar;
        android.widget.Button button = this.f198454e;
        if (button != null) {
            button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z3(this));
        }
        az2.f fVar2 = this.f198456g;
        if (fVar2 != null) {
            fVar2.b();
        }
        android.widget.TextView textView = this.f198455f;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = this.f198455f;
        if (textView2 != null) {
            textView2.setText(java.lang.String.valueOf(this.f198457h));
        }
        this.f198458i.c(1000L, 1000L);
        az2.f fVar3 = this.f198456g;
        if (fVar3 != null) {
            fVar3.b();
        }
    }
}
