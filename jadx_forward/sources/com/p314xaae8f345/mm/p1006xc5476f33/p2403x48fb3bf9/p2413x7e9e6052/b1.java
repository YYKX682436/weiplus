package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* loaded from: classes8.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264777d;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.c1 c1Var, java.lang.String str) {
        this.f264777d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Exception e17;
        java.lang.String str3;
        org.json.JSONObject jSONObject;
        java.lang.String str4 = this.f264777d;
        try {
            str3 = u46.k.e(str4.substring(1, str4.length() - 1));
            try {
                jSONObject = new org.json.JSONObject(str3);
                str = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "");
            } catch (java.lang.Exception e18) {
                e = e18;
                str = "";
                str2 = str;
            }
        } catch (java.lang.Exception e19) {
            str = "";
            str2 = str;
            e17 = e19;
            str3 = str2;
        }
        try {
            str2 = jSONObject.optString("music_data", "");
        } catch (java.lang.Exception e27) {
            e = e27;
            str2 = "";
            e17 = e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave, ex = %s, %s", e17.getMessage(), str3);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.f1.b(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.f1.c(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave reportData size=%d", java.lang.Integer.valueOf(str4.length()));
        }
        try {
            cy4.b bVar = cy4.b.f306392a;
            if (bVar.a()) {
                try {
                    java.lang.String optString = jSONObject.optString("native_data", "");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPVideoPreviewDataMgr", "reportOnLeaveForMP native_data null");
                    } else {
                        bVar.c(optString);
                    }
                } catch (java.lang.Exception e28) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPVideoPreviewDataMgr", "reportOnLeave, ex = %s", e28.getMessage());
                }
            }
        } catch (java.lang.Exception e29) {
            e17 = e29;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave, ex = %s, %s", e17.getMessage(), str3);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.f1.b(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.f1.c(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave reportData size=%d", java.lang.Integer.valueOf(str4.length()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.f1.b(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.f1.c(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave reportData size=%d", java.lang.Integer.valueOf(str4.length()));
    }
}
