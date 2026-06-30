package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class pd implements com.tencent.mm.plugin.appbrand.utils.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.md f82703a;

    public pd(com.tencent.mm.plugin.appbrand.jsapi.md mdVar) {
        this.f82703a = mdVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c0
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowImageOperateSheet", "fav localPath:%s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.appbrand.jsapi.ce.class, new com.tencent.mm.plugin.appbrand.jsapi.od(this));
    }
}
