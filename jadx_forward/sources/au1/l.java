package au1;

/* loaded from: classes8.dex */
public final class l implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final au1.l f95595a = new au1.l();

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetCardEntranceStyle", "errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.ac3 ac3Var = (r45.ac3) fVar.f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetCardEntranceStyle", "retCode: %s", java.lang.Integer.valueOf(ac3Var.f451448d));
            if (ac3Var.f451448d == 0) {
                boolean z17 = ac3Var.f451450f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetCardEntranceStyle", "new version: %s, new version style: %s, trade area: %s, is_card_home_page_v2: %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(ac3Var.f451451g), java.lang.Integer.valueOf(ac3Var.f451452h), java.lang.Boolean.valueOf(ac3Var.f451454m));
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_ENTRANCE_SWITCH_INT_SYNC, java.lang.Integer.valueOf(z17 ? 1 : 0));
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_ENTRANCE_SHOW_SORT_INT_SYNC, java.lang.Integer.valueOf(ac3Var.f451451g));
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_ENTRANCE_TRADE_AREA_INT_SYNC, java.lang.Integer.valueOf(ac3Var.f451452h));
                ac3Var.f451454m = true;
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_ENTRANCE_SWITCH_V2_BOOLEAN_SYNC, java.lang.Boolean.valueOf(ac3Var.f451454m));
                r45.iu iuVar = ac3Var.f451453i;
                if (iuVar != null) {
                    byte[] mo14344x5f01b1f6 = iuVar.mo14344x5f01b1f6();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_ENTRANCE_TRADE_AREA_INFO_STRING_SYNC, new java.lang.String(mo14344x5f01b1f6, r26.c.f450400c));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
