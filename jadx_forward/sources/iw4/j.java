package iw4;

/* loaded from: classes15.dex */
public final class j implements lr.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.ActivityC19250xb79f2208 f376796a;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.ActivityC19250xb79f2208 activityC19250xb79f2208) {
        this.f376796a = activityC19250xb79f2208;
    }

    @Override // lr.k0
    public void a(android.view.View view, android.content.Context context, int i17, ir.u0 u0Var) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.ActivityC19250xb79f2208 activityC19250xb79f2208 = this.f376796a;
        ir.u0 y17 = ((lr.z) activityC19250xb79f2208.f263584e).y(i17);
        if (y17 instanceof ir.g) {
            ir.g gVar = (ir.g) y17;
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Bi = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class))).Bi(gVar.f375369b.mo42933xb5885648());
            boolean z17 = (Bi != null ? ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Bi).f68653x95b20dd4 : 0) == 81;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6875x94f4ba43 c6875x94f4ba43 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6875x94f4ba43();
            iw4.d dVar = activityC19250xb79f2208.f263583d;
            c6875x94f4ba43.f141945f = dVar.c() ? 59 : 78;
            c6875x94f4ba43.f141943d = c6875x94f4ba43.b("SessionId", dVar.f376781h, true);
            c6875x94f4ba43.f141944e = c6875x94f4ba43.b("SearchId", dVar.f376782i, true);
            c6875x94f4ba43.f141946g = c6875x94f4ba43.b("ClickMD5", gVar.f375369b.mo42933xb5885648(), true);
            com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc = dVar.f376778e;
            if (c21007x2f4a06dc == null || (str = c21007x2f4a06dc.f274683e) == null) {
                str = "";
            }
            c6875x94f4ba43.f141947h = c6875x94f4ba43.b("QueryMD5", str, true);
            c6875x94f4ba43.f141948i = dVar.f376779f;
            c6875x94f4ba43.f141949j = i17;
            c6875x94f4ba43.f141950k = java.lang.System.currentTimeMillis();
            c6875x94f4ba43.f141951l = c6875x94f4ba43.b("RequestId", dVar.f376782i, true);
            c6875x94f4ba43.f141952m = 1L;
            c6875x94f4ba43.f141953n = z17 ? 1L : 0L;
            c6875x94f4ba43.k();
            su4.k3.m(c6875x94f4ba43);
            if (z17) {
                return;
            }
            new rl5.r(activityC19250xb79f2208).g(view, 0, 0L, new iw4.a(gVar), new iw4.b(activityC19250xb79f2208, gVar, dVar, i17), com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
        }
    }

    @Override // lr.k0
    public void b(android.view.View view, android.content.Context context, int i17, ir.u0 u0Var) {
        ir.g gVar;
        java.lang.String str;
        android.content.Context context2 = context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        if (u0Var == null || !(u0Var instanceof ir.g)) {
            return;
        }
        ir.g gVar2 = (ir.g) u0Var;
        if (gVar2.f375370c != 103) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.ActivityC19250xb79f2208 activityC19250xb79f2208 = this.f376796a;
        if (currentTimeMillis - activityC19250xb79f2208.f263587h < 500) {
            return;
        }
        activityC19250xb79f2208.f263587h = java.lang.System.currentTimeMillis();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.u0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.a6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.a6.class))).getClass();
        y75.d dVar = y75.a.f541319a;
        if (dVar != null) {
            dVar.b(view, context2, i17, u0Var);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = gVar2.f375369b;
        java.lang.String str2 = "";
        if (activityC19250xb79f2208.f263583d.c()) {
            o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
            com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc = activityC19250xb79f2208.f263583d.f376778e;
            java.lang.String str3 = c21007x2f4a06dc != null ? c21007x2f4a06dc.f274687i : null;
            java.lang.String mo42933xb5885648 = ((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d).mo42933xb5885648();
            ((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d).p();
            iw4.g gVar3 = new iw4.g(h0Var, activityC19250xb79f2208, context2);
            ((r35.k1) q1Var).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(mo42933xb5885648);
            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
            if (context2 instanceof com.p314xaae8f345.mm.ui.xb) {
                context2 = ((com.p314xaae8f345.mm.ui.xb) context2).getBaseContext();
            }
            lb5.a aVar = new lb5.a();
            aVar.n(mo42933xb5885648);
            n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
            n13.t a17 = n13.t.a(gVar3);
            a17.f415671f.f415672a = 5;
            ((dk5.y) a0Var).wi(context2, aVar, str3, a17);
            gVar = gVar2;
        } else if (activityC19250xb79f2208.getIntent().getBooleanExtra("KEY_GET_EMOJI_INFO_DIRECTLY", false)) {
            o25.q1 q1Var2 = (o25.q1) i95.n0.c(o25.q1.class);
            com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc2 = activityC19250xb79f2208.f263583d.f376778e;
            java.lang.String mo42933xb58856482 = ((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d).mo42933xb5885648();
            java.lang.String X0 = ((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d).X0();
            java.lang.String l17 = ((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d).l();
            iw4.h hVar = new iw4.h(activityC19250xb79f2208, h0Var);
            ((r35.k1) q1Var2).getClass();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(mo42933xb58856482);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).getClass();
            java.lang.String p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.p(n22.m.g(), "", mo42933xb58856482);
            if (u17 == null) {
                int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(p17) ? 2 : 1;
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
                c21053xdbf1e5f4.f68671x4b6e68b9 = mo42933xb58856482;
                c21053xdbf1e5f4.f68653x95b20dd4 = 65;
                c21053xdbf1e5f4.f68689x2262335f = i18;
                gVar = gVar2;
                c21053xdbf1e5f4.f68679x22618426 = (int) com.p314xaae8f345.mm.vfs.w6.k(p17);
                c21053xdbf1e5f4.f68685x2261e7f9 = 1;
                c21053xdbf1e5f4.f68657xb76d85ab = X0;
                c21053xdbf1e5f4.f68686x7b284d5e = l17;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().J0(c21053xdbf1e5f4);
                u17 = c21053xdbf1e5f4;
            } else {
                gVar = gVar2;
            }
            r35.i1 i1Var = new r35.i1(context2);
            i1Var.f(u17, "");
            i1Var.g(java.lang.Boolean.FALSE);
            i1Var.f450670d = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571885sk);
            i1Var.a(hVar);
            i1Var.k();
        } else {
            gVar = gVar2;
            o25.q1 q1Var3 = (o25.q1) i95.n0.c(o25.q1.class);
            com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc3 = activityC19250xb79f2208.f263583d.f376778e;
            java.lang.String str4 = c21007x2f4a06dc3 != null ? c21007x2f4a06dc3.f274687i : null;
            java.lang.String mo42933xb58856483 = ((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d).mo42933xb5885648();
            java.lang.String X02 = ((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d).X0();
            java.lang.String l18 = ((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d).l();
            iw4.i iVar = new iw4.i(activityC19250xb79f2208, h0Var, context2);
            ((r35.k1) q1Var3).getClass();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u18 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(mo42933xb58856483);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).getClass();
            java.lang.String p18 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.p(n22.m.g(), "", mo42933xb58856483);
            if (u18 == null) {
                int i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(p18) ? 2 : 1;
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
                c21053xdbf1e5f42.f68671x4b6e68b9 = mo42933xb58856483;
                c21053xdbf1e5f42.f68653x95b20dd4 = 65;
                c21053xdbf1e5f42.f68689x2262335f = i19;
                c21053xdbf1e5f42.f68679x22618426 = (int) com.p314xaae8f345.mm.vfs.w6.k(p18);
                c21053xdbf1e5f42.f68685x2261e7f9 = 1;
                c21053xdbf1e5f42.f68657xb76d85ab = X02;
                c21053xdbf1e5f42.f68686x7b284d5e = l18;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().J0(c21053xdbf1e5f42);
                u18 = c21053xdbf1e5f42;
            }
            r35.i1 i1Var2 = new r35.i1(context2);
            i1Var2.l(str4);
            i1Var2.f(u18, "");
            i1Var2.g(java.lang.Boolean.TRUE);
            i1Var2.f450670d = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya);
            i1Var2.a(iVar);
            i1Var2.k();
        }
        r45.lq5 lq5Var = new r45.lq5();
        if (activityC19250xb79f2208.f263583d.c()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("logid=17372&sessionid=");
            sb6.append(activityC19250xb79f2208.f263583d.f376782i);
            sb6.append("&searchid=");
            sb6.append(activityC19250xb79f2208.f263583d.f376782i);
            sb6.append("&scene=59&clickmd5=");
            sb6.append(((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d).mo42933xb5885648());
            sb6.append("&querymd5=");
            com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc4 = activityC19250xb79f2208.f263583d.f376778e;
            sb6.append(c21007x2f4a06dc4 != null ? c21007x2f4a06dc4.f274683e : null);
            sb6.append("&offset=");
            sb6.append(activityC19250xb79f2208.f263583d.f376779f);
            sb6.append("&pos=");
            sb6.append(i17);
            sb6.append("&clienttimestamp=");
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append("&tab=0&requestid=");
            sb6.append(activityC19250xb79f2208.f263583d.f376782i);
            lq5Var.f461289t = sb6.toString();
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("scene=78&searchid=");
            sb7.append(activityC19250xb79f2208.f263583d.f376782i);
            sb7.append("&businesstype=256&docid=");
            ir.g gVar4 = gVar;
            sb7.append(gVar4.f375371d);
            sb7.append("&docpos=");
            sb7.append(i17);
            sb7.append("&typepos=0&ishomepage=0&clienttimestamp=");
            sb7.append(c01.id.c());
            sb7.append("&sceneactiontype=1&query=");
            com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc5 = activityC19250xb79f2208.f263583d.f376778e;
            if (c21007x2f4a06dc5 != null && (str = c21007x2f4a06dc5.f274682d) != null) {
                str2 = str;
            }
            sb7.append(str2);
            sb7.append("&sessionid=");
            sb7.append(activityC19250xb79f2208.f263583d.f376781h);
            sb7.append("&nettype=");
            sb7.append(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.b());
            sb7.append("&requestid=");
            sb7.append(activityC19250xb79f2208.f263583d.f376782i);
            sb7.append("&reqbusinesstype=256&pageno=");
            sb7.append(gVar4.f375372e);
            lq5Var.f461289t = sb7.toString();
        }
        ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
        gm0.j1.d().g(new su4.a2(lq5Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.SosSimilarUI", lq5Var.f461289t);
    }
}
