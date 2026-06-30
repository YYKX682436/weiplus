package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af;

/* loaded from: classes7.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.x f165738a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.x();

    public static void a(java.lang.String str, kg1.a aVar, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.v vVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.t.f165733a;
        java.lang.String str4 = ((kg1.h) aVar).f389226a;
        long a17 = f165738a.a(str4, str, aVar);
        java.util.List list = (java.util.List) ((java.util.HashMap) vVar.f165734a).get(str4);
        if (list == null) {
            return;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1 w1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1) ((kg1.e) list.get(i17));
            w1Var.getClass();
            w1Var.e(str, aVar, a17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u1.f169891e);
        }
    }
}
