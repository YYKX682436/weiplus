package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f267040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f267041f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f267042g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267043h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267044i;

    public x(java.lang.String str, long j17, long j18, java.util.HashMap hashMap, nw4.k kVar, nw4.y2 y2Var) {
        this.f267039d = str;
        this.f267040e = j17;
        this.f267041f = j18;
        this.f267042g = hashMap;
        this.f267043h = kVar;
        this.f267044i = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        try {
            str = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b0.f(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b0.f266472d, this.f267039d, this.f267040e, this.f267041f);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiChoosePassport", e17, "choosePassport save original image error", new java.lang.Object[0]);
            str = null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.w(str, this.f267042g, this.f267039d, this.f267043h, this.f267044i));
    }
}
