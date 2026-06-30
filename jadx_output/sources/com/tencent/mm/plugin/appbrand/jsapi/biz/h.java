package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes11.dex */
public final class h implements rv.i3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f79963a;

    public h(com.tencent.mm.ipcinvoker.r rVar) {
        this.f79963a = rVar;
    }

    @Override // rv.i3
    public final void a(android.content.Intent intent) {
        com.tencent.mm.ipcinvoker.r rVar;
        if (intent == null || (rVar = this.f79963a) == null) {
            return;
        }
        rVar.a(new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiResponse(1, new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiLaunchResponse(intent), null));
    }
}
