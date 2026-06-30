package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f266120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266122f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 f266123g;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 abstractActivityC19367xd1ae8c74, int i17, java.lang.String str, java.lang.String str2) {
        this.f266123g = abstractActivityC19367xd1ae8c74;
        this.f266120d = i17;
        this.f266121e = str;
        this.f266122f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f266123g.s9().R(this.f266120d, this.f266121e, this.f266122f, "", "onSimilarEmoticonReady");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "wxaapp_opsearch resp, ret = %d, errMsg = %s, json = %s", java.lang.Integer.valueOf(this.f266120d), this.f266121e, this.f266122f);
    }
}
