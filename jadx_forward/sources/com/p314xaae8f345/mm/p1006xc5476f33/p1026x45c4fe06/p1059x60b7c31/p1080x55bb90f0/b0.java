package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0;

/* loaded from: classes.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f161894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f161895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f161896f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f161897g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.c0 f161898h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.c0 c0Var2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f161895e = jSONObject;
        this.f161896f = c0Var;
        this.f161897g = i17;
        this.f161898h = c0Var2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.b0(this.f161895e, this.f161896f, this.f161897g, this.f161898h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        j91.e eVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f161894d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.c0 c0Var = this.f161898h;
        int i18 = this.f161897g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var2 = this.f161896f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                if (this.f161895e == null) {
                    throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f(jc1.f.f380452h);
                }
                j91.d dVar = (j91.d) c0Var2.t3().K1(j91.d.class);
                if (dVar == null) {
                    throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f(jc1.f.f380450f);
                }
                this.f161894d = 1;
                obj = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t) dVar).j(true, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            eVar = (j91.e) obj;
        } catch (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f e17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getChatToolInfo e:");
            jc1.d dVar2 = e17.f161924d;
            sb6.append(dVar2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApigetChatToolInfo", sb6.toString());
            c0Var2.a(i18, c0Var.r(null, dVar2, null));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApigetChatToolInfo", "getChatToolInfo e:" + th6.getMessage());
            java.lang.String str = "fail:" + th6.getMessage();
            c0Var.getClass();
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? str : null;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", -1);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            c0Var2.a(i18, c0Var.u(str2, jSONObject));
        }
        if (eVar == null) {
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f(new jc1.d(-1, "fail:server error, resp is null"));
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("encryptedData", eVar.f379882a);
        hashMap.put("iv", eVar.f379883b);
        hashMap.put("cloudID", eVar.f379884c);
        c0Var.getClass();
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap.put("errno", 0);
        c0Var2.a(i18, c0Var.t("ok", hashMap));
        return jz5.f0.f384359a;
    }
}
