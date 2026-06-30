package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class j implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9 f260305a;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9 activityC19031x1cc5b0e9) {
        this.f260305a = activityC19031x1cc5b0e9;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m8
    public void a(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 c19098xdf4bc178, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9 activityC19031x1cc5b0e9 = this.f260305a;
        if (activityC19031x1cc5b0e9.f260203y) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletChangeBankcardUI", "has receive cancel");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(965L, 3L, 1L);
            return;
        }
        activityC19031x1cc5b0e9.f260199u = c19098xdf4bc178;
        activityC19031x1cc5b0e9.m83105x7498fe14().putParcelable("key_favor_pay_info", activityC19031x1cc5b0e9.f260199u);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 c19098xdf4bc1782 = activityC19031x1cc5b0e9.f260199u;
        if (c19098xdf4bc1782 == null || !z17) {
            activityC19031x1cc5b0e9.f260198t = str;
            activityC19031x1cc5b0e9.mo48674x36654fab();
            activityC19031x1cc5b0e9.U6(str);
            activityC19031x1cc5b0e9.f260201w = null;
            return;
        }
        if (c19098xdf4bc1782 != null) {
            activityC19031x1cc5b0e9.V6(true);
            activityC19031x1cc5b0e9.f260193o.c(activityC19031x1cc5b0e9.f260189h, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var = activityC19031x1cc5b0e9.f260188g;
        if (n8Var != null) {
            n8Var.dismiss();
        }
        activityC19031x1cc5b0e9.b7();
        activityC19031x1cc5b0e9.mo67598xf0aced2e(0);
    }
}
