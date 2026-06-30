package yw2;

/* loaded from: classes2.dex */
public final class f implements com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x20 f548165d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f548166e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f548167f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f548168g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15282xfe3c9a46 f548169h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f548170i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f548171m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f548172n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f548173o;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Context f548174p;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x20 presenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f548165d = presenter;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void a(float f17) {
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void b() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8) this.f548165d).b();
        h().t(this);
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void c(boolean z17, boolean z18, int i17) {
        yw2.f fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x20 x20Var = this.f548165d;
        if (z17 && z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObj = h().getFeedObj();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(feedObj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8 f8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8) x20Var;
            f8Var.getClass();
            f8Var.f188250n = feedObj;
            fp0.t tVar = new fp0.t("FinderLikeExecutor");
            f8Var.f188251o = tVar;
            f8Var.f188253q = this;
            tVar.e();
            f8Var.g();
            f8Var.f188252p.clear();
            f8Var.f188259w.mo48813x58998cd();
            try {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = n().m82555x4905e9fa().mo7946xf939df19();
                if (mo7946xf939df19 != null) {
                    mo7946xf939df19.mo8163xed962dec(f8Var.f188260x);
                }
            } catch (java.lang.IllegalStateException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FavListDrawerPresenter", e17, "", new java.lang.Object[0]);
            }
            g(false);
            yw2.f fVar2 = f8Var.f188253q;
            if (fVar2 != null) {
                fVar2.h().l(true);
            }
            n().m82555x4905e9fa().mo7966xf161ffec(false);
            n().m82683xb165a19d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.u7(f8Var));
            yw2.f fVar3 = f8Var.f188253q;
            if (fVar3 != null) {
                android.widget.FrameLayout frameLayout = fVar3.f548170i;
                if (frameLayout == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
                    throw null;
                }
                frameLayout.setVisibility(8);
                fVar3.l().setOnClickListener(null);
            }
            yw2.f fVar4 = f8Var.f188253q;
            if (fVar4 != null) {
                fVar4.o();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8.d(f8Var, false, null, 3, null);
            if (!f8Var.f188258v && (fVar = f8Var.f188253q) != null) {
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.I(fVar.n(), null, 1, null);
            }
            f8Var.f188255s = true;
            android.content.Context context = f8Var.f188243d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uo) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uo.class)).O6();
        } else if (!z17 && z18) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8) x20Var).b();
        }
        if (!z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8) x20Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p9 p9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15282xfe3c9a46.B;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vc vcVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e.D;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d c14727x5e078d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a;
        android.content.Context context2 = this.f548174p;
        if (context2 != null) {
            c14727x5e078d.a(context2, 4);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
            throw null;
        }
    }

    public final void g(boolean z17) {
        if (!z17) {
            n().m82690xd3a27e96(false);
            return;
        }
        n().m82690xd3a27e96(true);
        if (n().getRefreshHeader() == null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 n17 = n();
            android.content.Context context = this.f548174p;
            if (context == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
                throw null;
            }
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cdl, (android.view.ViewGroup) null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            n17.m82701x7344efcb(inflate);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15282xfe3c9a46 h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15282xfe3c9a46 c15282xfe3c9a46 = this.f548169h;
        if (c15282xfe3c9a46 != null) {
            return c15282xfe3c9a46;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("favDrawer");
        throw null;
    }

    public final android.widget.TextView k() {
        android.widget.TextView textView = this.f548172n;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nothingView");
        throw null;
    }

    public final android.view.View l() {
        android.view.View view = this.f548173o;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
        throw null;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 n() {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f548168g;
        if (c22801x87cbdc00 != null) {
            return c22801x87cbdc00;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
        throw null;
    }

    public final void o() {
        android.widget.FrameLayout frameLayout = this.f548170i;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(0);
        android.view.View view = this.f548171m;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        k().setVisibility(8);
        android.view.View l17 = l();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(l17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(l17, "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
