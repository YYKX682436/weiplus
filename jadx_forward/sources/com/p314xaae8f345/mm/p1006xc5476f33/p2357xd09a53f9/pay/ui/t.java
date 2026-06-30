package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class t implements com.p314xaae8f345.mm.p2802xd031a825.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19033x1e329dde f260340a;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19033x1e329dde activityC19033x1e329dde) {
        this.f260340a = activityC19033x1e329dde;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.g
    /* renamed from: onProcessEnd */
    public android.content.Intent mo14634xe047072b(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19033x1e329dde activityC19033x1e329dde = this.f260340a;
        if (i17 == -1) {
            activityC19033x1e329dde.m83099x5406100e(new zr4.c(activityC19033x1e329dde.f260217r), true);
        } else {
            at4.t1 bj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).bj();
            if (bj6.c()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c b17 = bj6.b();
                if (b17 == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.f69239x93565523)) {
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19033x1e329dde.f260205w;
                    activityC19033x1e329dde.V6();
                } else {
                    activityC19033x1e329dde.W6(b17, activityC19033x1e329dde.f260215p, activityC19033x1e329dde.f260216q);
                }
            } else {
                activityC19033x1e329dde.setResult(0, null);
            }
        }
        return null;
    }
}
