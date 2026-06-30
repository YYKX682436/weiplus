package com.tencent.mm.plugin.finder.feed.ui.fragment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment;", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileCardFragment extends com.tencent.mm.ui.component.UIComponentFragment {

    /* renamed from: v, reason: collision with root package name */
    public static int f110049v;

    /* renamed from: n, reason: collision with root package name */
    public final int f110050n;

    /* renamed from: o, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f110051o = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));

    /* renamed from: p, reason: collision with root package name */
    public r45.lk2 f110052p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f110053q;

    /* renamed from: r, reason: collision with root package name */
    public vb2.x f110054r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f110055s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.HashMap f110056t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.z9 f110057u;

    static {
        g92.b bVar = g92.b.f269769e;
        m92.b j37 = g92.a.j3(bVar, bVar.T0(), false, 2, null);
        f110049v = j37 != null ? j37.u0().getInteger(6) : 0;
    }

    public FinderProfileCardFragment(int i17) {
        this.f110050n = i17;
        kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.internal.b0.f310484a));
        this.f110053q = "";
        this.f110056t = new java.util.HashMap();
    }

    public static /* synthetic */ void y0(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment, int i17, java.lang.String str, java.lang.Boolean bool, r45.ct4 ct4Var, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            str = null;
        }
        if ((i18 & 4) != 0) {
            bool = null;
        }
        if ((i18 & 8) != 0) {
            ct4Var = null;
        }
        finderProfileCardFragment.x0(i17, str, bool, ct4Var);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.edo;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return null;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        yj0.a.a("com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.o0();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 31121) {
            kotlinx.coroutines.l.d(this.f110051o, null, null, new hd2.d0(this, null), 3, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        u0();
        if (this.f110052p == null) {
            kotlinx.coroutines.l.d(this.f110051o, null, null, new hd2.d0(this, null), 3, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        int i17 = com.tencent.mm.R.id.f483299a85;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(view, com.tencent.mm.R.id.f483299a85);
        if (imageView != null) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
            i17 = com.tencent.mm.R.id.t_x;
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(view, com.tencent.mm.R.id.t_x);
            if (relativeLayout != null) {
                i17 = com.tencent.mm.R.id.t_y;
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(view, com.tencent.mm.R.id.t_y);
                if (weImageView != null) {
                    i17 = com.tencent.mm.R.id.t_z;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.t_z);
                    if (textView != null) {
                        i17 = com.tencent.mm.R.id.e7m;
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(view, com.tencent.mm.R.id.e7m);
                        if (linearLayout2 != null) {
                            i17 = com.tencent.mm.R.id.e_f;
                            android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(view, com.tencent.mm.R.id.e_f);
                            if (imageView2 != null) {
                                i17 = com.tencent.mm.R.id.egm;
                                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.egm);
                                if (textView2 != null) {
                                    i17 = com.tencent.mm.R.id.fuu;
                                    android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.fuu);
                                    if (textView3 != null) {
                                        i17 = com.tencent.mm.R.id.tto;
                                        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) x4.b.a(view, com.tencent.mm.R.id.tto);
                                        if (roundedCornerFrameLayout != null) {
                                            i17 = com.tencent.mm.R.id.g28;
                                            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(view, com.tencent.mm.R.id.g28);
                                            if (weImageView2 != null) {
                                                i17 = com.tencent.mm.R.id.g29;
                                                android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.g29);
                                                if (textView4 != null) {
                                                    i17 = com.tencent.mm.R.id.g3e;
                                                    android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.g3e);
                                                    if (textView5 != null) {
                                                        i17 = com.tencent.mm.R.id.f485211gx2;
                                                        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(view, com.tencent.mm.R.id.f485211gx2);
                                                        if (linearLayout3 != null) {
                                                            i17 = com.tencent.mm.R.id.ube;
                                                            android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) x4.b.a(view, com.tencent.mm.R.id.ube);
                                                            if (relativeLayout2 != null) {
                                                                i17 = com.tencent.mm.R.id.ubg;
                                                                com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(view, com.tencent.mm.R.id.ubg);
                                                                if (weImageView3 != null) {
                                                                    i17 = com.tencent.mm.R.id.ubh;
                                                                    android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.ubh);
                                                                    if (textView6 != null) {
                                                                        i17 = com.tencent.mm.R.id.f486142kc1;
                                                                        android.widget.TextView textView7 = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.f486142kc1);
                                                                        if (textView7 != null) {
                                                                            i17 = com.tencent.mm.R.id.f486362ur4;
                                                                            android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) x4.b.a(view, com.tencent.mm.R.id.f486362ur4);
                                                                            if (linearLayout4 != null) {
                                                                                i17 = com.tencent.mm.R.id.urb;
                                                                                android.view.View a17 = x4.b.a(view, com.tencent.mm.R.id.urb);
                                                                                if (a17 != null) {
                                                                                    i17 = com.tencent.mm.R.id.f487205vc3;
                                                                                    android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) x4.b.a(view, com.tencent.mm.R.id.f487205vc3);
                                                                                    if (relativeLayout3 != null) {
                                                                                        i17 = com.tencent.mm.R.id.f487206vc4;
                                                                                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(view, com.tencent.mm.R.id.f487206vc4);
                                                                                        if (weImageView4 != null) {
                                                                                            i17 = com.tencent.mm.R.id.vc6;
                                                                                            android.widget.ImageView imageView3 = (android.widget.ImageView) x4.b.a(view, com.tencent.mm.R.id.vc6);
                                                                                            if (imageView3 != null) {
                                                                                                i17 = com.tencent.mm.R.id.vc7;
                                                                                                android.widget.TextView textView8 = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.vc7);
                                                                                                if (textView8 != null) {
                                                                                                    this.f110054r = new vb2.x(linearLayout, imageView, linearLayout, relativeLayout, weImageView, textView, linearLayout2, imageView2, textView2, textView3, roundedCornerFrameLayout, weImageView2, textView4, textView5, linearLayout3, relativeLayout2, weImageView3, textView6, textView7, linearLayout4, a17, relativeLayout3, weImageView4, imageView3, textView8);
                                                                                                    com.tencent.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
                                                                                                    vb2.x xVar = this.f110054r;
                                                                                                    if (xVar == null) {
                                                                                                        kotlin.jvm.internal.o.o("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    com.tencent.mm.ui.bk.r0(xVar.f434759e.getPaint(), 0.8f);
                                                                                                    vb2.x xVar2 = this.f110054r;
                                                                                                    if (xVar2 == null) {
                                                                                                        kotlin.jvm.internal.o.o("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    com.tencent.mm.ui.bk.r0(xVar2.f434770p.getPaint(), 0.8f);
                                                                                                    com.tencent.mm.plugin.finder.extension.reddot.aa.f105379n.observe(this, new hd2.e0(this));
                                                                                                    android.content.Context context = getContext();
                                                                                                    if (context == null || (str = xy2.c.e(context)) == null) {
                                                                                                        str = "";
                                                                                                    }
                                                                                                    this.f110053q = str;
                                                                                                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                                                                                                    if (com.tencent.mm.plugin.finder.assist.s7.f102538a.b(getContext())) {
                                                                                                        vb2.x xVar3 = this.f110054r;
                                                                                                        if (xVar3 == null) {
                                                                                                            kotlin.jvm.internal.o.o("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        xVar3.f434757c.setVisibility(0);
                                                                                                    } else {
                                                                                                        vb2.x xVar4 = this.f110054r;
                                                                                                        if (xVar4 == null) {
                                                                                                            kotlin.jvm.internal.o.o("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        xVar4.f434757c.setVisibility(8);
                                                                                                    }
                                                                                                    java.lang.String Ai = ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).Ai();
                                                                                                    jz5.l[] lVarArr = new jz5.l[3];
                                                                                                    lVarArr[0] = new jz5.l("page_account_type", java.lang.Integer.valueOf(this.f110050n));
                                                                                                    android.content.Context context2 = getContext();
                                                                                                    lVarArr[1] = new jz5.l("finder_username", context2 != null ? xy2.c.e(context2) : null);
                                                                                                    lVarArr[2] = new jz5.l("bizuin", Ai);
                                                                                                    java.util.Map l17 = kz5.c1.l(lVarArr);
                                                                                                    vb2.x xVar5 = this.f110054r;
                                                                                                    if (xVar5 == null) {
                                                                                                        kotlin.jvm.internal.o.o("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    android.widget.LinearLayout finderAccountArea = xVar5.f434760f;
                                                                                                    kotlin.jvm.internal.o.f(finderAccountArea, "finderAccountArea");
                                                                                                    hc2.v0.e(finderAccountArea, "my_finder_account", 0, 0, false, false, l17, null, 94, null);
                                                                                                    vb2.x xVar6 = this.f110054r;
                                                                                                    if (xVar6 == null) {
                                                                                                        kotlin.jvm.internal.o.o("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    android.widget.RelativeLayout feedPostBtn = xVar6.f434758d;
                                                                                                    kotlin.jvm.internal.o.f(feedPostBtn, "feedPostBtn");
                                                                                                    hc2.v0.e(feedPostBtn, "post_feed", 0, 0, false, false, l17, null, 94, null);
                                                                                                    vb2.x xVar7 = this.f110054r;
                                                                                                    if (xVar7 == null) {
                                                                                                        kotlin.jvm.internal.o.o("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    android.widget.RelativeLayout livePostBtn = xVar7.f434768n;
                                                                                                    kotlin.jvm.internal.o.f(livePostBtn, "livePostBtn");
                                                                                                    hc2.v0.e(livePostBtn, "start_live", 0, 0, false, false, l17, null, 94, null);
                                                                                                    vb2.x xVar8 = this.f110054r;
                                                                                                    if (xVar8 == null) {
                                                                                                        kotlin.jvm.internal.o.o("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    android.widget.RelativeLayout tabShowWording = xVar8.f434774t;
                                                                                                    kotlin.jvm.internal.o.f(tabShowWording, "tabShowWording");
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

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        yj0.a.a("com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.p0();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }

    public final void r0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (hz2.d.f286313a.a("post")) {
            return;
        }
        java.lang.String str = gm0.j1.b().j() + '_' + java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        p2Var.W(p2Var.i(context, 105, false));
        p2Var.R(str);
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        int integer = nyVar != null ? nyVar.V6().getInteger(8) : 0;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setParentEnterScene(integer);
        }
        p2Var.D(context, false, 105);
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((sr2.l5) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(sr2.l5.class)).Q6(new hd2.z(this, context), new hd2.a0(context))) {
            p2Var.T(str, null);
            if (!((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).Vi()) {
                androidx.fragment.app.FragmentActivity activity = getActivity();
                if (activity != null) {
                    java.lang.String str2 = this.f110053q;
                    com.tencent.mm.ui.widget.dialog.k0 fj6 = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).fj(activity, str2, 105);
                    fj6.f211872n = new hd2.p0(activity, str2, this);
                    fj6.f211881s = new hd2.q0(this, activity, str, str2);
                    fj6.f211854d = hd2.r0.f280524d;
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
            intent.putExtra("KEY_FINDER_USERNAME_SELF", this.f110053q);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).yk(context, intent, 132, 10);
            intent.putExtra("KEY_FINDER_MJ_PUBLISHER_SHOW_MOVIE_COMPOSING_ENTRANCE", true);
            s0(context, intent, 99);
        }
    }

    public final void s0(android.content.Context context, android.content.Intent intent, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, context, intent2, 0L, null, 0, 0, false, 0, null, 508, null);
        intent2.putExtra("KEY_POST_ENTERSCENE", 105);
        java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(13, 52, i17);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Cj(Gj, intent);
        ((w40.e) i95.n0.c(w40.e.class)).getClass();
        qs2.v.f366327a.d(context, intent2, Gj);
    }

    public final void t0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", this.f110053q);
        intent.putExtra("KEY_FINDER_SELF_FLAG", true);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_enter_profile_type", 64);
        intent.putExtra("KEY_CAN_USE_SELF_CLUB_USERNAME", true);
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("ProfileEntrance", new int[]{32});
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Cj(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(13, 2, 33), intent);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(context, intent);
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment.u0():void");
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment.w0(boolean):void");
    }

    public final void x0(int i17, java.lang.String str, java.lang.Boolean bool, r45.ct4 ct4Var) {
        if (i17 == 8 && this.f110057u == null) {
            vb2.x xVar = this.f110054r;
            if (xVar != null) {
                xVar.f434774t.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
        }
        vb2.x xVar2 = this.f110054r;
        if (xVar2 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        xVar2.f434775u.setText(str);
        vb2.x xVar3 = this.f110054r;
        if (xVar3 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        xVar3.f434774t.setVisibility(0);
        vb2.x xVar4 = this.f110054r;
        if (xVar4 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        xVar4.f434774t.setOnClickListener(new hd2.s0(this, bool, ct4Var));
    }
}
