package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f267017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267018f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267019g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267020h;

    public w(java.lang.String str, java.util.HashMap hashMap, java.lang.String str2, nw4.k kVar, nw4.y2 y2Var) {
        this.f267016d = str;
        this.f267017e = hashMap;
        this.f267018f = str2;
        this.f267019g = kVar;
        this.f267020h = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f267016d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        java.util.HashMap hashMap = this.f267017e;
        if (!K0) {
            hashMap.put("originalImageLocalIdArr", new org.json.JSONArray(new java.lang.String[]{str}));
        }
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePassport", "choosePassport callback localId:%s hasOriginal:%b originalCount:%d", this.f267018f, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(z17 ? 1 : 0));
        this.f267019g.f422396d.e(this.f267020h.f422546c, "choosePassport:ok", hashMap);
    }
}
