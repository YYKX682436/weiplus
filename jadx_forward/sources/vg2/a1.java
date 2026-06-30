package vg2;

/* loaded from: classes3.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.b1 f518007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vg2.y0 f518008e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vg2.r1 f518009f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.yi6 f518010g;

    public a1(vg2.b1 b1Var, vg2.y0 y0Var, vg2.r1 r1Var, r45.yi6 yi6Var) {
        this.f518007d = b1Var;
        this.f518008e = y0Var;
        this.f518009f = r1Var;
        this.f518010g = yi6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget$ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GiftSkinSelectPanelWidget", "select color click, ");
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.f3a);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        int intValue = num != null ? num.intValue() : 0;
        vg2.b1 b1Var = this.f518007d;
        b1Var.m8147xed6e4d18(intValue);
        b1Var.m8147xed6e4d18(b1Var.f518014e);
        vg2.b1 b1Var2 = this.f518007d;
        b1Var2.f518014e = intValue;
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.f(k0Var, null, null, new vg2.z0(this.f518008e, this.f518009f, this.f518010g, b1Var2, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget$ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
