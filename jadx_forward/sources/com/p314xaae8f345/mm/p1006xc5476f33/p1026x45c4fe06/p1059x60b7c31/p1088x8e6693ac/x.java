package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac;

/* loaded from: classes4.dex */
public class x extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f162533d = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.w.f162532t, "LaunchBusinessWxaAppInfo")};

    public x(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.w.f162532t, "LaunchBusinessWxaAppInfo", null);
    }

    public boolean d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.w();
        wVar.f66785x181ecb5 = str;
        return super.mo9951xb06685ab(wVar, "businessAppInfoKey");
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.w y0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.w();
        wVar.f66785x181ecb5 = str;
        if (super.get(wVar, "businessAppInfoKey")) {
            return wVar;
        }
        return null;
    }

    public boolean z0(java.lang.String str, byte[] bArr, long j17, long j18) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.w();
        wVar.f66785x181ecb5 = str;
        wVar.f66786xa7075739 = j17;
        wVar.f66788x965c1e8 = bArr;
        wVar.f66787xaacf9851 = j18;
        return y0(str) == null ? super.mo880xb970c2b9(wVar) : super.mo9952xce0038c9(wVar, "businessAppInfoKey");
    }
}
