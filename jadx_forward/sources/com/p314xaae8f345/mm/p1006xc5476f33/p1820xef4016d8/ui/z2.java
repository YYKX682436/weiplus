package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class z2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f229288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.a3 f229289e;

    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.a3 a3Var, com.p314xaae8f345.mm.p944x882e457a.f fVar) {
        this.f229289e = a3Var;
        this.f229288d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$43$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f229288d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "click fissison entrance： %s", ((r45.xm3) fVar.f152151d).f471768h);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.a3 a3Var = this.f229289e;
        gb3.m.a(22, a3Var.f228224a.V2);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(a3Var.f228224a.mo55332x76847179(), ((r45.xm3) fVar.f152151d).f471768h, true);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$43$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
