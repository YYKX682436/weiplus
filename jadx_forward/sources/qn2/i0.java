package qn2;

/* loaded from: classes3.dex */
public final class i0 extends qn2.z {
    public final qo0.c A;
    public volatile int B;
    public android.view.ViewGroup C;
    public qn2.l1 D;
    public android.view.ViewGroup E;
    public qn2.u1 F;
    public android.view.ViewGroup G;
    public qn2.v0 H;
    public final yz5.l I;

    /* renamed from: J, reason: collision with root package name */
    public final yz5.l f446611J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.A = statusMonitor;
        this.B = -1;
        this.I = new qn2.e0(this);
        this.f446611J = new qn2.g0(this);
    }

    @Override // qo0.a
    public void A0(int i17, int i18, android.content.Intent intent) {
        s71.b bVar;
        byte[] byteArrayExtra;
        qn2.v0 v0Var = this.H;
        if (v0Var != null && i17 == 1001 && i18 == -1) {
            if (intent == null || (byteArrayExtra = intent.getByteArrayExtra("launch_from_select_addr")) == null) {
                bVar = null;
            } else {
                bVar = new s71.b();
                bVar.mo11468x92b714fd(byteArrayExtra);
            }
            if (bVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VisitorLotteryCardDoneWidget", "request addr but result is empty!");
                return;
            }
            android.content.Context context = v0Var.f446710b.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
            u1Var.g(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dpc));
            u1Var.n(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dpb));
            u1Var.j(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dpa));
            u1Var.i(new on2.b3(u1Var));
            u1Var.l(new qn2.r0(v0Var, bVar));
            u1Var.q(false);
            v0Var.f446734z = u1Var.f293531c;
        }
    }

    @Override // qn2.z, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            super.K0(i17);
        } else {
            this.f446856d.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveLotteryVisitorCardPlugin", "setVisible return for isTeenMode");
        }
    }

    @Override // qn2.z, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        qn2.v0 v0Var = this.H;
        if (v0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c1 c1Var = v0Var.f446733y;
            if (c1Var != null) {
                c1Var.q();
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = v0Var.f446734z;
            if (j0Var != null) {
                j0Var.dismiss();
            }
        }
    }

    @Override // qn2.z
    public void t1() {
        super.t1();
        this.B = -1;
    }

    @Override // qn2.z
    public void v1() {
        super.v1();
        android.view.ViewGroup viewGroup = this.f446856d;
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.m8k);
        this.C = viewGroup2;
        android.view.View view = this.f446758u;
        android.view.View view2 = this.f446759v;
        if (viewGroup2 != null && view != null && view2 != null) {
            qn2.l1 l1Var = new qn2.l1(this, viewGroup2, view, view2);
            this.D = l1Var;
            android.view.ViewGroup viewGroup3 = l1Var.f446625b;
            l1Var.f446634k = (android.widget.TextView) viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
            l1Var.f446635l = (android.widget.TextView) viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.cwn);
            android.widget.TextView textView = l1Var.f446634k;
            com.p314xaae8f345.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
            l1Var.f446636m = (android.widget.TextView) viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.f565599cw1);
            l1Var.f446637n = (android.widget.TextView) viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.cwa);
            l1Var.f446638o = viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.f568611nf3);
            l1Var.f446640q = (android.widget.TextView) viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.gx_);
            l1Var.f446639p = (android.widget.TextView) viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.a6b);
            l1Var.f446641r = (android.widget.TextView) viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.obc);
            l1Var.f446642s = viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.q89);
            l1Var.f446643t = (android.widget.ImageView) viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.f567974l74);
            l1Var.f446644u = viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.l6s);
            l1Var.f446645v = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1554x2e7b10.C14429xe96c5f3b) viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.q6w);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(l1Var.f446639p, "finder_live_participate_lucky");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(l1Var.f446639p, 40, 25561);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(l1Var.f446639p, new qn2.w0(l1Var));
            android.widget.TextView textView2 = l1Var.f446639p;
            if (textView2 != null) {
                textView2.setOnClickListener(new qn2.x0(l1Var));
            }
            android.view.View view3 = l1Var.f446627d;
            android.widget.TextView textView3 = (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.au7);
            on2.l3 l3Var = on2.l3.f428499a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
            l3Var.f(textView3);
            android.widget.TextView textView4 = (android.widget.TextView) viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.au7);
            view3.setTag(com.p314xaae8f345.mm.R.id.e6f, textView4 != null ? textView4.getText() : null);
        }
        android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.pmt);
        this.E = viewGroup4;
        android.view.View view4 = this.f446758u;
        android.view.View view5 = this.f446759v;
        if (viewGroup4 != null && view4 != null && view5 != null) {
            qn2.u1 u1Var = new qn2.u1(this, viewGroup4, view4, view5);
            this.F = u1Var;
            android.view.ViewGroup viewGroup5 = u1Var.f446696b;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup5.findViewById(com.p314xaae8f345.mm.R.id.f567248ir0);
            u1Var.f446700f = c22699x3dcdb352;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(0);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = u1Var.f446700f;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.post(new qn2.n1(u1Var));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = u1Var.f446700f;
            if (c22699x3dcdb3523 != null) {
                c22699x3dcdb3523.setOnClickListener(new qn2.o1(u1Var));
            }
            android.widget.TextView textView5 = (android.widget.TextView) viewGroup5.findViewById(com.p314xaae8f345.mm.R.id.pms);
            u1Var.f446701g = textView5;
            com.p314xaae8f345.mm.ui.bk.r0(textView5 != null ? textView5.getPaint() : null, 0.8f);
            u1Var.f446702h = (android.widget.TextView) viewGroup5.findViewById(com.p314xaae8f345.mm.R.id.oho);
            u1Var.f446703i = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) viewGroup5.findViewById(com.p314xaae8f345.mm.R.id.pmx);
            u1Var.f446706l = new qn2.c0(u1Var.f446695a.S0());
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = u1Var.f446703i;
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(viewGroup5.getContext(), 1, false));
                c1163xf1deaba4.mo7960x6cab2c8d(u1Var.f446706l);
                c1163xf1deaba4.i(new qn2.p1(u1Var));
            }
            u1Var.f446704j = viewGroup5.findViewById(com.p314xaae8f345.mm.R.id.pmu);
            u1Var.f446705k = (android.widget.TextView) viewGroup5.findViewById(com.p314xaae8f345.mm.R.id.ili);
        }
        android.view.ViewGroup viewGroup6 = (android.view.ViewGroup) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ish);
        this.G = viewGroup6;
        android.view.View view6 = this.f446758u;
        android.view.View view7 = this.f446759v;
        if (viewGroup6 == null || view6 == null || view7 == null) {
            return;
        }
        qn2.v0 v0Var = new qn2.v0(this, viewGroup6, view6, view7);
        this.H = v0Var;
        android.view.ViewGroup viewGroup7 = v0Var.f446710b;
        android.widget.TextView textView6 = (android.widget.TextView) viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.kcv);
        v0Var.f446713e = textView6;
        com.p314xaae8f345.mm.ui.bk.r0(textView6 != null ? textView6.getPaint() : null, 0.8f);
        android.widget.TextView textView7 = (android.widget.TextView) viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.pmy);
        v0Var.f446714f = textView7;
        com.p314xaae8f345.mm.ui.bk.r0(textView7 != null ? textView7.getPaint() : null, 0.8f);
        v0Var.f446715g = (android.widget.ImageView) viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.pmp);
        v0Var.f446716h = (android.widget.TextView) viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.pmv);
        v0Var.f446717i = (android.widget.TextView) viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.f567962l62);
        v0Var.f446718j = (android.widget.ImageView) viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.i0e);
        v0Var.f446719k = (android.widget.ImageView) viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.m48);
        v0Var.f446720l = (android.widget.TextView) viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.dkh);
        v0Var.f446732x = (android.widget.TextView) viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.f565275bx3);
        v0Var.f446721m = (android.widget.TextView) viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.f566696q71);
        v0Var.f446722n = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1554x2e7b10.C14429xe96c5f3b) viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.f566695q70);
        v0Var.f446723o = viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.f565397q40);
        v0Var.f446724p = viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.q6_);
        v0Var.f446725q = (android.widget.ImageView) viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.q7a);
        v0Var.f446726r = (android.widget.TextView) viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.q7b);
        v0Var.f446730v = viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.q7c);
        v0Var.f446731w = viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.q3_);
        android.widget.TextView textView8 = v0Var.f446732x;
        if (textView8 != null) {
            textView8.setOnClickListener(new qn2.m0(v0Var));
        }
        android.view.View findViewById = viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.ira);
        v0Var.f446727s = findViewById;
        if (findViewById != null) {
            findViewById.post(new qn2.n0(v0Var));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(v0Var.f446727s, "finder_live_win_result_list");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(v0Var.f446727s, 8, 25561);
        android.view.View view8 = v0Var.f446727s;
        if (view8 != null) {
            view8.setOnClickListener(new qn2.o0(v0Var));
        }
        v0Var.f446728t = (android.widget.TextView) viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.ir_);
        v0Var.f446729u = viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.iqz);
    }

    @Override // qn2.z
    public void w1(boolean z17, km2.z lotteryInfoWrapper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryInfoWrapper, "lotteryInfoWrapper");
        super.w1(z17, lotteryInfoWrapper);
        pm0.v.X(new qn2.h0(lotteryInfoWrapper, z17, this));
    }

    public final void y1(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryVisitorCardPlugin", "chooseContainer ui mode:" + i17);
        this.B = i17;
        if (i17 == 0) {
            android.view.ViewGroup viewGroup = this.C;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            android.view.ViewGroup viewGroup2 = this.E;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            android.view.ViewGroup viewGroup3 = this.G;
            if (viewGroup3 == null) {
                return;
            }
            viewGroup3.setVisibility(8);
            return;
        }
        if (i17 == 1) {
            android.view.ViewGroup viewGroup4 = this.C;
            if (viewGroup4 != null) {
                viewGroup4.setVisibility(8);
            }
            android.view.ViewGroup viewGroup5 = this.E;
            if (viewGroup5 != null) {
                viewGroup5.setVisibility(0);
            }
            android.view.ViewGroup viewGroup6 = this.G;
            if (viewGroup6 == null) {
                return;
            }
            viewGroup6.setVisibility(8);
            return;
        }
        if (i17 == 2) {
            android.view.ViewGroup viewGroup7 = this.C;
            if (viewGroup7 != null) {
                viewGroup7.setVisibility(8);
            }
            android.view.ViewGroup viewGroup8 = this.E;
            if (viewGroup8 != null) {
                viewGroup8.setVisibility(8);
            }
            android.view.ViewGroup viewGroup9 = this.G;
            if (viewGroup9 != null) {
                viewGroup9.setVisibility(0);
            }
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.p4 p4Var = ml2.p4.f409332m;
            ml2.v4[] v4VarArr = ml2.v4.f409682d;
            ml2.r0.ek(r0Var, p4Var, java.lang.String.valueOf(2), null, 0, null, 28, null);
            return;
        }
        if (i17 != 3) {
            return;
        }
        android.view.ViewGroup viewGroup10 = this.C;
        if (viewGroup10 != null) {
            viewGroup10.setVisibility(8);
        }
        android.view.ViewGroup viewGroup11 = this.E;
        if (viewGroup11 != null) {
            viewGroup11.setVisibility(8);
        }
        android.view.ViewGroup viewGroup12 = this.G;
        if (viewGroup12 != null) {
            viewGroup12.setVisibility(0);
        }
        i95.m c18 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ml2.r0 r0Var2 = (ml2.r0) c18;
        ml2.p4 p4Var2 = ml2.p4.f409332m;
        ml2.v4[] v4VarArr2 = ml2.v4.f409682d;
        ml2.r0.ek(r0Var2, p4Var2, java.lang.String.valueOf(1), null, 0, null, 28, null);
    }

    public final void z1(boolean z17) {
        r45.cz1 cz1Var;
        r45.jz1 jz1Var;
        java.util.LinkedList m75941xfb821914;
        r45.cz1 cz1Var2;
        r45.cz1 cz1Var3;
        qn2.u1 u1Var = this.F;
        if (u1Var != null) {
            qn2.i0 i0Var = u1Var.f446695a;
            on2.z2 z2Var = (on2.z2) i0Var.P0(on2.z2.class);
            km2.z zVar = z2Var.f428625m;
            int m75939xb282bd08 = (zVar == null || (cz1Var3 = zVar.f390765d) == null) ? 0 : cz1Var3.m75939xb282bd08(10);
            km2.z zVar2 = z2Var.f428625m;
            java.lang.String str = "visitorLotteryDoneWinnerList realWinnerCnt:" + m75939xb282bd08 + ",participateCount:" + ((zVar2 == null || (cz1Var2 = zVar2.f390765d) == null) ? 0 : cz1Var2.m75939xb282bd08(7));
            java.lang.String str2 = u1Var.f446699e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
            qn2.c0 c0Var = u1Var.f446706l;
            if (c0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveLotteryWinnerListAdapter", "clear");
                c0Var.f446581e.clear();
                c0Var.m8146xced61ae5();
            }
            android.widget.TextView textView = u1Var.f446701g;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.widget.TextView textView2 = u1Var.f446702h;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = u1Var.f446703i;
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.setVisibility(0);
            }
            r45.ht1 ht1Var = z2Var.f428627o;
            int size = (ht1Var == null || (jz1Var = (r45.jz1) ht1Var.m75936x14adae67(4)) == null || (m75941xfb821914 = jz1Var.m75941xfb821914(0)) == null) ? 0 : m75941xfb821914.size();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "parseWinnerList winnerListSize:" + size);
            if (size > 0) {
                u1Var.a(ht1Var);
            } else {
                km2.z zVar3 = ((on2.z2) i0Var.P0(on2.z2.class)).f428625m;
                java.lang.String m75945x2fec8307 = (zVar3 == null || (cz1Var = zVar3.f390765d) == null) ? null : cz1Var.m75945x2fec8307(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "parseWinnerList record is empty!lotteryId:" + m75945x2fec8307);
                dk2.xf W0 = i0Var.W0();
                if (W0 != null) {
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    r45.ht1 ht1Var2 = ((on2.z2) i0Var.P0(on2.z2.class)).f428627o;
                    ((dk2.r4) W0).N(m75945x2fec8307, ht1Var2 != null ? ht1Var2.m75934xbce7f2f(2) : null, new qn2.s1(u1Var));
                }
            }
            if (z17) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = u1Var.f446700f;
                if (c22699x3dcdb352 != null) {
                    c22699x3dcdb352.setVisibility(0);
                }
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = u1Var.f446700f;
                if (c22699x3dcdb3522 != null) {
                    c22699x3dcdb3522.setVisibility(8);
                }
            }
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.ek((ml2.r0) c17, ml2.p4.f409333n, "", null, 0, null, 28, null);
        }
    }
}
