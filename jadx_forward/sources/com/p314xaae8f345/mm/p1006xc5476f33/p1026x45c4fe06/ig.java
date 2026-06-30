package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

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
            Ai = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Bi(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, dm.i4.f66865x76d1ec5a));
            Ai2 = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Bi(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "ext_info"));
        } else {
            Ai = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, dm.i4.f66865x76d1ec5a));
            Ai2 = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "ext_info"));
        }
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "token");
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(intent, "ext_info_1", 0);
        if (android.text.TextUtils.isEmpty(Ai) || android.text.TextUtils.isEmpty(Ai2) || android.text.TextUtils.isEmpty(l17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, username or appId or token is null or nil.");
            return false;
        }
        if (!k01.o.a(Ai)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, username %s invalid ", Ai);
            jx3.f.INSTANCE.mo68477x336bdfd8(647L, 1L, 1L, false);
            return false;
        }
        if (!l17.equals(((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).wi(Ai2, "" + gm0.j1.b().h()))) {
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("app_brand_global_sp", 0);
            if (sharedPreferences == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, sp is null.");
                return false;
            }
            java.util.Set<java.lang.String> stringSet = sharedPreferences.getStringSet("uin_set", new java.util.HashSet());
            if (stringSet == null || stringSet.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, uin set is null or nil.");
                return false;
            }
            java.util.HashSet hashSet = new java.util.HashSet(stringSet);
            java.util.HashSet hashSet2 = new java.util.HashSet();
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                hashSet2.add(((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).wi(Ai2, (java.lang.String) it.next()));
            }
            if (!hashSet2.contains(l17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, illegal token(%s).", l17);
                return false;
            }
        }
        if (z65.c.a() || g17 != 1) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.WxaShortcutEntry", "can not open testing WeApp in released WeChat.");
        return false;
    }

    public abstract int i(android.content.Intent intent);

    public void k(android.content.Context context, android.content.Intent intent, boolean z17) {
        java.lang.String Ai;
        java.lang.String Ai2;
        if (z17) {
            Ai = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Bi(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, dm.i4.f66865x76d1ec5a));
            Ai2 = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Bi(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "ext_info"));
        } else {
            Ai = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, dm.i4.f66865x76d1ec5a));
            Ai2 = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "ext_info"));
        }
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(intent, "ext_info_1", 0);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
        am.nx nxVar = c6113xa3727625.f136390g;
        nxVar.f89006h = Ai2;
        nxVar.f88999a = Ai;
        nxVar.f89001c = g17;
        nxVar.f89002d = i(intent);
        nxVar.f89011m = true;
        nxVar.f89004f = context;
        nxVar.f89012n = false;
        c6113xa3727625.e();
        if (c6113xa3727625.f136391h.f89114a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.WxaShortcutEntry", "open wxa with id : %s", Ai);
        } else if (g17 == 1) {
            dp.a.m125853x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571622kl, 0).show();
        } else if (g17 == 2) {
            dp.a.m125853x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571740ny, 0).show();
        }
    }

    public abstract void l(android.content.Context context, android.content.Intent intent, boolean z17);
}
