package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public final class e extends com.tencent.mm.plugin.appbrand.ui.recents.m implements com.tencent.mm.plugin.appbrand.appusage.r6 {

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f90067q;

    public e(androidx.fragment.app.FragmentActivity fragmentActivity, android.view.ViewGroup viewGroup) {
        super(fragmentActivity, viewGroup);
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
        kotlin.jvm.internal.o.d(a17);
        this.f90067q = a17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.m, com.tencent.mm.plugin.appbrand.appusage.r6
    public void a(r45.fl0 info) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f90067q;
        if (!o4Var.getBoolean("kv_want_show_entry", false) && info.f374419e == 1) {
            o4Var.putBoolean("kv_want_show_entry", true);
        }
        n(info);
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.r6
    public com.tencent.mm.plugin.appbrand.appusage.q6 b() {
        return com.tencent.mm.plugin.appbrand.appusage.q6.f76547f;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.m, com.tencent.mm.plugin.appbrand.ui.recents.c
    public void e() {
        l(true);
        l(kotlin.jvm.internal.o.b(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_appbrand_desktop_live_entrance_enable, "", true), "1") && this.f90067q.getBoolean("kv_want_show_entry", false));
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.c
    public void j(com.tencent.mm.ui.widget.imageview.WeImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
        imageView.setVisibility(0);
        imageView.setImageResource(com.tencent.mm.R.raw.icons_outline_miniprogram_live);
        imageView.setIconColor(this.f90117e.getResources().getColor(com.tencent.mm.R.color.f478528a8));
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.m
    public java.lang.String m() {
        return this.f90117e.getString(com.tencent.mm.R.string.f490264q1);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.m, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        super.onClick(view);
        l81.b1 b1Var = new l81.b1();
        b1Var.f317012a = "gh_bc64bb356935@app";
        b1Var.f317016c = 0;
        b1Var.f317018d = 0;
        b1Var.f317032k = 1001;
        b1Var.f317034l = "";
        com.tencent.mm.plugin.appbrand.launching.xc xcVar = (com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class));
        androidx.fragment.app.FragmentActivity fragmentActivity = this.f90117e;
        xcVar.bj(fragmentActivity, b1Var);
        if (this.f90125p != null) {
            com.tencent.mm.plugin.appbrand.report.n0 n0Var = com.tencent.mm.plugin.appbrand.report.n0.f88122d;
            kotlin.jvm.internal.o.f(fragmentActivity, "getActivity(...)");
            com.tencent.mm.plugin.appbrand.report.AppBrandLauncherDesktopReporter a17 = n0Var.a(fragmentActivity);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19468, 3, java.lang.Integer.valueOf(this.f90125p.f374420f), "", "", "", "", java.lang.Long.valueOf(a17.f87773d));
        }
    }
}
