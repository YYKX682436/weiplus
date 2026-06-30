package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class xf implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6 f229223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e f229224b;

    public xf(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e activityC16380x9ede44e, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6 f6Var) {
        this.f229224b = activityC16380x9ede44e;
        this.f229223a = f6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.k0
    public void a(r45.n34 n34Var) {
        int i17 = n34Var.f462582e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e activityC16380x9ede44e = this.f229224b;
        if (i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "click right button");
            activityC16380x9ede44e.finish();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "click left button");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l6 l6Var = activityC16380x9ede44e.R1;
        int i18 = l6Var.f226951h;
        int i19 = l6Var.f226952i;
        java.lang.String str = l6Var.f226953m;
        java.lang.String str2 = l6Var.f226954n;
        java.lang.String str3 = l6Var.P;
        java.lang.String str4 = this.f229223a.f226825w;
        activityC16380x9ede44e.P1 = true;
        activityC16380x9ede44e.m66165x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6(i18, i19, str, str2, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.l(), c01.z1.l(), activityC16380x9ede44e.getIntent().getStringExtra("key_username"), "v1.0", str3, str4), true);
    }
}
