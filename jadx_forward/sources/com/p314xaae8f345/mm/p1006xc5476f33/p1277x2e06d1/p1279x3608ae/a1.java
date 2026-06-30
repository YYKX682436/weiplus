package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes8.dex */
public class a1 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f175251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840 f175252e;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840 activityC12946xbb486840, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f175252e = activityC12946xbb486840;
        this.f175251d = m1Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXEntryActivity", "callback() called with: errType = [" + i17 + "], errCode = [" + i18 + "], errMsg = [" + str + "], rr = [" + oVar + "], scene = [" + m1Var + "]");
        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840 activityC12946xbb486840 = this.f175252e;
        if (activityC12946xbb486840.f175234v.get() != null && !((com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840) activityC12946xbb486840.f175234v.get()).isFinishing()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840) activityC12946xbb486840.f175234v.get()).d7();
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840 activityC12946xbb4868402 = (com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840) activityC12946xbb486840.f175234v.get();
                activityC12946xbb4868402.getClass();
                r45.ib0 ib0Var = (r45.ib0) oVar.f152244b.f152233a;
                if (ib0Var != null) {
                    java.util.LinkedList linkedList = ib0Var.f458431d;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                        c01.n2.d().c("kWXEntryActivity_data_center_session_id", true).i("kWXEntryActivity_data_center_wework_msg_list", linkedList);
                        activityC12946xbb4868402.b7(this.f175251d, null);
                        return 0;
                    }
                }
                activityC12946xbb4868402.l7("");
                return 0;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840) activityC12946xbb486840.f175234v.get()).h7(i17, i18, str);
        }
        return 0;
    }
}
