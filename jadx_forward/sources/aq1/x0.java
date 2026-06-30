package aq1;

/* loaded from: classes11.dex */
public class x0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public static aq1.x0 f94632d;

    public void a(java.lang.String str) {
        java.util.Map d17;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class);
        intent.putExtra("Intro_Notify", true);
        intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        intent.addFlags(67108864);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.startsWith("autoauth_errmsg_")) {
            str = str.substring(16);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.startsWith("<") && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "e", null)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) d17.get(".e.Content"))) {
            str = (java.lang.String) d17.get(".e.Content");
        }
        z2.k0 k0Var = new z2.k0(context, n25.a.b());
        k0Var.f(str);
        k0Var.e(null);
        k0Var.f550996g = android.app.PendingIntent.getActivity(context, 0, intent, fp.g0.a(268435456));
        android.app.Notification b17 = k0Var.b();
        b17.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
        b17.flags = 16;
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).m(b17, true);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 4 || c01.d9.e().f152304n) {
            return;
        }
        if (i18 == -999999) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50293x3498a0(new aq1.w0(this));
            return;
        }
        if (i18 != -2023) {
            if (i18 != -205) {
                if (i18 == -140) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewSyncErrorProcessor", "alpha need whitelist : [%s]", str);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gqp));
                    } else {
                        a(str);
                    }
                    gm0.m.o();
                    return;
                }
                if (i18 != -100) {
                    if (i18 != -72 && i18 != -9 && i18 != -6 && i18 != -311 && i18 != -310) {
                        if (i18 == -17 || i18 == -16) {
                            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 0);
                            long j17 = sharedPreferences.getLong("recomended_update_ignore", -1L);
                            if (j17 == -1 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(j17) >= 86400) {
                                int i19 = i18 == -17 ? 2 : 1;
                                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class);
                                intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
                                intent.addFlags(67108864);
                                intent.putExtra("nofification_type", "update_nofification");
                                intent.putExtra("show_update_dialog", true);
                                intent.putExtra("update_type", i19);
                                android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 0, intent, fp.g0.a(0));
                                z2.k0 k0Var = new z2.k0(context, "reminder_channel_id");
                                k0Var.m(null);
                                k0Var.D.when = java.lang.System.currentTimeMillis();
                                k0Var.f(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572118z6));
                                k0Var.e(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572066xt));
                                k0Var.f550996g = activity;
                                android.app.Notification b17 = k0Var.b();
                                b17.flags |= 16;
                                ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).n(34, b17, false);
                                sharedPreferences.edit().putLong("recomended_update_ignore", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()).commit();
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 27L, 1L, true);
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
            a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gqp));
            gm0.m.o();
            return;
        }
        a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gqn));
        gm0.m.o();
    }
}
