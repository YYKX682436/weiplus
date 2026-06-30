package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f266160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f266161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266162f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357 f266163g;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357 activityC19379x488a6357, int i17, long j17, java.lang.String str) {
        this.f266163g = activityC19379x488a6357;
        this.f266160d = i17;
        this.f266161e = j17;
        this.f266162f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f266163g.f265377p0;
        if (nVar != null) {
            int i17 = this.f266160d;
            long j17 = this.f266161e;
            java.lang.String str = this.f266162f;
            nVar.n0(i17, j17, str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "wxaapp_opsearch resp, ret = %d, reqId = %d, json = %s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), str);
        }
    }
}
