package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui;

/* loaded from: classes9.dex */
public class f implements xw1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xw1.g f177829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13134x46be31c0 f177830b;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13134x46be31c0 activityC13134x46be31c0, xw1.g gVar) {
        this.f177830b = activityC13134x46be31c0;
        this.f177829a = gVar;
    }

    @Override // xw1.b
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        xw1.g gVar = this.f177829a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QrRewardGrantUI", "place order error: %s, %s", java.lang.Integer.valueOf(gVar.f539205n.f456198d), gVar.f539205n.f456199e);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.f539205n.f456199e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13134x46be31c0 activityC13134x46be31c0 = this.f177830b;
        if (!K0) {
            dp.a.m125854x26a183b(activityC13134x46be31c0, gVar.f539205n.f456199e, 0).show();
        }
        z17 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) activityC13134x46be31c0).f39902xe856ec83;
        if (z17) {
            activityC13134x46be31c0.mo48627xce38d9a();
        }
    }
}
