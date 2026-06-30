package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public abstract class c3 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f259157a = "";

    public static java.lang.String a(java.lang.String str) {
        return android.net.Uri.parse(str).getQueryParameter("operate_id");
    }

    public static void b(java.lang.String str) {
        java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("trace_info");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter)) {
            return;
        }
        c(queryParameter);
    }

    public static void c(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtTraceInfoStore", "trace info: %s", str);
        f259157a = str;
    }
}
