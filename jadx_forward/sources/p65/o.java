package p65;

/* loaded from: classes12.dex */
public class o extends p65.a {
    @Override // p65.a
    public void d() {
        float f17;
        super.d();
        android.app.Application a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a();
        com.p314xaae8f345.mm.app.v5 a18 = com.p314xaae8f345.mm.app.v5.a(a17);
        if ((a18 == com.p314xaae8f345.mm.app.v5.f135384h || a18 == com.p314xaae8f345.mm.app.v5.f135386m) && com.p314xaae8f345.mm.ui.fj.h()) {
            p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1217xcec07a36.m8463x33ebcb90(a17.getApplicationContext(), com.p314xaae8f345.mm.R.xml.f576434b2);
            android.content.ComponentName componentName = new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.ui.LauncherUI");
            android.content.ComponentName componentName2 = new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.*");
            android.content.ComponentName componentName3 = new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.ui.chatting.ChattingUI");
            android.content.ComponentName componentName4 = new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.ui.EmptyActivity");
            int i17 = (int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics().density * 600.0f);
            int i18 = (int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics().density * 600.0f);
            com.p314xaae8f345.mm.ui.ah a19 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int min = java.lang.Math.min(a19.f278668a, a19.f278669b);
            if (com.p314xaae8f345.mm.ui.bk.A()) {
                i17 = min > 0 ? min + 5 : (int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics().density * 701.0f);
                f17 = 0.3f;
            } else {
                f17 = 0.5f;
            }
            float f18 = f17;
            if (com.p314xaae8f345.mm.ui.bk.a0()) {
                i17 = min;
                i18 = i17;
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.add(new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1219x5e21258c(componentName, componentName2, null));
            int i19 = i17;
            int i27 = i18;
            p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1217xcec07a36.m8462x9cf0d20b().m8469x9a35303f(new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1220x1f056610(hashSet, false, true, false, i19, i27, f18, 3));
            java.util.HashSet hashSet2 = new java.util.HashSet();
            hashSet2.add(new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1219x5e21258c(componentName, componentName3, null));
            p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1217xcec07a36.m8462x9cf0d20b().m8469x9a35303f(new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1220x1f056610(hashSet2, false, true, true, i19, i27, f18, 3));
            android.content.Intent intent = new android.content.Intent();
            intent.setComponent(componentName4);
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(1);
            linkedHashSet.add(new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1199x1e7baf87(componentName, null));
            p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1217xcec07a36.m8462x9cf0d20b().m8469x9a35303f(new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1221x7a3f98b5(linkedHashSet, intent, i17, i18, f18, 3));
        }
        com.p314xaae8f345.mm.p815xbe0af3c9.app.C10819x6f435d6d.a();
    }

    @Override // p65.a
    public void e(android.app.Application application) {
        com.p314xaae8f345.mm.vfs.z7 z7Var;
        java.util.ArrayList f17 = f(application);
        nm.i iVar = (nm.i) nm.i.f419969g.b();
        android.app.Application a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a();
        android.app.Application[] applicationArr = iVar.f419972c;
        if (applicationArr[0] == null) {
            synchronized (applicationArr) {
                android.app.Application[] applicationArr2 = iVar.f419972c;
                if (applicationArr2[0] == null) {
                    applicationArr2[0] = a17;
                    iVar.f419970a.a(a17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FirstScreenArrangement2", "[+] installed.");
                }
            }
        }
        android.app.Application a18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a();
        if (com.p314xaae8f345.mm.app.c6.f21434x701ef43e.m43004x321e8933(a18)) {
            p65.l lVar = new p65.l(this, a18);
            com.p314xaae8f345.mm.p794xb0fa9b5e.h0[] h0VarArr = com.p314xaae8f345.mm.p794xb0fa9b5e.i0.f149889a;
            synchronized (h0VarArr) {
                h0VarArr[0] = lVar;
            }
        }
        android.app.Application a19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e = j65.j.e(a19.getResources(), a19, false);
        if (com.p314xaae8f345.mm.app.v5.a(a19).f135402f) {
            java.lang.String a27 = lp0.h.f401799b.a("login_user_name", "");
            java.lang.String e17 = lp0.b.e();
            com.p314xaae8f345.mm.vfs.z7 a28 = e17 == null ? null : com.p314xaae8f345.mm.vfs.z7.a(e17);
            if (a28 == null) {
                z7Var = new com.p314xaae8f345.mm.vfs.z7(null, null, com.p314xaae8f345.mm.vfs.e8.l("version_history.cfg", false, false), null, null);
            } else {
                z7Var = new com.p314xaae8f345.mm.vfs.z7(a28.f294810d, a28.f294811e, com.p314xaae8f345.mm.vfs.e8.l(a28.f294812f + "/version_history.cfg", false, false), a28.f294813g, a28.f294814h);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a27)) {
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, null);
                if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
                    j65.c.i();
                }
            }
            j65.f.f379479j = new p65.m(this);
            j62.e g17 = j62.e.g();
            e42.c0 c0Var = e42.c0.clicfg_mb_reward_ad_log_max_length_android;
            boolean z17 = !g17.l("clicfg_dont_manually_notify_res_changed_on_appbrand", true, true, true);
            if (!com.p314xaae8f345.mm.app.c6.f21417x2b974760.m43004x321e8933(a19) || z17) {
                j65.j jVar = (j65.j) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
                jVar.i(jVar.getConfiguration());
            }
            com.p314xaae8f345.mm.app.e6.f134941a = null;
            com.p314xaae8f345.mm.app.e6.f134942b = "com.tencent.mm.boot";
            android.content.res.Resources resources = a19.getResources();
            m95.k.e(a19, com.p314xaae8f345.mm.app.e6.f134942b);
            com.p314xaae8f345.mm.app.e6.f134943c = a19;
            com.p314xaae8f345.mm.app.e6.f134944d = resources;
        }
        g(f17);
        com.p314xaae8f345.mm.p815xbe0af3c9.app.C10819x6f435d6d.b(this.f433973b, new com.p314xaae8f345.mm.p815xbe0af3c9.app.C10820x69adf850());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            gm0.j1.i().m(new p65.n(this));
        }
    }
}
