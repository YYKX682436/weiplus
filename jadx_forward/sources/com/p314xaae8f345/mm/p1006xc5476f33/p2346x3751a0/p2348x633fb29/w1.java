package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class w1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.a2 f258443d;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.a2 a2Var) {
        this.f258443d = a2Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z1 z1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z1 z1Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z1 z1Var3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.a2 a2Var = this.f258443d;
        if (!a2Var.f257862g) {
            return false;
        }
        byte[] bArr = new byte[4];
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = a2Var.f257857b;
        c18912x54425f62.m72841x430a65b(54, bArr, 1);
        if (bArr[0] == 1) {
            if (a2Var.f257856a != 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.f258350d2++;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.f258352f2++;
            if (!a2Var.f257859d && gq4.v.Ni()) {
                a2Var.f257859d = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipNetStatusChecker", "onNetWorkChangeToMobileNet");
                java.lang.ref.WeakReference weakReference = a2Var.f257861f;
                if (weakReference != null && (z1Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z1) weakReference.get()) != null) {
                    z1Var3.p();
                }
            }
            if (gq4.v.Ni()) {
                a2Var.f257859d = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipNetStatusChecker", "onNetWorkCostMax");
                java.lang.ref.WeakReference weakReference2 = a2Var.f257861f;
                if (weakReference2 != null && (z1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z1) weakReference2.get()) != null) {
                    z1Var2.k();
                }
            }
        }
        a2Var.f257856a = bArr[0];
        byte[] bArr2 = new byte[4];
        int[] iArr = {-1, -1};
        if (c18912x54425f62.m72841x430a65b(10, bArr2, 4) >= 0) {
            int b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.b(bArr2);
            iArr[0] = b17;
            if (b17 >= 0 && b17 < 5) {
                iArr[1] = c18912x54425f62.m72780x169aa083();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipNetStatusChecker", "netStatus: %d net_bottleneck_side %d", java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(iArr[1]));
            }
        }
        int i17 = iArr[0];
        if (i17 != -1) {
            int i18 = iArr[1];
            if (i17 < 5) {
                if (i18 != -1) {
                    if (i18 == 0) {
                        a2Var.b(true);
                    }
                    if (i18 == 1) {
                        a2Var.b(false);
                    }
                }
            } else if (a2Var.f257858c) {
                int i19 = a2Var.f257863h;
                if (i19 < 1) {
                    a2Var.f257863h = i19 + 1;
                } else {
                    a2Var.f257858c = false;
                    java.lang.ref.WeakReference weakReference3 = a2Var.f257861f;
                    if (weakReference3 != null && (z1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z1) weakReference3.get()) != null) {
                        z1Var.b();
                    }
                }
            }
        }
        return true;
    }
}
