package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui;

/* loaded from: classes9.dex */
public class c0 implements xw1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xw1.d f177823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd f177824b;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd activityC13135x13db66fd, xw1.d dVar) {
        this.f177824b = activityC13135x13db66fd;
        this.f177823a = dVar;
    }

    @Override // xw1.b
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        xw1.d dVar = this.f177823a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QrRewardMainUI", "get code error: %s, %s", java.lang.Integer.valueOf(dVar.f539197n.f459675d), dVar.f539197n.f459676e);
        r45.jw jwVar = dVar.f539197n;
        int i19 = jwVar.f459675d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd activityC13135x13db66fd = this.f177824b;
        if (i19 != 416) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jwVar.f459676e)) {
                dp.a.m125854x26a183b(activityC13135x13db66fd, dVar.f539197n.f459676e, 0).show();
            }
            if (dVar.f539199p) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd.U6(activityC13135x13db66fd, false);
            return;
        }
        r45.lj5 lj5Var = jwVar.f459689u;
        activityC13135x13db66fd.f177762e.setVisibility(4);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("realname_verify_process_jump_activity", ".reward.ui.CollectMainUI");
        bundle.putString("realname_verify_process_jump_plugin", "collect");
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd activityC13135x13db66fd2 = this.f177824b;
        r45.jw jwVar2 = dVar.f539197n;
        zs4.q.d(activityC13135x13db66fd2, jwVar2.f459675d, jwVar2.f459689u, bundle, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.b0(this), null, 1011, 2);
    }
}
