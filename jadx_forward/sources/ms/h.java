package ms;

/* loaded from: classes4.dex */
public final class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms.i f412455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412456b;

    public h(ms.i iVar, java.lang.String str) {
        this.f412455a = iVar;
        this.f412456b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        ms.i iVar = this.f412455a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = iVar.f412457d;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        if (fVar == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetInfrequentContactUIC", "getInfrequentContact() called " + fVar.f152148a + ' ' + fVar.f152149b);
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = iVar.m158354x19263085();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m158354x19263085);
            e4Var.f293309c = iVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ggb);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            e4Var.c();
            return fVar;
        }
        r45.hh3 hh3Var = (r45.hh3) fVar.f152151d;
        if (hh3Var == null) {
            return fVar;
        }
        java.util.LinkedList infrequent_contact_list = hh3Var.f457680d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(infrequent_contact_list, "infrequent_contact_list");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(infrequent_contact_list, 10));
        java.util.Iterator it = infrequent_contact_list.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.qz3) it.next()).f465894d);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        kz5.n0.O0(arrayList, arrayList2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetInfrequentContactUIC", "getInfrequentContact()usernameList:" + arrayList2.size() + "  ");
        java.lang.String string = iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oct);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("INTENT_KEY_TIPS_WORDING", string);
        intent.putExtra("INTENT_KEY_USERNAME_LIST", arrayList2);
        intent.putExtra("INTENT_KEY_REPORT_SESSION_ID", this.f412456b);
        intent.putExtra("INTENT_KEY_LAST_CGI_CONTEXT", hh3Var.f457681e);
        j45.l.j(iVar.m80379x76847179(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.RecommendDeleteContactUI", intent, null);
        return fVar;
    }
}
