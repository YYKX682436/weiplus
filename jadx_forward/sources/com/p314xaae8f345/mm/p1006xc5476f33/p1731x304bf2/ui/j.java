package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public abstract class j implements android.view.View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f222959e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f222961g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 f222962h;

    /* renamed from: i, reason: collision with root package name */
    public dm.t3 f222963i;

    /* renamed from: m, reason: collision with root package name */
    public int f222964m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f222965n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f222966o;

    /* renamed from: d, reason: collision with root package name */
    public int f222958d = -1;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b f222960f = null;

    public j(android.content.Context context) {
        this.f222959e = context;
    }

    public final void a(boolean z17) {
        long b17;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar = this.f222960f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0.g(bVar.f319901J, bVar.P, bVar.f221746p2, bVar.f67370x28d45f97, null, "app_update");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar2 = this.f222960f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0.g(bVar2.f319901J, bVar2.P, bVar2.f221746p2, bVar2.f67370x28d45f97, null, this.f222966o);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar3 = this.f222960f;
        t0Var.f178683a = bVar3.f319901J;
        t0Var.f178684b = bVar3.f221755y2;
        t0Var.f178685c = bVar3.f221756z2;
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar4 = this.f222960f;
        android.content.Context context = this.f222959e;
        t0Var.f178686d = ((kt.c) i0Var).Ui(context, bVar4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar5 = this.f222960f;
        t0Var.f178689g = bVar5.f67370x28d45f97;
        t0Var.f178687e = bVar5.P;
        t0Var.f178691i = true;
        t0Var.f178688f = 1;
        t0Var.f178690h = bVar5.f67386xa1e9e82c;
        t0Var.f178694l = bVar5.f221746p2;
        if (bVar5.A2 == 1) {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().c(t0Var);
        } else {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().b(t0Var);
        }
        long j17 = b17;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar6 = this.f222960f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommonGameClickLinstener", " add download task result:[%d], appid[%s]，downloaerType[%d]", valueOf, bVar6.f67370x28d45f97, java.lang.Integer.valueOf(bVar6.A2));
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.m(context, this.f222960f.f67370x28d45f97);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar7 = this.f222960f;
        g02.c cVar = new g02.c(bVar7.f67370x28d45f97, bVar7.f221746p2, j17, "", null, 0);
        ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
        g02.b.c(9, cVar);
    }

    public void b(boolean z17) {
        android.content.Context context = this.f222959e;
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(context)) {
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573741fm1), 0).show();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0.b().e(this.f222960f.f67370x28d45f97, 803, false, null);
            return;
        }
        gm0.j1.i();
        if (!gm0.j1.u().l()) {
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573743fm3), 0).show();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0.b().e(this.f222960f.f67370x28d45f97, 804, false, null);
            return;
        }
        vz.u1 u1Var = (vz.u1) i95.n0.c(vz.u1.class);
        long j17 = this.f222960f.f221756z2;
        ((uz.t1) u1Var).getClass();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.u0.a(j17)) {
            vz.u1 u1Var2 = (vz.u1) i95.n0.c(vz.u1.class);
            long j18 = this.f222960f.f221756z2;
            ((uz.t1) u1Var2).getClass();
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.u0.c(j18)) {
                dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573742fm2), 0).show();
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0.b().e(this.f222960f.f67370x28d45f97, 804, false, null);
                return;
            }
        }
        if (o45.wf.f424557b.toLowerCase().contains("xiaomi")) {
            try {
                if (android.provider.Settings.Secure.getInt(context.getContentResolver(), "install_non_market_apps") == 0 && !context.getSharedPreferences("game_center_pref", 0).getBoolean("show_open_download_authority_tips", false)) {
                    db5.e1.k(this.f222959e, com.p314xaae8f345.mm.R.C30867xcad56011.fpi, com.p314xaae8f345.mm.R.C30867xcad56011.fpj, com.p314xaae8f345.mm.R.C30867xcad56011.fm_, com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.h(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i(this));
                    context.getSharedPreferences("game_center_pref", 0).edit().putBoolean("show_open_download_authority_tips", true).commit();
                }
            } catch (android.provider.Settings.SettingNotFoundException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CommonGameClickLinstener", "SettingNotFoundException ; %S", e17.getMessage());
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f222960f.f319901J) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f222960f.P)) {
            android.content.Context context2 = this.f222959e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar = this.f222960f;
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.g(context2, bVar.f221745o2, bVar.f221746p2, bVar.f221747q2, 4, bVar.f67370x28d45f97, this.f222964m, bVar.f221743m2, this.f222965n);
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context)) {
                a(z17);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14217, this.f222960f.f67370x28d45f97, 4, "", this.f222960f.f319901J, 2);
            android.content.Context context3 = this.f222959e;
            db5.e1.D(context3, context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5x), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5y), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5q), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.f(this, z17), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.g(this), com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f222960f.Q)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CommonGameClickLinstener", "downloadApk fail, gpDownloadUrl is null");
        } else {
            ((yb0.c) ((zb0.y) i95.n0.c(zb0.y.class))).wi(context, this.f222960f.Q);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f222960f.f319901J)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0.b().e(this.f222960f.f67370x28d45f97, 700, false, null);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f222960f.P)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0.b().e(this.f222960f.f67370x28d45f97, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.r0.f34827x366c91de, false, null);
        }
    }
}
