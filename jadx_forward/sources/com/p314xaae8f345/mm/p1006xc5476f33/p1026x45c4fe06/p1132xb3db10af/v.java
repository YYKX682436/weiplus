package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af;

/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f165734a = new java.util.HashMap();

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.r rVar) {
    }

    public void a(java.lang.String str, java.lang.String str2, kg1.a aVar, long j17) {
        java.util.List list = (java.util.List) ((java.util.HashMap) this.f165734a).get(str);
        if (list == null) {
            return;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1 w1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1) ((kg1.e) list.get(i17));
            w1Var.getClass();
            w1Var.e(str2, aVar, j17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u1.f169891e);
        }
    }

    public final void b(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.u uVar) {
        java.util.List list = (java.util.List) ((java.util.HashMap) this.f165734a).get(str);
        if (list == null) {
            return;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            uVar.a((kg1.e) list.get(i17));
        }
    }
}
