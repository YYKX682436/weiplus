package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class c1 implements k80.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.d1 f79422a;

    public c1(com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask jsApiAuthorize$AuthorizeTask, com.tencent.mm.plugin.appbrand.jsapi.auth.d1 d1Var) {
        this.f79422a = d1Var;
    }

    @Override // k80.f
    public void a(int i17, int i18, java.lang.String str, k80.g gVar) {
        com.tencent.mm.plugin.appbrand.jsapi.auth.d1 d1Var = this.f79422a;
        if (i17 != 0 || i18 != 0) {
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.v0) d1Var).a(-1, java.lang.String.format(java.util.Locale.ENGLISH, "cgi fail(%d,%d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
            return;
        }
        if (gVar != null) {
            r45.h24 h24Var = (r45.h24) ((bl0.a) gVar).f21676d.f70711b.f70700a;
            r45.j14 j14Var = h24Var.f375773d;
            int i19 = j14Var.f377491d;
            java.lang.String str2 = j14Var.f377492e;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAuthorize", "stev NetSceneJSAuthorize jsErrcode %d", java.lang.Integer.valueOf(i19));
            if (i19 != -12000) {
                if (i19 != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAuthorize", "onSceneEnd NetSceneJSAuthorize ERROR %s", str2);
                    ((com.tencent.mm.plugin.appbrand.jsapi.auth.v0) d1Var).a(i19, str2);
                    return;
                } else {
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask jsApiAuthorize$AuthorizeTask = ((com.tencent.mm.plugin.appbrand.jsapi.auth.v0) d1Var).f79758a;
                    jsApiAuthorize$AuthorizeTask.f79339r = "ok";
                    jsApiAuthorize$AuthorizeTask.c();
                    return;
                }
            }
            com.tencent.mm.plugin.appbrand.jsapi.auth.v0 v0Var = (com.tencent.mm.plugin.appbrand.jsapi.auth.v0) d1Var;
            v0Var.getClass();
            java.util.LinkedList linkedList = h24Var.f375774e;
            int size = linkedList.size();
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask jsApiAuthorize$AuthorizeTask2 = v0Var.f79758a;
            jsApiAuthorize$AuthorizeTask2.E = size;
            int i27 = 0;
            while (true) {
                if (i27 >= jsApiAuthorize$AuthorizeTask2.E) {
                    break;
                }
                r45.jv5 jv5Var = (r45.jv5) linkedList.get(i27);
                try {
                    jsApiAuthorize$AuthorizeTask2.F.putByteArray(i27 + "", jv5Var.toByteArray());
                    i27++;
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAuthorize", "IOException %s", e17.getMessage());
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiAuthorize", e17, "", new java.lang.Object[0]);
                    jsApiAuthorize$AuthorizeTask2.f79339r = "fail";
                    jsApiAuthorize$AuthorizeTask2.c();
                    return;
                }
            }
            jsApiAuthorize$AuthorizeTask2.f79343v = h24Var.f375775f;
            jsApiAuthorize$AuthorizeTask2.f79344w = h24Var.f375776g;
            jsApiAuthorize$AuthorizeTask2.f79345x = h24Var.f375779m;
            jsApiAuthorize$AuthorizeTask2.f79347z = h24Var.f375778i;
            jsApiAuthorize$AuthorizeTask2.f79346y = h24Var.f375777h;
            r45.i7 i7Var = h24Var.f375780n;
            if (i7Var != null) {
                jsApiAuthorize$AuthorizeTask2.A = i7Var.f376773d;
                jsApiAuthorize$AuthorizeTask2.B = i7Var.f376774e;
            }
            r45.pw6 pw6Var = h24Var.f375783q;
            if (pw6Var != null) {
                jsApiAuthorize$AuthorizeTask2.P = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo(pw6Var);
            }
            jsApiAuthorize$AuthorizeTask2.f79339r = "needConfirm";
            if (linkedList.size() <= 0) {
                jsApiAuthorize$AuthorizeTask2.c();
                return;
            }
            r45.jv5 jv5Var2 = (r45.jv5) linkedList.get(0);
            java.lang.String str3 = jv5Var2.f378136i;
            jsApiAuthorize$AuthorizeTask2.G = str3 != null ? str3 : "";
            if (!"scope.userInfo".equals(jv5Var2.f378131d)) {
                jsApiAuthorize$AuthorizeTask2.c();
                return;
            }
            java.lang.String l17 = c01.z1.l();
            jsApiAuthorize$AuthorizeTask2.D = l17;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAuthorize", "userNickName=".concat(l17));
            com.tencent.mm.plugin.appbrand.jsapi.auth.c0.f79420a.a(c01.z1.r(), new com.tencent.mm.plugin.appbrand.jsapi.auth.u0(v0Var));
        }
    }
}
