package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class v3 implements qk.y7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16555xc2a48267 f230970a;

    public v3(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16555xc2a48267 activityC16555xc2a48267) {
        this.f230970a = activityC16555xc2a48267;
    }

    @Override // qk.y7
    public void a(qk.g6 g6Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TestVideoEditUI", "[onSelectedFeature] features:%s", g6Var.name());
    }

    @Override // qk.y7
    public void b(qk.g6 g6Var, int i17, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TestVideoEditUI", "[onSelectedDetailFeature] features:%s index:%s", g6Var.name(), java.lang.Integer.valueOf(i17));
    }

    @Override // qk.y7
    public void c(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16555xc2a48267 activityC16555xc2a48267 = this.f230970a;
        if (z17) {
            activityC16555xc2a48267.mo26063x7b383410();
        } else {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16555xc2a48267.f230790e;
            activityC16555xc2a48267.mo53060x36654fab(activityC16555xc2a48267.m78513xc2a54588());
        }
    }
}
