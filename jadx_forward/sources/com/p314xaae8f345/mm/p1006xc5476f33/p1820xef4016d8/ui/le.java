package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class le extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def f228677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fo3.m f228678e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def, fo3.m mVar) {
        super(false);
        this.f228677d = activityC16377xf00b6def;
        this.f228678e = mVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        gb3.o.f351568a.a(4);
        li3.g gVar = (li3.g) ((h45.s) i95.n0.c(h45.s.class));
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def = this.f228677d;
        gVar.Ri(activityC16377xf00b6def, 10, 3);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = 5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l6 l6Var = activityC16377xf00b6def.F1;
        int i17 = l6Var != null ? l6Var.f226965y : 0;
        objArr[1] = java.lang.Integer.valueOf(i17 != 0 ? i17 != 1 ? 0 : 1 : 2);
        objArr[2] = java.lang.Integer.valueOf(activityC16377xf00b6def.Y6());
        objArr[3] = 0;
        objArr[4] = 2;
        g0Var.d(11701, objArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", "open btn click! mLiveId[%s]", activityC16377xf00b6def.f227852y1);
        fo3.m mVar = this.f228678e;
        mVar.onClick(v17);
        if (mVar.f346448i) {
            w04.l.INSTANCE.ac(540999719, mVar.f346446g, true);
        }
        android.widget.Button button = activityC16377xf00b6def.f227836o;
        if (button != null) {
            button.setClickable(false);
        }
        activityC16377xf00b6def.d7(ml2.f5.f408993h, true);
        activityC16377xf00b6def.W6("");
    }
}
