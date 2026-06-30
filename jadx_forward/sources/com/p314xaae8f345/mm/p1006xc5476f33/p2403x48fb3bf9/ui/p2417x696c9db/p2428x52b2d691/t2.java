package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes7.dex */
public final class t2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268069b;

    public t2(nw4.k kVar, nw4.y2 y2Var) {
        this.f268068a = kVar;
        this.f268069b = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("MicroMsg.JsApiH5NativeWXPayCgiTunnel", "onGYNetEnd errType :" + i17 + " errCode: " + i18 + " errMsg :" + str);
        nw4.k kVar = this.f268068a;
        nw4.y2 y2Var = this.f268069b;
        if (i17 != 0 || i18 != 0 || oVar.f152244b.f152233a == null) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("MicroMsg.JsApiH5NativeWXPayCgiTunnel", "nativeWXPayCgiTunnel cgi failed");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("err_desc", "server system error");
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", hashMap);
            return;
        }
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("MicroMsg.JsApiH5NativeWXPayCgiTunnel", "nativeWXPayCgiTunnel cgi success");
        og0.m mVar = (og0.m) i95.n0.c(og0.m.class);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        ((ng0.m) mVar).getClass();
        java.lang.String str2 = ((r45.hy5) fVar).f458089d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        hashMap2.put("respbuf", str2);
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap2);
    }
}
