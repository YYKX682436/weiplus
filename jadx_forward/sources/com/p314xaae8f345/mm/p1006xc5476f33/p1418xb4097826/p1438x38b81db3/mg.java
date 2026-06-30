package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class mg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1 f185531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lx2.d f185532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.a2 f185533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qg f185534g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1 c15298x95ee76f1, lx2.d dVar, so2.a2 a2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qg qgVar) {
        super(0);
        this.f185531d = c15298x95ee76f1;
        this.f185532e = dVar;
        this.f185533f = a2Var;
        this.f185534g = qgVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1 c15298x95ee76f1 = this.f185531d;
        android.view.View findViewById = c15298x95ee76f1.findViewById(com.p314xaae8f345.mm.R.id.ovk);
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams3 = c15298x95ee76f1.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams4 = (android.widget.FrameLayout.LayoutParams) layoutParams3;
        lx2.d dVar = this.f185532e;
        if (dVar != null) {
            dVar.i(findViewById, layoutParams2, layoutParams4);
        }
        pm0.v.a(c15298x95ee76f1, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.lg(c15298x95ee76f1, this.f185533f, this.f185534g));
        c15298x95ee76f1.requestLayout();
        return jz5.f0.f384359a;
    }
}
