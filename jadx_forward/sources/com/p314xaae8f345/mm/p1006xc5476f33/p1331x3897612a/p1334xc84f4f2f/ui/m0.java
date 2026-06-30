package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui;

/* loaded from: classes9.dex */
public class m0 implements xw1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xw1.i f177850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13137x38066d82 f177851b;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13137x38066d82 activityC13137x38066d82, xw1.i iVar) {
        this.f177851b = activityC13137x38066d82;
        this.f177850a = iVar;
    }

    @Override // xw1.b
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        xw1.i iVar = this.f177850a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QrRewardSetMoneyUI", "set code error: %s, %s", java.lang.Integer.valueOf(iVar.f539211n.f464975d), iVar.f539211n.f464976e);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f539211n.f464976e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13137x38066d82 activityC13137x38066d82 = this.f177851b;
        if (K0) {
            dp.a.m125853x26a183b(activityC13137x38066d82, com.p314xaae8f345.mm.R.C30867xcad56011.hpc, 1).show();
        } else {
            dp.a.m125854x26a183b(activityC13137x38066d82, iVar.f539211n.f464976e, 1).show();
        }
    }
}
