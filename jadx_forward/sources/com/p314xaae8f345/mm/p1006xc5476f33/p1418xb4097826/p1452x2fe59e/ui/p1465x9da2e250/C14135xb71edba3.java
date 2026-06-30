package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment;", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment */
/* loaded from: classes2.dex */
public final class C14135xb71edba3 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639 {

    /* renamed from: v, reason: collision with root package name */
    public static int f191582v;

    /* renamed from: n, reason: collision with root package name */
    public final int f191583n;

    /* renamed from: o, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f191584o = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));

    /* renamed from: p, reason: collision with root package name */
    public r45.lk2 f191585p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f191586q;

    /* renamed from: r, reason: collision with root package name */
    public vb2.x f191587r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f191588s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.HashMap f191589t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 f191590u;

    static {
        g92.b bVar = g92.b.f351302e;
        m92.b j37 = g92.a.j3(bVar, bVar.T0(), false, 2, null);
        f191582v = j37 != null ? j37.u0().m75939xb282bd08(6) : 0;
    }

    public C14135xb71edba3(int i17) {
        this.f191583n = i17;
        p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));
        this.f191586q = "";
        this.f191589t = new java.util.HashMap();
    }

    public static /* synthetic */ void y0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3 c14135xb71edba3, int i17, java.lang.String str, java.lang.Boolean bool, r45.ct4 ct4Var, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            str = null;
        }
        if ((i18 & 4) != 0) {
            bool = null;
        }
        if ((i18 & 8) != 0) {
            ct4Var = null;
        }
        c14135xb71edba3.x0(i17, str, bool, ct4Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: getLayoutId */
    public int mo48065x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.edo;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: l0 */
    public java.util.Set getF204828n() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void o0() {
        yj0.a.a("com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.o0();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityResult */
    public void mo7496x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (i17 == 31121) {
            p3325xe03a0797.p3326xc267989b.l.d(this.f191584o, null, null, new hd2.d0(this, null), 3, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        u0();
        if (this.f191585p == null) {
            p3325xe03a0797.p3326xc267989b.l.d(this.f191584o, null, null, new hd2.d0(this, null), 3, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        int i17 = com.p314xaae8f345.mm.R.id.f564832a85;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(view, com.p314xaae8f345.mm.R.id.f564832a85);
        if (imageView != null) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
            i17 = com.p314xaae8f345.mm.R.id.t_x;
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(view, com.p314xaae8f345.mm.R.id.t_x);
            if (relativeLayout != null) {
                i17 = com.p314xaae8f345.mm.R.id.t_y;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(view, com.p314xaae8f345.mm.R.id.t_y);
                if (c22699x3dcdb352 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.t_z;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.t_z);
                    if (textView != null) {
                        i17 = com.p314xaae8f345.mm.R.id.e7m;
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(view, com.p314xaae8f345.mm.R.id.e7m);
                        if (linearLayout2 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.e_f;
                            android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(view, com.p314xaae8f345.mm.R.id.e_f);
                            if (imageView2 != null) {
                                i17 = com.p314xaae8f345.mm.R.id.egm;
                                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.egm);
                                if (textView2 != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.fuu;
                                    android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.fuu);
                                    if (textView3 != null) {
                                        i17 = com.p314xaae8f345.mm.R.id.tto;
                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) x4.b.a(view, com.p314xaae8f345.mm.R.id.tto);
                                        if (c22646x1e9ca55 != null) {
                                            i17 = com.p314xaae8f345.mm.R.id.g28;
                                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(view, com.p314xaae8f345.mm.R.id.g28);
                                            if (c22699x3dcdb3522 != null) {
                                                i17 = com.p314xaae8f345.mm.R.id.g29;
                                                android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.g29);
                                                if (textView4 != null) {
                                                    i17 = com.p314xaae8f345.mm.R.id.g3e;
                                                    android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.g3e);
                                                    if (textView5 != null) {
                                                        i17 = com.p314xaae8f345.mm.R.id.f566744gx2;
                                                        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(view, com.p314xaae8f345.mm.R.id.f566744gx2);
                                                        if (linearLayout3 != null) {
                                                            i17 = com.p314xaae8f345.mm.R.id.ube;
                                                            android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) x4.b.a(view, com.p314xaae8f345.mm.R.id.ube);
                                                            if (relativeLayout2 != null) {
                                                                i17 = com.p314xaae8f345.mm.R.id.ubg;
                                                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(view, com.p314xaae8f345.mm.R.id.ubg);
                                                                if (c22699x3dcdb3523 != null) {
                                                                    i17 = com.p314xaae8f345.mm.R.id.ubh;
                                                                    android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.ubh);
                                                                    if (textView6 != null) {
                                                                        i17 = com.p314xaae8f345.mm.R.id.f567675kc1;
                                                                        android.widget.TextView textView7 = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.f567675kc1);
                                                                        if (textView7 != null) {
                                                                            i17 = com.p314xaae8f345.mm.R.id.f567895ur4;
                                                                            android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) x4.b.a(view, com.p314xaae8f345.mm.R.id.f567895ur4);
                                                                            if (linearLayout4 != null) {
                                                                                i17 = com.p314xaae8f345.mm.R.id.urb;
                                                                                android.view.View a17 = x4.b.a(view, com.p314xaae8f345.mm.R.id.urb);
                                                                                if (a17 != null) {
                                                                                    i17 = com.p314xaae8f345.mm.R.id.f568738vc3;
                                                                                    android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) x4.b.a(view, com.p314xaae8f345.mm.R.id.f568738vc3);
                                                                                    if (relativeLayout3 != null) {
                                                                                        i17 = com.p314xaae8f345.mm.R.id.f568739vc4;
                                                                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(view, com.p314xaae8f345.mm.R.id.f568739vc4);
                                                                                        if (c22699x3dcdb3524 != null) {
                                                                                            i17 = com.p314xaae8f345.mm.R.id.vc6;
                                                                                            android.widget.ImageView imageView3 = (android.widget.ImageView) x4.b.a(view, com.p314xaae8f345.mm.R.id.vc6);
                                                                                            if (imageView3 != null) {
                                                                                                i17 = com.p314xaae8f345.mm.R.id.vc7;
                                                                                                android.widget.TextView textView8 = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.vc7);
                                                                                                if (textView8 != null) {
                                                                                                    this.f191587r = new vb2.x(linearLayout, imageView, linearLayout, relativeLayout, c22699x3dcdb352, textView, linearLayout2, imageView2, textView2, textView3, c22646x1e9ca55, c22699x3dcdb3522, textView4, textView5, linearLayout3, relativeLayout2, c22699x3dcdb3523, textView6, textView7, linearLayout4, a17, relativeLayout3, c22699x3dcdb3524, imageView3, textView8);
                                                                                                    com.p314xaae8f345.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
                                                                                                    vb2.x xVar = this.f191587r;
                                                                                                    if (xVar == null) {
                                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    com.p314xaae8f345.mm.ui.bk.r0(xVar.f516292e.getPaint(), 0.8f);
                                                                                                    vb2.x xVar2 = this.f191587r;
                                                                                                    if (xVar2 == null) {
                                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    com.p314xaae8f345.mm.ui.bk.r0(xVar2.f516303p.getPaint(), 0.8f);
                                                                                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186912n.mo7806x9d92d11c(this, new hd2.e0(this));
                                                                                                    android.content.Context mo7438x76847179 = mo7438x76847179();
                                                                                                    if (mo7438x76847179 == null || (str = xy2.c.e(mo7438x76847179)) == null) {
                                                                                                        str = "";
                                                                                                    }
                                                                                                    this.f191586q = str;
                                                                                                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                                                                                                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s7.f184071a.b(mo7438x76847179())) {
                                                                                                        vb2.x xVar3 = this.f191587r;
                                                                                                        if (xVar3 == null) {
                                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        xVar3.f516290c.setVisibility(0);
                                                                                                    } else {
                                                                                                        vb2.x xVar4 = this.f191587r;
                                                                                                        if (xVar4 == null) {
                                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        xVar4.f516290c.setVisibility(8);
                                                                                                    }
                                                                                                    java.lang.String Ai = ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).Ai();
                                                                                                    jz5.l[] lVarArr = new jz5.l[3];
                                                                                                    lVarArr[0] = new jz5.l("page_account_type", java.lang.Integer.valueOf(this.f191583n));
                                                                                                    android.content.Context mo7438x768471792 = mo7438x76847179();
                                                                                                    lVarArr[1] = new jz5.l("finder_username", mo7438x768471792 != null ? xy2.c.e(mo7438x768471792) : null);
                                                                                                    lVarArr[2] = new jz5.l("bizuin", Ai);
                                                                                                    java.util.Map l17 = kz5.c1.l(lVarArr);
                                                                                                    vb2.x xVar5 = this.f191587r;
                                                                                                    if (xVar5 == null) {
                                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    android.widget.LinearLayout finderAccountArea = xVar5.f516293f;
                                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderAccountArea, "finderAccountArea");
                                                                                                    hc2.v0.e(finderAccountArea, "my_finder_account", 0, 0, false, false, l17, null, 94, null);
                                                                                                    vb2.x xVar6 = this.f191587r;
                                                                                                    if (xVar6 == null) {
                                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    android.widget.RelativeLayout feedPostBtn = xVar6.f516291d;
                                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(feedPostBtn, "feedPostBtn");
                                                                                                    hc2.v0.e(feedPostBtn, "post_feed", 0, 0, false, false, l17, null, 94, null);
                                                                                                    vb2.x xVar7 = this.f191587r;
                                                                                                    if (xVar7 == null) {
                                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    android.widget.RelativeLayout livePostBtn = xVar7.f516301n;
                                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(livePostBtn, "livePostBtn");
                                                                                                    hc2.v0.e(livePostBtn, "start_live", 0, 0, false, false, l17, null, 94, null);
                                                                                                    vb2.x xVar8 = this.f191587r;
                                                                                                    if (xVar8 == null) {
                                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    android.widget.RelativeLayout tabShowWording = xVar8.f516307t;
                                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tabShowWording, "tabShowWording");
                                                                                                    ym5.a1.h(tabShowWording, new hd2.h0(this));
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void p0() {
        yj0.a.a("com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.p0();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }

    public final void r0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (hz2.d.f367846a.a("post")) {
            return;
        }
        java.lang.String str = gm0.j1.b().j() + '_' + java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        p2Var.W(p2Var.i(context, 105, false));
        p2Var.R(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        int m75939xb282bd08 = nyVar != null ? nyVar.V6().m75939xb282bd08(8) : 0;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76422xc18e3d60(m75939xb282bd08);
        }
        p2Var.D(context, false, 105);
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((sr2.l5) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(sr2.l5.class)).Q6(new hd2.z(this, context), new hd2.a0(context))) {
            p2Var.T(str, null);
            if (!((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).Vi()) {
                p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
                if (mo7430x19263085 != null) {
                    java.lang.String str2 = this.f191586q;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 fj6 = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).fj(mo7430x19263085, str2, 105);
                    fj6.f293405n = new hd2.p0(mo7430x19263085, str2, this);
                    fj6.f293414s = new hd2.q0(this, mo7430x19263085, str, str2);
                    fj6.f293387d = hd2.r0.f362057d;
                    fj6.v();
                    return;
                }
                return;
            }
            ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
            us2.u.n(105, false);
            ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ui("FinderPersonalProfilePagePostingButton", 105, 0, str, true);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_finder_post_router", 2);
            intent.putExtra("key_finder_post_from", 1);
            intent.putExtra("key_finder_post_id", str);
            intent.putExtra("KEY_FINDER_USERNAME_SELF", this.f191586q);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).yk(context, intent, 132, 10);
            intent.putExtra("KEY_FINDER_MJ_PUBLISHER_SHOW_MOVIE_COMPOSING_ENTRANCE", true);
            s0(context, intent, 99);
        }
    }

    public final void s0(android.content.Context context, android.content.Intent intent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, context, intent2, 0L, null, 0, 0, false, 0, null, 508, null);
        intent2.putExtra("KEY_POST_ENTERSCENE", 105);
        java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(13, 52, i17);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Cj(Gj, intent);
        ((w40.e) i95.n0.c(w40.e.class)).getClass();
        qs2.v.f447860a.d(context, intent2, Gj);
    }

    public final void t0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", this.f191586q);
        intent.putExtra("KEY_FINDER_SELF_FLAG", true);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_enter_profile_type", 64);
        intent.putExtra("KEY_CAN_USE_SELF_CLUB_USERNAME", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("ProfileEntrance", new int[]{32});
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Cj(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(13, 2, 33), intent);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(context, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x04ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u0() {
        /*
            Method dump skipped, instructions count: 2085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3.u0():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w0(boolean r18) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3.w0(boolean):void");
    }

    public final void x0(int i17, java.lang.String str, java.lang.Boolean bool, r45.ct4 ct4Var) {
        if (i17 == 8 && this.f191590u == null) {
            vb2.x xVar = this.f191587r;
            if (xVar != null) {
                xVar.f516307t.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
        }
        vb2.x xVar2 = this.f191587r;
        if (xVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        xVar2.f516308u.setText(str);
        vb2.x xVar3 = this.f191587r;
        if (xVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        xVar3.f516307t.setVisibility(0);
        vb2.x xVar4 = this.f191587r;
        if (xVar4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        xVar4.f516307t.setOnClickListener(new hd2.s0(this, bool, ct4Var));
    }
}
