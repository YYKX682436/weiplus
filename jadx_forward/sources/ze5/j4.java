package ze5;

/* loaded from: classes9.dex */
public final class j4 {
    public j4(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final void a(ze5.j4 j4Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str, we5.y0 y0Var, boolean z17) {
        j4Var.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        java.lang.String U1 = f9Var.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return;
        }
        l15.c cVar = new l15.c();
        cVar.m126743xf78a7eb8(true);
        cVar.m126728xdc93280d(U1);
        v05.b k17 = cVar.k();
        if (k17 == null) {
            return;
        }
        z01.y yVar = new z01.y();
        s15.w wVar = new s15.w();
        wVar.m126743xf78a7eb8(true);
        wVar.m126728xdc93280d(k17.m75945x2fec8307(k17.f513848e + 44));
        yVar.f550720g = wVar;
        yVar.f550717d = f9Var.m124847x74d37ac6();
        java.lang.String Q0 = f9Var.Q0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
        yVar.f550718e = Q0;
        y0Var.d(new ze5.h4(dVar2, dVar, yVar, a0Var));
    }

    public static final void b(ze5.j4 j4Var, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        j4Var.getClass();
        java.lang.String U1 = f9Var.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return;
        }
        l15.c cVar = new l15.c();
        cVar.m126743xf78a7eb8(true);
        cVar.m126728xdc93280d(U1);
        v05.b k17 = cVar.k();
        if (k17 == null) {
            return;
        }
        s15.w wVar = new s15.w();
        wVar.m126743xf78a7eb8(true);
        wVar.m126728xdc93280d(k17.m75945x2fec8307(k17.f513848e + 44));
        if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(dVar.g(), f9Var.G, null)) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a c5824x69fbb00a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a();
        c5824x69fbb00a.f136132g.f89439c = dVar.g();
        c5824x69fbb00a.f136132g.f89437a = f9Var.m124847x74d37ac6();
        c5824x69fbb00a.f136132g.f89442f = f9Var.Q0();
        c5824x69fbb00a.f136132g.f89440d = dVar.D();
        am.sn snVar = c5824x69fbb00a.f136132g;
        java.lang.String m126747x696739c = wVar.m126747x696739c();
        if (m126747x696739c == null) {
            m126747x696739c = "";
        }
        snVar.f89438b = m126747x696739c;
        am.sn snVar2 = c5824x69fbb00a.f136132g;
        snVar2.f89443g = 6;
        snVar2.f89445i = c01.ia.q(f9Var);
        c5824x69fbb00a.f136132g.f89446j = f9Var.V1();
        c5824x69fbb00a.e();
    }

    public static final boolean c(ze5.j4 j4Var, db5.g4 g4Var, android.view.View view, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar) {
        j4Var.getClass();
        java.lang.Object tag = view.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag).d();
        if (!c01.ia.x(f9Var) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.j(f9Var) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.D(f9Var)) {
            g4Var.c(d17, 111, 0, dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        }
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.b(f9Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgNoteMvvm", "canShowFav false");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgNoteMvvm", "canShowFav true");
            g4Var.c(d17, 116, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
        }
        if (!((gb0.n) ((fb0.k) i95.n0.c(fb0.k.class))).Ai(f9Var)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a564 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            am.b6 b6Var = c5348xb8e1a564.f135674g;
            b6Var.f87752a = m124847x74d37ac6;
            b6Var.f87753b = f9Var.Q0();
            c5348xb8e1a564.e();
            if (c5348xb8e1a564.f135675h.f87869a) {
                g4Var.c(d17, 129, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3x), com.p314xaae8f345.mm.R.raw.f79841xc8521962);
            }
        }
        if (c01.ia.A(f9Var)) {
            g4Var.clear();
        }
        if ((f9Var.K1() || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, dVar) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0()) && !dVar.A()) {
            g4Var.c(d17, 123, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
        }
        if (!dVar.F()) {
            g4Var.c(d17, 100, 0, dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        }
        return true;
    }

    public static final boolean d(ze5.j4 j4Var, android.view.MenuItem menuItem, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        j4Var.getClass();
        if (menuItem.getItemId() != 111) {
            return false;
        }
        ze5.i4 i4Var = new ze5.i4(dVar, f9Var);
        android.app.Activity g17 = dVar.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.t.a(f9Var, g17, i4Var);
        return true;
    }

    public static final void e(ze5.j4 j4Var, rd5.d dVar) {
        j4Var.getClass();
        if (dVar == null) {
            return;
        }
        boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20251x90c3810c()) == 1;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgNoteMvvm", "preloadNoteHtml, doPreload:" + z17);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        java.lang.String U1 = f9Var.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return;
        }
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(U1);
        v05.b k17 = cVar.k();
        if (k17 == null) {
            return;
        }
        s15.w wVar = new s15.w();
        wVar.m126728xdc93280d(k17.m75945x2fec8307(k17.f513848e + 44));
        s15.h hVar = (s15.h) kz5.n0.a0(wVar.j(), 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadNoteHtml, fmt:");
        sb6.append(hVar != null ? hVar.n() : null);
        sb6.append(", htmlI:");
        sb6.append(hVar != null ? hVar.B() : null);
        sb6.append(", ddataId:");
        sb6.append(hVar != null ? hVar.m75945x2fec8307(hVar.f384955d + 3) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgNoteMvvm", sb6.toString());
        long c17 = c01.id.c() - f9Var.mo78012x3fdd41df();
        if (c17 > 1209600000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgNoteMvvm", "preloadNoteHtml, out of time, msgDelayMs:" + c17);
            return;
        }
        if (hVar == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(hVar.B(), "WeNoteHtmlFile") || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hVar.B()) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar.B(), "WeNoteHtmlFile")) {
            return;
        }
        r45.gp0 c18 = bt3.x2.c(hVar);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044 c5888x4e3b0044 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044();
        am.eq eqVar = c5888x4e3b0044.f136196g;
        eqVar.f88116a = 1;
        eqVar.f88118c = c18;
        eqVar.f88119d = f9Var.m124847x74d37ac6();
        eqVar.f88120e = f9Var.Q0();
        c5888x4e3b0044.e();
        if (com.p314xaae8f345.mm.vfs.w6.j(c5888x4e3b0044.f136197h.f88226b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgNoteMvvm", "preloadNoteHtml, fileExist, return");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044 c5888x4e3b00442 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044();
        am.eq eqVar2 = c5888x4e3b00442.f136196g;
        eqVar2.f88116a = 8;
        eqVar2.f88118c = c18;
        eqVar2.f88119d = f9Var.m124847x74d37ac6();
        eqVar2.f88120e = f9Var.Q0();
        eqVar2.f88126k = "";
        c5888x4e3b00442.e();
    }
}
