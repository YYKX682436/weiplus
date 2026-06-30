package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes9.dex */
public final class a3 implements tg3.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f83110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f83111b;

    public a3(java.lang.String str, kotlin.jvm.internal.f0 f0Var, java.lang.Runnable runnable) {
        this.f83110a = f0Var;
        this.f83111b = runnable;
    }

    @Override // tg3.z0
    public final void a() {
        kotlin.jvm.internal.f0 f0Var = this.f83110a;
        int i17 = f0Var.f310116d - 1;
        f0Var.f310116d = i17;
        if (i17 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShareVideoAfterSelectConversation, send video done");
            this.f83111b.run();
        }
    }
}
