package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask f83219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f83220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f83221f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.u f83222g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83223h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.l f83224i;

    public r(com.tencent.mm.plugin.appbrand.jsapi.share.l lVar, com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask sendAppMessageTask, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, java.lang.String str) {
        this.f83224i = lVar;
        this.f83219d = sendAppMessageTask;
        this.f83220e = c0Var;
        this.f83221f = i17;
        this.f83222g = uVar;
        this.f83223h = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageBase", "task callback");
        com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask sendAppMessageTask = this.f83219d;
        sendAppMessageTask.x();
        com.tencent.mm.plugin.appbrand.jsapi.share.l lVar = this.f83224i;
        lVar.f83174h = false;
        com.tencent.mm.plugin.appbrand.jsapi.share.u uVar = this.f83222g;
        java.lang.String str = this.f83223h;
        this.f83220e.a(this.f83221f, lVar.p("ok", lVar.H(uVar, sendAppMessageTask, str)));
        lVar.K(true, uVar, str);
    }
}
