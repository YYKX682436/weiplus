package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class cg extends com.tencent.mm.plugin.appbrand.ig implements k34.g {
    @Override // com.tencent.mm.plugin.appbrand.ig, k34.f
    public void c(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(443L, 2L, 1L, false);
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) context).setNavigationbarColor(0);
        }
        super.c(context, intent);
    }

    @Override // com.tencent.mm.plugin.appbrand.ig
    public int i(android.content.Intent intent) {
        return 1023;
    }

    @Override // com.tencent.mm.plugin.appbrand.ig
    public void k(android.content.Context context, android.content.Intent intent, boolean z17) {
        super.k(context, intent, z17);
        java.lang.String Bi = z17 ? ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Bi(com.tencent.mm.sdk.platformtools.c2.l(intent, dm.i4.COL_ID)) : ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Ai(com.tencent.mm.sdk.platformtools.c2.l(intent, dm.i4.COL_ID));
        int g17 = com.tencent.mm.sdk.platformtools.c2.g(intent, "ext_info_1", 0);
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(intent, "digest");
        if (!android.text.TextUtils.isEmpty(l17)) {
            try {
                k91.v5 Bi2 = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(Bi);
                if (Bi2 == null) {
                    com.tencent.mars.xlog.Log.e("MiroMsg.WxaLauncherShortcutEntry", "no such WeApp(%s)", Bi);
                    return;
                }
                if (!l17.equals(kk.k.g(("" + Bi2.field_nickname + Bi2.field_roundedSquareIconURL + Bi2.field_brandIconURL + Bi2.field_bigHeadURL).getBytes()))) {
                    com.tencent.mars.xlog.Log.i("MiroMsg.WxaLauncherShortcutEntry", "update shortcut for wxa(%s)", Bi);
                    if (context == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandShortcutManager", "remove fail, context or username is null.");
                    } else if (intent == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandShortcutManager", "remove fail, intent is null");
                    } else {
                        com.tencent.mm.autogen.events.CollectAppBrandDesktopShortcutInfoEvent collectAppBrandDesktopShortcutInfoEvent = new com.tencent.mm.autogen.events.CollectAppBrandDesktopShortcutInfoEvent();
                        collectAppBrandDesktopShortcutInfoEvent.f54067g.f6632a = Bi;
                        collectAppBrandDesktopShortcutInfoEvent.e();
                        am.g3 g3Var = collectAppBrandDesktopShortcutInfoEvent.f54068h;
                        if (g3Var.f6736b == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandShortcutManager", "no such WeApp(%s)", Bi);
                        } else {
                            java.lang.String str = android.text.TextUtils.isEmpty(g3Var.f6735a) ? Bi : g3Var.f6735a;
                            android.content.Intent intent2 = new android.content.Intent("com.android.launcher.action.UNINSTALL_SHORTCUT");
                            intent2.putExtra("android.intent.extra.shortcut.NAME", str);
                            intent2.putExtra("duplicate", false);
                            intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
                            ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
                            xp1.c.i(context, intent2);
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandShortcutManager", "remove shortcut %s", Bi);
                        }
                    }
                    com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.appbrand.bg(this, Bi2, context, g17, z17), 1000L);
                }
            } catch (java.lang.NullPointerException e17) {
                com.tencent.mars.xlog.Log.e("MiroMsg.WxaLauncherShortcutEntry", "query attrs with username[%s], e=%s", Bi, e17);
                return;
            }
        }
        intent.putExtra("type", 0);
        intent.putExtra(dm.i4.COL_ID, "");
    }

    @Override // com.tencent.mm.plugin.appbrand.ig
    public void l(android.content.Context context, android.content.Intent intent, boolean z17) {
        if (z17) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(443L, 3L, 1L, false);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            java.lang.String Bi = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Bi(com.tencent.mm.sdk.platformtools.c2.l(intent, dm.i4.COL_ID));
            if (k01.o.a(Bi)) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MiroMsg.WxaLauncherShortcutEntry", "jump to Wxa with androidId decode failed, username %s invalid , try to decode with imei", Bi);
            if (k01.o.a(((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Ai(com.tencent.mm.sdk.platformtools.c2.l(intent, dm.i4.COL_ID)))) {
                k(context, intent, false);
            } else {
                dp.a.makeText(context, context.getString(com.tencent.mm.R.string.lbh), 1).show();
            }
        }
    }
}
