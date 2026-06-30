package rg0;

/* loaded from: classes9.dex */
public final class z extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.String f476736d;

    public z() {
        super(0);
        this.f476736d = "{}";
    }

    public final void b(boolean z17, boolean z18, java.lang.String str) {
        try {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "FinishUUID") && z18 && z17) {
                ((pg0.l3) ((qg0.e0) i95.n0.c(qg0.e0.class))).Ui();
            }
            java.lang.String valueOf = java.lang.String.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("pay_usecase").getString("currentstate", ""));
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_paysec_exec_secliteapp, true)) {
                rg0.t tVar = rg0.t.f476724a;
                if (tVar.g() && tVar.h() && rg0.d0.f476701a.b(valueOf)) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    pg0.l3 l3Var = (pg0.l3) ((qg0.e0) i95.n0.c(qg0.e0.class));
                    float Ni = l3Var.Ni();
                    java.lang.String valueOf2 = java.lang.String.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("pay_keyboard_security_setting").getString("kv_pwd_keyboard_click_btn_pressure", ""));
                    java.lang.String valueOf3 = java.lang.String.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("pay_keyboard_security_setting").getString("kv_pwd_keyboard_click_btn_clicktime", ""));
                    java.lang.String valueOf4 = java.lang.String.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("pay_keyboard_security_setting").getString("kv_pwd_keyboard_click_btn_size", ""));
                    boolean wi6 = l3Var.wi();
                    java.lang.String valueOf5 = java.lang.String.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("pay_usecase").getString("pristate", ""));
                    boolean Bi = l3Var.Bi();
                    boolean Ai = l3Var.Ai();
                    jSONObject.put("PriState", valueOf5);
                    jSONObject.put("CurrentState", valueOf);
                    jSONObject.put("ScreenBrightness", java.lang.Float.valueOf(Ni));
                    jSONObject.put("PayPwdKeyboardPressure", valueOf2);
                    jSONObject.put("PayPwdKeyboardTime", valueOf3);
                    jSONObject.put("PayPwdKeyboardSize", valueOf4);
                    jSONObject.put("VoipStatus", Bi);
                    jSONObject.put("VpnStatus", Ai);
                    jSONObject.put("ScreenShareStatus", wi6);
                    jSONObject.put("DeviceID", wo.w0.k());
                    jSONObject.put("DeviceUUID", c());
                    jSONObject.put("IsHonor", z17);
                    if (z18 && z17) {
                        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new rg0.y(this, null), 2, null);
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject(this.f476736d);
                        jSONObject2.put("HonorTouchResult", java.lang.Float.valueOf(((pg0.l3) ((qg0.e0) i95.n0.c(qg0.e0.class))).Di()));
                        jSONObject.put("HonorSecInfo", jSONObject2);
                    }
                    tVar.e(0, valueOf, jSONObject);
                    new vs4.a(valueOf, jSONObject.toString()).l().K(rg0.w.f476732a);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SecinfoOnKindaNotifyEventListener", e17, "doReportClientInfo error", new java.lang.Object[0]);
        }
    }

    public final java.lang.String c() {
        boolean z17 = true;
        if (rg0.a0.f476693b.length() == 0) {
            try {
                java.lang.String k17 = wo.w0.k();
                if (k17.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SecinfoOnKindaNotifyEventListener", "getMMDeviceId is null or empty");
                    return "";
                }
                java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
                byte[] bytes = k17.getBytes(UTF_8);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bytes);
                b17.f(16);
                java.lang.String b18 = ot5.e.b(b17.g());
                if (b18 == null) {
                    b18 = "";
                }
                rg0.a0.f476693b = b18;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SecinfoOnKindaNotifyEventListener", e17, "getDeviceUUID error", new java.lang.Object[0]);
                rg0.a0.f476693b = "";
            }
        }
        return rg0.a0.f476693b;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00c6 A[Catch: Exception -> 0x0123, TryCatch #0 {Exception -> 0x0123, blocks: (B:90:0x004b, B:94:0x0069, B:95:0x0074, B:99:0x0099, B:101:0x009d, B:102:0x00aa, B:104:0x00ba, B:109:0x00c6, B:110:0x00e6, B:112:0x00ec, B:117:0x00fe, B:123:0x0102, B:125:0x0108, B:127:0x0110, B:129:0x0116, B:131:0x011b, B:134:0x008f), top: B:89:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0116 A[Catch: Exception -> 0x0123, TryCatch #0 {Exception -> 0x0123, blocks: (B:90:0x004b, B:94:0x0069, B:95:0x0074, B:99:0x0099, B:101:0x009d, B:102:0x00aa, B:104:0x00ba, B:109:0x00c6, B:110:0x00e6, B:112:0x00ec, B:117:0x00fe, B:123:0x0102, B:125:0x0108, B:127:0x0110, B:129:0x0116, B:131:0x011b, B:134:0x008f), top: B:89:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x011b A[Catch: Exception -> 0x0123, TRY_LEAVE, TryCatch #0 {Exception -> 0x0123, blocks: (B:90:0x004b, B:94:0x0069, B:95:0x0074, B:99:0x0099, B:101:0x009d, B:102:0x00aa, B:104:0x00ba, B:109:0x00c6, B:110:0x00e6, B:112:0x00ec, B:117:0x00fe, B:123:0x0102, B:125:0x0108, B:127:0x0110, B:129:0x0116, B:131:0x011b, B:134:0x008f), top: B:89:0x004b }] */
    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 r22) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rg0.z.mo778xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
    }

    public final void f(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.lang.String valueOf = java.lang.String.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("pay_usecase").getString("currentstate", ""));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("pay_usecase");
        if (M != null) {
            M.D("pristate", valueOf);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("pay_usecase");
        if (M2 != null) {
            M2.D("currentstate", url);
        }
    }
}
