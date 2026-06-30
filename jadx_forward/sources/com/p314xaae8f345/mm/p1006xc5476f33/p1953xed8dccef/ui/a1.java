package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16817xdad885e7 f234802d;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16817xdad885e7 activityC16817xdad885e7) {
        this.f234802d = activityC16817xdad885e7;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductSubmitUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wq3.j jVar = this.f234802d.f234779y.f234900g;
        if (jVar.b()) {
            if (jVar.o() == 0) {
                gm0.j1.i();
                com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
                r45.a76 n17 = jVar.n();
                xq3.n nVar = jVar.f530082b.f530133f;
                r1Var.g(new wq3.r(n17, nVar != null ? nVar.f537638d : null));
            } else {
                gm0.j1.i();
                com.p314xaae8f345.mm.p944x882e457a.r1 r1Var2 = gm0.j1.n().f354821b;
                r45.a76 n18 = jVar.n();
                xq3.n nVar2 = jVar.f530082b.f530133f;
                r1Var2.g(new wq3.s(n18, nVar2 != null ? nVar2.f537638d : null));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductSubmitUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
