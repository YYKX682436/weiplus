package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

@j95.b
/* loaded from: classes8.dex */
public class p0 extends i95.w implements m33.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f222136d;

    /* renamed from: e, reason: collision with root package name */
    public final xg3.h0 f222137e;

    public p0() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f222136d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3>(a0Var) { // from class: com.tencent.mm.plugin.game.GameExternalService$9
            {
                this.f39173x3fe91575 = 1907495603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c32 = c5675xda3892c3;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5675xda3892c32.f136001g.f89352c)) {
                    return false;
                }
                am.ri riVar = c5675xda3892c32.f136001g;
                if (!riVar.f89352c.equals("wxalite7f2b757eb3c356d7b3d4291ded2f7743")) {
                    return false;
                }
                int i17 = riVar.f89350a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0.this;
                if (i17 == 0) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(p0Var.f222137e, null);
                    return false;
                }
                if (i17 != 3) {
                    return false;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().b0("gh_25d9ac85a4bc");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(p0Var.f222137e);
                mo48814x2efc64();
                return false;
            }
        };
        this.f222137e = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.q0(this);
    }

    public boolean Ai(android.content.Context context, long j17) {
        m33.b1 a17 = m33.a1.a();
        return !(a17 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.h0) a17).Vi(context) : false) || (((j17 & 8388608) > 0L ? 1 : ((j17 & 8388608) == 0L ? 0 : -1)) != 0) || ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
    }

    public int Bi(int i17) {
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                return 0;
            }
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().u1(i18);
    }

    public void Di(java.lang.String str, m33.f1 f1Var) {
        if (str == null || str.length() == 0) {
            if (f1Var != null) {
                f1Var.a(null);
                return;
            }
            return;
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String str2 = parse.getHost() + parse.getPath();
        if ((str2 == null || str2.length() == 0) && f1Var != null) {
            f1Var.a(null);
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str2), y43.i.class, new y43.l(f1Var));
    }

    public final java.lang.String Ni(java.util.Map map, java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.lang.String str3 = (java.lang.String) map.get(".appmsg." + str2);
            return str3 == null ? "" : str3;
        }
        java.lang.String str4 = (java.lang.String) map.get(".appmsg." + str + "." + str2);
        return str4 == null ? "" : str4;
    }

    public final void Ri(final android.content.Context context, final m33.k1 k1Var, final int i17, final m33.i1 i1Var) {
        if (i17 == 2) {
            n53.b.b(k1Var.f404836a, 3L, 102, 2, 0, k1Var.f404839d, k1Var.f404843h, k1Var.f404842g);
        } else {
            n53.b.b(k1Var.f404836a, 3L, 101, 2, 0, k1Var.f404839d, k1Var.f404843h, k1Var.f404842g);
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(k1Var.f404838c)) {
            if (i1Var != null) {
                i1Var.a("file not exist");
            }
        } else {
            final l53.i iVar = new l53.i(k1Var, i17);
            final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fnv), true, 3, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.mm.plugin.game.p0$$c
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(android.content.DialogInterface dialogInterface) {
                    l53.i.this.a();
                }
            });
            ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.p0$$d
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = f17;
                    m33.i1 i1Var2 = i1Var;
                    int i18 = i17;
                    m33.k1 k1Var2 = k1Var;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0.this;
                    p0Var.getClass();
                    iVar.b(context, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.w0(p0Var, u3Var, i1Var2, i18, k1Var2));
                }
            });
        }
    }

    public boolean Ui() {
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_weixin_game_jump_liteapp_android, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameExternalService", "isWxGameJumpLiteApp expt is false");
            return false;
        }
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef vj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).vj();
        if (vj6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameExternalService", "baseLibInfo is null!");
            return false;
        }
        java.lang.String str = vj6.f14334x14f51cd8;
        boolean z17 = r53.f.f474186a;
        boolean m65521x97246452 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65521x97246452(str, "1.14.0");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameExternalService", "isWxGameJumpLiteApp result:%b baselibversion:%s", java.lang.Boolean.valueOf(m65521x97246452), vj6.f14334x14f51cd8);
        return m65521x97246452;
    }

    public void Vi() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15777x5c9b169f c15777x5c9b169f;
        m53.p3 p3Var = l33.c.f396962b;
        if (p3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameExternalService", "gamelog.account , manage , jumpAccountPage error ,JumpInfo is null");
            return;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c();
        c15780xf49d6a1c.f36742x28d6c0ab = p3Var.f405495d;
        c15780xf49d6a1c.f36743xf0cd21de = p3Var.f405496e;
        m53.f3 f3Var = p3Var.f405498g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15838x34f4a78f c15838x34f4a78f = null;
        if (f3Var != null) {
            c15777x5c9b169f = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15777x5c9b169f();
            c15777x5c9b169f.f36732x368f3a = f3Var.f405209d;
            c15777x5c9b169f.f36730xd371e91 = f3Var.f405210e;
            c15777x5c9b169f.f36731x3474cd60 = f3Var.f405211f;
        } else {
            c15777x5c9b169f = null;
        }
        c15780xf49d6a1c.f36741x68a8edf8 = c15777x5c9b169f;
        m53.c6 c6Var = p3Var.f405497f;
        if (c6Var != null) {
            c15838x34f4a78f = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15838x34f4a78f();
            c15838x34f4a78f.f36918x58b82fc = c6Var.f405140d;
            c15838x34f4a78f.f36919x346425 = c6Var.f405141e;
        }
        c15780xf49d6a1c.f36745x92fd8573 = c15838x34f4a78f;
        s33.y.h(context, c15780xf49d6a1c);
    }

    public final void Zi(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("start_time", java.lang.System.currentTimeMillis());
        intent.putExtra("default_game_tab_key", str);
        intent.putExtra("key_game_url_ext_param", str2);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_open_by_sdk", true);
        bundle.putString("key_back_appid", str4);
        bundle.putString("key_open_business_type", str5);
        intent.putExtra("key_bundle_ext_data", bundle);
        intent.putExtra("key_game_profile_tab_type", "tab_type=" + str3 + "&game_tab_key=" + str4 + "&jump_from=game");
        j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "game", ".ui.GameCenterUI", intent, null);
    }

    public void aj(long j17) {
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(j17 & 8388608));
        r45.p53 p53Var = new r45.p53();
        p53Var.f464294d = 52;
        p53Var.f464295e = 1;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
    }

    public void bj(android.content.Context context, android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("imagePath");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(stringExtra), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.b1.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.r0(this, intent, context));
        } else {
            intent.putExtra(dm.i4.f66867x2a5c95c7, ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(stringExtra).f264269e);
            cj(context, intent);
        }
    }

    public final void cj(android.content.Context context, android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra(dm.i4.f66867x2a5c95c7);
        java.lang.String stringExtra2 = intent.hasExtra("gameAppId") ? intent.getStringExtra("gameAppId") : "";
        java.lang.String stringExtra3 = intent.getStringExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put(dm.i4.f66867x2a5c95c7, stringExtra);
            jSONArray.put(jSONObject2);
            jSONObject.put("imageList", jSONArray);
            jSONObject.put("appid", stringExtra2);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameExternalService", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameExternalService", java.lang.String.format("shareToGameCircle:%s, extraData=%s", jSONObject.toString(), stringExtra3));
        q80.d0 d0Var = new q80.d0();
        d0Var.D = jSONObject;
        d0Var.f442182a = "wxalitee1c0e9364cf03ce302ae64bc59cb72d5@game?lite_publishcenter";
        d0Var.f442183b = "pages/editor/index";
        d0Var.f442184c = "{\"ssid\": 154 }";
        d0Var.f442195n = 31871;
        if (stringExtra3 != null && !stringExtra3.isEmpty()) {
            try {
                com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
                c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.SCREEN_SHOT_SHARE;
                c3708xc1f46f80.f14309xf0df6fda = new org.json.JSONObject(stringExtra3);
                d0Var.f442207z = c3708xc1f46f80;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameExternalService", "openGameCenterPublishInAnyProcess: set referrerInfo with extraData");
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameExternalService", e18, "parse extraData failed", new java.lang.Object[0]);
            }
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).ok(context, d0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s0(this));
    }

    public void fj(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, m33.h1 h1Var) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.y0(this, str, str2, str3, context, str4, str5, h1Var));
    }

    public void hj(android.content.Context context, android.content.Intent intent) {
        java.lang.String str;
        if (intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Chat_User");
        int intExtra = intent.getIntExtra("chat_from_scene", 0);
        q80.d0 d0Var = new q80.d0();
        d0Var.f442182a = "wxalite7f2b757eb3c356d7b3d4291ded2f7743";
        d0Var.f442183b = "pages/index/index";
        d0Var.f442199r = true;
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(d0Var.f442182a) == null) {
            d0Var.f442200s = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameExternalService", "openWxGamePluginByLiteApp appId:" + d0Var.f442182a + " syncCheck:" + d0Var.f442200s);
        int c17 = c01.h2.c(1);
        int d17 = c01.h2.d("gh_25d9ac85a4bc", c01.e2.f118653d);
        int j76 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().j7("gh_25d9ac85a4bc");
        boolean Q = c01.e2.Q("gh_25d9ac85a4bc");
        boolean i17 = k35.m1.i();
        long longExtra = intent.getLongExtra("game_plugun_click_time", java.lang.System.currentTimeMillis());
        r01.q3.Ai().c("gh_25d9ac85a4bc", null);
        ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
        qk.o b17 = r01.z.b("gh_25d9ac85a4bc");
        java.lang.String str2 = "{}";
        if (b17 != null) {
            b17.A0();
            qk.n nVar = b17.f445834x1;
            if (nVar != null) {
                nVar.c();
                str2 = b17.f445834x1.G;
            } else {
                str2 = "{}";
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9[] Q5 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().Q5("gh_25d9ac85a4bc", 8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (Q5 != null) {
            str = stringExtra;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameExternalService", "openWxGamePluginByLiteApp getLastMsgList size:%d", java.lang.Integer.valueOf(Q5.length));
            for (int length = Q5.length - 1; length >= 0; length--) {
                if (length == 0) {
                    r53.f.f474191f = Q5[length].mo78012x3fdd41df();
                }
                arrayList.add(ij(Q5[length]));
            }
        } else {
            str = stringExtra;
        }
        int size = arrayList.size();
        int min = java.lang.Math.min(d17, size);
        int i18 = size - min;
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            hashMap.put("menuInfo", new org.json.JSONObject(str2));
        } catch (org.json.JSONException unused) {
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        java.lang.String str3 = ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().i("gh_25d9ac85a4bc", false, false)).f264269e;
        hashMap.put("totalUnreadCount", java.lang.Integer.valueOf(c17));
        hashMap.put("unreadCount", java.lang.Integer.valueOf(d17));
        hashMap.put("allMsgCount", java.lang.Integer.valueOf(j76));
        hashMap.put("mute", java.lang.Boolean.valueOf(Q));
        hashMap.put("firstScreenUnread", java.lang.Integer.valueOf(min));
        hashMap.put("firstScreenHasRead", java.lang.Integer.valueOf(i18));
        hashMap.put("messageContent", arrayList);
        hashMap.put("clickEnterTime", java.lang.Long.valueOf(longExtra));
        hashMap.put("headImgUrl", str3);
        hashMap.put("is24HourFormat", java.lang.Boolean.valueOf(i17));
        if (d17 > 0) {
            d0Var.f442184c = "redDot=true";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(hashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameExternalService", "preInjectData:%s", jSONObject.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
        sVar.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.z0(this, jSONObject));
        d0Var.f442205x = sVar;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context, d0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.a1(this, context, intExtra, str));
    }

    public java.util.Map ij(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String str;
        java.lang.String str2;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("createTime", java.lang.Long.valueOf(f9Var.mo78012x3fdd41df()));
        hashMap.put(dm.i4.f66865x76d1ec5a, java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        if (f9Var.mo78013xfb85f7b0() == 1) {
            hashMap.put("content", f9Var.j());
            return hashMap;
        }
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null || (str = v17.I2) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameExternalService", "null == content");
            return hashMap;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.p7.a(str);
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(v17.I2, "appmsg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameExternalService", "null == values");
            return hashMap;
        }
        hashMap.put("appid", Ni(d17, "", "appid"));
        hashMap.put("sdkver", Ni(d17, "", "sdkver"));
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, Ni(d17, "", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28));
        hashMap.put("des", Ni(d17, "", "des"));
        hashMap.put("url", Ni(d17, "", "url"));
        hashMap.put("thumburl", Ni(d17, "", "thumburl"));
        hashMap.put("sourceusername", Ni(d17, "", "sourceusername"));
        hashMap.put("sourcedisplayname", Ni(d17, "", "sourcedisplayname"));
        hashMap.put("showtype", java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(Ni(d17, "", "showtype"), -1)));
        hashMap.put("type", java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(Ni(d17, "", "type"), -1)));
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("framesetname", Ni(d17, "wxgamecard", "framesetname"));
        hashMap2.put("mbcarddata", Ni(d17, "wxgamecard", "mbcarddata"));
        hashMap2.put("minpkgversion", Ni(d17, "wxgamecard", "minpkgversion"));
        hashMap2.put("clientextinfo", Ni(d17, "wxgamecard", "clientextinfo"));
        hashMap.put("wxgamecard", hashMap2);
        java.util.HashMap hashMap3 = new java.util.HashMap();
        java.util.HashMap hashMap4 = new java.util.HashMap();
        hashMap4.put(dm.i4.f66875xa013b0d5, Ni(d17, "mmreader.publisher", dm.i4.f66875xa013b0d5));
        hashMap4.put("nickname", Ni(d17, "mmreader.publisher", "nickname"));
        hashMap3.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37657xc6f7cacc, hashMap4);
        java.util.HashMap hashMap5 = new java.util.HashMap();
        hashMap5.put("type", java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(Ni(d17, "mmreader.category", "type"), -1)));
        hashMap5.put("count", java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(Ni(d17, "mmreader.category", "count"), -1)));
        java.util.HashMap hashMap6 = new java.util.HashMap();
        hashMap4.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, Ni(d17, "mmreader.category.topnew", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28));
        hashMap4.put("digest", Ni(d17, "mmreader.category.topnew", "digest"));
        hashMap4.put("cover", Ni(d17, "mmreader.category.topnew", "cover"));
        hashMap5.put("topnew", hashMap6);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mmreader.category.item");
            if (i17 == 0) {
                str2 = "";
            } else {
                str2 = i17 + "";
            }
            sb6.append(str2);
            java.lang.String sb7 = sb6.toString();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) d17.get(".appmsg." + sb7))) {
                hashMap5.put("item", arrayList);
                hashMap3.put("category", hashMap5);
                hashMap.put("mmreader", hashMap3);
                return hashMap;
            }
            java.util.HashMap hashMap7 = new java.util.HashMap();
            hashMap7.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, Ni(d17, sb7, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28));
            hashMap7.put("url", Ni(d17, sb7, "url"));
            hashMap7.put("cover", Ni(d17, sb7, "cover"));
            hashMap7.put("digest", Ni(d17, sb7, "digest"));
            hashMap7.put("pub_time", Ni(d17, sb7, "pub_time"));
            hashMap7.put("itemshowtype", java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(Ni(d17, sb7, "itemshowtype"), -1)));
            arrayList.add(hashMap7);
            i17++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m33.g1 mj(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Class<m33.s1> r0 = m33.s1.class
            i95.m r0 = i95.n0.c(r0)
            m33.s1 r0 = (m33.s1) r0
            com.tencent.mm.plugin.game.s1 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) r0
            p43.b r0 = r0.Bi()
            p43.d r0 = (p43.d) r0
            r0.getClass()
            r1 = 0
            if (r5 != 0) goto L17
            goto L4d
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "SELECT * FROM GameLocalVideoInfo WHERE fileId = "
            r2.<init>(r3)
            java.lang.String r5 = d95.b0.O(r5)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            l75.k0 r0 = r0.f433296d
            r2 = 2
            android.database.Cursor r5 = r0.f(r5, r1, r2)
            if (r5 == 0) goto L4d
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L41
            p43.a r0 = new p43.a     // Catch: java.lang.Throwable -> L46
            r0.<init>()     // Catch: java.lang.Throwable -> L46
            r0.mo9015xbf5d97fd(r5)     // Catch: java.lang.Throwable -> L46
            goto L42
        L41:
            r0 = r1
        L42:
            vz5.b.a(r5, r1)
            goto L4e
        L46:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L48
        L48:
            r1 = move-exception
            vz5.b.a(r5, r0)
            throw r1
        L4d:
            r0 = r1
        L4e:
            if (r0 == 0) goto L55
            m33.g1 r5 = r4.oj(r0)
            return r5
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0.mj(java.lang.String):m33.g1");
    }

    public void nj(java.lang.String str, long j17, long j18, int i17, java.lang.String str2) {
        try {
            java.lang.String appId = new org.json.JSONObject(str).getString("appId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Report20267", "reportInfo = {" + appId + ", " + j17 + ", " + j18 + ", " + i17 + ", " + str2 + '}');
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20267, appId, null, null, null, null, null, 113110, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i17), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, nj0.a.d(str2), 113);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameExternalService", e17, "JSONException:can not get appid", new java.lang.Object[0]);
        }
    }

    public final m33.g1 oj(p43.a aVar) {
        m33.g1 g1Var = new m33.g1();
        g1Var.f404821b = aVar.f67895x28d45f97;
        g1Var.f404820a = aVar.f67902xf9dbbe9c;
        g1Var.f404823d = aVar.f67903xf1e9b966;
        g1Var.f404824e = aVar.f67898xac3be4e;
        g1Var.f404822c = aVar.f67896x453d1e07;
        g1Var.f404827h = aVar.f67905x29dd02d3;
        g1Var.f404828i = aVar.f67899x225aa2b6;
        g1Var.f404825f = aVar.f67900x4f407658;
        g1Var.f404826g = aVar.f67897x109ca377;
        g1Var.f404829j = aVar.f67901x6985322e;
        return g1Var;
    }

    public void wi() {
        i53.l4 l4Var = new i53.l4();
        java.lang.String j17 = gm0.j1.b().j();
        p43.b Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Bi();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j17);
        java.util.List J0 = ((p43.d) Bi).J0(j17);
        java.util.ArrayList arrayList = (java.util.ArrayList) J0;
        if (arrayList.isEmpty()) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p43.a aVar = (p43.a) it.next();
            if (currentTimeMillis - aVar.f67898xac3be4e > 2592000000L) {
                arrayList2.add(aVar.f67902xf9dbbe9c);
            }
        }
        if (arrayList2.isEmpty()) {
            l4Var.b(J0, 3);
            return;
        }
        ((p43.d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Bi()).z0(arrayList2);
        l4Var.b(((p43.d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Bi()).J0(j17), 3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniGameVideoProcessor", "gamelog.init , manage video , clearExpiredVideo, expiredVideoIdList size = " + arrayList2.size());
    }
}
