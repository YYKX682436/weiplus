package sg4;

/* loaded from: classes7.dex */
public final class c extends tg4.e {
    @Override // lc3.c0
    public java.lang.String f() {
        return "updatePagView";
    }

    @Override // tg4.e
    public boolean x(int i17, android.view.View view, org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b.class);
        if (c22789xd23e9a9b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MBJsApiUpdatePagView", "onUpdateView(viewId : " + i17 + ") failed, targetView is null");
            return false;
        }
        xg4.p pVar = (xg4.p) this.f399423a;
        if (pVar == null) {
            return false;
        }
        pVar.J1();
        up0.j jVar = up0.k.f511324a;
        xg4.p pVar2 = (xg4.p) this.f399423a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 b17 = pVar2 != null ? pVar2.J1().b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        return jVar.a(b17, data, c22789xd23e9a9b);
    }
}
