package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* loaded from: classes8.dex */
public class c1 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f264780a;

    public c1(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59) {
        this.f264780a = c22633x83752a59;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave reportOnLeaveForMp onReceiveValue");
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.a1(this));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave onReceiveValue but null");
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.b1(this, str), "WebViewReportOnLeaveThread");
    }
}
