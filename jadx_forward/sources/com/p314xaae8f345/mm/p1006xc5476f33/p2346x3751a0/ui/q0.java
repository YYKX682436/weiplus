package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui;

/* loaded from: classes.dex */
public final class q0 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258511a;

    public q0(java.lang.String str) {
        this.f258511a = str;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public final void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        boolean z17;
        boolean z18;
        boolean z19 = false;
        if (iArr[0] != 0) {
            db5.t7.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "请给存储权限");
            return;
        }
        java.lang.String str = this.f258511a;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoipAutomatedTestSetupShell", "config path doest not exist:" + str);
            return;
        }
        java.lang.String M = com.p314xaae8f345.mm.vfs.w6.M(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipAutomatedTestSetupShell", "receive test config in path:" + str + ", config:" + M);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.s0.f258515a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(M);
        try {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOIP_FACEBEAUTY_CUSTOM_STRING, new org.json.JSONObject(M).getJSONObject(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15506x7f57ec74).toString());
            z17 = true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoipAutomatedTestSetupShell", e17, "parse config error", new java.lang.Object[0]);
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.s0 s0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.s0.f258515a;
        try {
            org.json.JSONArray jSONArray = new org.json.JSONObject(M).getJSONArray("qos");
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONArray);
            c75.c.d(jSONArray, new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.r0(jSONArray2));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOIP_QOS_CUSTOM_STRING, jSONArray2.toString());
            bm5.o1.f104252a.o(bm5.h0.RepairerConfig_VOIP_TestEncodeParam_Int, 3);
            z18 = true;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoipAutomatedTestSetupShell", e18, "parse config error", new java.lang.Object[0]);
            z18 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.s0 s0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.s0.f258515a;
        try {
            java.lang.String l17 = new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2538xd14fac7c.C20337xeef26f0a().l();
            int i18 = new org.json.JSONObject(M).getInt("ilink");
            bm5.o1.f104252a.p(l17, java.lang.Integer.valueOf(i18));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipAutomatedTestSetupShell", "Saved config to repairer! (" + l17 + '=' + i18 + ')');
            z19 = true;
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoipAutomatedTestSetupShell", e19, "parse config error", new java.lang.Object[0]);
        }
        db5.t7.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "设置美颜" + z17 + ",设置qos" + z18 + ",设置ilink" + z19);
    }
}
