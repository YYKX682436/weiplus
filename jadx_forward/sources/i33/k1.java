package i33;

/* loaded from: classes10.dex */
public final class k1 extends i33.c {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f369742f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f369743g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f369744h;

    /* renamed from: i, reason: collision with root package name */
    public int f369745i;

    /* renamed from: m, reason: collision with root package name */
    public int f369746m;

    /* renamed from: n, reason: collision with root package name */
    public int f369747n;

    /* renamed from: o, reason: collision with root package name */
    public final long f369748o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f369742f = "MicroMsg.AlbumWindowUIC";
        this.f369743g = jz5.h.b(new i33.i1(this));
        this.f369744h = new java.util.ArrayList();
        this.f369746m = 1;
        this.f369747n = 1;
        this.f369748o = 300L;
    }

    @Override // i33.c
    public void V6(com.p314xaae8f345.mm.ui.q2 oldMode, com.p314xaae8f345.mm.ui.q2 newMode) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldMode, "oldMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newMode, "newMode");
        if (oldMode != newMode) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f369742f, "updateStatusBarAndNavigationBar: toType:" + newMode);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
            if (abstractActivityC21394xb3d2c0cf2 != null) {
                int ordinal = newMode.ordinal();
                long j17 = this.f369748o;
                if (ordinal == 0) {
                    if (!abstractActivityC21394xb3d2c0cf2.getIntent().getBooleanExtra("is_from_emoji_ALBUM", false)) {
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
                        abstractActivityC21394xb3d2c0cf = m158354x192630852 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852 : null;
                        if (abstractActivityC21394xb3d2c0cf != null) {
                            abstractActivityC21394xb3d2c0cf.m78506x1ef531b7(false, j17);
                        }
                    }
                    W6(true);
                    ul5.k m78511x9f88d943 = abstractActivityC21394xb3d2c0cf2.m78511x9f88d943();
                    if (m78511x9f88d943 != null) {
                        android.view.ViewGroup.LayoutParams layoutParams = m78511x9f88d943.mo82160xfb86a31b().getLayoutParams();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                        layoutParams2.bottomMargin = this.f369745i;
                        m78511x9f88d943.mo82160xfb86a31b().setLayoutParams(layoutParams2);
                        return;
                    }
                    return;
                }
                if (ordinal != 1) {
                    return;
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = m158354x19263085();
                abstractActivityC21394xb3d2c0cf = m158354x192630853 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630853 : null;
                if (abstractActivityC21394xb3d2c0cf != null) {
                    abstractActivityC21394xb3d2c0cf.m78506x1ef531b7(true, j17);
                }
                W6(false);
                ul5.k m78511x9f88d9432 = abstractActivityC21394xb3d2c0cf2.m78511x9f88d943();
                if (m78511x9f88d9432 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams3 = m78511x9f88d9432.mo82160xfb86a31b().getLayoutParams();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    android.widget.FrameLayout.LayoutParams layoutParams4 = (android.widget.FrameLayout.LayoutParams) layoutParams3;
                    this.f369745i = layoutParams4.bottomMargin;
                    layoutParams4.bottomMargin = 0;
                    m78511x9f88d9432.mo82160xfb86a31b().setLayoutParams(layoutParams4);
                }
                o23.m.f423959a.C = true;
            }
        }
    }

    public final void W6(boolean z17) {
        s23.x xVar;
        k33.b bVar;
        s23.o oVar;
        java.util.Iterator it = ((java.util.ArrayList) this.f369744h).iterator();
        while (it.hasNext()) {
            ((s23.j) ((i33.f1) it.next())).getClass();
            java.util.Set<java.util.Map.Entry> entrySet = s23.n.f483843e.entrySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
            for (java.util.Map.Entry entry : entrySet) {
                s23.x xVar2 = (s23.x) entry.getValue();
                if (((xVar2 == null || (oVar = xVar2.f483876d) == null) ? false : oVar.d()) && (xVar = (s23.x) entry.getValue()) != null && (bVar = xVar.f483890u) != null) {
                    int i17 = k33.b.f385389j;
                    if (bVar.isShowing()) {
                        int i18 = z17 ? 0 : 4;
                        android.view.View contentView = bVar.getContentView();
                        if (contentView != null) {
                            int visibility = contentView.getVisibility();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasAlbumTipPopup", "setPopupLayoutVisibility: old=" + visibility + ", new=" + i18);
                            if (visibility != i18) {
                                android.view.View contentView2 = bVar.getContentView();
                                if (contentView2 != null) {
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                                    arrayList.add(java.lang.Integer.valueOf(i18));
                                    java.util.Collections.reverse(arrayList);
                                    yj0.a.d(contentView2, arrayList.toArray(), "com/tencent/mm/plugin/gallery/view/AbsAutoDismissTipsPopup", "setPopupLayoutVisibility", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    contentView2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                                    yj0.a.f(contentView2, "com/tencent/mm/plugin/gallery/view/AbsAutoDismissTipsPopup", "setPopupLayoutVisibility", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                if (i18 == 0) {
                                    bVar.b();
                                } else {
                                    bVar.a();
                                }
                            }
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasAlbumTipPopup", "setPopupLayoutVisibility: had dismiss");
                    }
                }
            }
        }
        sa5.x xVar3 = sa5.x.f486906a;
        jz5.g gVar = this.f369743g;
        long j17 = this.f369748o;
        if (!z17) {
            for (i33.g1 g1Var : (java.util.List) ((jz5.n) gVar).mo141623x754a37bb()) {
                android.view.View view = g1Var.f369727a;
                g1Var.f369728b = view.getVisibility();
                if (view.getVisibility() == 0) {
                    sa5.d.b(view, new sa5.n0(xVar3), j17, new i33.h1(this, view));
                }
            }
            return;
        }
        for (i33.g1 g1Var2 : (java.util.List) ((jz5.n) gVar).mo141623x754a37bb()) {
            android.view.View view2 = g1Var2.f369727a;
            int visibility2 = view2.getVisibility();
            int i19 = g1Var2.f369728b;
            if (visibility2 != i19 && i19 == 0) {
                view2.getId();
                sa5.d.a(view2, new sa5.e0(xVar3), j17, i33.j1.f369738d);
            }
        }
    }

    public final int X6() {
        return this.f369746m * (com.p314xaae8f345.mm.ui.bl.a(m80379x76847179()) + (com.p314xaae8f345.mm.ui.b4.c(m80379x76847179()) ? 0 : com.p314xaae8f345.mm.ui.bl.h(m80379x76847179())));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        i33.z0 z0Var = (i33.z0) pf5.z.f435481a.a(activity).e(i33.z0.class);
        if (z0Var != null) {
            z0Var.X6(this, 1);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        if ((m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null) != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x192630852 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852 : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = abstractActivityC21394xb3d2c0cf.mo2533x106ab264();
                if (mo2533x106ab264 != null) {
                    mo2533x106ab264.o();
                }
                abstractActivityC21394xb3d2c0cf.getWindow().clearFlags(1024);
                abstractActivityC21394xb3d2c0cf.getWindow().addFlags(Integer.MIN_VALUE);
                android.view.View decorView = abstractActivityC21394xb3d2c0cf.getWindow().getDecorView();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
                if (decorView.getSystemUiVisibility() != 1280) {
                    decorView.setSystemUiVisibility(1280);
                }
                p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab2642 = abstractActivityC21394xb3d2c0cf.mo2533x106ab264();
                if (mo2533x106ab2642 != null) {
                    mo2533x106ab2642.L();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ((java.util.ArrayList) this.f369744h).clear();
    }
}
