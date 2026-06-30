package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.d2.class)
@java.lang.Deprecated
/* loaded from: classes9.dex */
public class ml extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.d2, com.p314xaae8f345.mm.p2621x8fb0427b.f8 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f281049e = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21672x160faeea(this, com.p314xaae8f345.mm.app.a0.f134821d);

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        this.f281049e.mo48814x2efc64();
        ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).f276654h.j(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        this.f280113d.D();
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        if (i17 == 0) {
            try {
                m0();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingUI.SilenceMsgComponent", e17, "silenceMsgImp handleIdelScrollChange", new java.lang.Object[0]);
            }
        }
    }

    public void m0() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389;
        yb5.d dVar = this.f280113d;
        android.view.View f17 = dVar.f(dVar.j());
        if (f17 != null && f17.getTop() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange forceTopLoadData true");
            if (!this.f280113d.D() || (mo75871xfb80e389 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f280113d.f542241c.a(sb5.z.class))).mo75871xfb80e389(0)) == null || mo75871xfb80e389.m124847x74d37ac6() == 0) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange check fault[%d, %d, %d, %d, %d, %d, %d, %s]", java.lang.Integer.valueOf(mo75871xfb80e389.w0()), java.lang.Integer.valueOf(mo75871xfb80e389.A0()), java.lang.Long.valueOf(mo75871xfb80e389.m124847x74d37ac6()), java.lang.Long.valueOf(mo75871xfb80e389.I0()), java.lang.Long.valueOf(mo75871xfb80e389.F0()), java.lang.Long.valueOf(mo75871xfb80e389.mo78012x3fdd41df()), java.lang.Integer.valueOf(mo75871xfb80e389.mo78013xfb85f7b0()), mo75871xfb80e389.Q0());
            if ((mo75871xfb80e389.w0() & 1) == 0 || (mo75871xfb80e389.w0() & 4) == 0) {
                return;
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) this.f280113d.f542252n).B.m79088x648e109b(false);
            return;
        }
        if (this.f280113d.D()) {
            yb5.d dVar2 = this.f280113d;
            if (dVar2.f(dVar2.p().m75886x3d79f549() - 1) != null) {
                sb5.z zVar = (sb5.z) this.f280113d.f542241c.a(sb5.z.class);
                if (this.f280113d.o() == this.f280113d.p().s().mo8143x7444f759() - 1) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = null;
                    int i17 = 1;
                    while (true) {
                        if (i17 >= 5) {
                            break;
                        }
                        f9Var = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f280113d.f542241c.a(sb5.z.class))).mo75871xfb80e389(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).mo8143x7444f759() - i17);
                        if (f9Var != null && f9Var.m124847x74d37ac6() != 0 && (f9Var.w0() & 1) != 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange bottom check fault found i[%s]", java.lang.Integer.valueOf(i17));
                            break;
                        }
                        i17++;
                    }
                    if (f9Var == null || f9Var.m124847x74d37ac6() == 0) {
                        if ((f9Var != null) && ((f9Var.w0() & 2) != 0)) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.f9 q57 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).q5(f9Var.Q0());
                            if (q57 == null || q57.m124847x74d37ac6() == 0 || q57.mo78012x3fdd41df() <= f9Var.mo78012x3fdd41df()) {
                                return;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange bottom check fault[%d, %d, %d, %d, %d, %d, %d, %s] not need notify", java.lang.Integer.valueOf(q57.w0()), java.lang.Integer.valueOf(q57.A0()), java.lang.Long.valueOf(q57.m124847x74d37ac6()), java.lang.Long.valueOf(q57.I0()), java.lang.Long.valueOf(q57.F0()), java.lang.Long.valueOf(q57.mo78012x3fdd41df()), java.lang.Integer.valueOf(q57.mo78013xfb85f7b0()), q57.Q0());
                            return;
                        }
                        return;
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 k27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().k2(f9Var.Q0(), f9Var.F0());
                    if (k27 != null && k27.m124847x74d37ac6() != 0 && k27.m124847x74d37ac6() == f9Var.m124847x74d37ac6() && (k27.w0() & 1) == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange found msg not fault msgId[%s] flag[%s]", java.lang.Long.valueOf(k27.m124847x74d37ac6()), java.lang.Integer.valueOf(k27.w0()));
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange bottom check fault[%d, %d, %d, %d, %d, %d, %d, %s]", java.lang.Integer.valueOf(f9Var.w0()), java.lang.Integer.valueOf(f9Var.A0()), java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Long.valueOf(f9Var.I0()), java.lang.Long.valueOf(f9Var.F0()), java.lang.Long.valueOf(f9Var.mo78012x3fdd41df()), java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()), f9Var.Q0());
                    if ((f9Var.w0() & 1) == 0 || (f9Var.w0() & 4) != 0) {
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange forceBottomLoadData");
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) this.f280113d.f542252n).i1(false);
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) this.f280113d.f542252n).h1(true);
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) this.f280113d.f542252n).B.c(true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange bottom check fault found");
                    gm0.j1.e().j(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.il(this, f9Var));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v18 */
    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.f8
    public void p(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, com.p314xaae8f345.mm.p2621x8fb0427b.l8 l8Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        ?? r76;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify cvs.getUsername[%s] tid[%d]", l4Var.h1(), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        yb5.d dVar = this.f280113d;
        if (!dVar.f542247i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingUI.SilenceMsgComponent", "[onMsgChangeNotify] ChattingUI is not in Foreground!!");
            return;
        }
        if (dVar.D() && this.f280113d.u().d1().equals(l4Var.h1())) {
            sb5.z zVar = (sb5.z) this.f280113d.f542241c.a(sb5.z.class);
            int T0 = l4Var.T0();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar;
            int M0 = kVar.M0();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(T0);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(M0);
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify newCvsCount[%d], total[%d], dealHistoryGetMsg[%b], UnDeliverCount[%d]", valueOf, valueOf2, bool, java.lang.Integer.valueOf(l4Var.c1()));
            if (T0 <= M0 || (f9Var = l4Var.f276617f2) == null || f9Var.m124847x74d37ac6() == 0) {
                return;
            }
            int i17 = T0 - M0;
            int w07 = f9Var.w0();
            java.lang.Long valueOf3 = java.lang.Long.valueOf(f9Var.I0());
            java.lang.Long valueOf4 = java.lang.Long.valueOf(f9Var.F0());
            java.lang.Integer valueOf5 = java.lang.Integer.valueOf(w07);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify receive get msg svrId[%d], seq[%d], flag[%d], stack[%s]", valueOf3, valueOf4, valueOf5, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            if ((w07 & 2) == 0) {
                return;
            }
            if (this.f280113d.p() != null) {
                yb5.d dVar2 = this.f280113d;
                if (dVar2.f542252n != null) {
                    if ((w07 & 4) == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify down dealHistoryGetMsg: %b", bool);
                        int j17 = this.f280113d.j();
                        int mo8143x7444f759 = kVar.mo8143x7444f759();
                        int mo8143x7444f7592 = kVar.mo8143x7444f759();
                        int i18 = mo8143x7444f7592 - mo8143x7444f759;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify down talker[%s],firstVisiblePosition:%d, new oldTotal[%d,%d,%d], now preCount:[%d,%d,%d] fromcount:%d, needCheckHistoryTips:%b", this.f280113d.u().d1(), java.lang.Integer.valueOf(j17), java.lang.Integer.valueOf(T0), java.lang.Integer.valueOf(M0), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(mo8143x7444f7592), java.lang.Integer.valueOf(mo8143x7444f759), java.lang.Integer.valueOf(i18), 0, bool);
                        if (i18 > 1) {
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 p17 = this.f280113d.p();
                            int mo75757x2ce24761 = p17.mo75757x2ce24761();
                            android.view.View mo75872xfb86a31b = (j17 < mo75757x2ce24761 || j17 > (p17.m75886x3d79f549() + mo75757x2ce24761) + (-1)) ? p17.s().mo75872xfb86a31b(j17, null, p17.f()) : p17.m75885x6a486239(j17 - mo75757x2ce24761);
                            int top = mo75872xfb86a31b == null ? 0 : mo75872xfb86a31b.getTop();
                            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) this.f280113d.f542252n).B;
                            int m79074xd3ae1da8 = top - (c21897x17252689 == null ? 0 : c21897x17252689.m79074xd3ae1da8());
                            this.f280113d.p().k(this.f280113d.p().s());
                            this.f280113d.U(j17, m79074xd3ae1da8, false, false);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr firstVisiblePosition %s firstView %s scrollY %s %s", java.lang.Integer.valueOf(j17), mo75872xfb86a31b, java.lang.Integer.valueOf(top), java.lang.Integer.valueOf(m79074xd3ae1da8));
                            this.f280113d.p().m75893x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jl(this, j17, m79074xd3ae1da8, kVar));
                            this.f280113d.p().m75894x7c4d7ca2(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kl(this, j17, m79074xd3ae1da8, kVar), 200L);
                            return;
                        }
                        return;
                    }
                    int j18 = dVar2.j();
                    int o17 = this.f280113d.o();
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389 = kVar.mo75871xfb80e389(j18);
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e3892 = kVar.mo75871xfb80e389(o17);
                    int mo8143x7444f7593 = kVar.mo8143x7444f759();
                    int mo8143x7444f7594 = kVar.mo8143x7444f759();
                    int i19 = mo8143x7444f7594 - mo8143x7444f7593;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify up talker[%s],new oldTotal[%d,%d,%d], now preCount:[%d,%d,%d] fromcount:%d needCheckHistoryTips:%b", this.f280113d.u().d1(), java.lang.Integer.valueOf(T0), java.lang.Integer.valueOf(M0), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(mo8143x7444f7594), java.lang.Integer.valueOf(mo8143x7444f7593), java.lang.Integer.valueOf(i19), 0, bool);
                    if (mo75871xfb80e3892 != null && mo75871xfb80e3892.m124847x74d37ac6() != 0 && mo75871xfb80e3892.mo78012x3fdd41df() < f9Var.mo78012x3fdd41df()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr lastVisibleMsg getCreateTime < lastInsert msg");
                        r76 = 1;
                    } else if (i19 > 0) {
                        kVar.I0(i19);
                        java.lang.Object[] objArr = new java.lang.Object[5];
                        objArr[0] = java.lang.Integer.valueOf(j18);
                        r76 = 1;
                        objArr[1] = java.lang.Integer.valueOf(o17);
                        objArr[2] = java.lang.Long.valueOf(mo75871xfb80e389 == null ? -1L : mo75871xfb80e389.mo78012x3fdd41df());
                        objArr[3] = java.lang.Long.valueOf(mo75871xfb80e3892 != null ? mo75871xfb80e3892.mo78012x3fdd41df() : -1L);
                        objArr[4] = java.lang.Long.valueOf(f9Var.mo78012x3fdd41df());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr firstVisiblePosition %s, lastVisiblePosition %s, createtime[%s, %s, %s]", objArr);
                        java.lang.Integer valueOf6 = java.lang.Integer.valueOf(i19);
                        int i27 = i19 + 1;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify up nowCount > preCount on set select:%d position %d, firstVisiblePosition %s", valueOf6, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(j18));
                        yb5.d dVar3 = this.f280113d;
                        dVar3.U(i27, ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) dVar3.f542241c.a(sb5.z0.class))).r0() + ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) this.f280113d.f542252n).B.m79077xde699c26(), false, false);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ll(this, i19));
                    } else {
                        r76 = 1;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify up incTotal incCount[%d, %d, %d] keep same", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), 0);
                    }
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) this.f280113d.f542252n).B.d(false);
                    if (l4Var.c1() < r76) {
                        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf) ((sb5.a1) this.f280113d.f542241c.a(sb5.a1.class))).v0(r76);
                        return;
                    }
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr something is null %s %s %s", this.f280113d.p(), kVar, this.f280113d.f542252n);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
    }
}
