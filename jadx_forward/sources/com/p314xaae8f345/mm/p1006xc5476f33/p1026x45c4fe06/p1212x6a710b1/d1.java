package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class d1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.k2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e1 f171938d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e1 e1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b1 b1Var) {
        this.f171938d = e1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.k2, k75.c
    public void a() {
        super.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e1.q(this.f171938d);
    }

    @Override // k75.c
    public boolean c(android.os.Message message) {
        int i17 = message.what;
        if (1 != i17 && 2 != i17) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e1.q(this.f171938d);
        return true;
    }

    @Override // k75.c, k75.a
    /* renamed from: getName */
    public java.lang.String mo51017xfb82e301() {
        return this.f171938d.f171944i + "|StateIdle";
    }
}
