package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes8.dex */
public class b1 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f175255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840 f175256e;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840 activityC12946xbb486840, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f175256e = activityC12946xbb486840;
        this.f175255d = m1Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840 activityC12946xbb486840 = this.f175256e;
        if (activityC12946xbb486840.f175234v.get() != null && !((com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840) activityC12946xbb486840.f175234v.get()).isFinishing()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840) activityC12946xbb486840.f175234v.get()).d7();
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840 activityC12946xbb4868402 = (com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840) activityC12946xbb486840.f175234v.get();
                activityC12946xbb4868402.getClass();
                r45.kb0 kb0Var = (r45.kb0) oVar.f152244b.f152233a;
                if (kb0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kb0Var.f460105d)) {
                    activityC12946xbb4868402.l7("");
                } else {
                    c01.n2.d().c("kWXEntryActivity_data_center_session_id", true).i("kWXEntryActivity_data_center_wework_msgcontent", kb0Var.f460105d);
                    activityC12946xbb4868402.b7(this.f175255d, null);
                }
                return 0;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840) activityC12946xbb486840.f175234v.get()).h7(i17, i18, str);
        }
        return 0;
    }
}
