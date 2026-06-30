package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class r0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.j {
    public final boolean c(long j17) {
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 != null && c17.f68409xc4f9be67) {
            c17.f68409xc4f9be67 = false;
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        return com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().o(j17);
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar = this.f222960f;
        g02.c cVar = new g02.c(bVar.f67370x28d45f97, bVar.f221746p2, this.f222963i.f68408x32b20428, "", null, 0);
        ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
        g02.b.c(10, cVar);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().w(this.f222963i.f68408x32b20428)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameClickListener", "resumeDownloadTask false");
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().t(this.f222963i.f68408x32b20428);
            b(false);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.m(this.f222959e, this.f222960f.f67370x28d45f97);
        android.content.Context context = this.f222959e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar2 = this.f222960f;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.g(context, bVar2.f221745o2, bVar2.f221746p2, bVar2.f221747q2, 4, bVar2.f67370x28d45f97, this.f222964m, bVar2.f221743m2, this.f222965n);
    }

    public final void e() {
        android.content.Context context = this.f222959e;
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(context)) {
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573741fm1), 0).show();
        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context)) {
            d();
        } else {
            android.content.Context context2 = this.f222959e;
            db5.e1.D(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5x), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5y), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5q), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p0(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.q0(this), com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean F;
        int i17;
        int i18;
        if (!(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameClickListener", "No AppInfo");
            return;
        }
        this.f222960f = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b) view.getTag();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameClickListener", "Clicked appid = " + this.f222960f.f67370x28d45f97);
        vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
        java.lang.String str = this.f222960f.f67370x28d45f97;
        ((uz.p1) q1Var).getClass();
        this.f222963i = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(str);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(this.f222960f.f67370x28d45f97);
        this.f222962h = q17;
        long j17 = q17.f178494d;
        this.f222958d = q17.f178496f;
        this.f222961g = q17.f178497g;
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str2 = this.f222960f.f67370x28d45f97;
        ((kt.c) i0Var).getClass();
        android.content.Context context = this.f222959e;
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.r(context, str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar = this.f222960f;
            if (bVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b) {
                i17 = r53.f.j(bVar.f67386xa1e9e82c);
                i18 = this.f222960f.f221748r2;
            } else {
                i17 = 0;
                i18 = 0;
            }
            if (i18 <= i17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar2 = this.f222960f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameClickListener", "launchFromWX, appId = %s, pkg = %s, openId = %s", bVar2.f67370x28d45f97, bVar2.f67386xa1e9e82c, bVar2.f67384x996f3ea);
                android.content.Context context2 = this.f222959e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar3 = this.f222960f;
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.g(context2, bVar3.f221745o2, bVar3.f221746p2, bVar3.f221747q2, 3, bVar3.f67370x28d45f97, this.f222964m, bVar3.f221743m2, this.f222965n);
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.j(context, this.f222960f.f67370x28d45f97);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameClickListener", "AppId: %s installed, local: %d, server: %d", this.f222960f.f67370x28d45f97, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar4 = this.f222960f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0.g(bVar4.f319901J, bVar4.P, bVar4.f221746p2, bVar4.f67370x28d45f97, null, "app_update");
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 c13222x107de37 = this.f222962h;
            int i19 = c13222x107de37.f178496f;
            if (i19 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameClickListener", "pauseDownloadTask ret = " + c(c13222x107de37.f178494d));
                return;
            }
            if (i19 == 2) {
                e();
                return;
            }
            if (i19 != 3) {
                b(true);
                return;
            }
            if (!com.p314xaae8f345.mm.vfs.w6.j(c13222x107de37.f178497g) || r53.f.i(this.f222962h.f178497g) <= i17) {
                b(true);
                return;
            }
            zb0.y yVar = (zb0.y) i95.n0.c(zb0.y.class);
            java.lang.String str3 = this.f222962h.f178497g;
            ((yb0.c) yVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n1.d(context, str3, null, false);
            android.content.Context context3 = this.f222959e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar5 = this.f222960f;
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.g(context3, bVar5.f221745o2, bVar5.f221746p2, bVar5.f221747q2, 8, bVar5.f67370x28d45f97, this.f222964m, bVar5.f221743m2, this.f222965n);
            return;
        }
        if (this.f222960f.I0()) {
            r53.f.v(context, this.f222960f.C2.f405184e, "game_center_hv_game", null);
            android.content.Context context4 = this.f222959e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar6 = this.f222960f;
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.g(context4, bVar6.f221745o2, bVar6.f221746p2, bVar6.f221747q2, 29, bVar6.f67370x28d45f97, this.f222964m, bVar6.f221743m2, this.f222965n);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar7 = this.f222960f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0.g(bVar7.f319901J, bVar7.P, bVar7.f221746p2, bVar7.f67370x28d45f97, null, this.f222966o);
        int i27 = this.f222958d;
        if (i27 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameClickListener", "pauseDownloadTask ret = " + c(this.f222962h.f178494d));
            return;
        }
        if (i27 == 2) {
            e();
            return;
        }
        if (i27 != 3) {
            b(false);
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f222961g) && com.p314xaae8f345.mm.vfs.w6.j(this.f222961g)) {
            java.lang.String str4 = this.f222961g;
            java.lang.String str5 = this.f222963i.f68426x4b6e68b9;
            boolean z17 = r53.f.f474186a;
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str4);
            java.lang.String str6 = a17.f294812f;
            if (str6 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str6, false, false);
                if (!str6.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(a17.m82499x9616526c());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCenterUtil", "checkPkgMD5Valid, md5 is null");
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                F = !m17.a() ? false : m17.f294799a.F(m17.f294800b);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCenterUtil", "checkPkgMD5Valid, md5 = %s, calculateMD5 = %s", str5, p17);
                F = str5.equalsIgnoreCase(p17);
            }
            if (F) {
                java.lang.String str7 = this.f222960f.f67370x28d45f97;
                long j18 = this.f222963i.f68408x32b20428;
                ((uz.a) ((vz.f1) i95.n0.c(vz.f1.class))).getClass();
                k02.l.a(j18, false, null);
                android.content.Context context5 = this.f222959e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar8 = this.f222960f;
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.g(context5, bVar8.f221745o2, bVar8.f221746p2, bVar8.f221747q2, 8, bVar8.f67370x28d45f97, this.f222964m, bVar8.f221743m2, this.f222965n);
                return;
            }
        }
        b(false);
    }
}
