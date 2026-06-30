package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242;

/* loaded from: classes7.dex */
public final class n0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.h5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.p0 f158247a;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.p0 p0Var) {
        this.f158247a = p0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.h5
    public void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AVDeviceUsageDatas", "onPhoneCall: " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.p0 p0Var = this.f158247a;
        boolean andSet = p0Var.f158261b.getAndSet(true);
        yz5.l lVar = p0Var.f158260a;
        if (andSet) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(i17));
            return;
        }
        if (((java.lang.Boolean) ((jz5.n) p0Var.f158262c).mo141623x754a37bb()).booleanValue()) {
            boolean Bi = com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.Bi();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.o.f158248a;
            if (Bi == (2 == i17)) {
                lVar.mo146xb9724478(java.lang.Integer.valueOf(i17));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AVDeviceUsageDatas", "skip first.");
    }
}
