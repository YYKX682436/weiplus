package com.tencent.mm.plugin.appbrand.jsapi.webview;

/* loaded from: classes3.dex */
public final class e implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.webview.EmojiFetcher$EmojiArgs f83880a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f83881b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f83882c;

    public e(com.tencent.mm.plugin.appbrand.jsapi.webview.EmojiFetcher$EmojiArgs emojiFetcher$EmojiArgs, kotlinx.coroutines.q qVar, kotlin.jvm.internal.h0 h0Var) {
        this.f83880a = emojiFetcher$EmojiArgs;
        this.f83881b = qVar;
        this.f83882c = h0Var;
    }

    @Override // dr.q
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHTMLWebView.EmojiFetcher.MMLogic", "load with args:" + this.f83880a + ", async load success:" + z17);
        kotlinx.coroutines.q qVar = this.f83881b;
        if (!z17) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(null));
        } else {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(this.f83882c.f310123d));
        }
    }
}
