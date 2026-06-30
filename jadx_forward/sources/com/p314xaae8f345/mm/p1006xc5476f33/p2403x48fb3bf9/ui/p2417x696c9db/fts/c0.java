package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f265894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265896f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265897g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 f265898h;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 abstractActivityC19367xd1ae8c74, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f265898h = abstractActivityC19367xd1ae8c74;
        this.f265894d = i17;
        this.f265895e = str;
        this.f265896f = str2;
        this.f265897g = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f265898h.s9().R(this.f265894d, this.f265895e, this.f265896f, this.f265897g, "onSearchWebQueryReady");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "onSearchWebQueryReady, ret = %d, errMsg = %s, json = %s", java.lang.Integer.valueOf(this.f265894d), this.f265895e, this.f265896f);
    }
}
