package wc5;

/* loaded from: classes10.dex */
public final /* synthetic */ class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public o0(java.lang.Object obj) {
        super(1, obj, wc5.y0.class, "onSearchTextChanged", "onSearchTextChanged(Ljava/lang/String;)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xm3.t0 b17;
        java.lang.String p07 = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        wc5.y0 y0Var = (wc5.y0) this.f72685xcfcbe9ef;
        y0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGallerySearchFilterUIC", "onSearchTextChanged: query='" + p07 + "', isSearching=" + y0Var.f526192g);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = y0Var.f526191f;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        y0Var.Y6(true, !r26.n0.N(p07));
        if (r26.n0.N(p07)) {
            y0Var.f526193h = "";
            y0Var.V6("", false);
            if (y0Var.f526192g) {
                y0Var.f526192g = false;
                y0Var.f526193h = "";
                y0Var.f526198p = vc5.j.f516857d;
                y0Var.f526199q = null;
                y0Var.f526200r = null;
                uc5.f fVar = y0Var.f526190e;
                fVar.getClass();
                fVar.f508015a = "";
                y0Var.V6("", false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe l76 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) y0Var.U6()).l7();
                if (l76 != null && (b17 = xm3.u0.b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) y0Var.U6()).m7())) != null) {
                    java.util.ArrayList arrayList = l76.f233598o;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(arrayList, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryRow>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryRow> }");
                    b17.E0(arrayList);
                    b17.m8146xced61ae5();
                    y0Var.W6();
                    if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) y0Var.U6()).r7()) {
                        y0Var.X6();
                    }
                }
            }
        } else {
            y0Var.f526193h = p07;
            y0Var.f526191f = v65.i.b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) y0Var.U6()).k7(), null, new wc5.r0(y0Var, p07, null), 1, null);
        }
        return jz5.f0.f384359a;
    }
}
