package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes13.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f162957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f162958e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f162959f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f162960g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f162961h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0 f162962i;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0 v0Var, android.widget.TextView textView, android.widget.LinearLayout linearLayout, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, int i17) {
        this.f162962i = v0Var;
        this.f162957d = textView;
        this.f162958e = linearLayout;
        this.f162959f = e9Var;
        this.f162960g = y1Var;
        this.f162961h = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/lbs/JsApiOpenMapApp$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f162957d.setVisibility(8);
        android.widget.LinearLayout linearLayout = this.f162958e;
        linearLayout.removeAllViews();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0 v0Var = this.f162962i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f162959f;
        v0Var.I(e9Var, this.f162960g, linearLayout, this.f162961h);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 22, "", "", "", "", 4, java.lang.Integer.valueOf(v0Var.H() ? 1 : 0), e9Var.mo48798x74292566());
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/lbs/JsApiOpenMapApp$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
