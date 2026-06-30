package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class f2 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openGameLifeChatroom";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenGameLifeChatroom", "invokeInMM");
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_params", null);
            return;
        }
        java.lang.String optString = e17.optString("chatroom_name");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            q5Var.a("invalid_params", null);
            return;
        }
        java.lang.String optString2 = e17.optString("chatroom_icon");
        boolean optBoolean = e17.optBoolean("is_auto_join", false);
        long optLong = e17.optLong("sourceid", 0L);
        long optLong2 = e17.optLong(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f, 0L);
        boolean optBoolean2 = e17.optBoolean("backToRoomList", false);
        int optInt = e17.optInt("targetChannelId", -1);
        long optLong3 = e17.optLong("targetSeq", -1L);
        boolean optBoolean3 = e17.optBoolean("is_real_time", false);
        java.lang.String optString3 = e17.optString("extInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenGameLifeChatroom", "chatRoomName:%s, iconUrl:%s, isAutoJoin:%b, sourceId:%d, ssid:%d, backToRoomList:%b, targetChannelId:%s, targetSeq:%s", optString, optString2, java.lang.Boolean.valueOf(optBoolean), java.lang.Long.valueOf(optLong), java.lang.Long.valueOf(optLong2), java.lang.Boolean.valueOf(optBoolean2), java.lang.Integer.valueOf(optInt), java.lang.Long.valueOf(optLong3));
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).m78545xde66c1f2(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.e2(this, context, q5Var));
        t33.e eVar = new t33.e(optString, optString2, optLong2, optLong, optBoolean, null);
        eVar.f496947j = 3345;
        eVar.f496943f = optBoolean2;
        eVar.f496946i = optLong3;
        eVar.f496945h = optInt;
        eVar.f496948k = optBoolean3;
        eVar.f496949l = optString3;
        ((s33.j0) ((t33.f) i95.n0.c(t33.f.class))).getClass();
        s33.n.f484063b = true;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.ActivityC15843x1aee8bd9.b7(context, eVar, null, null, true)) {
            return;
        }
        q5Var.a(null, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
