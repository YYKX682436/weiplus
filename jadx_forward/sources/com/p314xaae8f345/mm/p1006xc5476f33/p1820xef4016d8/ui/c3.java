package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class c3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.eg7 f228306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d f228307e;

    public c3(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d, r45.eg7 eg7Var) {
        this.f228307e = activityC16363x8a0a619d;
        this.f228306d = eg7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$45", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "[setWxAppInfoEntrance] click wxapp entrance");
        gb3.m.a(42, this.f228307e.V2);
        r45.eg7 eg7Var = this.f228306d;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(eg7Var.f454999d, eg7Var.f455000e, 0, 1100);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$45", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
