package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.i.class)
/* loaded from: classes9.dex */
public class k0 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.i, xg3.h0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f280862e = true;

    /* renamed from: f, reason: collision with root package name */
    public final vh0.m1 f280863f = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m0(this);

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f280864g = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n0(this);

    /* renamed from: h, reason: collision with root package name */
    public long f280865h = 0;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        this.f280113d.f542250l.m78680x8f8ecf18(5);
        vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
        if (n1Var != null) {
            vh0.m1 listener = this.f280863f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
            ((vh0.f3) n1Var).f518394h.remove(listener);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this, android.os.Looper.getMainLooper());
    }

    @Override // yn.d
    public void O() {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(this.f280113d.x())) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_name", this.f280113d.x());
            hashMap.put("enter_sessionid", this.f280113d.f542255q);
            hashMap.put("enter_type", java.lang.Integer.valueOf(this.f280113d.k()));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("yuanbao_chat_close", "view_clk", hashMap, 34004);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(this.f280113d.x())) {
            final android.app.Activity context = this.f280113d.g();
            final int intExtra = this.f280113d.n().getIntExtra("chat_from_scene", 0);
            final vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
            switch (intExtra) {
                case 12:
                case 14:
                case 15:
                case 16:
                    java.lang.String x17 = this.f280113d.x();
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o0 o0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o0(this);
                    ((vh0.f3) n1Var).getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    if (!com.p314xaae8f345.mm.app.c6.f21432x4058ee7a.m43004x321e8933(context)) {
                        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, j3.f.a(new jz5.l("chatbotUsername", x17)), vh0.c3.class, null);
                        break;
                    } else {
                        vh0.f3.mj(o0Var, x17);
                        break;
                    }
            }
            if ((this.f280113d.l() != null) == true) {
                ((vh0.f3) n1Var).Vi(context, intExtra, this.f280113d.x());
            } else {
                int k17 = this.f280113d.k();
                yb5.d dVar = this.f280113d;
                ((vh0.f3) n1Var).bj(context, dVar.x(), vh0.l2.a(k17), dVar.f542255q, new vh0.i1() { // from class: com.tencent.mm.ui.chatting.component.k0$$a
                    @Override // vh0.i1
                    /* renamed from: onResult */
                    public final void mo56534x57429edc(java.lang.Object obj) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k0 k0Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k0.this;
                        k0Var.getClass();
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            k0Var.f280113d.d();
                        } else {
                            ((vh0.f3) n1Var).Vi(context, intExtra, k0Var.f280113d.x());
                        }
                    }
                });
            }
            int k18 = this.f280113d.k();
            java.lang.String str = this.f280113d.f542255q;
            java.util.HashMap hashMap = new java.util.HashMap();
            iy1.c cVar = iy1.c.MainUI;
            hashMap.put("page_id", 50175);
            hashMap.put("page_name", "chatting_yuanbao_single");
            hashMap.put("chat_name", this.f280113d.x());
            hashMap.put("enter_sessionid", str);
            hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(k18)));
            hashMap.put("if_friend", java.lang.Integer.valueOf(this.f280113d.u().r2() ? 1 : 0));
            hashMap.put("screen_mode", java.lang.Integer.valueOf((this.f280113d.l() != null ? 1 : 0) ^ 1));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("session_in", hashMap, 34004);
        }
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        java.util.ArrayList arrayList;
        int i17;
        if (this.f280113d.u() == null || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(this.f280113d.u().d1()) || !this.f280113d.u().d1().equals("wxid_wi_1d142z0zdj03") || m0Var == null || l0Var == null || l0Var.f535943a == null || (arrayList = l0Var.f535945c) == null || arrayList.isEmpty()) {
            return;
        }
        java.lang.String str = l0Var.f535944b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatBotComponent", "notifyInfo.func = %s", str);
        int i18 = 2;
        int i19 = 1;
        if ("insert".equals(str) || "update".equals(str)) {
            java.util.Iterator it = arrayList.iterator();
            i17 = 0;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                int A0 = f9Var.A0();
                if (A0 != 0) {
                    if (A0 == i19 && f9Var.P0() == i18 && f9Var.T0() != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(f9Var.T0()) && f9Var.T0().equals(this.f280113d.x())) {
                        i17++;
                        int k17 = this.f280113d.k();
                        java.lang.String str2 = this.f280113d.f542255q;
                        ot0.q v17 = ot0.q.v(f9Var.j());
                        int i27 = v17 == null ? 0 : v17.f430199i;
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("chat_name", this.f280113d.x());
                        hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(k17)));
                        hashMap.put("enter_sessionid", str2);
                        hashMap.put("msgid", java.lang.Long.valueOf(f9Var.I0()));
                        hashMap.put("msgtype", java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()));
                        hashMap.put("submsgtype", java.lang.Integer.valueOf(i27));
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("send_msg", hashMap, 34003);
                    }
                } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(f9Var.y0())) {
                    i17--;
                    int k18 = this.f280113d.k();
                    java.lang.String str3 = this.f280113d.f542255q;
                    ot0.q v18 = ot0.q.v(f9Var.j());
                    int i28 = v18 == null ? 0 : v18.f430199i;
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put("chat_name", this.f280113d.x());
                    hashMap2.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(k18)));
                    hashMap2.put("enter_sessionid", str3);
                    hashMap2.put("msgid", java.lang.Long.valueOf(f9Var.I0()));
                    hashMap2.put("msgtype", java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()));
                    hashMap2.put("submsgtype", java.lang.Integer.valueOf(i28));
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("receive_msg", hashMap2, 34003);
                }
                i18 = 2;
                i19 = 1;
            }
        } else {
            i17 = 0;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f280864g;
        n3Var.mo50303x856b99f0(1);
        if (i17 <= 0) {
            n3Var.mo50303x856b99f0(2);
            n3Var.mo50303x856b99f0(1);
            m0(false);
            return;
        }
        ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).getClass();
        int i29 = 30;
        try {
            i29 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("TypingDurationSecond", 30);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChatBotConfigService", th6, "[-] Fail to get dynamic config.", new java.lang.Object[0]);
        }
        n3Var.mo50307xb9e94560(1, i29 * 1000);
        n3Var.mo50307xb9e94560(2, 200L);
    }

    @Override // yn.d
    public boolean d0(int i17, android.view.KeyEvent keyEvent) {
        yb5.d dVar;
        if (i17 == 4 && (dVar = this.f280113d) != null && "wxid_wi_1d142z0zdj03".equals(dVar.x())) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("yuanbao_chat_left_slide_close", "view_clk", bm5.i0.a(new java.util.HashMap(16), new m3.d("chat_name", dVar.x()), new m3.d("enter_sessionid", dVar.f542255q), new m3.d("enter_type", java.lang.Integer.valueOf(vh0.l2.a(dVar.k())))), 34004);
        }
        return false;
    }

    public final void m0(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatBotComponent", "resetChattingTitle, isOverTime = %s, tick = %s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(this.f280865h));
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) this.f280113d.f542241c.a(sb5.z0.class))).C();
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatBotComponent", "Unexpected thread, report may be wrong!");
        }
        if (this.f280865h == 0) {
            return;
        }
        this.f280865h = 0L;
        int k17 = this.f280113d.k();
        java.lang.String str = this.f280113d.f542255q;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("chat_name", this.f280113d.x());
        hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(k17)));
        hashMap.put("enter_sessionid", str);
        hashMap.put("view_id", "yuanbao_chat");
        hashMap.put("end_reason", java.lang.Integer.valueOf(z17 ? 1 : 0));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("input_cancel", hashMap, 34004);
    }

    public void n0() {
        yb5.d dVar = this.f280113d;
        if (dVar == null || dVar.f542250l == null) {
            return;
        }
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2584xd0ce9a2d.C20831x84d13498()) != 0) {
            if (this.f280862e) {
                this.f280113d.f542250l.mo78691x3f86539a((java.lang.String) null);
            } else {
                yb5.d dVar2 = this.f280113d;
                dVar2.f542250l.mo78691x3f86539a(dVar2.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o_3));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        vh0.n1 n1Var;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(this.f280113d.x())) {
            ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.H);
            if ((j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2584xd0ce9a2d.C20831x84d13498()) != 0) && (n1Var = (vh0.n1) i95.n0.c(vh0.n1.class)) != null) {
                java.lang.String x17 = this.f280113d.x();
                vh0.f3 f3Var = (vh0.f3) n1Var;
                java.lang.Boolean bool = (java.lang.Boolean) f3Var.f518393g.get(x17);
                this.f280862e = bool == null ? true : bool.booleanValue();
                vh0.m1 listener = this.f280863f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
                f3Var.f518394h.add(listener);
                if (x17.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatBotRoutineService", "fetchWeClawStatus: username empty, skip");
                } else {
                    p3325xe03a0797.p3326xc267989b.l.d(f3Var.f518391e, null, null, new vh0.r2(x17, f3Var, null), 3, null);
                }
            }
        }
    }
}
