package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

@db5.a(m123858x6ac9171 = 19)
@gm0.a2
/* renamed from: com.tencent.mm.plugin.game.ui.GameCenterUI */
/* loaded from: classes8.dex */
public class ActivityC15948xe03d07db extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 f222251e;

    public void O6(java.lang.String str) {
        r45.sp1 sp1Var = new r45.sp1();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            sp1Var.set(0, java.lang.Long.valueOf(jSONObject.optLong("objectId")));
            sp1Var.set(1, java.lang.Long.valueOf(jSONObject.optLong("liveId")));
            sp1Var.set(2, jSONObject.optString(dm.i4.f66875xa013b0d5));
            sp1Var.set(4, jSONObject.optString("objectNonceId"));
            sp1Var.set(7, jSONObject.optString("streamUrl"));
            sp1Var.set(3, jSONObject.optString("nickname"));
            sp1Var.set(6, jSONObject.optString("coverUrl"));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameCenterUI", e17, "", new java.lang.Object[0]);
        }
        java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(9, 2, 65);
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        wk0Var.set(0, Gj);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 Mk = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Mk(sp1Var);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(Mk);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("noticeId", this.f222251e.T2);
        hashMap.put("msgId", this.f222251e.f68458xd54c6aa5);
        hashMap.put("extData", this.f222251e.U2);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("gameReport", hashMap);
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameCenterUI", e18, "", new java.lang.Object[0]);
        }
        intent.putExtra("key_chnl_extra", jSONObject2.toString());
        ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(getBaseContext(), intent, arrayList, 0, wk0Var, null);
    }

    public final void P6(boolean z17) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d0.d(this, getIntent())) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.ActivityC16018xae0b4e2b.class);
        android.os.Bundle extras = getIntent().getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameCenterUI", "jumpNativeIndex", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/game/ui/GameCenterUI", "jumpNativeIndex", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (z17) {
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559348c9, com.p314xaae8f345.mm.R.C30854x2dc211.f559348c9);
        } else {
            overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292611a, com.p314xaae8f345.mm.ui.uc.f292612b);
        }
        if (getIntent().getBooleanExtra("from_find_more_friend", false)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d0.g(6, false, null, 1001);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(848L, 4L, 1L, false);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 m17;
        super.onCreate(bundle);
        l33.c.c();
        getIntent().putExtra("gamecenterui_createtime", java.lang.System.currentTimeMillis());
        java.lang.Long l17 = (java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_DISCOVERY_ENTRANCE_MSGID_LONG_SYNC, 0L);
        if (l17.longValue() != 0) {
            this.f222251e = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(l17.longValue());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCenterUI", "gamelog.activity, GameCenterUI, onCreate, time: " + java.lang.System.currentTimeMillis());
        if (getIntent().getIntExtra("game_report_from_scene", 0) == 901) {
            r53.d dVar = r53.b.f474173a;
            r53.c cVar = dVar.f474182c;
            cVar.f474175a = 0L;
            cVar.f474176b = 0L;
            cVar.f474177c = 0L;
            cVar.f474178d = 0L;
            cVar.f474175a = java.lang.System.currentTimeMillis();
            dVar.f474182c.f474178d = java.lang.System.currentTimeMillis();
        }
        if (getIntent().getBooleanExtra("game_check_float", false)) {
            int intExtra = getIntent().getIntExtra("game_sourceScene", 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 l18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().l();
            if (l18 != null) {
                l18.t0();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l18.f221824p2.f221856a)) {
                    r53.f.r(getBaseContext(), l18, "game_center_h5_floatlayer");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d0.f(l18, intExtra, 1);
            finish();
            return;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("switch_country_no_anim", false);
        m53.e1 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.g();
        if (g17 == null) {
            P6(booleanExtra);
            return;
        }
        int i17 = g17.f405175d;
        if (i17 == 0) {
            P6(booleanExtra);
            return;
        }
        if (i17 != 1) {
            if (i17 != 3) {
                if (i17 != 5) {
                    P6(booleanExtra);
                    return;
                } else {
                    P6(booleanExtra);
                    return;
                }
            }
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15955xbd627646.class);
            android.os.Bundle extras = getIntent().getExtras();
            if (extras != null) {
                intent.putExtras(extras);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameCenterUI", "jumpToDownloadGuidanceIndex", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/game/ui/GameCenterUI", "jumpToDownloadGuidanceIndex", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (booleanExtra) {
                overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559348c9, com.p314xaae8f345.mm.R.C30854x2dc211.f559348c9);
            } else {
                overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292611a, com.p314xaae8f345.mm.ui.uc.f292612b);
            }
            if (getIntent().getBooleanExtra("from_find_more_friend", false)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d0.g(6, false, null, 1002);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(848L, 6L, 1L, false);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17.f405176e)) {
            P6(booleanExtra);
            return;
        }
        java.lang.String str = g17.f405176e;
        getIntent().putExtra("rawUrl", str);
        if (((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Bi(e42.d0.game_luggage, true)) {
            android.content.Intent intent2 = getIntent();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && intent2 != null) {
                boolean booleanExtra2 = intent2.getBooleanExtra("from_find_more_friend", false);
                int intExtra2 = intent2.getIntExtra("game_report_from_scene", 0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 k17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().k();
                java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d0.a(str, k17, intent2, true);
                intent2.putExtra("rawUrl", a17);
                intent2.putExtra("from_find_more_friend", true);
                if (booleanExtra2) {
                    if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Bi().b() && (m17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().m()) != null) {
                        m17.t0();
                        if (m17.S2 == 107) {
                            intent2.putExtra("from_download_floagt_ball_shutdown_entrance", true);
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d0.c(intent2, "game_center_entrance", true, k17, intExtra2, a17);
                    r53.f.F(intent2, this);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d0.g(7, true, a17, intExtra2);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d0.c(intent2, "game_center_entrance", false, k17, intExtra2, a17);
                    r53.f.F(intent2, this);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(848L, 3L, 1L, false);
            g0Var.mo68477x336bdfd8(848L, 9L, 1L, false);
        } else {
            android.content.Intent intent3 = getIntent();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && intent3 != null) {
                boolean booleanExtra3 = intent3.getBooleanExtra("from_find_more_friend", false);
                int intExtra3 = intent3.getIntExtra("game_report_from_scene", 0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 k18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().k();
                java.lang.String a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d0.a(str, k18, intent3, true);
                intent3.putExtra("rawUrl", a18);
                if (booleanExtra3) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d0.e(this, intent3, "game_center_entrance", true, k18, intExtra3);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d0.g(7, true, a18, intExtra3);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d0.e(this, intent3, "game_center_entrance", false, k18, intExtra3);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(848L, 3L, 1L, false);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("game_center_pref", 0).edit().putLong("game_index_last_visit_time", java.lang.System.currentTimeMillis()).commit();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        m53.x0 x0Var;
        java.lang.String b17;
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1755xc50a8b8b.C15936xa915f9d1 c15936xa915f9d1 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220914a;
        if (c15936xa915f9d1 != null) {
            x0Var = c15936xa915f9d1.f36951xa1960e1e;
            if (x0Var != null) {
                java.util.LinkedList linkedList = x0Var.f405700d;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameConfigManager", "getGameDyeReportInfo gameDyeReportInfoControl.PackageInfoList.size = :%d", java.lang.Integer.valueOf(linkedList.size()));
                }
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.s();
            x0Var = null;
        }
        if (x0Var != null) {
            java.util.LinkedList linkedList2 = x0Var.f405700d;
            if (!(linkedList2 == null || linkedList2.isEmpty())) {
                ((ku5.t0) ku5.t0.f394148d).g(new r53.b0(x0Var));
            }
        }
        if (isFinishing()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var = this.f222251e;
        if (e1Var != null) {
            e1Var.t0();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.d.c()) {
                try {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f222251e.f221812d2.f221948f)) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(this.f222251e.f221812d2.f221948f);
                        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.d.b() && !this.f222251e.f68464xfc4f7384 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jSONObject.optString("objectNonceId"))) {
                            O6(this.f222251e.f221812d2.f221948f);
                            finish();
                            return;
                        }
                    }
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameCenterUI", e17, "", new java.lang.Object[0]);
                }
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.k() != null && com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.k().f405512h) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.q0 q0Var = this.f222251e.f221812d2;
                if (q0Var.f221950h == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q0Var.f221949g)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r0 r0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r0();
                    r0Var.f221962d = 5;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var2 = this.f222251e;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var2.f221812d2.f221949g)) {
                        b17 = null;
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.q0 q0Var2 = e1Var2.f221812d2;
                        b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d0.b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d0.b(q0Var2.f221949g, "localMsgId=" + e1Var2.f68468x297eb4f7), "gameMsgId=" + e1Var2.f68458xd54c6aa5);
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var2.V2)) {
                            try {
                                b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d0.b(b17, "business_data=" + java.net.URLEncoder.encode(e1Var2.V2, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
                            } catch (java.io.UnsupportedEncodingException unused) {
                            }
                        }
                        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.k() != null && com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.k().f405512h && q0Var2.f221950h == 1) {
                            b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d0.b(b17, "fromReddotExternPage=1");
                        }
                    }
                    r0Var.f221963e = b17;
                    r0Var.f36743xf0cd21de = b17;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("preInjectData", this.f222251e.N2.f221889a);
                    } catch (org.json.JSONException e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCenterUI", e18.getMessage());
                    }
                    r53.f.s(this, r0Var, "", jSONObject2.toString(), null);
                    overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292611a, com.p314xaae8f345.mm.ui.uc.f292612b);
                }
            }
        }
        finish();
    }
}
