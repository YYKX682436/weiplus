package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public abstract class ig extends k34.a {
    @Override // k34.f
    public void c(android.content.Context context, android.content.Intent intent) {
        boolean z17 = android.os.Build.VERSION.SDK_INT >= 26;
        if (!h(intent, z17)) {
            l(context, intent, false);
        } else {
            l(context, intent, true);
            k(context, intent, z17);
        }
    }

    public boolean h(android.content.Intent intent, boolean z17) {
        java.lang.String Ai;
        java.lang.String Ai2;
        if (z17) {
            Ai = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Bi(com.tencent.mm.sdk.platformtools.c2.l(intent, dm.i4.COL_ID));
            Ai2 = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Bi(com.tencent.mm.sdk.platformtools.c2.l(intent, "ext_info"));
        } else {
            Ai = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Ai(com.tencent.mm.sdk.platformtools.c2.l(intent, dm.i4.COL_ID));
            Ai2 = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Ai(com.tencent.mm.sdk.platformtools.c2.l(intent, "ext_info"));
        }
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(intent, "token");
        int g17 = com.tencent.mm.sdk.platformtools.c2.g(intent, "ext_info_1", 0);
        if (android.text.TextUtils.isEmpty(Ai) || android.text.TextUtils.isEmpty(Ai2) || android.text.TextUtils.isEmpty(l17)) {
            com.tencent.mars.xlog.Log.e("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, username or appId or token is null or nil.");
            return false;
        }
        if (!k01.o.a(Ai)) {
            com.tencent.mars.xlog.Log.e("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, username %s invalid ", Ai);
            jx3.f.INSTANCE.idkeyStat(647L, 1L, 1L, false);
            return false;
        }
        if (!l17.equals(((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).wi(Ai2, "" + gm0.j1.b().h()))) {
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("app_brand_global_sp", 0);
            if (sharedPreferences == null) {
                com.tencent.mars.xlog.Log.w("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, sp is null.");
                return false;
            }
            java.util.Set<java.lang.String> stringSet = sharedPreferences.getStringSet("uin_set", new java.util.HashSet());
            if (stringSet == null || stringSet.isEmpty()) {
                com.tencent.mars.xlog.Log.w("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, uin set is null or nil.");
                return false;
            }
            java.util.HashSet hashSet = new java.util.HashSet(stringSet);
            java.util.HashSet hashSet2 = new java.util.HashSet();
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                hashSet2.add(((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).wi(Ai2, (java.lang.String) it.next()));
            }
            if (!hashSet2.contains(l17)) {
                com.tencent.mars.xlog.Log.e("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, illegal token(%s).", l17);
                return false;
            }
        }
        if (z65.c.a() || g17 != 1) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MiroMsg.WxaShortcutEntry", "can not open testing WeApp in released WeChat.");
        return false;
    }

    public abstract int i(android.content.Intent intent);

    public void k(android.content.Context context, android.content.Intent intent, boolean z17) {
        java.lang.String Ai;
        java.lang.String Ai2;
        if (z17) {
            Ai = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Bi(com.tencent.mm.sdk.platformtools.c2.l(intent, dm.i4.COL_ID));
            Ai2 = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Bi(com.tencent.mm.sdk.platformtools.c2.l(intent, "ext_info"));
        } else {
            Ai = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Ai(com.tencent.mm.sdk.platformtools.c2.l(intent, dm.i4.COL_ID));
            Ai2 = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Ai(com.tencent.mm.sdk.platformtools.c2.l(intent, "ext_info"));
        }
        int g17 = com.tencent.mm.sdk.platformtools.c2.g(intent, "ext_info_1", 0);
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7473h = Ai2;
        nxVar.f7466a = Ai;
        nxVar.f7468c = g17;
        nxVar.f7469d = i(intent);
        nxVar.f7478m = true;
        nxVar.f7471f = context;
        nxVar.f7479n = false;
        startAppBrandUIFromOuterEvent.e();
        if (startAppBrandUIFromOuterEvent.f54858h.f7581a) {
            com.tencent.mars.xlog.Log.i("MiroMsg.WxaShortcutEntry", "open wxa with id : %s", Ai);
        } else if (g17 == 1) {
            dp.a.makeText(context, com.tencent.mm.R.string.f490089kl, 0).show();
        } else if (g17 == 2) {
            dp.a.makeText(context, com.tencent.mm.R.string.f490207ny, 0).show();
        }
    }

    public abstract void l(android.content.Context context, android.content.Intent intent, boolean z17);
}
