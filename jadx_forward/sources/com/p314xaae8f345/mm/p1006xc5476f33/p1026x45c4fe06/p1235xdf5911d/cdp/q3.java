package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp;

/* loaded from: classes7.dex */
public final class q3 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp.s3 f173715d;

    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp.s3 s3Var) {
        this.f173715d = s3Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp.s3 s3Var = this.f173715d;
        java.util.Iterator it = s3Var.f173719x.iterator();
        while (it.hasNext()) {
            ((lk1.b) it.next()).j(0, "ok", s3Var.f("wgs84"));
        }
        java.util.Iterator it6 = s3Var.f173720y.iterator();
        while (it6.hasNext()) {
            ((lk1.b) it6.next()).j(0, "ok", s3Var.f("gcj02"));
        }
        return true;
    }
}
