package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes7.dex */
public class o implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.p f263944a;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.p pVar) {
        this.f263944a = pVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.t6
    public void a(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAuthorize", "stev onRevMsg resultCode %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.p pVar = this.f263944a;
        if (i17 != 1 && i17 != 2) {
            pVar.f263958g.f263971a.c("auth_cancel", null);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q qVar = pVar.f263958g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s sVar = qVar.f263973c;
        java.lang.String str = qVar.f263972b;
        sd.b bVar = qVar.f263971a;
        sVar.getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) bundle.getSerializable("key_scope");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add((java.lang.String) it.next());
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.e24 e24Var = new r45.e24();
        lVar.f152197a = e24Var;
        lVar.f152198b = new r45.f24();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/js-authorize-confirm";
        lVar.f152200d = me1.a.f72878x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        e24Var.f454457d = str;
        e24Var.f454458e = linkedList;
        e24Var.f454460g = 0;
        e24Var.f454459f = i17;
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r(sVar, bVar, i17));
        if (i17 == 2) {
            pVar.f263958g.f263971a.c("auth_deny", null);
        }
    }
}
