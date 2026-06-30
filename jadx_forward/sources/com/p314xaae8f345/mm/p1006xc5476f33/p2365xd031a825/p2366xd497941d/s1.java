package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class s1 extends com.p314xaae8f345.mm.ui.ac {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f f261023e;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f activityC19081x5e445f1f) {
        this.f261023e = activityC19081x5e445f1f;
    }

    @Override // com.p314xaae8f345.mm.ui.ac
    public void a(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f activityC19081x5e445f1f = this.f261023e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f.U6(activityC19081x5e445f1f);
        if (activityC19081x5e445f1f.f260803g.isEnabled()) {
            np5.g m83106x57340563 = activityC19081x5e445f1f.m83106x57340563();
            if (!(m83106x57340563 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.u)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WcPayRealNameVerifyCodeUI", "wrong controller");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.u uVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.u) m83106x57340563;
            java.lang.String m83183xfb85ada3 = activityC19081x5e445f1f.f260800d.m83183xfb85ada3();
            java.lang.String str = activityC19081x5e445f1f.f260808o;
            java.lang.String m83183xfb85ada32 = activityC19081x5e445f1f.f260801e.m83183xfb85ada3();
            uVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "do check verify code");
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) uVar.f420366a).m83137x918cb44a();
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar = uVar.f261032d;
            java.lang.String string = aVar.f295334c.getString("realname_verify_process_req_key", "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f260855l)) {
                string = aVar.f260855l;
            }
            new ys4.c(string, m83183xfb85ada3, str, m83183xfb85ada32).l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.s(uVar));
        }
    }
}
