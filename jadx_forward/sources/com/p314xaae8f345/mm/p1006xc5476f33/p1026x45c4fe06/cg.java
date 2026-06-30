package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class cg extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ig implements k34.g {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ig, k34.f
    public void c(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(443L, 2L, 1L, false);
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo78578x8b18f126(0);
        }
        super.c(context, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ig
    public int i(android.content.Intent intent) {
        return 1023;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ig
    public void k(android.content.Context context, android.content.Intent intent, boolean z17) {
        super.k(context, intent, z17);
        java.lang.String Bi = z17 ? ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Bi(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, dm.i4.f66865x76d1ec5a)) : ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, dm.i4.f66865x76d1ec5a));
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(intent, "ext_info_1", 0);
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "digest");
        if (!android.text.TextUtils.isEmpty(l17)) {
            try {
                k91.v5 Bi2 = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(Bi);
                if (Bi2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.WxaLauncherShortcutEntry", "no such WeApp(%s)", Bi);
                    return;
                }
                if (!l17.equals(kk.k.g(("" + Bi2.f68913x21f9b213 + Bi2.f68917xa22f9ad1 + Bi2.f68910xea1bd3d4 + Bi2.f68907x6b8edeb4).getBytes()))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.WxaLauncherShortcutEntry", "update shortcut for wxa(%s)", Bi);
                    if (context == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandShortcutManager", "remove fail, context or username is null.");
                    } else if (intent == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandShortcutManager", "remove fail, intent is null");
                    } else {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5278x58efad5a c5278x58efad5a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5278x58efad5a();
                        c5278x58efad5a.f135600g.f88165a = Bi;
                        c5278x58efad5a.e();
                        am.g3 g3Var = c5278x58efad5a.f135601h;
                        if (g3Var.f88269b == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandShortcutManager", "no such WeApp(%s)", Bi);
                        } else {
                            java.lang.String str = android.text.TextUtils.isEmpty(g3Var.f88268a) ? Bi : g3Var.f88268a;
                            android.content.Intent intent2 = new android.content.Intent("com.android.launcher.action.UNINSTALL_SHORTCUT");
                            intent2.putExtra("android.intent.extra.shortcut.NAME", str);
                            intent2.putExtra("duplicate", false);
                            intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
                            ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
                            xp1.c.i(context, intent2);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandShortcutManager", "remove shortcut %s", Bi);
                        }
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.bg(this, Bi2, context, g17, z17), 1000L);
                }
            } catch (java.lang.NullPointerException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.WxaLauncherShortcutEntry", "query attrs with username[%s], e=%s", Bi, e17);
                return;
            }
        }
        intent.putExtra("type", 0);
        intent.putExtra(dm.i4.f66865x76d1ec5a, "");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ig
    public void l(android.content.Context context, android.content.Intent intent, boolean z17) {
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(443L, 3L, 1L, false);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            java.lang.String Bi = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Bi(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, dm.i4.f66865x76d1ec5a));
            if (k01.o.a(Bi)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.WxaLauncherShortcutEntry", "jump to Wxa with androidId decode failed, username %s invalid , try to decode with imei", Bi);
            if (k01.o.a(((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, dm.i4.f66865x76d1ec5a)))) {
                k(context, intent, false);
            } else {
                dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lbh), 1).show();
            }
        }
    }
}
