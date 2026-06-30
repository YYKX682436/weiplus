package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class y9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f229262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.fa f229263e;

    public y9(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.fa faVar) {
        this.f229262d = i17;
        this.f229263e = faVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUIFunctionUIC$doRedpacketPersonEntranceStyle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = (this.f229262d & 128) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doRedpacketPersonEntranceStyle] click entrance，needJumpWeApp ：" + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.fa faVar = this.f229263e;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = faVar.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d) m158354x19263085 : null;
        gb3.m.a(64, activityC16371xf216ae6d != null ? activityC16371xf216ae6d.V2 : null);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doRedpacketPersonEntranceStyle] jump to weapp");
            l81.b1 b1Var = new l81.b1();
            b1Var.f398547b = "wxb8f2d39684e3fe62";
            b1Var.f398555f = "pages/customEdit/index.html?channel=202597";
            b1Var.f398549c = 0;
            b1Var.f398565k = 1100;
            b1Var.M = true;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(faVar.m80379x76847179(), b1Var);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doRedpacketPersonEntranceStyle] jump to liteapp");
            r45.q74 q74Var = new r45.q74();
            q74Var.f465267d = "wxalitee3496ed66c0cfe06db0edfa2dbd8f4a2";
            q74Var.f465268e = "pages/customeditpage/entry";
            q74Var.f465270g = "3.0.3";
            q74Var.f465269f = "channel=202597";
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.Y(faVar.m80379x76847179(), q74Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.x9(faVar));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUIFunctionUIC$doRedpacketPersonEntranceStyle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
