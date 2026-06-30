package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class t2 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements yn.e, xg3.h0 {
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        android.database.Cursor f17;
        boolean m07 = m0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingAutoTranslationComponent", "onChattingEnterAnimEnd() called isSupportChat:" + m07 + " talker:" + this.f280113d.u().d1() + ' ');
        if (m07) {
            go.d dVar = go.d.f355229a;
            go.d.f355233e = this.f280113d.x();
            go.d.f355232d = 0;
            final java.lang.String x17 = this.f280113d.x();
            n0(x17);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this, android.os.Looper.getMainLooper());
            this.f280113d.h().b(hd5.n.ACTION_UPDATE, false);
            if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2510x423001a2.C19937x42c107f()) == 1) {
                final com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
                cj6.getClass();
                if (android.text.TextUtils.isEmpty(x17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getLimitNonSys fail, argument is invalid");
                    f17 = null;
                } else {
                    final java.lang.String X8 = cj6.X8(x17);
                    if (cj6.Da(X8)) {
                        final int i17 = 100;
                        f17 = ot0.c3.l().c("getLimitSysMsg", new yz5.a() { // from class: com.tencent.mm.storage.g9$$j1
                            @Override // yz5.a
                            /* renamed from: invoke */
                            public final java.lang.Object mo152xb9724478() {
                                java.lang.String str = X8;
                                java.lang.String str2 = x17;
                                int i18 = i17;
                                ot0.z2 z2Var = ot0.z2.f430355a;
                                com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                                return z2Var.I0(g9Var.f275522r, str, str2, i18, java.util.Arrays.asList(g9Var.D8()));
                            }
                        }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$k1
                            @Override // yz5.a
                            /* renamed from: invoke */
                            public final java.lang.Object mo152xb9724478() {
                                com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                                g9Var.getClass();
                                return g9Var.f275522r.f("select * from " + X8 + " where" + g9Var.Z8(x17) + "AND type IN (10000,10002,570425393,64,855638065,889192497,922746929,268445456,1077936177,603979825) AND isSend=0 order by createTime ASC limit " + i17, null, 2);
                            }
                        });
                    } else if (cj6.Pb(X8)) {
                        f17 = ot0.z2.f430355a.I0(cj6.f275522r, X8, x17, 100, java.util.Arrays.asList(cj6.D8()));
                    } else {
                        f17 = cj6.f275522r.f("select * from " + X8 + " where" + cj6.Z8(x17) + "AND type IN (10000,10002,570425393,64,855638065,889192497,922746929,268445456,1077936177,603979825) AND isSend=0 order by createTime ASC limit 100", null, 2);
                    }
                }
                while (f17.moveToNext()) {
                    try {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                        f9Var.mo9015xbf5d97fd(f17);
                        java.lang.String j17 = f9Var.j();
                        if (j17 != null && j17.contains("tmpl_type_auto_translation_sys_tip")) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoTranslationSysTipHelper", "removeSysTip talkerMap:" + x17 + ", msg: " + f9Var.m124847x74d37ac6());
                            c01.w9.f(f9Var.m124847x74d37ac6(), x17);
                        }
                    } catch (java.lang.Throwable th6) {
                        try {
                            throw th6;
                        } catch (java.lang.Throwable th7) {
                            vz5.b.a(f17, th6);
                            throw th7;
                        }
                    }
                }
                vz5.b.a(f17, null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
        go.d dVar = go.d.f355229a;
        go.d.f355232d = 0;
        if (dVar.c(go.d.f355233e) == 1) {
            dVar.e().A(go.d.f355233e, 0);
        }
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        boolean z17;
        if (l0Var != null) {
            java.lang.String x17 = this.f280113d.x();
            java.lang.String talker = l0Var.f535943a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(talker, x17) && m0()) {
                java.util.ArrayList msgList = l0Var.f535945c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msgList, "msgList");
                if (!msgList.isEmpty()) {
                    java.util.Iterator it = msgList.iterator();
                    while (it.hasNext()) {
                        if (((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next()).A0() == 0) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                if (z17) {
                    java.lang.String str = l0Var.f535944b;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "insert") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "delete")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(talker, "talker");
                        n0(talker);
                        go.d dVar = go.d.f355229a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(talker, "talker");
                        if (dVar.c(talker) == 2) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msgList, "msgList");
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            for (java.lang.Object obj : msgList) {
                                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj;
                                if (f9Var.A0() == 0 && f9Var.mo78013xfb85f7b0() == 1 && com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2.c(f9Var.j())) {
                                    arrayList.add(obj);
                                }
                            }
                            go.d dVar2 = go.d.f355229a;
                            java.util.Iterator it6 = arrayList.iterator();
                            while (it6.hasNext()) {
                                dVar2.f((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it6.next());
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean m0() {
        return (com.p314xaae8f345.mm.p2621x8fb0427b.z3.O4(this.f280113d.x()) && !this.f280113d.u().k2()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f280113d.x());
    }

    public final void n0(java.lang.String talker) {
        java.lang.Object obj;
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        java.util.List B5 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().B5(talker, false, 5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(B5);
        java.util.Iterator it = B5.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2.c(((com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj).j())) {
                    break;
                }
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj;
        if (f9Var2 == null) {
            return;
        }
        long m124847x74d37ac6 = f9Var2.m124847x74d37ac6();
        go.d dVar = go.d.f355229a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        go.d.f355230b.put(talker, java.lang.Long.valueOf(m124847x74d37ac6));
        java.util.ArrayList arrayList = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f280113d.f542241c.a(sb5.z.class))).I.f233598o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrayList, "getDataMap(...)");
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it6.next();
                if (((rd5.d) obj2).f475787d.f526833b.m124847x74d37ac6() == m124847x74d37ac6) {
                    break;
                }
            }
        }
        rd5.d dVar2 = (rd5.d) obj2;
        java.lang.Object obj3 = (dVar2 == null || (f9Var = dVar2.f475787d.f526833b) == null) ? null : f9Var.f275460g2;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.un unVar = obj3 instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.un ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.un) obj3 : null;
        if (unVar == null) {
            return;
        }
        unVar.f287249e = go.d.f355229a.c(talker);
    }
}
