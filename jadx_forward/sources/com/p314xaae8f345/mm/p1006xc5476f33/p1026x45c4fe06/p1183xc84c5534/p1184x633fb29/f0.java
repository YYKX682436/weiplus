package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29;

/* loaded from: classes7.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f169475d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.g0 g0Var, java.lang.Object[] objArr) {
        this.f169475d = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr = this.f169475d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c.class, true);
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Report.kv_13536", "report get null kvReporter");
            return;
        }
        try {
            try {
                java.lang.String str = (java.lang.String) objArr[19];
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    objArr[19] = s91.a.a(str);
                }
                java.lang.String str2 = (java.lang.String) objArr[19];
                if ((str2 == null ? "" : str2).length() > 1024) {
                    objArr[19] = str2.substring(0, 1024);
                }
            } catch (java.lang.Exception unused) {
                objArr[19] = "";
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            }
            int[] iArr = {1, 11, 13};
            for (int i17 = 0; i17 < 3; i17++) {
                int i18 = iArr[i17];
                java.lang.String str3 = (java.lang.String) objArr[i18];
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if ((str3 == null ? "" : str3).length() > 1024) {
                    objArr[i18] = str3.substring(0, 1024);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Report.kv_13536", "report " + java.util.Arrays.deepToString(objArr));
            ((ch1.d) cVar).c(13536, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.o2.a(objArr));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.d();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d.f(false);
        } catch (java.lang.Throwable th6) {
            java.lang.String str4 = (java.lang.String) objArr[19];
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if ((str4 != null ? str4 : "").length() > 1024) {
                objArr[19] = str4.substring(0, 1024);
            }
            throw th6;
        }
    }
}
