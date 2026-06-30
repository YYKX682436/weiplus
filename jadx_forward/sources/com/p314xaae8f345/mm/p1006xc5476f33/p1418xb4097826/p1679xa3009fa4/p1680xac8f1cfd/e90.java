package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class e90 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements ku2.b {

    /* renamed from: p, reason: collision with root package name */
    public static r45.cx2 f215763p;

    /* renamed from: d, reason: collision with root package name */
    public boolean f215764d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f215765e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f215766f;

    /* renamed from: g, reason: collision with root package name */
    public pi0.n1 f215767g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rc f215768h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215769i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f215770m;

    /* renamed from: n, reason: collision with root package name */
    public ku2.a f215771n;

    /* renamed from: o, reason: collision with root package name */
    public long f215772o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e90(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f215769i = new java.util.concurrent.ConcurrentHashMap();
        this.f215770m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    }

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90 e90Var, in5.s0 holder, boolean z17, int i17, int i18, boolean z18, int i19, java.lang.Object obj) {
        if ((i19 & 16) != 0) {
            z18 = false;
        }
        e90Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (z18) {
            e90Var.f215770m.mo77786xdceccb8e(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.z80(e90Var, holder, z17, i17, i18), 500L);
        }
    }

    public final boolean O6() {
        boolean m112843xefa19018 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27311x43a2d090.m112842x9cf0d20b().m112843xefa19018(bw5.ms0.emFinderNewbieGuideType_TingEntryGuide);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return m112843xefa19018 || (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Ub).mo141623x754a37bb()).r()).intValue() == 1);
    }

    public final java.lang.String P6(long j17) {
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String q17 = b52.b.q(j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q17);
        return q17;
    }

    public final java.util.Map Q6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("session_buffer", abstractC14490x69736cb5.g0());
        java.lang.String str2 = "";
        if (V6 == null || (str = V6.m75945x2fec8307(1)) == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str);
        if (V6 != null && (m75945x2fec8307 = V6.m75945x2fec8307(2)) != null) {
            str2 = m75945x2fec8307;
        }
        lVarArr[2] = new jz5.l("finder_tab_context_id", str2);
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6 != null ? V6.m75939xb282bd08(5) : 0));
        lVarArr[4] = new jz5.l("feed_id", java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()));
        lVarArr[5] = new jz5.l("remind_feedid", java.lang.Long.valueOf(this.f215772o));
        return kz5.c1.k(lVarArr);
    }

    public final void R6(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v80 v80Var, boolean z17) {
        android.view.View itemView = s0Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) itemView.findViewById(com.p314xaae8f345.mm.R.id.tvy);
        if (frameLayout == null || frameLayout.getVisibility() == 8) {
            return;
        }
        java.lang.Object parent = frameLayout.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.y80(z17, this, frameLayout, v80Var, view, null), 3, null);
        }
    }

    public final void S6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v80 V6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        r45.dm2 m76806xdef68064;
        r45.o34 o34Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        pf5.u uVar = pf5.u.f435469a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0) uVar.e(zy2.b6.class).c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0.class))).c7(m158354x19263085());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) uVar.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34.class);
        c15482x9b531b34.getClass();
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n90(c15482x9b531b34));
        byte[] mo14344x5f01b1f6 = new bw5.fb0().mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null && (feedObject2 = feedObject.getFeedObject()) != null && (m76806xdef68064 = feedObject2.m76806xdef68064()) != null && (o34Var = (r45.o34) m76806xdef68064.m75936x14adae67(47)) != null && (m75934xbce7f2f = o34Var.m75934xbce7f2f(1)) != null) {
            mo14344x5f01b1f6 = m75934xbce7f2f.g();
        }
        if (abstractC14490x69736cb5 != null && (V6 = V6(abstractC14490x69736cb5)) != null) {
            V6.f217758c = true;
        }
        ((o40.e) i95.n0.c(o40.e.class)).getClass();
        ((wy2.g) ((o40.e) i95.n0.c(o40.e.class))).Bi(m80379x76847179(), null, kz5.c1.l(new jz5.l("finderSleepModeJumpInfo", mo14344x5f01b1f6)));
    }

    public final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u80 u80Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v80 V6 = V6(abstractC14490x69736cb5);
        if (u80Var == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u80.f217643f) {
            pi0.n1 n1Var = this.f215767g;
            if (n1Var != null) {
                n1Var.a();
            }
            this.f215767g = null;
        }
        if (V6 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(u80Var, "<set-?>");
            V6.f217757b = u80Var;
            this.f215769i.put(java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()), V6);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v80 V6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v80) this.f215769i.get(java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        in5.s0 s0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        this.f215770m.mo50302x6b17ad39(null);
        java.lang.ref.WeakReference weakReference = this.f215766f;
        if (weakReference != null && (s0Var = (in5.s0) weakReference.get()) != null && (abstractC14490x69736cb5 = this.f215765e) != null) {
            R6(s0Var, V6(abstractC14490x69736cb5), false);
        }
        this.f215769i.clear();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e90(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f215769i = new java.util.concurrent.ConcurrentHashMap();
        this.f215770m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    }
}
