package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes7.dex */
public class r implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.b f263976a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f263977b;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s sVar, sd.b bVar, int i17) {
        this.f263976a = bVar;
        this.f263977b = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        r45.j14 j14Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAuthorize", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        sd.b bVar = this.f263976a;
        if (i17 != 0 || i18 != 0) {
            bVar.c("fail", null);
            return;
        }
        if (this.f263977b == 2) {
            bVar.c("fail", null);
            return;
        }
        r45.f24 f24Var = (r45.f24) oVar.f152244b.f152233a;
        if (f24Var == null || (j14Var = f24Var.f455474d) == null) {
            bVar.c("fail", null);
            return;
        }
        int i19 = j14Var.f459024d;
        java.lang.String str2 = j14Var.f459025e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAuthorize", "jsErrcode = %d", java.lang.Integer.valueOf(i19));
        if (i19 == 0) {
            bVar.a();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAuthorize", "ERROR = %s", str2);
            bVar.c("fail", null);
        }
    }
}
