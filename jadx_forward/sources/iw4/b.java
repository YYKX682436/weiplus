package iw4;

/* loaded from: classes15.dex */
public final class b implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f376772d;

    /* renamed from: e, reason: collision with root package name */
    public final ir.g f376773e;

    /* renamed from: f, reason: collision with root package name */
    public final iw4.d f376774f;

    /* renamed from: g, reason: collision with root package name */
    public final int f376775g;

    public b(android.content.Context context, ir.g gVar, iw4.d data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f376772d = context;
        this.f376773e = gVar;
        this.f376774f = data;
        this.f376775g = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        ir.g gVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        if (menuItem == null || menuItem.getItemId() != 0 || (gVar = this.f376773e) == null) {
            return;
        }
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = gVar.f375369b;
        java.lang.String mo42933xb5885648 = interfaceC4987x84e327cb.mo42933xb5885648();
        java.lang.String str5 = "";
        if (mo42933xb5885648 == null) {
            mo42933xb5885648 = "";
        }
        java.lang.String X0 = interfaceC4987x84e327cb.X0();
        if (X0 == null) {
            X0 = "";
        }
        java.lang.String l17 = interfaceC4987x84e327cb.l();
        if (l17 == null) {
            l17 = "";
        }
        java.lang.String S0 = interfaceC4987x84e327cb.S0();
        if (S0 == null) {
            S0 = "";
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6875x94f4ba43 c6875x94f4ba43 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6875x94f4ba43();
        iw4.d dVar = this.f376774f;
        c6875x94f4ba43.f141945f = dVar.c() ? 59L : 78L;
        c6875x94f4ba43.f141943d = c6875x94f4ba43.b("SessionId", dVar.f376781h, true);
        c6875x94f4ba43.f141944e = c6875x94f4ba43.b("SearchId", dVar.f376782i, true);
        if (interfaceC4987x84e327cb == null || (str = interfaceC4987x84e327cb.mo42933xb5885648()) == null) {
            str = "";
        }
        c6875x94f4ba43.f141946g = c6875x94f4ba43.b("ClickMD5", str, true);
        com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc = dVar.f376778e;
        if (c21007x2f4a06dc == null || (str2 = c21007x2f4a06dc.f274683e) == null) {
            str2 = "";
        }
        c6875x94f4ba43.f141947h = c6875x94f4ba43.b("QueryMD5", str2, true);
        c6875x94f4ba43.f141948i = dVar.f376779f;
        long j17 = this.f376775g;
        c6875x94f4ba43.f141949j = j17;
        c6875x94f4ba43.f141950k = java.lang.System.currentTimeMillis();
        c6875x94f4ba43.f141951l = c6875x94f4ba43.b("RequestId", dVar.f376782i, true);
        c6875x94f4ba43.f141952m = 2L;
        c6875x94f4ba43.k();
        su4.k3.m(c6875x94f4ba43);
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Bi = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class))).Bi(mo42933xb5885648);
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5 x5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5.class);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).getClass();
        java.lang.String g17 = n22.m.g();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.o0) x5Var).getClass();
        java.lang.String p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.p(g17, "", mo42933xb5885648);
        if (Bi == null) {
            int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(p17) ? 2 : 1;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class))).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
            c21053xdbf1e5f4.f68671x4b6e68b9 = mo42933xb5885648;
            c21053xdbf1e5f4.f68653x95b20dd4 = 65;
            c21053xdbf1e5f4.f68689x2262335f = i18;
            c21053xdbf1e5f4.f68679x22618426 = (int) com.p314xaae8f345.mm.vfs.w6.k(p17);
            c21053xdbf1e5f4.f68685x2261e7f9 = 1;
            c21053xdbf1e5f4.f68657xb76d85ab = X0;
            c21053xdbf1e5f4.f68686x7b284d5e = l17;
            c21053xdbf1e5f4.f68641x3342accf = S0;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class))).wi(c21053xdbf1e5f4);
            Bi = c21053xdbf1e5f4;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.SosSimilarUI", "doAddAction %b", java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.s0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.y5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.y5.class))).wi(this.f376772d, Bi, 18, c01.z1.r())));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6875x94f4ba43 c6875x94f4ba432 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6875x94f4ba43();
        c6875x94f4ba432.f141945f = dVar.c() ? 59L : 78L;
        c6875x94f4ba432.f141943d = c6875x94f4ba432.b("SessionId", dVar.f376782i, true);
        c6875x94f4ba432.f141944e = c6875x94f4ba432.b("SearchId", dVar.f376782i, true);
        if (interfaceC4987x84e327cb == null || (str3 = interfaceC4987x84e327cb.mo42933xb5885648()) == null) {
            str3 = "";
        }
        c6875x94f4ba432.f141946g = c6875x94f4ba432.b("ClickMD5", str3, true);
        com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc2 = dVar.f376778e;
        if (c21007x2f4a06dc2 != null && (str4 = c21007x2f4a06dc2.f274683e) != null) {
            str5 = str4;
        }
        c6875x94f4ba432.f141947h = c6875x94f4ba432.b("QueryMD5", str5, true);
        c6875x94f4ba432.f141948i = dVar.f376779f;
        c6875x94f4ba432.f141949j = j17;
        c6875x94f4ba432.f141950k = java.lang.System.currentTimeMillis();
        c6875x94f4ba432.f141951l = c6875x94f4ba432.b("RequestId", dVar.f376782i, true);
        c6875x94f4ba432.f141952m = 3L;
        c6875x94f4ba432.k();
        su4.k3.m(c6875x94f4ba432);
    }
}
