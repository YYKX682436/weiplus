package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class z0 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f83329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83330b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.a1 f83331c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.t0 f83332d;

    public z0(com.tencent.mm.plugin.appbrand.y yVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.share.a1 a1Var, com.tencent.mm.plugin.appbrand.jsapi.share.t0 t0Var) {
        this.f83329a = yVar;
        this.f83330b = i17;
        this.f83331c = a1Var;
        this.f83332d = t0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        java.lang.String str2 = "fail:convert openId to username fail";
        com.tencent.mm.plugin.appbrand.jsapi.share.a1 a1Var = this.f83331c;
        int i19 = this.f83330b;
        com.tencent.mm.plugin.appbrand.y yVar = this.f83329a;
        if (i17 == 0 && i18 == 0) {
            boolean z17 = true;
            if (!(oVar == null)) {
                com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
                if (!(fVar == null) && (fVar instanceof r45.r46)) {
                    kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ShareTransIdResponse");
                    r45.r46 r46Var = (r45.r46) fVar;
                    if (r46Var.f384543d.f382749d != 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "shareTransId fail, response errcode:" + r46Var.f384543d.f382749d);
                        java.lang.String str3 = r46Var.f384543d.f382750e;
                        if (str3 != null && str3.length() != 0) {
                            z17 = false;
                        }
                        if (z17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "shareTransId fail, response errmsg:" + r46Var.f384543d.f382750e);
                        } else {
                            str2 = "fail:" + r46Var.f384543d.f382750e + ' ';
                        }
                        yVar.a(i19, a1Var.o(str2));
                        return;
                    }
                    java.lang.String str4 = r46Var.f384544e;
                    if (str4 != null && str4.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "shareTransId fail, response username is null");
                        yVar.a(i19, a1Var.o("fail:response username is null"));
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "shareTransId success, username:" + r46Var.f384544e);
                    java.lang.String username = r46Var.f384544e;
                    kotlin.jvm.internal.o.f(username, "username");
                    com.tencent.mm.plugin.appbrand.jsapi.share.t0 t0Var = this.f83332d;
                    t0Var.getClass();
                    t0Var.f83236d = username;
                    a1Var.getClass();
                    com.tencent.mm.plugin.appbrand.utils.o5.b(yVar, t0Var.f83233a, null, new com.tencent.mm.plugin.appbrand.jsapi.share.u0(yVar, i19, a1Var, t0Var));
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "shareTransId fail, convert openId to username fail");
        yVar.a(i19, a1Var.o("fail:convert openId to username fail"));
    }
}
