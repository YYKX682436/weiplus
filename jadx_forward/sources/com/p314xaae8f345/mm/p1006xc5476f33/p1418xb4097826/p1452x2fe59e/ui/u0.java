package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class u0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13936xa2396d4e f192122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192123b;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13936xa2396d4e activityC13936xa2396d4e, java.lang.String str) {
        this.f192122a = activityC13936xa2396d4e;
        this.f192123b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.nw1 m76794xd0557130;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AppPushRouteProxyUI", "[CgiGetFinderFeedComment] errType=" + fVar.f152148a + " errCode=" + fVar.f152149b);
        int i17 = fVar.f152149b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13936xa2396d4e activityC13936xa2396d4e = this.f192122a;
        if (i17 == -4200) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13936xa2396d4e.E;
            g0Var.d(23669, activityC13936xa2396d4e.k7(), "return", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "-4200", 1, 2);
            android.content.Intent intent = (android.content.Intent) activityC13936xa2396d4e.getIntent().getParcelableExtra("KEY_JUMP_HOT_INTENT");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13936xa2396d4e.c7(activityC13936xa2396d4e);
            activityC13936xa2396d4e.d7(intent);
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13936xa2396d4e.E;
            jSONObject.put("client_trigger_scene", activityC13936xa2396d4e.j7());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.String k76 = activityC13936xa2396d4e.k7();
            java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            g0Var2.d(23498, k76, 1, valueOf, r26.i0.t(jSONObject2, ",", ";", false), java.lang.Integer.valueOf(activityC13936xa2396d4e.h7()), java.lang.Integer.valueOf(activityC13936xa2396d4e.i7()), (java.lang.String) ((jz5.n) activityC13936xa2396d4e.D).mo141623x754a37bb(), (java.lang.String) ((jz5.n) activityC13936xa2396d4e.C).mo141623x754a37bb());
            r45.h51 h51Var = (r45.h51) fVar.f152151d;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) h51Var.m75936x14adae67(2);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) h51Var.m75936x14adae67(2);
            if (((c19792x256d27252 == null || (m76794xd0557130 = c19792x256d27252.m76794xd0557130()) == null) ? 0L : m76794xd0557130.m75942xfb822ef2(0)) == 0 || ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) h51Var.m75936x14adae67(2)) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.AppPushRouteProxyUI", "get liveId failed.");
                g0Var2.d(23669, activityC13936xa2396d4e.k7(), "return", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "liveId == 0L", 1, 2);
                int intValue = ((java.lang.Number) ((jz5.n) activityC13936xa2396d4e.f190748w).mo141623x754a37bb()).intValue();
                if (intValue == 4) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.addFlags(67108864);
                    intent2.putExtra("preferred_tab", 0);
                    j45.l.u(activityC13936xa2396d4e, ".ui.LauncherUI", intent2, null);
                    activityC13936xa2396d4e.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559413e4, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
                } else if (intValue == 5) {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.addFlags(67108864);
                    intent3.putExtra("preferred_tab", 2);
                    j45.l.u(activityC13936xa2396d4e, ".ui.LauncherUI", intent3, null);
                    activityC13936xa2396d4e.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559413e4, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
                }
            } else if (c19792x256d2725 != null) {
                android.content.Intent intent4 = new android.content.Intent();
                if ((activityC13936xa2396d4e.e7() & 2) != 0) {
                    c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                    long g76 = activityC13936xa2396d4e.g7();
                    ((b92.d1) zbVar).getClass();
                    vd2.a2.f517172j = g76;
                }
                if ((activityC13936xa2396d4e.e7() & 8) != 0) {
                    c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
                    long g77 = activityC13936xa2396d4e.g7();
                    ((b92.d1) zbVar2).getClass();
                    vd2.a2.f517173k = g77;
                }
                intent4.putExtra("key_enter_live_param_visitor_enter_scene", activityC13936xa2396d4e.getIntent().getIntExtra("key_enter_live_param_visitor_enter_scene", 0));
                intent4.putExtra("KEY_TASK_ID", activityC13936xa2396d4e.k7());
                intent4.putExtra("key_enter_live_param_by_pass_type", activityC13936xa2396d4e.getIntent().getIntExtra("key_enter_live_param_by_pass_type", 0));
                intent4.putExtra("key_enter_live_param_by_pass_info", activityC13936xa2396d4e.getIntent().getStringExtra("key_enter_live_param_by_pass_info"));
                intent4.putExtra("KEY_ENTER_LIVE_PARAM_APP_PUSH_TASK_ID", activityC13936xa2396d4e.getIntent().getStringExtra("KEY_ENTER_LIVE_PARAM_APP_PUSH_TASK_ID"));
                bu2.j.f106067a.n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0), bu2.i.f106064l);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13936xa2396d4e.c7(activityC13936xa2396d4e);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(c19792x256d2725);
                r45.wk0 wk0Var = new r45.wk0();
                wk0Var.set(0, this.f192123b);
                wk0Var.set(1, "");
                wk0Var.set(2, java.lang.Boolean.FALSE);
                wk0Var.set(3, -1);
                wk0Var.set(4, -1);
                wk0Var.set(5, 1);
                r45.y74 y74Var = new r45.y74();
                y74Var.set(1, 65);
                java.lang.String m76801x8010e5e4 = c19792x256d2725.m76801x8010e5e4();
                y74Var.set(2, m76801x8010e5e4 != null ? m76801x8010e5e4 : "");
                wk0Var.set(6, y74Var);
                ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                ((vd2.f1) e0Var).Ni(context, intent4, arrayList, 0, wk0Var, null);
                g0Var2.d(23669, activityC13936xa2396d4e.k7(), "getcommentdetail", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "", 1, 2);
            }
        }
        return jz5.f0.f384359a;
    }
}
