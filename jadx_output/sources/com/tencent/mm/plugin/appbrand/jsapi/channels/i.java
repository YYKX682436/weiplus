package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes.dex */
public final class i implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f80240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.channels.j f80241f;

    public i(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.channels.j jVar) {
        this.f80239d = lVar;
        this.f80240e = i17;
        this.f80241f = jVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignResult jsApiEcdSaSign$SignResult = (com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignResult) obj;
        this.f80239d.a(this.f80240e, this.f80241f.q(null, !com.tencent.mm.sdk.platformtools.t8.K0(jsApiEcdSaSign$SignResult.f80204d) ? jc1.f.f298912a : jc1.f.f298915d, kz5.c1.i(new jz5.l("signature", jsApiEcdSaSign$SignResult.f80204d), new jz5.l("suffix", jsApiEcdSaSign$SignResult.f80205e))));
    }
}
