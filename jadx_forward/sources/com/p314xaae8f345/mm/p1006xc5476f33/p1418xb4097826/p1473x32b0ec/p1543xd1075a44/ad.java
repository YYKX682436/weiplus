package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ad implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf f199289d;

    public ad(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf c14394xb058b2bf) {
        this.f199289d = c14394xb058b2bf;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf c14394xb058b2bf = this.f199289d;
        if (c14394xb058b2bf.f199126m) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf.a(c14394xb058b2bf);
            return true;
        }
        long j17 = c14394xb058b2bf.f199127n;
        if (j17 <= 0) {
            return true;
        }
        c14394xb058b2bf.f199127n = j17 - 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf.a(c14394xb058b2bf);
        return true;
    }
}
