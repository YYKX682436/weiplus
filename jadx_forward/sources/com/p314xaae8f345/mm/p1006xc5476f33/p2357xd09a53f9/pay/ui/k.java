package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class k extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9 f260308d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9 activityC19031x1cc5b0e9) {
        super(false);
        this.f260308d = activityC19031x1cc5b0e9;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9 activityC19031x1cc5b0e9 = this.f260308d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var = activityC19031x1cc5b0e9.f260188g;
        if (n8Var != null) {
            n8Var.dismiss();
        }
        activityC19031x1cc5b0e9.V6(false);
        activityC19031x1cc5b0e9.f260193o.c(activityC19031x1cc5b0e9.f260189h, true);
        activityC19031x1cc5b0e9.f260199u = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178) view.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 c19098xdf4bc178 = activityC19031x1cc5b0e9.f260199u;
        if (c19098xdf4bc178 != null) {
            c19098xdf4bc178.f261204h = "";
        }
        activityC19031x1cc5b0e9.m83105x7498fe14().putParcelable("key_favor_pay_info", activityC19031x1cc5b0e9.f260199u);
        activityC19031x1cc5b0e9.b7();
        activityC19031x1cc5b0e9.mo67598xf0aced2e(0);
        activityC19031x1cc5b0e9.f260201w = null;
    }
}
