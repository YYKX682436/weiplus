package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class x0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16361xa250edf2 f229194d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16361xa250edf2 activityC16361xa250edf2) {
        super(false);
        this.f229194d = activityC16361xa250edf2;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "open btn click");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 10, 0, 0, 0, 2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16361xa250edf2 activityC16361xa250edf2 = this.f229194d;
        activityC16361xa250edf2.f227565s.setClickable(false);
        activityC16361xa250edf2.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "do open hb");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s5 s5Var = activityC16361xa250edf2.C;
        activityC16361xa250edf2.m66165x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r5(s5Var.f227150i, s5Var.f227149h, s5Var.f227151m, activityC16361xa250edf2.getIntent().getStringExtra("packageExt"), activityC16361xa250edf2.f227569w), false);
        activityC16361xa250edf2.f227565s.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.G(activityC16361xa250edf2.f227567u, 0);
    }
}
