package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class k9 extends dm.j7 {
    public static final l75.e0 K = dm.j7.m125145x3593deb(dm.j7.class);

    /* renamed from: J, reason: collision with root package name */
    public transient boolean f166252J;

    /* renamed from: equals */
    public boolean m51743xb2c87fbf(java.lang.Object obj) {
        r45.o54 o54Var;
        r45.b10 b10Var;
        r45.mc7 mc7Var;
        r45.t1 t1Var;
        r45.d25 d25Var;
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k9)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k9 k9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k9) obj;
        return this.f67120x28d45f97.equals(k9Var.f67120x28d45f97) && (o54Var = this.f67125x2eee6aee) != null && ik1.d0.a(o54Var, k9Var.f67125x2eee6aee) && (b10Var = this.f67124x7960ff7a) != null && ik1.d0.a(b10Var, k9Var.f67124x7960ff7a) && (mc7Var = this.f67123xbd3c41b) != null && ik1.d0.a(mc7Var, k9Var.f67123xbd3c41b) && (t1Var = this.f67119xd65b4ff2) != null && ik1.d0.a(t1Var, k9Var.f67119xd65b4ff2) && (d25Var = this.f67128x7ec0d830) != null && ik1.d0.a(d25Var, k9Var.f67128x7ec0d830) && u46.l.c(this.f67126xc5c3da28, k9Var.f67126xc5c3da28) && this.f67122x55ff97dc == k9Var.f67122x55ff97dc && u46.l.c(this.f67127x996f3ea, k9Var.f67127x996f3ea);
    }

    @Override // dm.j7, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return K;
    }

    public void t0(r45.v54 v54Var) {
        this.f67125x2eee6aee = v54Var.f469435d;
        this.f67124x7960ff7a = v54Var.f469436e;
        this.f67123xbd3c41b = v54Var.f469437f;
        this.f67119xd65b4ff2 = v54Var.f469439h;
        this.f67128x7ec0d830 = v54Var.f469440i;
        this.f67126xc5c3da28 = v54Var.f469443o;
        long b17 = ik1.c0.b(v54Var.f469445q);
        if (b17 > 0) {
            this.f67122x55ff97dc = c01.id.e() + b17;
        } else {
            this.f67122x55ff97dc = 0L;
        }
        this.f67127x996f3ea = v54Var.f469446r;
        this.f67129x71936746 = v54Var.f469447s;
        r45.s54 s54Var = v54Var.f469448t;
        this.f67130xa4705657 = s54Var;
        java.lang.Object[] objArr = new java.lang.Object[2];
        boolean z17 = false;
        objArr[0] = java.lang.Boolean.valueOf(s54Var != null);
        r45.s54 s54Var2 = v54Var.f469448t;
        if (s54Var2 != null && s54Var2.f467052d) {
            z17 = true;
        }
        objArr[1] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.LaunchWxaAppInfo", "switch_list:%b,  tencent_map_download_guide:%b", objArr);
    }

    public void u0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a195) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        r45.t1 t1Var = this.f67119xd65b4ff2;
        c11813xf952a195.f158874y0 = t1Var != null && t1Var.f467586d;
        c11813xf952a195.f158871l1 = t1Var != null && t1Var.f467587e;
        c11813xf952a195.f158872p1 = t1Var != null && t1Var.f467589g;
        c11813xf952a195.f158873x1 = t1Var != null ? t1Var.f467588f : 0;
        if (t1Var == null || (gVar = t1Var.f467590h) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.LaunchWxaAppInfo", "fillLaunchConfig, appId:%s, field_actionsheetInfo null", this.f67120x28d45f97);
            c11813xf952a195.f158875y1 = null;
        } else {
            c11813xf952a195.f158875y1 = gVar.f273689a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.LaunchWxaAppInfo", "fillLaunchConfig, appId:%s, has field_actionsheetInfo", this.f67120x28d45f97);
        }
        r45.d25 d25Var = this.f67128x7ec0d830;
        if (d25Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d25Var.f453546d)) {
            c11813xf952a195.D = this.f67128x7ec0d830.f453546d;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(c11813xf952a195.D).getJSONObject(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25964xb9d36a6b.f49240x524f1eb5);
                c11813xf952a195.f387381n = jSONObject.getInt("banLocationIfEmptyDesc") == 1;
                c11813xf952a195.f387382o = jSONObject.getInt("banGetWifiListIfEmptyDesc") == 1;
            } catch (org.json.JSONException unused) {
                c11813xf952a195.f387381n = false;
                c11813xf952a195.f387382o = false;
            }
            java.lang.String str = c11813xf952a195.D;
            c11813xf952a195.f387378h = true;
            c11813xf952a195.f387379i = true;
            c11813xf952a195.f387380m = true;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandSysConfigUtil", "operationInfo nil");
            } else {
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(str).getJSONObject("bgKeepAlive");
                    c11813xf952a195.f387378h = jSONObject2.optInt("music", 1) == 1;
                    c11813xf952a195.f387379i = jSONObject2.optInt(ya.b.f77489x9ff58fb5, 1) == 1;
                    c11813xf952a195.f387380m = jSONObject2.optInt("bluetooth", 1) == 1;
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandSysConfigUtil", "assembleBgKeepAliveConfigByOperationInfo operationInfo:%s", str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandSysConfigUtil", "assembleBgKeepAliveConfigByOperationInfo exp:%s", e17);
                }
            }
        }
        c11813xf952a195.A = new com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3900x5df21f9b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54(this.f67124x7960ff7a), null, this.f67126xc5c3da28, false, false, null, this.f67129x71936746, 0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o8.f157242a.b());
        c11813xf952a195.f128831x0 = this.f67127x996f3ea;
        r45.s54 s54Var = this.f67130xa4705657;
        c11813xf952a195.H1 = s54Var != null && s54Var.f467052d;
    }

    public final boolean v0(java.lang.String str) {
        r45.d25 d25Var = this.f67128x7ec0d830;
        if (d25Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d25Var.f453546d)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.f67128x7ec0d830.f453546d);
                if (!jSONObject.has("jumpWeAppFromLongPressCodeBanInfo")) {
                    return false;
                }
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("jumpWeAppFromLongPressCodeBanInfo");
                if (jSONObject2.has(str)) {
                    return jSONObject2.optInt(str, 0) == 1;
                }
                return false;
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.LaunchWxaAppInfo", "[banjump] shouldBanJumpInternal fail", e17);
            }
        }
        return false;
    }
}
