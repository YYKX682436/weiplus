package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class tb extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements he2.b {
    public static final jz5.g B;
    public boolean A;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f195901p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f195902q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f195903r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f195904s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f195905t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f195906u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f195907v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f195908w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f195909x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f195910y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f195911z;

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jb(null);
        B = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ib.f194486d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f195901p = statusMonitor;
        this.f195902q = "";
        this.f195905t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob(this));
        this.f195906u = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sb(this));
        this.f195907v = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lb(root, this));
        this.f195909x = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pb(root, this));
        this.f195910y = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mb(root, this));
        this.f195911z = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qb(this));
        this.A = true;
        if (x0()) {
            i17 = (int) (com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y * 0.22d);
            com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        } else {
            i17 = (int) (com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y * 0.25d);
            com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14364x8eb8469 c14364x8eb8469 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14364x8eb8469) root.findViewById(com.p314xaae8f345.mm.R.id.awg);
        c14364x8eb8469.b(i17, false);
        c14364x8eb8469.m57536x1ff432c7(true);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 t17 = t1();
        t17.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.C14266x705ed9f4(t17.getRootView().getContext()));
        t17.N(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hb(root));
    }

    public final void A1(boolean z17) {
        if (z17 != this.f195903r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBoxCommentPlugin", "isFirstPageCommentData from " + this.f195903r + " to " + z17);
        }
        this.f195903r = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kb.f194744a[status.ordinal()] == 1) {
            this.A = !(bundle != null ? bundle.getBoolean("PARAM_IS_ENTERING_COMMENT") : false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBoxCommentPlugin", "unMount " + hashCode() + " commentListVisible:" + this.f195904s);
        z1(false);
        y1("");
        this.A = true;
        android.view.ViewTreeObserver viewTreeObserver = t1().getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener((android.view.ViewTreeObserver.OnGlobalLayoutListener) ((jz5.n) this.f195905t).mo141623x754a37bb());
        }
        t1().V0((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rb) ((jz5.n) this.f195906u).mo141623x754a37bb());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BoxCommentListPresenter", "isFinished:" + v1().f488365a.a1());
    }

    @Override // he2.b
    public android.view.View W() {
        return this.f446856d;
    }

    @Override // he2.b
    public void j(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return x0() || this.A;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 t1() {
        java.lang.Object mo141623x754a37bb = this.f195907v.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) mo141623x754a37bb;
    }

    public final int u1() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f195908w;
        if (c22848x6ddd90cf != null) {
            return c22848x6ddd90cf.mo1894x7e414b06();
        }
        return 0;
    }

    public final se2.a0 v1() {
        return (se2.a0) ((jz5.n) this.f195909x).mo141623x754a37bb();
    }

    @Override // he2.b
    public void w(int i17) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14364x8eb8469) this.f446856d.findViewById(com.p314xaae8f345.mm.R.id.awg)).b(i17, false);
    }

    public final void w1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBoxCommentPlugin", "pauseBoxComment " + hashCode() + " id:" + this.f195902q);
        android.view.ViewTreeObserver viewTreeObserver = t1().getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener((android.view.ViewTreeObserver.OnGlobalLayoutListener) ((jz5.n) this.f195905t).mo141623x754a37bb());
        }
        t1().V0((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rb) ((jz5.n) this.f195906u).mo141623x754a37bb());
        z1(false);
    }

    public final void x1(java.lang.String prefix, lm2.t notifyMsg) {
        lm2.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyMsg, "notifyMsg");
        if (zl2.q4.f555466a.E()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(prefix.concat(":"));
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f195908w;
            java.util.List m82898xfb7e5820 = c22848x6ddd90cf != null ? c22848x6ddd90cf.m82898xfb7e5820() : null;
            int i17 = notifyMsg.f400982a;
            int i18 = notifyMsg.f400983b + i17;
            while (i17 < i18) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[");
                sb7.append(i17);
                sb7.append(',');
                sb7.append((m82898xfb7e5820 == null || (cVar = (lm2.c) kz5.n0.a0(m82898xfb7e5820, i17)) == null) ? null : cVar.g());
                sb7.append(']');
                sb6.append(sb7.toString());
                i17++;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBoxCommentPlugin", java.lang.String.valueOf(sb6));
        }
    }

    public final void y1(java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(value, this.f195902q)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBoxCommentPlugin", "attachBoxId from:" + this.f195902q + " to " + value);
        }
        this.f195902q = value;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBoxCommentPlugin", "mount " + hashCode());
    }

    public final void z1(boolean z17) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf;
        if (z17 != this.f195904s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBoxCommentPlugin", "commentListVisible " + hashCode() + " from " + this.f195904s + " to " + z17);
            if (z17) {
                se2.a0 v17 = v1();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyAllData commentListVisible:");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb tbVar = v17.f488365a;
                sb6.append(tbVar.f195904s);
                sb6.append(" size:");
                sb6.append(tbVar.u1());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BoxCommentListPresenter", sb6.toString());
                if (tbVar.f195904s && (c22848x6ddd90cf = tbVar.f195908w) != null) {
                    c22848x6ddd90cf.m8146xced61ae5();
                }
                se2.a0 v18 = v1();
                int u17 = u1();
                if (u17 > 0) {
                    v18.f488365a.t1().post(new se2.z(v18, u17));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BoxCommentListPresenter", "[updateMessagesOnViewAttach] curVisiableFirstPosition:" + ((mm2.e0) v18.b(mm2.e0.class)).f410505o);
                }
            } else {
                se2.a0 v19 = v1();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb tbVar2 = v19.f488365a;
                if (tbVar2.v1().f488366b > 0) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = tbVar2.t1().getLayoutManager();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
                    ((mm2.e0) v19.b(mm2.e0.class)).f410505o = c1162x665295de.y();
                    c1162x665295de.w();
                    ((mm2.e0) v19.b(mm2.e0.class)).U6(((mm2.e0) v19.b(mm2.e0.class)).f410505o == tbVar2.u1() - 1);
                    mm2.e0 e0Var = (mm2.e0) v19.b(mm2.e0.class);
                    long j17 = ((mm2.e0) v19.b(mm2.e0.class)).f410507q;
                    long j18 = tbVar2.v1().f488366b;
                    if (j17 < j18) {
                        j17 = j18;
                    }
                    e0Var.f410507q = j17;
                }
            }
        }
        this.f195904s = z17;
    }
}
