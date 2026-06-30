package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class ka extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public final java.lang.String H;
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f197977J;
    public android.view.View K;
    public android.view.View L;
    public yz5.l M;
    public android.widget.TextView N;
    public final int P;
    public bm2.c6 Q;
    public p3325xe03a0797.p3326xc267989b.r2 R;
    public wt2.a S;
    public int T;
    public int U;
    public final jz5.g V;
    public yz5.l W;
    public com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 X;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g Y;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14342xb54e31ba Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.live.view.FinderLivePromoteAddSubWidget$tingEventListener$1] */
    public ka(android.content.Context context) {
        super(context, false, null, 0.75f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.H = "FinderLivePromoteAddSubWidget";
        this.P = 1;
        this.T = -1;
        this.V = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.t9.f198231d);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.Z = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6166xea7b16fe>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.view.FinderLivePromoteAddSubWidget$tingEventListener$1
            {
                this.f39173x3fe91575 = -1986766098;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6166xea7b16fe c6166xea7b16fe) {
                el2.v2 v2Var;
                java.util.LinkedList linkedList;
                java.lang.Object obj;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6166xea7b16fe event = c6166xea7b16fe;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ka kaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ka.this;
                java.lang.String str = kaVar.H;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[tingEventListener] action = ");
                am.yy yyVar = event.f136426g;
                sb6.append(yyVar.f90024a);
                sb6.append(", isLike = ");
                sb6.append(yyVar.f90025b);
                sb6.append(", isPublic = ");
                sb6.append(yyVar.f90026c);
                sb6.append(", itemId = ");
                sb6.append(yyVar.f90027d.c());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                bm2.c6 c6Var = kaVar.Q;
                if (c6Var == null || (linkedList = c6Var.f103354h) == null) {
                    v2Var = null;
                } else {
                    java.util.Iterator it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        el2.v2 v2Var2 = (el2.v2) obj;
                        if ((v2Var2 instanceof el2.a3) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(v2Var2.a(), yyVar.f90027d.c())) {
                            break;
                        }
                    }
                    v2Var = (el2.v2) obj;
                }
                int i17 = yyVar.f90024a;
                if (i17 != 3) {
                    if (i17 != 4) {
                        if (i17 == 5 && v2Var != null) {
                            el2.a3 a3Var = v2Var instanceof el2.a3 ? (el2.a3) v2Var : null;
                            r45.qy1 qy1Var = a3Var != null ? a3Var.f335279a : null;
                            if (qy1Var != null) {
                                il4.l lVar = il4.l.f373675a;
                                bw5.o50 item = yyVar.f90027d;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "item");
                                qy1Var.set(0, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(lVar.n(item).mo14344x5f01b1f6()));
                            }
                            bm2.c6 c6Var2 = kaVar.Q;
                            if (c6Var2 != null) {
                                java.util.LinkedList linkedList2 = c6Var2.f103354h;
                                int indexOf = linkedList2.indexOf(v2Var);
                                if (indexOf >= 0 && indexOf < linkedList2.size()) {
                                    c6Var2.m8147xed6e4d18(indexOf);
                                }
                            }
                        }
                    } else if (v2Var != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ka.e0(kaVar, v2Var);
                    }
                } else if (!yyVar.f90026c && v2Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ka.e0(kaVar, v2Var);
                }
                return false;
            }
        };
    }

    public static final void e0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ka kaVar, el2.v2 item) {
        bm2.c6 c6Var = kaVar.Q;
        if (c6Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
            java.util.LinkedList linkedList = c6Var.f103354h;
            int indexOf = linkedList.indexOf(item);
            if (indexOf >= 0 && indexOf < linkedList.size()) {
                linkedList.remove(indexOf);
                c6Var.m8155x27702c4(indexOf);
            }
        }
        int i17 = kaVar.U - 1;
        kaVar.U = i17;
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ga(kaVar, kaVar.T, i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.axl;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.I = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) rootView.findViewById(com.p314xaae8f345.mm.R.id.fhv);
        this.f197977J = rootView.findViewById(com.p314xaae8f345.mm.R.id.fhw);
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.fht);
        zl2.r4 r4Var = zl2.r4.f555483a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        zl2.r4.c3(r4Var, findViewById, 0, 0, 6, null);
        this.K = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.fhu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById2);
        zl2.r4.c3(r4Var, findViewById2, 0, 0, 6, null);
        findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.x9(this));
        this.L = findViewById2;
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.fhx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        this.N = textView;
        this.Q = new bm2.c6(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.y9(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ba(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ca(this));
        android.view.View view = this.f197977J;
        if (view != null) {
            view.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.da.f197788d);
        }
        android.view.View view2 = this.K;
        if (view2 != null) {
            view2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ea(this));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.I;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7960x6cab2c8d(this.Q);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.I;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this.f199716e));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = (com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864) rootView.findViewById(com.p314xaae8f345.mm.R.id.f568116lr1);
        c22851x22587864.D(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15314xbe4d10f8(c22851x22587864.getContext(), null));
        c22851x22587864.m82945xba09cf09(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.fa(this));
        this.X = c22851x22587864;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void S() {
        super.S();
        g0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2
    public void f() {
        g0();
    }

    public final gk2.e f0() {
        return (gk2.e) ((jz5.n) this.V).mo141623x754a37bb();
    }

    public final void g0() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.R;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        bm2.c6 c6Var = this.Q;
        if (c6Var != null) {
            c6Var.f103354h.clear();
            c6Var.m8146xced61ae5();
        }
        yz5.l lVar = this.W;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(this.T));
        }
        this.Y = null;
        mo48814x2efc64();
    }

    public final void h0(int i17) {
        i0(i17);
        android.view.View view = this.L;
        if (view == null) {
            return;
        }
        int i18 = i17 == 7 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddSubWidget", "refreshDataAndUI", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddSubWidget", "refreshDataAndUI", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void i0(int i17) {
        yg2.b bVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.H, "[requestData] type = " + i17);
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = this.X;
        if (c22851x22587864 != null) {
            c22851x22587864.E(false);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.R;
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = null;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        gk2.e f07 = f0();
        if (f07 != null && (bVar = f07.f354008i) != null) {
            r2Var2 = p3325xe03a0797.p3326xc267989b.l.d(bVar, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ja(this, i17, null), 3, null);
        }
        this.R = r2Var2;
    }

    public final void j0(int i17, int i18, wt2.a presenter, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 e0Var, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.S = presenter;
        this.M = lVar;
        this.T = i17;
        this.U = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(this, e0Var, false, 0, 6, null);
        h0(i17);
        if (i17 == 19) {
            mo48813x58998cd();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean w() {
        return true;
    }
}
