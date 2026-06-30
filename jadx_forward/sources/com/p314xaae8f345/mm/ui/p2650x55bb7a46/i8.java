package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class i8 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 {

    /* renamed from: a, reason: collision with root package name */
    public final yb5.d f283370a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.z3 f283371b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f283372c;

    /* renamed from: d, reason: collision with root package name */
    public int f283373d;

    public i8(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, java.lang.String str) {
        this.f283370a = dVar;
        this.f283371b = z3Var;
        this.f283372c = str;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(str);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3.s4(str);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3.G4(str);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9
    public void a(boolean z17, int i17) {
        yb5.d dVar = this.f283370a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) dVar.f542241c.a(sb5.s0.class))).f280796e;
        if (z17) {
            this.f283373d = c19666xfd6e2f33.m75446x74bdd737();
            c19666xfd6e2f33.i1(qk.w9.a(dVar.g()) + i17, true, 0, 0);
            c19666xfd6e2f33.f271587r2 = false;
            c19666xfd6e2f33.m75494x9cbd38c1(java.lang.Boolean.TRUE);
            return;
        }
        int i18 = this.f283373d;
        if (i18 > 0) {
            c19666xfd6e2f33.i1(i18, true, 0, 0);
        } else {
            c19666xfd6e2f33.i1(qk.w9.a(dVar.g()) + i17, true, 0, 0);
        }
        c19666xfd6e2f33.f271587r2 = true;
        c19666xfd6e2f33.m75494x9cbd38c1(java.lang.Boolean.FALSE);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9
    public void b(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        boolean E = c01.d9.b().E();
        yb5.d dVar = this.f283370a;
        if (!E) {
            db5.t7.k(dVar.g(), dVar.f542250l.m78646xc2a54588());
            return;
        }
        if (interfaceC4987x84e327cb == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f283371b;
        if (!(z3Var.d1().equals("medianote") && (c01.z1.p() & 16384) == 0)) {
            ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.a();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) dVar.f542241c.a(sb5.s0.class))).f280796e;
            r15.b m75465xd0d4a36c = c19666xfd6e2f33 != null ? c19666xfd6e2f33.m75465xd0d4a36c() : null;
            s25.a wi6 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
            java.lang.String str = this.f283372c;
            ((y12.h) wi6).Y(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? z3Var.d1() : str, (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb, null, m75465xd0d4a36c, interfaceC4987x84e327cb.c0().ordinal());
            if (m75465xd0d4a36c != null) {
                ik1.h0.b(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.i8$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) com.p314xaae8f345.mm.ui.p2650x55bb7a46.i8.this.f283370a.f542241c.a(sb5.s0.class))).f280796e.v1(false, true);
                    }
                });
            }
            dVar.L(true);
            return;
        }
        interfaceC4987x84e327cb.O0(0);
        interfaceC4987x84e327cb.w1(3);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Vi(interfaceC4987x84e327cb);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.m124850x7650bebc(47);
        f9Var.u1("medianote");
        f9Var.j1(1);
        if (interfaceC4987x84e327cb.k()) {
            f9Var.d1(com.p314xaae8f345.mm.p2621x8fb0427b.y4.e(c01.z1.r(), 0L, false, interfaceC4987x84e327cb.mo42933xb5885648(), false, ""));
        }
        if (!pt0.f0.f439742b1.e()) {
            f9Var.i1(interfaceC4987x84e327cb.mo42933xb5885648());
        }
        f9Var.e1(c01.w9.o(f9Var.Q0()));
        f9Var.r1(2);
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).M9(f9Var);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9
    public void c() {
    }

    public void d(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        if (!c01.d9.b().E()) {
            yb5.d dVar = this.f283370a;
            db5.t7.k(dVar.g(), dVar.f542250l.m78646xc2a54588());
            return;
        }
        if (interfaceC4987x84e327cb == null) {
            return;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        c01.d9.b().getClass();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb7.append(gm0.j1.u().d());
        sb7.append("emoji/");
        sb6.append(sb7.toString());
        sb6.append(interfaceC4987x84e327cb.mo42933xb5885648());
        java.lang.String sb8 = sb6.toString();
        if (com.p314xaae8f345.mm.vfs.w6.j(sb8 + "_thumb")) {
            c11286x34a5504.f33128x4f3b3aa0 = com.p314xaae8f345.mm.vfs.w6.N(sb8 + "_thumb", 0, (int) com.p314xaae8f345.mm.vfs.w6.k(sb8 + "_thumb"));
        } else {
            java.io.InputStream inputStream = null;
            try {
                try {
                    inputStream = com.p314xaae8f345.mm.vfs.w6.E(sb8);
                    c11286x34a5504.m48468xb4dcc327(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.c(inputStream, 1.0f));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingSmileyPanelImpl", e17, "", new java.lang.Object[0]);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingSmileyPanelImpl", "sendAppMsgEmoji Fail cause there is no thumb");
                }
            } finally {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
            }
        }
        c11286x34a5504.f33122xe4128443 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11276x643df984(sb8);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.D(c11286x34a5504, interfaceC4987x84e327cb.S(), null, this.f283372c, 1, interfaceC4987x84e327cb.mo42933xb5885648());
    }
}
