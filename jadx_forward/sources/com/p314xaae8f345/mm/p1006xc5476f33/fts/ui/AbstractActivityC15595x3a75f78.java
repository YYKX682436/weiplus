package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI */
/* loaded from: classes12.dex */
public abstract class AbstractActivityC15595x3a75f78 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements com.p314xaae8f345.mm.ui.p2740x696c9db.b9, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d0, com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {
    public static final /* synthetic */ int E1 = 0;
    public android.view.View A;
    public final boolean A1;
    public android.view.View B;
    public java.lang.String B1;
    public android.view.View C;
    public boolean C1;
    public int D;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 D1;
    public int E;
    public k23.v0 I;
    public z21.e S;
    public final boolean V;
    public final com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.i0 W;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 X;
    public java.lang.String Y;
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n1 Z;

    /* renamed from: d, reason: collision with root package name */
    public boolean f219446d;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f219448f;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f219450h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f219451i;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.ListView f219452l1;

    /* renamed from: m, reason: collision with root package name */
    public db5.d5 f219453m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f219454n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d f219455o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f219456p;

    /* renamed from: p0, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n1 f219457p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 f219458p1;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewGroup f219459q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewGroup f219460r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f219461s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f219462t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f219463u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f219464v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f219465w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f219466x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f219467x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f219468x1;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewGroup f219469y;

    /* renamed from: y0, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.m1 f219470y0;

    /* renamed from: y1, reason: collision with root package name */
    public final android.animation.ValueAnimator.AnimatorUpdateListener f219471y1;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f219472z;

    /* renamed from: z1, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f219473z1;

    /* renamed from: e, reason: collision with root package name */
    public android.animation.ObjectAnimator f219447e = null;

    /* renamed from: g, reason: collision with root package name */
    public int f219449g = 0;
    public final int F = com.p314xaae8f345.mm.ui.zk.a(mo55332x76847179(), 0);
    public final int G = com.p314xaae8f345.mm.ui.zk.a(mo55332x76847179(), 25);
    public boolean H = false;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.FrameLayout f219445J = null;
    public android.widget.FrameLayout K = null;
    public boolean L = false;
    public final android.animation.ValueAnimator M = android.animation.ValueAnimator.ofInt(250, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761).setDuration(200L);
    public final android.animation.ValueAnimator N = android.animation.ValueAnimator.ofInt(40, 800).setDuration(200L);
    public final android.animation.ValueAnimator P = android.animation.ValueAnimator.ofInt(72, 0).setDuration(200L);
    public final android.animation.ValueAnimator Q = android.animation.ValueAnimator.ofInt(22, 0).setDuration(200L);
    public final android.animation.ValueAnimator R = android.animation.ValueAnimator.ofInt(8, 0).setDuration(200L);
    public boolean T = true;
    public boolean U = false;

