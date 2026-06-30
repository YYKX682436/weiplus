package s65;

/* loaded from: classes11.dex */
public class v0 implements q65.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s65.x0 f485057a;

    public v0(s65.x0 x0Var) {
        this.f485057a = x0Var;
    }

    @Override // q65.b
    public void a(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdaterManager", "total=%d, offset=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        s65.x0 x0Var = this.f485057a;
        if (x0Var.f485077r != 2) {
            s65.x0.j(x0Var, i18, i17);
        }
        x0Var.a(i17, i18);
    }

    @Override // q65.a
    public void b(long j17) {
        s65.m0 m0Var = this.f485057a.C;
        m0Var.f485027a.mo50293x3498a0(new s65.k0(m0Var, j17));
    }

    @Override // q65.a
    public void c(long j17) {
        s65.m0 m0Var = this.f485057a.C;
        m0Var.f485027a.mo50293x3498a0(new s65.l0(m0Var, j17));
    }

    @Override // q65.b
    public void d(int i17, int i18, r45.js5 js5Var) {
        s65.x0 x0Var = this.f485057a;
        x0Var.f485083x = false;
        x0Var.C.b();
        x0Var.B = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l lVar = x0Var.f485060a;
        if (lVar == null) {
            x0Var.l(2, true);
            return;
        }
        android.content.Context context = x0Var.A;
        if (i17 == 200 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdaterManager", "packCallback onSceneEnd ok");
            if (x0Var.f485077r != 2) {
                s65.x0.j(x0Var, 100, 100);
            }
            if (x0Var.f485075p) {
                s65.o0.h(context, 0);
            } else {
                s65.o0.h(context, 9);
            }
            java.lang.String string = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "yyb_pkg_sig_prefs", 4)).getString(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "");
            x0Var.f485070k = string;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdaterManager", "summertoken downloadsuccess onSceneEnd sig[%s], path[%s]", string, x0Var.f485060a.b());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x0Var.f485070k)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.mo68477x336bdfd8(322L, 8L, 1L, false);
                g0Var.d(11098, java.lang.Integer.valueOf(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7536x419518a9));
            } else {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                try {
                    java.lang.String i19 = com.p314xaae8f345.mm.vfs.w6.i(x0Var.f485060a.b(), true);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageName().equalsIgnoreCase(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b) || j62.e.g().a("clicfg_appcompat_pkg_sig", "0", false, true).equals("1")) {
                        uk.f.d(new java.io.File(i19), x0Var.f485070k);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdaterManager", "Skip writing apkSig for v2 signing, pkg = " + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdaterManager", "summertoken downloadsuccess writeSecurityCode done");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var2.mo68477x336bdfd8(322L, 6L, 1L, false);
                    g0Var2.d(11098, java.lang.Integer.valueOf(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7530xe5db58ec), x0Var.f485070k);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.UpdaterManager", "summertoken downloadsuccess writeSecurityCode e: " + e17.getMessage());
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var3.mo68477x336bdfd8(322L, 7L, 1L, false);
                    g0Var3.d(11098, java.lang.Integer.valueOf(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7534x97f3504d), e17.getMessage());
                }
            }
            int i27 = x0Var.f485077r;
            if (i27 == 1) {
                s65.o0.g(context, 8, 0);
                s65.o0.d(x0Var.f485069j, x0Var.f485070k, x0Var.f485068i, x0Var.f485071l, x0Var.f485077r, x0Var.f485063d, x0Var.f485079t);
                x0Var.c(x0Var.f485060a.b());
                if (x0Var.f485080u) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 58L, 1L, false);
                }
            } else if (i27 == 0) {
                x0Var.c(x0Var.f485060a.b());
            } else if (i27 == 2) {
                s65.o0.g(context, 1, 0);
                s65.o0.d(x0Var.f485069j, x0Var.f485070k, x0Var.f485068i, x0Var.f485071l, x0Var.f485077r, x0Var.f485063d, x0Var.f485079t);
            }
            s65.o0.f();
            return;
        }
        if (i18 == -13) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UpdaterManager", "session timeout, killself and restart");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.UpdaterService", "UpdaterService stopInstance()");
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20974x100c85cc c20974x100c85cc = com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20974x100c85cc.f273864p;
            if (c20974x100c85cc != null) {
                c20974x100c85cc.i();
            }
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c = com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c.f273849m;
            if (activityC20972xfb8eac1c != null) {
                activityC20972xfb8eac1c.R6();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "update_config_prefs", 4);
            o4Var.getClass();
            o4Var.putBoolean("update_download_start_one_immediate", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "putOneDownloadTask");
            return;
        }
        if (!(lVar instanceof s65.g0) || x0Var.f485063d == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UpdaterManager", "update failed");
            s65.o0.h(context, 10);
            int i28 = x0Var.f485077r;
            if (i28 == 1) {
                java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571911tb);
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyt) + "/"));
                intent.addFlags(268435456);
                android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 0, intent, fp.g0.a(134217728));
                z2.k0 k0Var = new z2.k0(context, "reminder_channel_id");
                k0Var.m(null);
                k0Var.D.when = java.lang.System.currentTimeMillis();
                k0Var.f(string2);
                k0Var.e(null);
                k0Var.f550996g = activity;
                android.app.Notification b17 = k0Var.b();
                x0Var.f485085z = b17;
                b17.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.boa;
                b17.flags |= 16;
                ((android.app.NotificationManager) context.getSystemService("notification")).notify(99, x0Var.f485085z);
            } else if (i28 == 0) {
                x0Var.l(1, true);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UpdaterManager", "download package from cdn error.");
            if (x0Var.f485075p) {
                if (i17 == 3 || i17 == 4 || i17 == 2 || i17 == 1 || i17 == 13) {
                    s65.o0.h(context, i17);
                }
                x0Var.f485075p = false;
                int i29 = x0Var.f485077r;
                if (i29 == 1) {
                    if (!x0Var.f485080u) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdaterManager", "showDownloadFullPackNotification()");
                        java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571912tc, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(x0Var.f485071l));
                        android.content.Intent intent2 = x0Var.f485084y;
                        intent2.putExtra("intent_extra_force_download_full", true);
                        android.app.PendingIntent service = android.app.PendingIntent.getService(context, 0, intent2, fp.g0.a(134217728));
                        z2.k0 k0Var2 = new z2.k0(context, "reminder_channel_id");
                        k0Var2.m(null);
                        k0Var2.D.when = java.lang.System.currentTimeMillis();
                        k0Var2.f(string3);
                        k0Var2.e(null);
                        k0Var2.f550996g = service;
                        android.app.Notification b18 = k0Var2.b();
                        x0Var.f485085z = b18;
                        b18.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.boa;
                        b18.flags |= 16;
                        ((android.app.NotificationManager) context.getSystemService("notification")).notify(99, x0Var.f485085z);
                    } else if (i17 == 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 51L, 1L, false);
                    } else if (i17 == 2) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 54L, 1L, false);
                    } else if (i17 == 3) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 52L, 1L, false);
                    } else if (i17 == 4) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 53L, 1L, false);
                    } else if (i17 == 13) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 55L, 1L, false);
                    }
                } else if (i29 == 0) {
                    x0Var.l(1, true);
                } else if (i29 == 2) {
                    x0Var.n();
                }
            } else {
                x0Var.f485060a = new s65.z(x0Var.f485071l, x0Var.f485069j, x0Var.f485063d, x0Var.f485067h, x0Var.f485064e, x0Var.f485065f, x0Var.f485066g, x0Var.f485062c, x0Var.f485077r == 2);
                x0Var.r();
            }
        }
        x0Var.h(x0Var.f485060a);
    }
}
