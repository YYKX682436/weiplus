package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public final class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.m implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r6 {

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f171600q;

    public e(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, android.view.ViewGroup viewGroup) {
        super(activityC1102x9ee2d9f, viewGroup);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        this.f171600q = a17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r6
    public void a(r45.fl0 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f171600q;
        if (!o4Var.getBoolean("kv_want_show_entry", false) && info.f455952e == 1) {
            o4Var.putBoolean("kv_want_show_entry", true);
        }
        n(info);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r6
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.q6 b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.q6.f158080f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c
    public void e() {
        l(true);
        l(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_appbrand_desktop_live_entrance_enable, "", true), "1") && this.f171600q.getBoolean("kv_want_show_entry", false));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c
    public void j(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 imageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        imageView.setVisibility(0);
        imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79992x9167cf80);
        imageView.m82040x7541828(this.f171650e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560061a8));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.m
    public java.lang.String m() {
        return this.f171650e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571797q1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.m, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        super.onClick(view);
        l81.b1 b1Var = new l81.b1();
        b1Var.f398545a = "gh_bc64bb356935@app";
        b1Var.f398549c = 0;
        b1Var.f398551d = 0;
        b1Var.f398565k = 1001;
        b1Var.f398567l = "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc xcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class));
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = this.f171650e;
        xcVar.bj(activityC1102x9ee2d9f, b1Var);
        if (this.f171658p != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.n0 n0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.n0.f169655d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activityC1102x9ee2d9f, "getActivity(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12557xaff9f077 a17 = n0Var.a(activityC1102x9ee2d9f);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19468, 3, java.lang.Integer.valueOf(this.f171658p.f455953f), "", "", "", "", java.lang.Long.valueOf(a17.f169306d));
        }
    }
}
