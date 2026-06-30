package pp1;

/* loaded from: classes14.dex */
public final class z implements p012xc85e97e9.p093xedfae76a.y, gp1.y, pp1.a0 {
    public static boolean B;
    public static final android.view.animation.Interpolator C = com.p314xaae8f345.mm.ui.p2740x696c9db.c3.a(com.p314xaae8f345.mm.ui.p2740x696c9db.b3.EASE);
    public static final android.view.animation.Interpolator D = com.p314xaae8f345.mm.ui.p2740x696c9db.c3.a(com.p314xaae8f345.mm.ui.p2740x696c9db.b3.EASE_IN_OUT);
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12916x4253bec6 f438979d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12919x6cd8224f f438980e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 f438981f;

    /* renamed from: g, reason: collision with root package name */
    public int f438982g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f438983h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f438984i;

    /* renamed from: m, reason: collision with root package name */
    public int f438985m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f438986n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f438987o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f438988p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f438989q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f438990r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f438991s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f438992t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f438993u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f438994v;

    /* renamed from: w, reason: collision with root package name */
    public int f438995w;

    /* renamed from: x, reason: collision with root package name */
    public int f438996x;

    /* renamed from: y, reason: collision with root package name */
    public int f438997y;

    /* renamed from: z, reason: collision with root package name */
    public int f438998z;

    public z(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f438984i = new java.util.ArrayList();
        this.f438986n = jz5.h.b(pp1.o.f438965d);
        this.f438989q = jz5.h.b(pp1.n.f438964d);
        this.f438990r = jz5.h.b(new pp1.u(this));
        this.f438991s = jz5.h.b(new pp1.t(this));
        this.f438992t = jz5.h.b(new pp1.c(this));
        this.f438993u = jz5.h.b(new pp1.s(context, this));
        this.f438994v = jz5.h.b(new pp1.x(this));
        this.f438995w = -1;
        this.f438996x = -1;
        this.f438997y = -1;
        this.f438998z = -1;
    }

