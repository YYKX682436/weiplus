package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class f8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f228432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f228433e;

    public f8(com.p314xaae8f345.mm.p944x882e457a.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d) {
        this.f228432d = fVar;
        this.f228433e = activityC16371xf216ae6d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$getRedpacketFissionEntrance$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f228432d;
        r45.xm3 xm3Var = (r45.xm3) fVar.f152151d;
        objArr[0] = xm3Var != null ? xm3Var.f471768h : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "click fissison entrance： %s", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f228433e;
        gb3.m.a(22, activityC16371xf216ae6d.V2);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16371xf216ae6d.mo55332x76847179();
        r45.xm3 xm3Var2 = (r45.xm3) fVar.f152151d;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(mo55332x76847179, xm3Var2 != null ? xm3Var2.f471768h : null, true);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$getRedpacketFissionEntrance$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
