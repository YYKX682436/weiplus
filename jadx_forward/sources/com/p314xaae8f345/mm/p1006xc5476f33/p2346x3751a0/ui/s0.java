package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui;

/* loaded from: classes10.dex */
public final class s0 {

    /* renamed from: b, reason: collision with root package name */
    public static org.json.JSONObject f258516b;

    /* renamed from: c, reason: collision with root package name */
    public static org.json.JSONObject f258517c;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.s0 f258515a = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.s0();

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.C18917xbb879870 f258518d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6016x3c780059>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.voip.ui.VoipAutomatedTestSetupShell$listener$1
        {
            this.f39173x3fe91575 = -2024436119;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6016x3c780059 c6016x3c780059) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6016x3c780059 event = c6016x3c780059;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
            if (!z65.c.a()) {
                return true;
            }
            am.lu luVar = event.f136310g;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(luVar.f88807b, "wechat.shell.SET_VOIP_SETTING_CUSTOM")) {
                return true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.s0.f258515a;
            android.content.Intent intent = luVar.f88806a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(intent, "intent");
            java.lang.String stringExtra = intent.getStringExtra("config_path");
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            j35.u.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 1, new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.q0(stringExtra), new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, null, null);
            return true;
        }
    };

    public final void a() {
        int g17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_VOIP_TestEncodeParam_Int, 0);
        org.json.JSONObject jSONObject = f258516b;
        org.json.JSONObject jSONObject2 = f258517c;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getExternalFilesDir(null) + "/voip_test_result.json";
        if (g17 == 0 || jSONObject == null || jSONObject2 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipAutomatedTestSetupShell", "write report to " + str);
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("temperature", jSONObject);
        jSONObject3.put("render", jSONObject2);
        com.p314xaae8f345.mm.vfs.w6.h(str);
        com.p314xaae8f345.mm.vfs.w6.e(str);
        java.lang.String jSONObject4 = jSONObject3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
        byte[] bytes = jSONObject4.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        com.p314xaae8f345.mm.vfs.w6.S(str, bytes, 0, bytes.length);
        f258516b = null;
        f258517c = null;
    }
}
