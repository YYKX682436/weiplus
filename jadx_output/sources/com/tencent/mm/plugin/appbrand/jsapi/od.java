package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class od implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pd f82465d;

    public od(com.tencent.mm.plugin.appbrand.jsapi.pd pdVar) {
        this.f82465d = pdVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) obj;
        if (iPCInteger == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowImageOperateSheet", "fav ipc callback data null");
            return;
        }
        int i17 = iPCInteger.f68404d;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowImageOperateSheet", "fav result:%d", java.lang.Integer.valueOf(i17));
        android.content.Context context = this.f82465d.f82703a.f81606c.getContext();
        if (i17 == 0 && (context instanceof android.app.Activity)) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.nd(this, context));
        }
    }
}
