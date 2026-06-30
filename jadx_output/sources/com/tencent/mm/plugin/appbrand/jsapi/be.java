package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class be implements com.tencent.mm.plugin.appbrand.utils.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.md f79856a;

    public be(com.tencent.mm.plugin.appbrand.jsapi.md mdVar) {
        this.f79856a = mdVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c0
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowImageOperateSheet", "saveToSDCard localPath:%s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        android.content.Context context = this.f79856a.f81606c.getContext();
        ((ub0.r) oVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.l7.a(str, context, null);
    }
}
