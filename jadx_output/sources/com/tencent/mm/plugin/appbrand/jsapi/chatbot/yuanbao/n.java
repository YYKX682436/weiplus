package com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao;

/* loaded from: classes.dex */
public final class n implements l81.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f80328b;

    public n(java.lang.String str, kotlinx.coroutines.q qVar) {
        this.f80327a = str;
        this.f80328b = qVar;
    }

    @Override // l81.v0
    public void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandYuanbaoService", "startPreRender appId:" + this.f80327a + " errCode:" + i17 + " errMsg:" + str);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        ((kotlinx.coroutines.r) this.f80328b).resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
    }

    @Override // l81.v0
    public void onSuccess() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandYuanbaoService", "startPreRender appId:" + this.f80327a + " success");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        ((kotlinx.coroutines.r) this.f80328b).resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
    }
}