    public static final void c(pp1.z zVar) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12916x4253bec6 c12916x4253bec6 = zVar.f438979d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = c12916x4253bec6 != null ? c12916x4253bec6.getLayoutManager() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager2 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager2 : null;
        if (c1162x665295de == null) {
            return;
        }
        int m8020x7e414b06 = c1162x665295de.m8020x7e414b06();
        for (int i17 = 0; i17 < m8020x7e414b06; i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12916x4253bec6 c12916x4253bec62 = zVar.f438979d;
            android.view.View mo7935xa188593e = (c12916x4253bec62 == null || (layoutManager = c12916x4253bec62.getLayoutManager()) == null) ? null : layoutManager.mo7935xa188593e(i17);
            if (mo7935xa188593e == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", "checkResetAllItem itemView is null");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12916x4253bec6 c12916x4253bec63 = zVar.f438979d;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m07 = c12916x4253bec63 != null ? c12916x4253bec63.m0(mo7935xa188593e) : null;
                if (m07 instanceof lp1.b) {
                    lp1.b bVar = (lp1.b) m07;
                    bVar.x();
                    com.p314xaae8f345.mm.p2776x373aa5.p2791xca247920.p2792xbddafb2a.C22856x436a4cd0 c22856x436a4cd0 = bVar.f401802n;
                    c22856x436a4cd0.setPivotX(0.0f);
                    c22856x436a4cd0.setPivotY(0.0f);
                    c22856x436a4cd0.setScaleX(1.0f);
                    c22856x436a4cd0.setScaleY(1.0f);
                    c22856x436a4cd0.setAlpha(1.0f);
                    c22856x436a4cd0.setTranslationX(0.0f);
                    c22856x436a4cd0.setTranslationY(0.0f);
                    android.view.View view = bVar.f401808t;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/convert/FloatBallViewHolder", "reset", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/ball/convert/FloatBallViewHolder", "reset", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
        }
    }

    @Override // gp1.y
    public void X(java.util.List ballInfoList, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ballInfoList, "ballInfoList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", "onFloatBallInfoChanged ballInfoList size: " + ballInfoList.size() + ", lastShowSize: " + this.f438985m);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : ballInfoList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", "getData info type: " + c12886x91aa2b6d2.f174579d + ", key: " + c12886x91aa2b6d2.f174582g + ", name: " + c12886x91aa2b6d2.f174596x);
            if (!c12886x91aa2b6d2.f174578J) {
                arrayList.add(new pp1.a(c12886x91aa2b6d2, i17));
            }
            i17 = i18;
        }
        java.util.ArrayList arrayList2 = this.f438984i;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (!this.f438987o) {
            l();
        }
        u();
        if (B) {
            return;
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        pp1.v vVar = new pp1.v(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(vVar, 200L, false);
    }

    public final int d(int i17, boolean z17, int i18) {
        return z17 ? ((i18 - 1) - i17) * qp1.c0.f447233i : (-i17) * qp1.c0.f447233i;
    }

    public int e() {
        return this.f438984i.size();
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d f() {
        return (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d) ((jz5.n) this.f438993u).mo141623x754a37bb();
    }

    public final android.view.View g(android.view.View view) {
        if (view != null) {
            return view.findViewById(com.p314xaae8f345.mm.R.id.f564870sh2);
        }
        return null;
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return (p012xc85e97e9.p093xedfae76a.b0) ((jz5.n) this.f438991s).mo141623x754a37bb();
    }

    public final void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = this.f438981f;
        if (c12917x19ac03e7 != null) {
            this.f438982g = this.f438987o ? c12917x19ac03e7.m(c12917x19ac03e7.w()) : c12917x19ac03e7.n(c12917x19ac03e7.w());
        }
    }

    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12916x4253bec6 c12916x4253bec6 = this.f438979d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c12916x4253bec6 != null ? c12916x4253bec6.getLayoutManager() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de == null) {
            return false;
        }
        int w17 = c1162x665295de.w();
        this.f438995w = w17;
        android.view.View mo7935xa188593e = c1162x665295de.mo7935xa188593e(w17);
        if (mo7935xa188593e == null) {
            return false;
        }
        mo7935xa188593e.getLeft();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = this.f438981f;
        this.f438998z = c12917x19ac03e7 != null ? c12917x19ac03e7.m(false) : 0;
        h();
        return true;
    }

    public boolean j() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12916x4253bec6 c12916x4253bec6 = this.f438979d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c12916x4253bec6 != null ? c12916x4253bec6.getLayoutManager() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de == null) {
            return false;
        }
        int y17 = c1162x665295de.y();
        this.f438996x = y17;
        android.view.View mo7935xa188593e = c1162x665295de.mo7935xa188593e(y17);
        if (mo7935xa188593e == null) {
            return false;
        }
        mo7935xa188593e.getRight();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = this.f438981f;
        this.f438997y = c12917x19ac03e7 != null ? c12917x19ac03e7.n(false) : 0;
        h();
        return true;
    }

    public void k() {
        this.f438995w = -1;
        this.f438996x = -1;
        this.f438997y = -1;
        this.f438998z = -1;
        this.A = 0;
    }

    public final void l() {
        java.util.ArrayList arrayList = this.f438984i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrayList, "<this>");
        java.util.Collections.reverse(arrayList);
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            pp1.a aVar = (pp1.a) next;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", "reverseShowList index: " + i17 + ", item: " + aVar.f438926d.f174596x);
            aVar.f438927e = i17;
            i17 = i18;
        }
    }

    public void m(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", "setExpandFlag isExpand: " + z17);
        B = z17;
    }

    public final void n(boolean z17, boolean z18, float f17, float f18, boolean z19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = this.f438981f;
        if (c12917x19ac03e7 != null) {
            if (!z18) {
                f17 = 0.0f;
            }
            c12917x19ac03e7.K(z18, z17, f18, z19, java.lang.Float.valueOf(f17));
        }
    }

    public final void o(boolean z17, android.view.View view, int i17, int i18, float f17, float f18, boolean z18) {
        if (view == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12916x4253bec6 c12916x4253bec6 = this.f438979d;
        android.view.ViewGroup.LayoutParams layoutParams = null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m07 = c12916x4253bec6 != null ? c12916x4253bec6.m0(view) : null;
        if (m07 instanceof lp1.b) {
            lp1.b bVar = (lp1.b) m07;
            if (z18) {
                bVar.x();
                return;
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2791xca247920.p2792xbddafb2a.C22856x436a4cd0 c22856x436a4cd0 = bVar.f401802n;
            if (!(z17 && i17 == i18 - 1) && (z17 || i17 != 0)) {
                c22856x436a4cd0.setAlpha(1.0f);
                bVar.x();
                return;
            }
            float f19 = pp1.b.f438929e;
            int i19 = (int) ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12914xc9f89b34.f174918q * f18) + ((1 - f18) * f19));
            int i27 = (int) (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12914xc9f89b34.f174919r * f18);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = bVar.f401804p;
            qp1.g0.e(c22645x24069159, i19, i27);
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12927xb2f1d9af c12927xb2f1d9af = bVar.f401805q;
            qp1.g0.e(c12927xb2f1d9af, i19, i27);
            android.view.ViewGroup.LayoutParams layoutParams2 = c22645x24069159.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = null;
            } else if (layoutParams2 instanceof android.widget.RelativeLayout.LayoutParams) {
                int i28 = (int) f19;
                if (z17) {
                    ((android.widget.RelativeLayout.LayoutParams) layoutParams2).setMargins(i28, i28, (int) (f19 * f18), i28);
                } else {
                    ((android.widget.RelativeLayout.LayoutParams) layoutParams2).setMargins((int) (f19 * f18), i28, i28, i28);
                }
            }
            c22645x24069159.setLayoutParams(layoutParams2);
            android.view.ViewGroup.LayoutParams layoutParams3 = c12927xb2f1d9af.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = null;
            } else if (layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams) {
                int i29 = (int) f19;
                if (z17) {
                    ((android.widget.RelativeLayout.LayoutParams) layoutParams3).setMargins(i29, i29, (int) (f19 * f18), i29);
                } else {
                    ((android.widget.RelativeLayout.LayoutParams) layoutParams3).setMargins((int) (f19 * f18), i29, i29, i29);
                }
            }
            c12927xb2f1d9af.setLayoutParams(layoutParams3);
            android.widget.RelativeLayout relativeLayout = bVar.f401807s;
            relativeLayout.setAlpha(f17);
            if (f17 >= 0.5f) {
                c22856x436a4cd0.setAlpha(java.lang.Math.max(0.0f, java.lang.Math.min(1.0f - ((f17 - 0.8f) / 0.2f), 1.0f)));
            }
            if (relativeLayout.getVisibility() != 0) {
                relativeLayout.setVisibility(0);
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar.f401809u, java.lang.Boolean.valueOf(z17))) {
                bVar.f401809u = java.lang.Boolean.valueOf(z17);
                bVar.z(relativeLayout, z17);
                bVar.z(c22645x24069159, z17);
                bVar.z(c12927xb2f1d9af, z17);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = bVar.f401806r;
                android.view.ViewGroup.LayoutParams layoutParams4 = c22699x3dcdb352.getLayoutParams();
                if (layoutParams4 != null) {
                    if (layoutParams4 instanceof android.widget.RelativeLayout.LayoutParams) {
                        if (z17) {
                            android.widget.RelativeLayout.LayoutParams layoutParams5 = (android.widget.RelativeLayout.LayoutParams) layoutParams4;
                            layoutParams5.removeRule(18);
                            layoutParams5.addRule(19, com.p314xaae8f345.mm.R.id.sgz);
                        } else {
                            android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) layoutParams4;
                            layoutParams6.removeRule(19);
                            layoutParams6.addRule(18, com.p314xaae8f345.mm.R.id.sgz);
                        }
                    }
                    layoutParams = layoutParams4;
                }
                c22699x3dcdb352.setLayoutParams(layoutParams);
            }
            bVar.y();
        }
    }

    public void p(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", "updateDockLeftForDrawingOrder isDockLeft: " + z17);
        this.f438987o = z17;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.p1275x822d9a5b.C12908x312d8725) ((jz5.n) this.f438990r).mo141623x754a37bb()).getClass();
    }

    public final void q(boolean z17, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12919x6cd8224f c12919x6cd8224f;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12919x6cd8224f c12919x6cd8224f2 = this.f438980e;
            if (!((c12919x6cd8224f2 == null || c12919x6cd8224f2.getF174973e()) ? false : true) || (c12919x6cd8224f = this.f438980e) == null) {
                return;
            }
            c12919x6cd8224f.a(false);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12919x6cd8224f c12919x6cd8224f3 = this.f438980e;
        if (c12919x6cd8224f3 != null) {
            c12919x6cd8224f3.a(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12919x6cd8224f c12919x6cd8224f4 = this.f438980e;
        if (c12919x6cd8224f4 == null || c12919x6cd8224f4.f174973e) {
            return;
        }
        c12919x6cd8224f4.setAlpha(f17);
    }

    public final void r(boolean z17, android.view.View view, int i17, int i18, float f17, boolean z18) {
        android.view.View findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.f564869sh1) : null;
        if (z17) {
            float max = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, ((i18 - i17) - 1) * 0.25f));
            float f18 = max + (f17 * (0.0f - max));
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(f18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/ball/ui/floatball/FloatBallRecyclerViewHelperV2", "updateItemMaskAlpha", "(ZLandroid/view/View;IIFZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/ball/ui/floatball/FloatBallRecyclerViewHelperV2", "updateItemMaskAlpha", "(ZLandroid/view/View;IIFZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        float max2 = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, i17 * 0.25f));
        float f19 = max2 + (f17 * (0.0f - max2));
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Float.valueOf(f19));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/ball/ui/floatball/FloatBallRecyclerViewHelperV2", "updateItemMaskAlpha", "(ZLandroid/view/View;IIFZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/ball/ui/floatball/FloatBallRecyclerViewHelperV2", "updateItemMaskAlpha", "(ZLandroid/view/View;IIFZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void s(android.view.View view, float f17) {
        if (view != null) {
            view.setPivotX(0.0f);
            view.setPivotY(view.getHeight() / 2.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/ui/floatball/FloatBallRecyclerViewHelperV2", "updateItemTransX", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ball/ui/floatball/FloatBallRecyclerViewHelperV2", "updateItemTransX", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setTranslationX(f17);
            view.setTranslationY(0.0f);
        }
    }

    public final void t(float f17, boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = this.f438981f;
            if (c12917x19ac03e7 != null) {
                c12917x19ac03e7.U(f17);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e72 = this.f438981f;
        if (c12917x19ac03e72 != null) {
            c12917x19ac03e72.U(1.0f);
        }
    }

    public final void u() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateShowData isExpanded ");
        sb6.append(B);
        sb6.append(", showSize: ");
        java.util.ArrayList arrayList = this.f438984i;
        sb6.append(arrayList.size());
        sb6.append(", lastShowSize: ");
        sb6.append(this.f438985m);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", sb6.toString());
        this.f438985m = arrayList.size();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.p1275x822d9a5b.C12908x312d8725) ((jz5.n) this.f438990r).mo141623x754a37bb()).z(new pp1.y(this));
    }
}
