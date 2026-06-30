package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes7.dex */
public class h2 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.i2 f263859a;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.i2 i2Var) {
        this.f263859a = i2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.t6
    public void a(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLogin", "onRevMsg resultCode %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.i2 i2Var = this.f263859a;
        if (i17 != 1 && i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLogin", "press back button!");
            i2Var.f263876h.f263887a.c("auth_cancel", null);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j2 j2Var = i2Var.f263876h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.l2 l2Var = j2Var.f263889c;
        java.lang.String str = j2Var.f263888b;
        java.lang.String str2 = i2Var.f263872d;
        sd.b bVar = j2Var.f263887a;
        l2Var.getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) bundle.getSerializable("key_scope");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add((java.lang.String) it.next());
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.i24 i24Var = new r45.i24();
        lVar.f152197a = i24Var;
        lVar.f152198b = new r45.j24();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/js-login-confirm";
        lVar.f152200d = 1117;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        i24Var.f458213d = str;
        i24Var.f458214e = linkedList;
        i24Var.f458215f = 0;
        i24Var.f458216g = str2;
        i24Var.f458218i = 0;
        i24Var.f458217h = i17;
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.k2(l2Var, bVar, i17));
        if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLogin", "fail auth deny!");
            i2Var.f263876h.f263887a.c("auth_deny", null);
        }
    }
}
