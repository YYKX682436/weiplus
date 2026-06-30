package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public final class l1 extends com.tencent.mm.plugin.appbrand.ui.recents.m implements com.tencent.mm.plugin.appbrand.appusage.r6 {

    /* renamed from: q, reason: collision with root package name */
    public boolean f90116q;

    public l1(androidx.fragment.app.FragmentActivity fragmentActivity, android.view.ViewGroup viewGroup) {
        super(fragmentActivity, viewGroup);
        this.f90116q = p();
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.r6
    public com.tencent.mm.plugin.appbrand.appusage.q6 b() {
        return com.tencent.mm.plugin.appbrand.appusage.q6.f76546e;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.m, com.tencent.mm.plugin.appbrand.ui.recents.c
    public void e() {
        boolean z17 = true;
        l(true);
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() && ((uh4.c0) i95.n0.c(uh4.c0.class)).hd() != 1) {
            z17 = false;
        }
        l(z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.m, com.tencent.mm.plugin.appbrand.ui.recents.c
    public void h() {
        super.h();
        if (this.f90116q || !p()) {
            return;
        }
        this.f90116q = true;
        e();
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.c
    public void j(com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        weImageView.setVisibility(0);
        weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_location);
        weImageView.setIconColor(this.f90117e.getResources().getColor(com.tencent.mm.R.color.f478496g));
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.m
    public java.lang.String m() {
        return this.f90117e.getResources().getString(com.tencent.mm.R.string.f490206nx);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.m, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListNearByHeader", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        androidx.fragment.app.FragmentActivity fragmentActivity = this.f90117e;
        if (fragmentActivity == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListNearByHeader", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (this.f90116q) {
            q(fragmentActivity);
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListNearByHeader", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        r();
        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).uj(fragmentActivity, "nearby", "android.permission.ACCESS_FINE_LOCATION", d85.f0.f227171v.f227177e, new com.tencent.mm.plugin.appbrand.ui.recents.k1(this, fragmentActivity));
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListNearByHeader", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final boolean p() {
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.d(this.f90117e, "android.permission.ACCESS_FINE_LOCATION", true)) {
            if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f227171v)) {
                return true;
            }
        }
        return false;
    }

    public final void q(android.content.Context context) {
        new com.tencent.mm.autogen.events.StartNearbyFromLauncherRecentsListEvent().e();
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = 1001;
        ((com.tencent.mm.plugin.appbrand.launching.a) com.tencent.mm.plugin.appbrand.launching.precondition.x.f85032a).b(context, "gh_2b2e3862a1fb@app", null, "pages/index/index.html", 0, 0, appBrandStatObject, null, null);
        r();
        com.tencent.mm.plugin.appbrand.report.model.j0 j0Var = new com.tencent.mm.plugin.appbrand.report.model.j0();
        j0Var.f88002a = com.tencent.mm.plugin.appbrand.report.model.i0.TOP_ENTRANCE_IN_DESKTOP;
        j0Var.f88003b = 0;
        j0Var.f88004c = "";
        j0Var.f88006e = com.tencent.mm.plugin.appbrand.report.model.h0.NEARBY_MINI_PROGRAM;
        j0Var.a();
    }

    public final void r() {
        androidx.fragment.app.FragmentActivity fragmentActivity = this.f90117e;
        if (fragmentActivity == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.appusage.o2 o2Var = ((com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI) fragmentActivity).f89363h;
        if (o2Var != null) {
            o2Var.f76534a[8] = "1";
        }
        if (this.f90125p != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19468, 2, "", "", "", "", "", java.lang.Long.valueOf(com.tencent.mm.plugin.appbrand.report.n0.f88122d.a(fragmentActivity).f87773d));
        }
    }
}
