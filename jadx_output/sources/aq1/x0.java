package aq1;

/* loaded from: classes11.dex */
public class x0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public static aq1.x0 f13099d;

    public void a(java.lang.String str) {
        java.util.Map d17;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.LauncherUI.class);
        intent.putExtra("Intro_Notify", true);
        intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        intent.addFlags(67108864);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.startsWith("autoauth_errmsg_")) {
            str = str.substring(16);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.startsWith("<") && (d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "e", null)) != null && !com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) d17.get(".e.Content"))) {
            str = (java.lang.String) d17.get(".e.Content");
        }
        z2.k0 k0Var = new z2.k0(context, n25.a.b());
        k0Var.f(str);
        k0Var.e(null);
        k0Var.f469463g = android.app.PendingIntent.getActivity(context, 0, intent, fp.g0.a(268435456));
        android.app.Notification b17 = k0Var.b();
        b17.icon = com.tencent.mm.R.drawable.c7v;
        b17.flags = 16;
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).m(b17, true);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 4 || c01.d9.e().f70771n) {
            return;
        }
        if (i18 == -999999) {
            new com.tencent.mm.sdk.platformtools.n3().post(new aq1.w0(this));
            return;
        }
        if (i18 != -2023) {
            if (i18 != -205) {
                if (i18 == -140) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NewSyncErrorProcessor", "alpha need whitelist : [%s]", str);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        a(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.gqp));
                    } else {
                        a(str);
                    }
                    gm0.m.o();
                    return;
                }
                if (i18 != -100) {
                    if (i18 != -72 && i18 != -9 && i18 != -6 && i18 != -311 && i18 != -310) {
                        if (i18 == -17 || i18 == -16) {
                            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 0);
                            long j17 = sharedPreferences.getLong("recomended_update_ignore", -1L);
                            if (j17 == -1 || com.tencent.mm.sdk.platformtools.t8.H1(j17) >= 86400) {
                                int i19 = i18 == -17 ? 2 : 1;
                                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.LauncherUI.class);
                                intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                                intent.addFlags(67108864);
                                intent.putExtra("nofification_type", "update_nofification");
                                intent.putExtra("show_update_dialog", true);
                                intent.putExtra("update_type", i19);
                                android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 0, intent, fp.g0.a(0));
                                z2.k0 k0Var = new z2.k0(context, "reminder_channel_id");
                                k0Var.m(null);
                                k0Var.D.when = java.lang.System.currentTimeMillis();
                                k0Var.f(context.getString(com.tencent.mm.R.string.f490585z6));
                                k0Var.e(context.getString(com.tencent.mm.R.string.f490533xt));
                                k0Var.f469463g = activity;
                                android.app.Notification b17 = k0Var.b();
                                b17.flags |= 16;
                                ((com.tencent.mm.booter.notification.x) c01.d9.f()).n(34, b17, false);
                                sharedPreferences.edit().putLong("recomended_update_ignore", com.tencent.mm.sdk.platformtools.t8.i1()).commit();
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 27L, 1L, true);
                                return;
                            }
                            return;
                        }
                        if (i18 != -4 && i18 != -3) {
                            return;
                        }
                    }
                }
            }
            a(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.gqp));
            gm0.m.o();
            return;
        }
        a(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.gqn));
        gm0.m.o();
    }
}
