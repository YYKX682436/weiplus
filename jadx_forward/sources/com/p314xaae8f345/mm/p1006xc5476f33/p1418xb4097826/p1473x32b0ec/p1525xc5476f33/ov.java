package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ov implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow f195317d;

    public ov(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar) {
        this.f195317d = owVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar = this.f195317d;
        int[] iArr = owVar.S;
        if (iArr[0] != 0 && iArr[1] != 0) {
            if (owVar.R <= 0) {
                this.f195317d.F = false;
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar2 = this.f195317d;
            owVar2.R--;
            if (!this.f195317d.E) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar3 = this.f195317d;
                int[] iArr2 = owVar3.S;
                int i17 = iArr2[0];
                int i18 = iArr2[1];
                android.graphics.Bitmap G1 = owVar3.G1();
                if (G1 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(owVar3.f195320p, "emitLikeConfettiToAnchor: bitmap is null");
                } else {
                    owVar3.x1(G1, i17, i18, true, owVar3.M, owVar3.N, 1.0f);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar4 = this.f195317d;
            int i19 = owVar4.U + 1;
            owVar4.U = i19;
            if (i19 % owVar4.T == 0) {
                int[] iArr3 = owVar4.S;
                owVar4.v1(iArr3[0], iArr3[1]);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar5 = this.f195317d;
                owVar5.U = 0;
                owVar5.Q.clear();
            }
        }
        return true;
    }
}
