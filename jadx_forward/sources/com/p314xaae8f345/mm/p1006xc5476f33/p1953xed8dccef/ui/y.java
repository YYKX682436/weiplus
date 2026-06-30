package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.a0 f234908d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.a0 a0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.b0 b0Var) {
        this.f234908d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductImageAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallProductImageAdapter", "henryyr user: clicked the ImageView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.a0 a0Var = this.f234908d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.x xVar = a0Var.f234801f.f234806g;
        if (xVar != null) {
            java.lang.String str = a0Var.f234800e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16811x11add592 activityC16811x11add592 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.k) xVar).f234842a;
            boolean z17 = !activityC16811x11add592.f234730i;
            activityC16811x11add592.f234730i = z17;
            if (z17) {
                activityC16811x11add592.m78602x5a7a36a0();
            } else {
                activityC16811x11add592.m78531x8f8cf1fb();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductImageAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
