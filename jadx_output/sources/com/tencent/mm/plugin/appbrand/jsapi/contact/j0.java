package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes7.dex */
public class j0 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.m0 f80565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f80566b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.n0 f80567c;

    public j0(com.tencent.mm.plugin.appbrand.jsapi.contact.n0 n0Var, com.tencent.mm.plugin.appbrand.jsapi.contact.m0 m0Var, com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f80567c = n0Var;
        this.f80565a = m0Var;
        this.f80566b = n7Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        if (i17 == 0 && i18 == 0 && (fVar = oVar.f70711b.f70700a) != null) {
            r45.qo3 qo3Var = (r45.qo3) fVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPrivateEnterContact", "getsubbusinessinfo success, subBusinessUsername:%s", qo3Var.f384147d);
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.contact.i0(this, qo3Var));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPrivateEnterContact", "getsubbusinessinfo cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, oVar.f70711b.f70700a);
            com.tencent.mm.plugin.appbrand.jsapi.contact.m0 m0Var = this.f80565a;
            if (m0Var != null) {
                ((com.tencent.mm.plugin.appbrand.jsapi.contact.f0) m0Var).a(false, "fail:cgi fail", null);
            }
        }
    }
}
