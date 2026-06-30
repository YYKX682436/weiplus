package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes7.dex */
public class j2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.b f263887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.l2 f263889c;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.l2 l2Var, sd.b bVar, java.lang.String str) {
        this.f263889c = l2Var;
        this.f263887a = bVar;
        this.f263888b = str;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        r45.j14 j14Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLogin", "errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        sd.b bVar = this.f263887a;
        if (i17 != 0 || i18 != 0) {
            bVar.c("fail", null);
            return;
        }
        r45.l24 l24Var = (r45.l24) oVar.f152244b.f152233a;
        if (l24Var == null || (j14Var = l24Var.f460619d) == null) {
            bVar.c("fail", null);
            return;
        }
        int i19 = j14Var.f459024d;
        java.lang.String str2 = j14Var.f459025e;
        java.lang.String str3 = l24Var.f460628p;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLogin", "NetSceneJSLogin jsErrcode %d", java.lang.Integer.valueOf(i19));
        if (i19 == -12000) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.i2(this, str3, l24Var.f460621f, l24Var.f460622g, l24Var.f460623h));
        } else if (i19 == 0) {
            new java.util.HashMap().put("code", l24Var.f460620e);
            bVar.a();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLogin", "onSceneEnd NetSceneJSLogin %s", str2);
            bVar.c("fail", null);
        }
    }
}
