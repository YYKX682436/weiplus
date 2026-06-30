package com.tencent.mm.plugin.appbrand.jsapi.webview;

/* loaded from: classes7.dex */
public final class h implements com.tencent.mm.ipcinvoker.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.webview.EmojiFetcher$EmojiArgs f83888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f83889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83890f;

    public h(com.tencent.mm.plugin.appbrand.jsapi.webview.EmojiFetcher$EmojiArgs emojiFetcher$EmojiArgs, kotlinx.coroutines.q qVar, java.lang.String str) {
        this.f83888d = emojiFetcher$EmojiArgs;
        this.f83889e = qVar;
        this.f83890f = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        byte[] bArr = null;
        java.lang.String str = iPCString != null ? iPCString.f68406d : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetch with args:");
        com.tencent.mm.plugin.appbrand.jsapi.webview.EmojiFetcher$EmojiArgs emojiFetcher$EmojiArgs = this.f83888d;
        sb6.append(emojiFetcher$EmojiArgs);
        sb6.append(", onCallback(");
        sb6.append((java.lang.String) str);
        sb6.append(')');
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHTMLWebView.EmojiFetcher", sb6.toString());
        boolean z17 = str == 0 || str.length() == 0;
        kotlinx.coroutines.q qVar = this.f83889e;
        try {
            if (z17) {
                ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(null));
                return;
            }
            try {
                byte[] c17 = s46.d.c(com.tencent.mm.vfs.w6.E(str));
                com.tencent.mm.plugin.appbrand.jsapi.webview.i.f83892b.put(this.f83890f, c17);
                com.tencent.mm.vfs.w6.h(str);
                bArr = c17;
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandHTMLWebView.EmojiFetcher", "fetch with args:" + emojiFetcher$EmojiArgs + ", decode gif bytes with exception:" + e17);
                com.tencent.mm.vfs.w6.h(str);
            }
            str = kotlin.Result.m521constructorimpl(bArr);
            ((kotlinx.coroutines.r) qVar).resumeWith(str);
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.vfs.w6.h(str);
            throw th6;
        }
    }

    @Override // com.tencent.mm.ipcinvoker.s
    public void c(java.lang.Exception exc) {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandHTMLWebView.EmojiFetcher", "fetch with args:" + this.f83888d + ", onCaughtInvokeException(" + exc + ')');
        this.f83889e.resumeWith(kotlin.Result.m521constructorimpl(null));
    }

    @Override // com.tencent.mm.ipcinvoker.s
    public void d() {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandHTMLWebView.EmojiFetcher", "fetch with args:" + this.f83888d + ", onBridgeNotFound()");
        this.f83889e.resumeWith(kotlin.Result.m521constructorimpl(null));
    }
}
