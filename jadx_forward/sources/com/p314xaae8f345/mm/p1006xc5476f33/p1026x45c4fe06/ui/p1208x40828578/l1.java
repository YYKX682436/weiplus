package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public final class l1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.m implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r6 {

    /* renamed from: q, reason: collision with root package name */
    public boolean f171649q;

    public l1(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, android.view.ViewGroup viewGroup) {
        super(activityC1102x9ee2d9f, viewGroup);
        this.f171649q = p();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r6
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.q6 b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.q6.f158079e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c
    public void e() {
        boolean z17 = true;
        l(true);
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7() && ((uh4.c0) i95.n0.c(uh4.c0.class)).hd() != 1) {
            z17 = false;
        }
        l(z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c
    public void h() {
        super.h();
        if (this.f171649q || !p()) {
            return;
        }
        this.f171649q = true;
        e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c
    public void j(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352) {
        c22699x3dcdb352.setVisibility(0);
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80155x9d99890d);
        c22699x3dcdb352.m82040x7541828(this.f171650e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560029g));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.m
    public java.lang.String m() {
        return this.f171650e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571739nx);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.m, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListNearByHeader", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = this.f171650e;
        if (activityC1102x9ee2d9f == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListNearByHeader", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (this.f171649q) {
            q(activityC1102x9ee2d9f);
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListNearByHeader", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        r();
        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).uj(activityC1102x9ee2d9f, "nearby", "android.permission.ACCESS_FINE_LOCATION", d85.f0.f308704v.f308710e, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.k1(this, activityC1102x9ee2d9f));
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListNearByHeader", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final boolean p() {
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.d(this.f171650e, "android.permission.ACCESS_FINE_LOCATION", true)) {
            if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f308704v)) {
                return true;
            }
        }
        return false;
    }

    public final void q(android.content.Context context) {
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6120xc637918f().e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        c12559xbdae8559.f169323f = 1001;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.x.f166565a).b(context, "gh_2b2e3862a1fb@app", null, "pages/index/index.html", 0, 0, c12559xbdae8559, null, null);
        r();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.j0 j0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.j0();
        j0Var.f169535a = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.i0.TOP_ENTRANCE_IN_DESKTOP;
        j0Var.f169536b = 0;
        j0Var.f169537c = "";
        j0Var.f169539e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.h0.NEARBY_MINI_PROGRAM;
        j0Var.a();
    }

    public final void r() {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = this.f171650e;
        if (activityC1102x9ee2d9f == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.o2 o2Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da) activityC1102x9ee2d9f).f170896h;
        if (o2Var != null) {
            o2Var.f158067a[8] = "1";
        }
        if (this.f171658p != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19468, 2, "", "", "", "", "", java.lang.Long.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.n0.f169655d.a(activityC1102x9ee2d9f).f169306d));
        }
    }
}
