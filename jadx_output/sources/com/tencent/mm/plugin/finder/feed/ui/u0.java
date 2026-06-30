package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class u0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI f110589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110590b;

    public u0(com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI finderAppPushRouteProxyUI, java.lang.String str) {
        this.f110589a = finderAppPushRouteProxyUI;
        this.f110590b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.nw1 liveInfo;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("Finder.AppPushRouteProxyUI", "[CgiGetFinderFeedComment] errType=" + fVar.f70615a + " errCode=" + fVar.f70616b);
        int i17 = fVar.f70616b;
        com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI finderAppPushRouteProxyUI = this.f110589a;
        if (i17 == -4200) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            int i18 = com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI.E;
            g0Var.d(23669, finderAppPushRouteProxyUI.k7(), "return", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "-4200", 1, 2);
            android.content.Intent intent = (android.content.Intent) finderAppPushRouteProxyUI.getIntent().getParcelableExtra("KEY_JUMP_HOT_INTENT");
            com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI.c7(finderAppPushRouteProxyUI);
            finderAppPushRouteProxyUI.d7(intent);
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            int i19 = com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI.E;
            jSONObject.put("client_trigger_scene", finderAppPushRouteProxyUI.j7());
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.String k76 = finderAppPushRouteProxyUI.k7();
            java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            g0Var2.d(23498, k76, 1, valueOf, r26.i0.t(jSONObject2, ",", ";", false), java.lang.Integer.valueOf(finderAppPushRouteProxyUI.h7()), java.lang.Integer.valueOf(finderAppPushRouteProxyUI.i7()), (java.lang.String) ((jz5.n) finderAppPushRouteProxyUI.D).getValue(), (java.lang.String) ((jz5.n) finderAppPushRouteProxyUI.C).getValue());
            r45.h51 h51Var = (r45.h51) fVar.f70618d;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) h51Var.getCustom(2);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) h51Var.getCustom(2);
            if (((finderObject2 == null || (liveInfo = finderObject2.getLiveInfo()) == null) ? 0L : liveInfo.getLong(0)) == 0 || ((com.tencent.mm.protocal.protobuf.FinderObject) h51Var.getCustom(2)) == null) {
                com.tencent.mars.xlog.Log.e("Finder.AppPushRouteProxyUI", "get liveId failed.");
                g0Var2.d(23669, finderAppPushRouteProxyUI.k7(), "return", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "liveId == 0L", 1, 2);
                int intValue = ((java.lang.Number) ((jz5.n) finderAppPushRouteProxyUI.f109215w).getValue()).intValue();
                if (intValue == 4) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.addFlags(67108864);
                    intent2.putExtra("preferred_tab", 0);
                    j45.l.u(finderAppPushRouteProxyUI, ".ui.LauncherUI", intent2, null);
                    finderAppPushRouteProxyUI.overridePendingTransition(com.tencent.mm.R.anim.f477880e4, com.tencent.mm.R.anim.f477889ed);
                } else if (intValue == 5) {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.addFlags(67108864);
                    intent3.putExtra("preferred_tab", 2);
                    j45.l.u(finderAppPushRouteProxyUI, ".ui.LauncherUI", intent3, null);
                    finderAppPushRouteProxyUI.overridePendingTransition(com.tencent.mm.R.anim.f477880e4, com.tencent.mm.R.anim.f477889ed);
                }
            } else if (finderObject != null) {
                android.content.Intent intent4 = new android.content.Intent();
                if ((finderAppPushRouteProxyUI.e7() & 2) != 0) {
                    c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                    long g76 = finderAppPushRouteProxyUI.g7();
                    ((b92.d1) zbVar).getClass();
                    vd2.a2.f435639j = g76;
                }
                if ((finderAppPushRouteProxyUI.e7() & 8) != 0) {
                    c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
                    long g77 = finderAppPushRouteProxyUI.g7();
                    ((b92.d1) zbVar2).getClass();
                    vd2.a2.f435640k = g77;
                }
                intent4.putExtra("key_enter_live_param_visitor_enter_scene", finderAppPushRouteProxyUI.getIntent().getIntExtra("key_enter_live_param_visitor_enter_scene", 0));
                intent4.putExtra("KEY_TASK_ID", finderAppPushRouteProxyUI.k7());
                intent4.putExtra("key_enter_live_param_by_pass_type", finderAppPushRouteProxyUI.getIntent().getIntExtra("key_enter_live_param_by_pass_type", 0));
                intent4.putExtra("key_enter_live_param_by_pass_info", finderAppPushRouteProxyUI.getIntent().getStringExtra("key_enter_live_param_by_pass_info"));
                intent4.putExtra("KEY_ENTER_LIVE_PARAM_APP_PUSH_TASK_ID", finderAppPushRouteProxyUI.getIntent().getStringExtra("KEY_ENTER_LIVE_PARAM_APP_PUSH_TASK_ID"));
                bu2.j.f24534a.n(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0), bu2.i.f24531l);
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI.c7(finderAppPushRouteProxyUI);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(finderObject);
                r45.wk0 wk0Var = new r45.wk0();
                wk0Var.set(0, this.f110590b);
                wk0Var.set(1, "");
                wk0Var.set(2, java.lang.Boolean.FALSE);
                wk0Var.set(3, -1);
                wk0Var.set(4, -1);
                wk0Var.set(5, 1);
                r45.y74 y74Var = new r45.y74();
                y74Var.set(1, 65);
                java.lang.String nickname = finderObject.getNickname();
                y74Var.set(2, nickname != null ? nickname : "");
                wk0Var.set(6, y74Var);
                ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                ((vd2.f1) e0Var).Ni(context, intent4, arrayList, 0, wk0Var, null);
                g0Var2.d(23669, finderAppPushRouteProxyUI.k7(), "getcommentdetail", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "", 1, 2);
            }
        }
        return jz5.f0.f302826a;
    }
}
