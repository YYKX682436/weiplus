package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class r2 implements com.tencent.mm.plugin.appbrand.utils.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f82886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82887b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.s2 f82888c;

    public r2(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.s2 s2Var) {
        this.f82886a = lVar;
        this.f82887b = i17;
        this.f82888c = s2Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.q2
    public void a(java.lang.String str, boolean z17) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiAddImageToFavorites", "invoke, url is illegal");
            this.f82886a.a(this.f82887b, this.f82888c.o("fail:url is illegal"));
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.y1.f(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiAddImageToFavorites", "invoke, " + str + " is not image");
            com.tencent.mm.vfs.w6.h(str);
            this.f82886a.a(this.f82887b, this.f82888c.o("fail:url is illegal"));
            return;
        }
        android.content.Context context = this.f82886a.getContext();
        if (context instanceof android.app.Activity) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.appbrand.jsapi.q2(this.f82888c, (android.app.Activity) context, str, this.f82886a, this.f82887b));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiAddImageToFavorites", "invoke, activity is null");
            this.f82886a.a(this.f82887b, this.f82888c.o("fail:activity is null"));
        }
    }
}
