package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f266039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f266040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266041f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e f266042g;

    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e activityC19391xc941d0e, int i17, long j17, java.lang.String str) {
        this.f266042g = activityC19391xc941d0e;
        this.f266039d = i17;
        this.f266040e = j17;
        this.f266041f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f266042g.f265377p0;
        if (nVar != null) {
            int i17 = this.f266039d;
            long j17 = this.f266040e;
            java.lang.String str = this.f266041f;
            nVar.n0(i17, j17, str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "wxaapp_opsearch resp, ret = %d, reqId = %d, json = %s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), str);
        }
    }
}
