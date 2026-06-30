package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class gk extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo3.m f228487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 f228488e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 activityC16387x8521db9, fo3.m mVar) {
        super(false);
        this.f228488e = activityC16387x8521db9;
        this.f228487d = mVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        gb3.o.f351568a.a(4);
        li3.g gVar = (li3.g) ((h45.s) i95.n0.c(h45.s.class));
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 activityC16387x8521db9 = this.f228488e;
        gVar.Ri(activityC16387x8521db9, 10, 3);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        int i17 = activityC16387x8521db9.D1.f226965y;
        g0Var.d(11701, 5, java.lang.Integer.valueOf(i17 == 1 ? 1 : i17 == 0 ? 2 : 0), java.lang.Integer.valueOf(activityC16387x8521db9.X6()), 0, 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "open btn click! mLiveId[%s]", activityC16387x8521db9.f228010p1);
        fo3.m mVar = this.f228487d;
        mVar.onClick(view);
        if (mVar.f346448i) {
            w04.l.INSTANCE.ac(540999719, mVar.f346446g, true);
        }
        activityC16387x8521db9.f228007o.setClickable(false);
        activityC16387x8521db9.d7(ml2.f5.f408993h, true);
        activityC16387x8521db9.V6("");
    }
}
