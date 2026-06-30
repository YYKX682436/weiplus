package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public class r8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f156786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f156787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.q5 f156788c;

    public r8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.l8 l8Var, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.q5 q5Var) {
        this.f156786a = str;
        this.f156787b = str2;
        this.f156788c = q5Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String str = this.f156787b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.q5 q5Var = this.f156788c;
        java.lang.String uuid = this.f156786a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uuid, "uuid");
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.c(uuid, 1, null, 4, null).l();
        try {
            cl0.g gVar = new cl0.g(str);
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.l8.wi(uuid, gVar)) {
                cl0.g gVar2 = new cl0.g(gVar.mo15082x48bce8a4("invokeData"));
                java.lang.String mo15082x48bce8a4 = gVar2.mo15082x48bce8a4("miniprogramAppID");
                int b17 = h3.a.b(gVar2.mo15080xc3ca103c("debugMode", 0), 0, 2);
                if (android.text.TextUtils.isEmpty(mo15082x48bce8a4)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.ServiceForWebView", "privateOpenWeappFunctionalPage, invalid miniprogramAppId");
                    new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.c(uuid, 4, null, 4, null).l();
                    if (q5Var != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k3) q5Var).a(false, "{}", 4);
                    }
                } else {
                    java.lang.String mo15083x48bce8a4 = gVar2.mo15083x48bce8a4(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "__wx__/open-api-redirecting-page");
                    java.lang.String mo15082x48bce8a42 = gVar2.mo15082x48bce8a4(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                    java.lang.String mo15082x48bce8a43 = gVar.mo15082x48bce8a4("runtimeAppid");
                    int mo15080xc3ca103c = gVar.mo15080xc3ca103c("runtimeLaunchScene", 1111);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ServiceForWebView", "transferJson：%s, runtimeLaunchScene:%d", str, java.lang.Integer.valueOf(mo15080xc3ca103c));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
                    c12559xbdae8559.f169323f = mo15080xc3ca103c;
                    c12559xbdae8559.f169324g = mo15082x48bce8a43 + ":" + mo15082x48bce8a42;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
                    c11812xa040dc98.f158855d = 7;
                    c11812xa040dc98.f158856e = null;
                    c11812xa040dc98.f158865q = gVar2.toString();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc();
                    c12362x460991bc.f166435e = mo15082x48bce8a4;
                    c12362x460991bc.f166439i = mo15083x48bce8a4;
                    c12362x460991bc.f166443o = c12559xbdae8559;
                    c12362x460991bc.f166444p = c11812xa040dc98;
                    c12362x460991bc.f166437g = b17;
                    c12362x460991bc.f166457y = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q8(this);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.x.f166565a).a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, c12362x460991bc);
                }
            } else if (q5Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.ServiceForWebView", "interceptedByDirectApi done, cancel");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k3) q5Var).a(false, "{}", 4);
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.ServiceForWebView", "privateOpenWeappFunctionalPage, parse failed e = %s, uuid = %s, json = %s", e17, uuid, str);
            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.c(uuid, 4, null, 4, null).l();
            if (q5Var == null) {
                return null;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k3) q5Var).a(false, "{}", 4);
            return null;
        }
    }
}
