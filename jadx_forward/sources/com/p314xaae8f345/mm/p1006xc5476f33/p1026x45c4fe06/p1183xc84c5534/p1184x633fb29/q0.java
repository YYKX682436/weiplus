package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29;

/* loaded from: classes7.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f169603d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.r0 r0Var, java.lang.Object[] objArr) {
        this.f169603d = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr = this.f169603d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c.class, true);
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Report.kv_14992", "report get null kvReporter");
            return;
        }
        try {
            java.lang.String str = (java.lang.String) objArr[18];
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                int indexOf = str.indexOf(63);
                objArr[18] = indexOf < 0 ? "" : fp.s0.a(str.substring(indexOf + 1, str.length()));
            }
        } catch (java.lang.Exception unused) {
            objArr[18] = "";
        }
        ((ch1.d) cVar).c(14992, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.o2.a(objArr));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d.f(false);
    }
}
