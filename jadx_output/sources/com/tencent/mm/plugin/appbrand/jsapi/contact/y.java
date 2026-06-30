package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes7.dex */
public class y implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.b0 f80621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f80622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC f80623c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.c0 f80624d;

    public y(com.tencent.mm.plugin.appbrand.jsapi.contact.c0 c0Var, com.tencent.mm.plugin.appbrand.jsapi.contact.b0 b0Var, com.tencent.mm.plugin.appbrand.page.n7 n7Var, com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC) {
        this.f80624d = c0Var;
        this.f80621a = b0Var;
        this.f80622b = n7Var;
        this.f80623c = appBrandSysConfigWC;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        if (i17 == 0 && i18 == 0 && (fVar = oVar.f70711b.f70700a) != null) {
            r45.qo3 qo3Var = (r45.qo3) fVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiEnterContact", "getsubbusinessinfo success, subBusinessUsername:%s", qo3Var.f384147d);
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.contact.x(this, qo3Var));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiEnterContact", "getsubbusinessinfo cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, oVar.f70711b.f70700a);
            com.tencent.mm.plugin.appbrand.jsapi.contact.b0 b0Var = this.f80621a;
            if (b0Var != null) {
                ((com.tencent.mm.plugin.appbrand.jsapi.contact.w) b0Var).a(false, "fail:cgi fail", null);
            }
        }
    }
}