    public AbstractActivityC15595x3a75f78() {
        this.V = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20676xd026b417()) == 1;
        this.W = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.i0(this);
        this.X = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.e1(this);
        this.Y = "";
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n1 n1Var = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n1.MODE_INIT;
        this.Z = n1Var;
        this.f219457p0 = n1Var;
        this.f219467x0 = false;
        this.f219468x1 = false;
        this.f219471y1 = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j1(this);
        this.f219473z1 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a1(this), true);
        this.A1 = true;
        this.D1 = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.b1(this);
    }

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78) {
        if (abstractActivityC15595x3a75f78.Y.length() > 0) {
            abstractActivityC15595x3a75f78.Y = abstractActivityC15595x3a75f78.Y.replaceAll("。", " ").replaceAll("\\.", " ").replaceAll("，", " ").replaceAll(",", " ").trim();
        }
    }

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n1 n1Var = abstractActivityC15595x3a75f78.f219457p0;
        if (n1Var != abstractActivityC15595x3a75f78.Z) {
            int ordinal = n1Var.ordinal();
            if (ordinal == 1) {
                abstractActivityC15595x3a75f78.c7();
            } else if (ordinal == 2) {
                abstractActivityC15595x3a75f78.e7();
            } else if (ordinal == 3) {
                abstractActivityC15595x3a75f78.d7();
            }
            int ordinal2 = abstractActivityC15595x3a75f78.Z.ordinal();
            if (ordinal2 == 1) {
                android.view.View view = abstractActivityC15595x3a75f78.f219463u;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "activeNewVoice2txtCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "activeNewVoice2txtCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                abstractActivityC15595x3a75f78.f219462t.r(abstractActivityC15595x3a75f78.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3), 0.9f);
                abstractActivityC15595x3a75f78.f219461s.setBackgroundDrawable(abstractActivityC15595x3a75f78.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.asz));
                abstractActivityC15595x3a75f78.f219461s.animate().scaleX(1.2f).scaleY(1.2f).setDuration(100L).start();
                abstractActivityC15595x3a75f78.f219456p.setVisibility(8);
                return;
            }
            if (ordinal2 == 2) {
                abstractActivityC15595x3a75f78.f219472z.animate().translationY(0.0f).alpha(1.0f).setDuration(100L).withEndAction(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.y0(abstractActivityC15595x3a75f78)).start();
                abstractActivityC15595x3a75f78.A.animate().translationY(0.0f).alpha(1.0f).setDuration(100L).start();
                abstractActivityC15595x3a75f78.B.animate().translationY(0.0f).setDuration(100L).start();
                abstractActivityC15595x3a75f78.f219455o.setVisibility(0);
                ((android.widget.RelativeLayout.LayoutParams) abstractActivityC15595x3a75f78.f219455o.getLayoutParams()).bottomMargin = 0;
                abstractActivityC15595x3a75f78.f219455o.requestLayout();
                abstractActivityC15595x3a75f78.f219456p.setVisibility(0);
                return;
            }
            if (ordinal2 != 3) {
                return;
            }
            android.view.View view2 = abstractActivityC15595x3a75f78.f219466x;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "activeNewVoice2txtSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "activeNewVoice2txtSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            abstractActivityC15595x3a75f78.f219465w.r(abstractActivityC15595x3a75f78.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3), 0.9f);
            abstractActivityC15595x3a75f78.f219464v.setBackgroundDrawable(abstractActivityC15595x3a75f78.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.asz));
            abstractActivityC15595x3a75f78.f219464v.animate().scaleX(1.2f).scaleY(1.2f).setDuration(150L).start();
            abstractActivityC15595x3a75f78.f219456p.setVisibility(8);
        }
    }

    private void Y6(java.lang.String str, int i17) {
        this.B1 = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            t7();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "[fts] doSearch: %s", str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.D1;
        n3Var.mo50303x856b99f0(1);
        n3Var.mo50307xb9e94560(1, i17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void H0() {
    }

    public void P4(java.lang.String str) {
        k23.v0 v0Var;
        k23.v0 v0Var2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "[fts] onSearchChange %s", str);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        this.T = K0;
        if (K0) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            k23.x0 x0Var = k23.c1.f385069h;
            if (((java.lang.Boolean) ((jz5.n) x0Var.a(mo55332x76847179).f385071d.f385064d).mo141623x754a37bb()).booleanValue()) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var = this.f219470y0.f291856h;
                if (!(o3Var != null ? o3Var.a() : false)) {
                    com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var2 = this.f219470y0.f291856h;
                    if (o3Var2 != null) {
                        o3Var2.d();
                    }
                    mo26063x7b383410();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar = z13.f.Y6(mo55332x76847179()).f550932e;
            if ((vVar != null && vVar.D) || this.U) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = this.U ? "YES" : "NO";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onSearchChange, isKeyboardDisplayed: %s", objArr);
                r7(true);
            }
            if (x0Var.a(mo55332x76847179()).V6() && (v0Var2 = this.I) != null) {
                v0Var2.u(true);
            }
            j7();
        } else if (k23.c1.f385069h.a(mo55332x76847179()).V6() && (v0Var = this.I) != null) {
            v0Var.u(false);
        }
        java.lang.String p17 = o13.n.p(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B1) && this.B1.equals(p17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "Same query %s %s", this.B1, p17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 f0Var = this.f219458p1;
        if (f0Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f0Var.f219583g) && this.f219458p1.f219583g.equals(p17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "Same adapter query %s %s", this.f219458p1.f219583g, p17);
            return;
        }
        boolean Zi = ((s50.k0) ((u50.w) i95.n0.c(u50.w.class))).Zi();
        boolean z17 = this.f219458p1 instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q2;
        if (Zi && z17) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B1)) {
                ((java.util.LinkedList) com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.y2.f219916d).clear();
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.y2.f219915c = null;
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17)) {
                r45.ei6 ei6Var = new r45.ei6();
                ei6Var.f455075d = p17;
                ei6Var.f455076e = c01.id.c();
                ((java.util.LinkedList) com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.y2.f219916d).add(ei6Var);
            }
        }
        Y6(p17, 300);
    }

    public void R3(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onEnd resultCount=%d | isFinished=%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (z17) {
            l7();
            if (i17 > 0) {
                k7();
            } else {
                o7();
            }
        } else if (i17 > 0) {
            k7();
            m7();
        } else {
            p7();
        }
        if (this.f219468x1) {
            this.f219468x1 = false;
            this.f219452l1.setSelection(0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void V5() {
    }

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 W6(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var);

    public final void X6() {
        k23.v0 v0Var = this.I;
        if (v0Var != null) {
            v0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "dismissRecognizingPanel");
            v0Var.s();
        }
    }

    public void Z6(java.lang.String str, int i17) {
        Y6(str, i17);
    }

    public java.util.List a7() {
        return null;
    }

    public java.lang.String b7() {
        java.lang.String str = this.B1;
        return str == null ? "" : str;
    }

    public final void c7() {
        android.view.View view = this.f219463u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "inactiveNewVoice2txtCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "inactiveNewVoice2txtCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f219462t.r(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an), 1.0f);
        this.f219461s.setBackgroundDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cvu));
        this.f219461s.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).withStartAction(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.m1(this)).start();
    }

    public final void d7() {
        android.view.View view = this.f219466x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "inactiveNewVoice2txtSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "inactiveNewVoice2txtSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f219465w.r(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an), 1.0f);
        this.f219464v.setBackgroundDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cvu));
        this.f219464v.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).withStartAction(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.k1(this)).start();
    }

    public final void e7() {
        android.view.ViewPropertyAnimator animate = this.f219472z.animate();
        int i17 = this.F;
        animate.translationY(i17).alpha(0.0f).setDuration(100L).withStartAction(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.l1(this)).start();
        this.A.animate().translationY(i17).alpha(0.0f).setDuration(100L).start();
        this.B.animate().translationY(i17).setDuration(100L).start();
    }

    public void f7() {
        boolean z17;
        k23.x0 x0Var = k23.c1.f385069h;
        if (!x0Var.a(this).W6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "initFloatingVoiceViewModelIfNeeded, isExptEnable false");
            return;
        }
        if (this.f219445J == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "初始化 floatingVoiceInputViewModelContainer");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.jlt);
            this.f219445J = new android.widget.FrameLayout(this);
            this.K = new android.widget.FrameLayout(this);
            viewGroup.addView(this.f219445J, new android.widget.FrameLayout.LayoutParams(-1, -1));
            viewGroup.addView(this.K, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        if (this.V) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var = this.f219470y0.f291856h;
            if (o3Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(o3Var, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.widget.FTSActionBarNewSearchView");
                z17 = ((java.lang.Boolean) ((jz5.n) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v) o3Var).M).mo141623x754a37bb()).booleanValue();
            } else {
                z17 = false;
            }
            if (z17) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(context).a(i23.e.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                i23.e eVar = (i23.e) a17;
                android.widget.FrameLayout viewGroup2 = this.K;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup2, "viewGroup");
                if (eVar.f369613e == null) {
                    android.view.View inflate = android.view.LayoutInflater.from(eVar.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570662eg2, (android.view.ViewGroup) null);
                    eVar.f369613e = inflate;
                    if (inflate != null) {
                        inflate.setOnClickListener(new i23.b(eVar));
                    }
                    android.view.View view = eVar.f369613e;
                    android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 81;
                    viewGroup2.addView(view, layoutParams);
                }
            }
        }
        if (this.I != null) {
            boolean U6 = x0Var.a(this).U6();
            this.I.B(U6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "initFloatingVoiceViewModelIfNeeded already not null, syncedGlobalEnable=" + U6);
            return;
        }
        if (!x0Var.a(this).U6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "initFloatingVoiceViewModelIfNeeded, isEnable false");
            return;
        }
        k23.u2 u2Var = ((java.lang.Number) ((jz5.n) x0Var.a(this).f385071d.f385065e).mo141623x754a37bb()).intValue() == 2 ? k23.u2.f385235e : k23.u2.f385234d;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.c1 c1Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.c1(this);
        android.widget.FrameLayout frameLayout = this.f219445J;
        k23.v0 v0Var = new k23.v0(this);
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) findViewById(android.R.id.content);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        k23.w0 w0Var = k23.w0.f385267d;
        java.lang.String startButtonTitle = (java.lang.String) ((jz5.n) this.W.f219813c).mo141623x754a37bb();
        int d17 = i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.f560691al2);
        java.lang.Integer[] numArr = new java.lang.Integer[2];
        for (int i17 = 0; i17 < 2; i17++) {
            numArr[i17] = java.lang.Integer.valueOf(d17);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(startButtonTitle, "startButtonTitle");
        k23.d0 d0Var = new k23.d0(viewGroup3, layoutParams2, c1Var, frameLayout, w0Var, 6, 3, startButtonTitle, u2Var, numArr, null, 1024, null);
        d0Var.f385088l = 0.6f;
        v0Var.t(d0Var);
        this.I = v0Var;
        k23.x0 x0Var2 = k23.c1.f385069h;
        if (x0Var2.a(this).V6()) {
            this.I.i();
        }
        x0Var2.a(this).f385074g = this.I;
        z50.e.f551696a.a(vu4.a.f521772f, vu4.b.C, 3, 6, z13.f.Y6(mo55332x76847179()).a7(), this.f219470y0.g());
        this.I.r();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f219470y0.g())) {
            this.I.E();
        }
    }

    public void g7() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0
    /* renamed from: getContext */
    public /* bridge */ /* synthetic */ android.content.Context mo63597x76847179() {
        return super.mo55332x76847179();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0
    /* renamed from: getListView */
    public android.widget.ListView mo63599xcc101dd9() {
        return this.f219452l1;
    }

    public void h7() {
    }

    public void i7() {
        if (this.f219467x0) {
            return;
        }
        this.f219467x0 = true;
        db5.d5 d5Var = this.f219453m;
        if (d5Var == null || !d5Var.isShowing()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n1 n1Var = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n1.MODE_CANCEL;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n1 n1Var2 = this.Z;
        if (n1Var == n1Var2) {
            final com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.o1 o1Var = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.o1.Cancel;
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI$$c
                @Override // java.lang.Runnable
                public final void run() {
                    db5.d5 d5Var2;
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78.E1;
                    com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78.this;
                    abstractActivityC15595x3a75f78.getClass();
                    int ordinal = o1Var.ordinal();
                    if ((ordinal == 0 || ordinal == 5 || ordinal == 2 || ordinal == 3) && (d5Var2 = abstractActivityC15595x3a75f78.f219453m) != null && d5Var2 != null && d5Var2.isShowing()) {
                        abstractActivityC15595x3a75f78.f219453m.dismiss();
                    }
                }
            });
            z21.e eVar = this.S;
            if (eVar != null) {
                eVar.mo48278xae7a2e7a(true);
            }
            this.Y = "";
            com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var = this.f219470y0.f291856h;
            if (o3Var != null) {
                o3Var.g(true);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n1 n1Var3 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n1.MODE_TRANS;
        final com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.o1 o1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.o1.ReadyToSearch;
        if (n1Var3 == n1Var2) {
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI$$c
                @Override // java.lang.Runnable
                public final void run() {
                    db5.d5 d5Var2;
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78.E1;
                    com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78.this;
                    abstractActivityC15595x3a75f78.getClass();
                    int ordinal = o1Var2.ordinal();
                    if ((ordinal == 0 || ordinal == 5 || ordinal == 2 || ordinal == 3) && (d5Var2 = abstractActivityC15595x3a75f78.f219453m) != null && d5Var2 != null && d5Var2.isShowing()) {
                        abstractActivityC15595x3a75f78.f219453m.dismiss();
                    }
                }
            });
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n1.MODE_SEARCH == n1Var2) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.X;
            n3Var.mo50303x856b99f0(1);
            n3Var.mo50307xb9e94560(1, 0L);
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI$$c
                @Override // java.lang.Runnable
                public final void run() {
                    db5.d5 d5Var2;
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78.E1;
                    com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78.this;
                    abstractActivityC15595x3a75f78.getClass();
                    int ordinal = o1Var2.ordinal();
                    if ((ordinal == 0 || ordinal == 5 || ordinal == 2 || ordinal == 3) && (d5Var2 = abstractActivityC15595x3a75f78.f219453m) != null && d5Var2 != null && d5Var2.isShowing()) {
                        abstractActivityC15595x3a75f78.f219453m.dismiss();
                    }
                }
            });
            Y6(b7(), 0);
            u7();
        }
    }

    public void j7() {
        this.f219452l1.setVisibility(8);
        android.view.View view = this.f219451i;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "hideFeedBackBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "hideFeedBackBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void k7() {
        this.f219452l1.setVisibility(0);
    }

    public void l7() {
    }

    public void m7() {
    }

    public boolean n5(java.lang.String str) {
        mo48674x36654fab();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.m1 m1Var = this.f219470y0;
        if (m1Var == null) {
            return false;
        }
        m1Var.a();
        return false;
    }

    public void n7(int i17) {
        android.view.View view = this.f219450h;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "setFtsVoiceBtnsLayoutVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "setFtsVoiceBtnsLayoutVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void o7() {
        this.f219452l1.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById;
        super.onCreate(bundle);
        this.f219446d = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20684x722a90ef()) == 1 && j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20672x8f1bd40b()) <= 0 && !com.p314xaae8f345.mm.ui.bk.U();
        m78601x22395ca8();
        mo54450xbf7c1df6("");
        g7();
        sh0.e eVar = (sh0.e) i95.n0.c(sh0.e.class);
        com.p314xaae8f345.p3210x3857dc.f1 f1Var = com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.f301722m;
        com.p314xaae8f345.p3210x3857dc.f1 f1Var2 = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f1 f1Var3 = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f1(this);
        ((th0.a0) eVar).getClass();
        com.p314xaae8f345.mm.p2829xfa87f9de.y0.b(f1Var2, f1Var3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "Start To Load WebView %s", "WV_KIND_PINUS");
        if (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.g(this)) {
            mo54450xbf7c1df6("");
            mo78530x8b45058f();
            mo78529xe76c1b79();
            p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
            java.util.Objects.requireNonNull(mo2533x106ab264);
            mo2533x106ab264.o();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.m1 m1Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.m1(this);
        this.f219470y0 = m1Var;
        m1Var.f291857i = this;
        m1Var.f219835s = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.h() && !k23.c1.f385069h.a(this).W6();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.m1 m1Var2 = this.f219470y0;
        if (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.g(m1Var2.f219834r)) {
            m1Var2.s();
        }
        this.f219452l1 = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.mfg);
        java.util.List a76 = a7();
        if (a76 != null && a76.size() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "searchResultLV addFooterView %d", java.lang.Integer.valueOf(a76.size()));
            java.util.Iterator it = a76.iterator();
            while (it.hasNext()) {
                this.f219452l1.addFooterView((android.view.View) it.next());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 W6 = W6(this);
        this.f219458p1 = W6;
        W6.f219587n = this;
        this.f219452l1.setAdapter((android.widget.ListAdapter) W6);
        this.f219452l1.setOnScrollListener(this.f219458p1);
        this.f219452l1.setOnItemClickListener(this.f219458p1);
        this.f219452l1.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.g1(this));
        if (this.f219446d) {
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.ggg);
            this.f219450h = findViewById2;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "initNewVoiceSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "initNewVoiceSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f219450h.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.i1(this));
            android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f219471y1;
            this.M.addUpdateListener(animatorUpdateListener);
            this.N.addUpdateListener(animatorUpdateListener);
            this.P.addUpdateListener(animatorUpdateListener);
            this.Q.addUpdateListener(animatorUpdateListener);
            this.R.addUpdateListener(animatorUpdateListener);
        }
        f7();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.h1(this));
        if (j62.e.g().l("clicfg_android_use_search_global_sug_feedback", false, true, true)) {
            android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.typ);
            this.f219451i = findViewById3;
            if (findViewById3 != null && (findViewById = findViewById3.findViewById(com.p314xaae8f345.mm.R.id.tyo)) != null) {
                findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d1(this));
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        z50.h hVar = z50.i.f551699a;
        objArr[0] = hVar.c() ? "yes" : "no";
        objArr[1] = java.lang.Float.valueOf(hVar.a());
        objArr[2] = java.lang.Float.valueOf(hVar.b());
        objArr[3] = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() ? "yes" : "no";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "[hitest], isBigFont: %s, fontScale: %f, maxScale: %f, isChineseAppLang: %s", objArr);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(this);
        this.f219448f = f5Var;
        f5Var.f291933e = this;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        this.f219470y0.j(this, menu);
        if (!this.C1) {
            this.f219470y0.c(((java.lang.Boolean) ((jz5.n) k23.c1.f385069h.a(mo55332x76847179()).f385071d.f385064d).mo141623x754a37bb()).booleanValue());
            this.C1 = true;
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        z21.e eVar;
        k23.v0 v0Var = this.I;
        if (v0Var != null) {
            v0Var.v();
        }
        this.D1.mo50303x856b99f0(1);
        this.f219458p1.g();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f219448f;
        if (f5Var != null) {
            f5Var.d();
            this.f219448f.f291933e = null;
        }
        this.X.mo50302x6b17ad39(null);
        if (this.f219446d && (eVar = this.S) != null) {
            eVar.mo48278xae7a2e7a(true);
            this.S = null;
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f219448f;
        if (f5Var != null) {
            f5Var.d();
        }
        super.onPause();
        this.f219470y0.a();
        this.f219458p1.getClass();
        if (this.L) {
            this.L = false;
            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI$$a
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78.E1;
                    com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78.this.X6();
                }
            }, 100L);
        }
        k23.v0 v0Var = this.I;
        if (v0Var != null) {
            v0Var.y();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        this.f219470y0.m(this, menu);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f219448f;
        if (f5Var != null) {
            f5Var.f();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onWindowFocusChanged, hasFocus: ".concat(z17 ? "YES" : "NO"));
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f219448f;
        if (f5Var == null || !z17) {
            return;
        }
        f5Var.f();
    }

    public void p7() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: provideCustomActivityContentView */
    public android.view.View mo44294xa334195d() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.g(this)) {
            return android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570645ef3, (android.view.ViewGroup) null);
        }
        return null;
    }

    public abstract void q7(java.lang.String str);

    public void r7(boolean z17) {
        k23.v0 v0Var;
        k23.x0 x0Var = k23.c1.f385069h;
        boolean U6 = x0Var.a(this).U6();
        boolean z18 = !z17 || (this.T && x0Var.a(this).U6());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "showFloatingButton: visible: " + z17 + ", isQueryEmpty: " + this.T + ", isEnable: " + U6);
        if (z18 && (v0Var = this.I) != null) {
            v0Var.G(z17);
        }
    }

    public void s7() {
        this.f219468x1 = true;
        p7();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j3 j3Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j3();
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(this).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        z13.f fVar = (z13.f) a17;
        j3Var.f219618b = fVar.i7();
        j3Var.f219617a = k23.s2.a(fVar.f550939o);
        if (fVar.f550940p.contains(b7())) {
            j3Var.f219619c = true;
        }
        this.f219458p1.o(this.B1, j3Var);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4
    /* renamed from: showVKB */
    public void mo26063x7b383410() {
        android.view.View currentFocus;
        int i17 = j62.e.g().i("clicfg_oppo_android16_show_vkb_new_impl", 0, true, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "showVKB exptKey %s exptVal %s", "clicfg_oppo_android16_show_vkb_new_impl", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            super.mo26063x7b383410();
            return;
        }
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = getCurrentFocus()) == null || currentFocus.getWindowToken() == null) {
            return;
        }
        inputMethodManager.showSoftInput(currentFocus, 2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
    }

    public void t7() {
        this.D1.mo50303x856b99f0(1);
        this.f219468x1 = false;
        this.f219458p1.p();
        j7();
    }

    public void u7() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void v() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.X;
        n3Var.mo50303x856b99f0(1);
        n3Var.mo50307xb9e94560(1, 0L);
        this.Y = "";
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        android.view.View view;
        android.animation.ObjectAnimator objectAnimator = this.f219447e;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f219447e.cancel();
        }
        boolean z18 = i17 > 0;
        this.U = z18;
        if (z18) {
            this.f219449g = i17;
            int c17 = i65.a.c(mo55332x76847179(), this.f219449g);
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(this).a(z13.f.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ((z13.f) a17).f550935h = c17;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = z17 ? "true" : "false";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onKeyboardHeightChanged, height: %d, isResized: %s", objArr);
        if (k23.c1.f385069h.a(mo55332x76847179()).V6() || (view = this.f219450h) == null) {
            return;
        }
        if (i17 > 0) {
            if (view.getTranslationY() != 0.0f) {
                view.setTranslationY(0.0f);
            }
            this.f219447e = android.animation.ObjectAnimator.ofFloat(view, "translationY", 0.0f, -i17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f219470y0.g())) {
                n7(0);
            }
        } else {
            this.f219447e = android.animation.ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), 0.0f);
            n7(8);
        }
        this.f219447e.setDuration(200L);
        this.f219447e.setInterpolator(new y3.b());
        this.f219447e.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.C15599x325f596c());
        this.f219447e.start();
    }
}
