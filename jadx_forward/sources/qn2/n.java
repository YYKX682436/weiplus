package qn2;

/* loaded from: classes3.dex */
public final class n extends qn2.z {
    public final qo0.c A;
    public final java.lang.String B;
    public final int C;
    public final int D;
    public final int E;
    public android.view.View F;
    public android.widget.TextView G;
    public android.widget.TextView H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f446650J;
    public android.widget.TextView K;
    public android.view.View L;
    public android.view.View M;
    public android.widget.TextView N;
    public android.widget.TextView P;
    public android.widget.TextView Q;
    public android.widget.TextView R;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 S;
    public android.view.View T;
    public android.widget.TextView U;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1554x2e7b10.C14429xe96c5f3b V;
    public android.view.View W;
    public android.widget.TextView X;
    public qn2.c0 Y;
    public boolean Z;

    /* renamed from: p0, reason: collision with root package name */
    public final yz5.l f446651p0;

    /* renamed from: x0, reason: collision with root package name */
    public final yz5.l f446652x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.A = statusMonitor;
        this.B = "FinderLiveLotteryAnchorCardPlugin";
        this.C = 1;
        this.D = 2;
        this.E = 10;
        this.f446651p0 = new qn2.d(this);
        this.f446652x0 = new qn2.f(this);
    }

    public static final void y1(qn2.n nVar, r45.cz1 cz1Var) {
        r45.cz1 cz1Var2;
        r45.jz1 jz1Var;
        java.util.LinkedList m75941xfb821914;
        r45.cz1 cz1Var3;
        boolean a86 = ((mm2.c1) nVar.P0(mm2.c1.class)).a8();
        java.lang.String str = nVar.B;
        if (!a86) {
            nVar.K0(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "anchorDoneAction liveStatus:" + ((mm2.c1) nVar.P0(mm2.c1.class)).f410346h2);
            return;
        }
        r45.ht1 ht1Var = ((on2.z2) nVar.P0(on2.z2.class)).f428627o;
        if (ht1Var != null && (cz1Var3 = (r45.cz1) ht1Var.m75936x14adae67(1)) != null) {
            cz1Var = cz1Var3;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cz1Var);
        int m75939xb282bd08 = cz1Var.m75939xb282bd08(7);
        android.view.ViewGroup viewGroup = nVar.f446856d;
        if (m75939xb282bd08 > 0) {
            nVar.A1(nVar.C);
            qn2.c0 c0Var = nVar.Y;
            if (c0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveLotteryWinnerListAdapter", "clear");
                c0Var.f446581e.clear();
                c0Var.m8146xced61ae5();
            }
            r45.ht1 ht1Var2 = ((on2.z2) nVar.P0(on2.z2.class)).f428627o;
            int size = (ht1Var2 == null || (jz1Var = (r45.jz1) ht1Var2.m75936x14adae67(4)) == null || (m75941xfb821914 = jz1Var.m75941xfb821914(0)) == null) ? 0 : m75941xfb821914.size();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "parseWinnerList winnerListSize:" + size);
            if (size > 0) {
                nVar.C1(ht1Var2);
            } else {
                km2.z zVar = ((on2.z2) nVar.P0(on2.z2.class)).f428625m;
                java.lang.String m75945x2fec8307 = (zVar == null || (cz1Var2 = zVar.f390765d) == null) ? null : cz1Var2.m75945x2fec8307(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "parseWinnerList record is empty!lotteryId:" + m75945x2fec8307);
                dk2.xf W0 = nVar.W0();
                if (W0 != null) {
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    r45.ht1 ht1Var3 = ((on2.z2) nVar.P0(on2.z2.class)).f428627o;
                    ((dk2.r4) W0).N(m75945x2fec8307, ht1Var3 != null ? ht1Var3.m75934xbce7f2f(2) : null, new qn2.l(nVar));
                }
            }
            android.widget.TextView textView = nVar.K;
            if (textView != null) {
                textView.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dre));
            }
        } else {
            nVar.A1(nVar.D);
            nVar.B1(nVar.P, cz1Var);
            android.widget.TextView textView2 = nVar.N;
            if (textView2 != null) {
                textView2.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573169dr2));
            }
            android.widget.TextView textView3 = nVar.K;
            if (textView3 != null) {
                on2.l3.f428499a.f(textView3);
            }
        }
        android.view.View view = nVar.f446758u;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "anchorDoneAction", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "anchorDoneAction", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        nVar.K0(0);
    }

    public static final void z1(qn2.n nVar, r45.cz1 cz1Var) {
        nVar.A1(0);
        nVar.B1(nVar.G, cz1Var);
        android.widget.TextView textView = nVar.H;
        android.view.ViewGroup viewGroup = nVar.f446856d;
        if (textView != null) {
            textView.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dok));
        }
        if (cz1Var.m75939xb282bd08(7) > 0) {
            android.widget.TextView textView2 = nVar.I;
            if (textView2 != null) {
                java.lang.String string = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dop);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(cz1Var.m75939xb282bd08(7))}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                textView2.setText(format);
            }
        } else {
            android.widget.TextView textView3 = nVar.I;
            if (textView3 != null) {
                textView3.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573168dr1));
            }
        }
        android.widget.TextView textView4 = nVar.f446650J;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        nVar.K0(0);
        android.view.View view = nVar.f446758u;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "anchorLotteryComputing", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "anchorLotteryComputing", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void A1(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.B, "chooseContainer ui mode:" + i17);
        if (i17 == this.C) {
            android.view.View view = this.F;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = this.M;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = this.L;
            if (view3 == null) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 == this.D) {
            android.view.View view4 = this.F;
            if (view4 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view5 = this.M;
            if (view5 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view6 = this.L;
            if (view6 == null) {
                return;
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view7 = this.F;
        if (view7 != null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view8 = this.M;
        if (view8 != null) {
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view9 = this.L;
        if (view9 == null) {
            return;
        }
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
        arrayList9.add(8);
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
        yj0.a.f(view9, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void B1(android.widget.TextView textView, r45.cz1 cz1Var) {
        android.view.ViewGroup viewGroup = this.f446856d;
        java.lang.String string = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573161dq2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String m75945x2fec8307 = cz1Var.m75945x2fec8307(4);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        objArr[0] = m75945x2fec8307;
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(objArr, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        int m75939xb282bd08 = cz1Var.m75939xb282bd08(6);
        if (textView == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(format);
        sb6.append('\n');
        java.lang.String string2 = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573163dq4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(m75939xb282bd08)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        sb6.append(format2);
        textView.setText(sb6.toString());
    }

    public final void C1(r45.ht1 ht1Var) {
        r45.jz1 jz1Var;
        jz5.f0 f0Var = null;
        r1 = null;
        java.util.LinkedList linkedList = null;
        r45.cz1 cz1Var = ht1Var != null ? (r45.cz1) ht1Var.m75936x14adae67(1) : null;
        java.lang.String str = this.B;
        if (cz1Var != null) {
            android.widget.TextView textView = this.Q;
            android.view.ViewGroup viewGroup = this.f446856d;
            if (textView != null) {
                java.lang.String string = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dsc);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(cz1Var.m75939xb282bd08(10))}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                textView.setText(format);
            }
            android.widget.TextView textView2 = this.R;
            if (textView2 != null) {
                java.lang.String string2 = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573172dr4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(cz1Var.m75939xb282bd08(7))}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
                textView2.setText(format2);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "updateWinnerList error lotteryInfo is empty!");
        }
        qn2.c0 c0Var = this.Y;
        if (c0Var != null) {
            if (ht1Var != null && (jz1Var = (r45.jz1) ht1Var.m75936x14adae67(4)) != null) {
                linkedList = jz1Var.m75941xfb821914(0);
            }
            c0Var.y(linkedList, cz1Var);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "updateWinnerList but winnderAdapter is null!");
        }
        qn2.c0 c0Var2 = this.Y;
        if (c0Var2 != null) {
            c0Var2.m8146xced61ae5();
        }
    }

    @Override // qn2.z
    public void v1() {
        super.v1();
        android.view.ViewGroup viewGroup = this.f446856d;
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.m8k);
        this.F = findViewById;
        this.G = findViewById != null ? (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2) : null;
        android.view.View view = this.F;
        this.H = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565599cw1) : null;
        android.view.View view2 = this.F;
        android.widget.TextView textView = view2 != null ? (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.cwa) : null;
        this.I = textView;
        com.p314xaae8f345.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
        android.view.View view3 = this.F;
        this.f446650J = view3 != null ? (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.f564522tn) : null;
        android.view.View view4 = this.F;
        this.V = view4 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1554x2e7b10.C14429xe96c5f3b) view4.findViewById(com.p314xaae8f345.mm.R.id.f566695q70) : null;
        android.view.View view5 = this.F;
        this.W = view5 != null ? view5.findViewById(com.p314xaae8f345.mm.R.id.q6w) : null;
        android.view.View view6 = this.F;
        this.X = view6 != null ? (android.widget.TextView) view6.findViewById(com.p314xaae8f345.mm.R.id.q6j) : null;
        android.widget.TextView textView2 = this.f446650J;
        com.p314xaae8f345.mm.ui.bk.r0(textView2 != null ? textView2.getPaint() : null, 0.8f);
        android.widget.TextView textView3 = this.f446650J;
        if (textView3 != null) {
            textView3.setOnClickListener(new qn2.h(this));
        }
        android.widget.TextView textView4 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.au7);
        this.K = textView4;
        if (textView4 != null) {
            on2.l3.f428499a.f(textView4);
        }
        this.L = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.pmt);
        android.view.View findViewById2 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.kcz);
        this.M = findViewById2;
        this.P = findViewById2 != null ? (android.widget.TextView) findViewById2.findViewById(com.p314xaae8f345.mm.R.id.f567684kd0) : null;
        android.view.View view7 = this.M;
        android.widget.TextView textView5 = view7 != null ? (android.widget.TextView) view7.findViewById(com.p314xaae8f345.mm.R.id.kcy) : null;
        this.N = textView5;
        com.p314xaae8f345.mm.ui.bk.r0(textView5 != null ? textView5.getPaint() : null, 0.8f);
        android.widget.TextView textView6 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.pms);
        this.Q = textView6;
        com.p314xaae8f345.mm.ui.bk.r0(textView6 != null ? textView6.getPaint() : null, 0.8f);
        this.R = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.oho);
        android.view.View view8 = this.L;
        this.S = view8 != null ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view8.findViewById(com.p314xaae8f345.mm.R.id.pmx) : null;
        this.Y = new qn2.c0(S0());
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.S;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(viewGroup.getContext(), 1, false));
            c1163xf1deaba4.mo7960x6cab2c8d(this.Y);
            c1163xf1deaba4.i(new qn2.g(this));
        }
        android.view.View view9 = this.L;
        this.T = view9 != null ? view9.findViewById(com.p314xaae8f345.mm.R.id.pmu) : null;
        android.view.View view10 = this.L;
        this.U = view10 != null ? (android.widget.TextView) view10.findViewById(com.p314xaae8f345.mm.R.id.ili) : null;
    }

    @Override // qn2.z
    public void w1(boolean z17, km2.z lotteryInfoWrapper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryInfoWrapper, "lotteryInfoWrapper");
        super.w1(z17, lotteryInfoWrapper);
        pm0.v.X(new qn2.a(lotteryInfoWrapper, this, z17));
    }
}
