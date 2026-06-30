package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public final class c0 extends k34.a implements k34.g {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f264347d = "";

    @Override // k34.f
    public void c(android.content.Context context, android.content.Intent intent) {
        java.lang.String Ai = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, dm.i4.f66865x76d1ec5a));
        java.lang.String Ai2 = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "ext_info"));
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "token");
        if (android.text.TextUtils.isEmpty(Ai) || android.text.TextUtils.isEmpty(Ai2) || android.text.TextUtils.isEmpty(l17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewShortcutEntry", "jump to webview  failed, username or appId or token is null or nil.");
            return;
        }
        if (!l17.equals(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j0.d(Ai2, "" + gm0.j1.b().h()))) {
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("app_brand_global_sp", 0);
            if (sharedPreferences == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewShortcutEntry", "jump to webview failed, sp is null.");
                return;
            }
            java.util.Set<java.lang.String> stringSet = sharedPreferences.getStringSet("uin_set", new java.util.HashSet());
            if (stringSet == null || stringSet.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewShortcutEntry", "jump to webview failed, uin set is null or nil.");
                return;
            }
            java.util.HashSet hashSet = new java.util.HashSet(stringSet);
            java.util.HashSet hashSet2 = new java.util.HashSet();
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                hashSet2.add(((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).wi(Ai2, (java.lang.String) it.next()));
            }
            if (!hashSet2.contains(l17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewShortcutEntry", "jump to webview failed, illegal token(%s).", l17);
                dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lay), 1).show();
                return;
            }
        }
        intent.putExtra("type", 0);
        intent.putExtra(dm.i4.f66865x76d1ec5a, "");
        java.lang.String str = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxy) + "/cgi-bin/h5/static/gameloading/index.html?wegame_ssid=25&appid=" + Ai2;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f264347d)) {
            str = str + "&" + f264347d;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("rawUrl", str);
        intent2.putExtra("from_shortcut", true);
        intent2.putExtra("game_hv_menu_appid", Ai2);
        intent2.addFlags(67108864);
        intent2.addFlags(268435456);
        j45.l.j(context, "webview", ".ui.tools.game.H5GameWebViewUI", intent2, null);
        r01.q3.Ai().c(Ai, null);
        java.lang.String l18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "digest");
        if (android.text.TextUtils.isEmpty(l18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewShortcutEntry", "digest is null");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(Ai, true);
        if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.f2())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewShortcutEntry", "no need update, displayName is null");
            return;
        }
        java.lang.String f27 = n17.f2();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(Ai);
        if (n07 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n07.d())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewShortcutEntry", "no need update, imgFlag is null");
            return;
        }
        if (l18.equals(kk.k.g((f27 + n07.d()).getBytes()))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewShortcutEntry", "no need update, digest is same");
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p943x351df9c2.g.a(Ai);
        if (a17 == null || a17.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewShortcutEntry", "icon is not downloaded, next time update");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewShortcutEntry", "update shortcut, displayName = %s", f27);
        java.lang.String Ai3 = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "ext_info_1"));
        if (context == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ai3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewShrotcutManager", "remove failed, invalid params");
        }
        android.content.Intent c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j0.c(context, Ai, Ai2, Ai3, null, false);
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewShrotcutManager", "remove failed, intent is null");
        } else {
            ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
            xp1.c.i(context, c17);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.b0(this, Ai, Ai2), 1000L);
    }
}
