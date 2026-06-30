package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class g7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f159722d;

    public g7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f159722d = o6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(this.f159722d.f156336n);
        if (b17 != null && this.f159722d != b17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "clearDuplicatedInstanceOnAppCreate duplicated[%d] this[%d]", java.lang.Integer.valueOf(b17.hashCode()), java.lang.Integer.valueOf(hashCode()));
            b17.K2();
        }
        new com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3943x709bcd95(this.f159722d).d();
    }
}
