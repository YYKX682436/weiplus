package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f266061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f266062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266063f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 f266064g;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 activityC19366xa1004627, int i17, long j17, java.lang.String str) {
        this.f266064g = activityC19366xa1004627;
        this.f266061d = i17;
        this.f266062e = j17;
        this.f266063f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f266064g.f265377p0;
        if (nVar != null) {
            int i17 = this.f266061d;
            long j17 = this.f266062e;
            java.lang.String str = this.f266063f;
            nVar.n0(i17, j17, str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "wxaapp_opsearch resp, ret = %d, reqId = %d, json = %s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), str);
        }
    }
}
