package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes8.dex */
public final class m2 extends ou4.n implements com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25293x529e01b6 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f263102g = "MicroMsg.hitest.WebSearchFlutterPlugin";

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25290xc23c837a f263103h;

    public final void b(tg0.q1 q1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f263102g, "setCallback");
        for (ou4.c0 c0Var : vg0.n.f517996a.a(q1Var)) {
            this.f430528d.put(c0Var.b(), c0Var);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25293x529e01b6
    /* renamed from: callApi */
    public java.util.Map mo74075x20b302dc(java.lang.String apiName, java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiName, "apiName");
        ou4.c0 c0Var = (ou4.c0) this.f430528d.get(apiName);
        java.lang.String str = this.f263102g;
        if (c0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "callApi: no handler for apiName=".concat(apiName));
            return kz5.c1.k(new jz5.l("error", "NOT_FOUND"), new jz5.l(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "No handler for apiName: ".concat(apiName)));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        ou4.m mVar = new ou4.m(h0Var, h0Var2, h0Var3);
        if (map == null) {
            map = null;
        }
        try {
            c0Var.a(map, mVar);
            java.lang.Object obj = h0Var2.f391656d;
            if (obj == null) {
                java.util.Map map2 = (java.util.Map) h0Var.f391656d;
                return map2 == null ? kz5.q0.f395534d : map2;
            }
            jz5.l[] lVarArr = new jz5.l[2];
            lVarArr[0] = new jz5.l("error", obj);
            java.lang.String str2 = (java.lang.String) h0Var3.f391656d;
            lVarArr[1] = new jz5.l(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, str2 != null ? str2 : "");
            return kz5.c1.k(lVarArr);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "callApi: handler error, apiName=".concat(apiName), e17);
            jz5.l[] lVarArr2 = new jz5.l[2];
            lVarArr2[0] = new jz5.l("error", "HANDLER_ERROR");
            java.lang.String message = e17.getMessage();
            lVarArr2[1] = new jz5.l(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, message != null ? message : "");
            return kz5.c1.k(lVarArr2);
        }
    }
}
