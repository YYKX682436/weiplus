package com.tencent.mm.plugin.appbrand.jsapi.emoji;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenSingleStickerView$OpenEmojiSinglePageResult f80858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.api.o6 f80859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80860f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80861g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f80862h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.emoji.r f80863i;

    public q(com.tencent.mm.plugin.appbrand.jsapi.emoji.r rVar, com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenSingleStickerView$OpenEmojiSinglePageResult jsApiOpenSingleStickerView$OpenEmojiSinglePageResult, com.tencent.mm.feature.emoji.api.o6 o6Var, java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        this.f80863i = rVar;
        this.f80858d = jsApiOpenSingleStickerView$OpenEmojiSinglePageResult;
        this.f80859e = o6Var;
        this.f80860f = str;
        this.f80861g = str2;
        this.f80862h = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.MMActivity activityContext;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenSingleStickerView", "start showSinglePage");
        final com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenSingleStickerView$OpenEmojiSinglePageResult jsApiOpenSingleStickerView$OpenEmojiSinglePageResult = this.f80858d;
        yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.plugin.appbrand.jsapi.emoji.q$$a
            @Override // yz5.a
            public final java.lang.Object invoke() {
                com.tencent.mm.plugin.appbrand.jsapi.emoji.q qVar = com.tencent.mm.plugin.appbrand.jsapi.emoji.q.this;
                qVar.getClass();
                com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenSingleStickerView$OpenEmojiSinglePageResult jsApiOpenSingleStickerView$OpenEmojiSinglePageResult2 = jsApiOpenSingleStickerView$OpenEmojiSinglePageResult;
                jsApiOpenSingleStickerView$OpenEmojiSinglePageResult2.f80837d = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenSingleStickerView", "close emoji page, finishProcess");
                qVar.f80863i.finishProcess(jsApiOpenSingleStickerView$OpenEmojiSinglePageResult2);
                return null;
            }
        };
        activityContext = this.f80863i.getActivityContext();
        ((com.tencent.mm.feature.emoji.c4) this.f80859e).pj(activityContext, this.f80860f, this.f80861g, 42, null, null, 1000042, java.lang.Boolean.valueOf(this.f80862h), aVar, aVar, aVar);
    }
}
