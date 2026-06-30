package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui;

/* loaded from: classes9.dex */
public class l implements xw1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xw1.j f177846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd f177847b;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd activityC13135x13db66fd, xw1.j jVar) {
        this.f177847b = activityC13135x13db66fd;
        this.f177846a = jVar;
    }

    @Override // xw1.b
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        xw1.j jVar = this.f177846a;
        java.lang.String str2 = jVar.f539216p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd activityC13135x13db66fd = this.f177847b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardMainUI", "set succ: %s, %s", str2, activityC13135x13db66fd.f177770p.getText());
        if (jVar.f539216p.equals(activityC13135x13db66fd.A)) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_WORD_STRING_SYNC, activityC13135x13db66fd.A);
            activityC13135x13db66fd.Z6();
        }
    }
}
