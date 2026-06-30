package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3;

/* loaded from: classes8.dex */
public class u extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34441x366c91de = -2;

    /* renamed from: NAME */
    private static final java.lang.String f34442x24728b = "openLiteApp";

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f163091h;

    /* renamed from: g, reason: collision with root package name */
    public boolean f163090g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f163092i = false;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (jSONObject == null) {
            e9Var.a(i17, o("invalid_data"));
            return;
        }
        this.f163091h = e9Var;
        q80.d0 d0Var = new q80.d0();
        try {
            if (!jSONObject.has("appId")) {
                e9Var.a(i17, o("invalid_appId"));
                return;
            }
            java.lang.String string = jSONObject.getString("appId");
            d0Var.f442182a = string;
            boolean z17 = jSONObject.has("checkUpdate") ? jSONObject.getBoolean("checkUpdate") : true;
            boolean z18 = jSONObject.has("syncCheckUpdate") ? jSONObject.getBoolean("syncCheckUpdate") : false;
            boolean z19 = jSONObject.has("openDataChannel") ? jSONObject.getBoolean("openDataChannel") : false;
            if (jSONObject.has("query")) {
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("query");
                d0Var.f442184c = optJSONObject != null ? optJSONObject.toString() : jSONObject.optString("query", "");
            }
            if (jSONObject.has(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f)) {
                str = jSONObject.getString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
                d0Var.f442183b = str;
            } else {
                str = "";
            }
            if (jSONObject.has("isTransparent") && jSONObject.getBoolean("isTransparent")) {
                d0Var.f442185d = java.lang.Boolean.TRUE;
            }
            if (jSONObject.has("isForbidRightGesture") && jSONObject.getBoolean("isForbidRightGesture")) {
                d0Var.f442186e = true;
            }
            if (jSONObject.has("isHalfScreen") && jSONObject.getBoolean("isHalfScreen")) {
                d0Var.f442190i = 1;
            }
            if (jSONObject.has("forcePortrait")) {
                this.f163092i = jSONObject.getBoolean("forcePortrait");
            }
            if (jSONObject.has("heightPercent")) {
                d0Var.f442191j = jSONObject.getDouble("heightPercent");
            }
            java.lang.String string2 = jSONObject.has("minVersion") ? jSONObject.getString("minVersion") : "";
            if (jSONObject.has("enableDragToCloseInHalfScreen")) {
                boolean z27 = jSONObject.getBoolean("enableDragToCloseInHalfScreen");
                if (d0Var.f442190i == 1) {
                    d0Var.f442192k = z27;
                }
            }
            if (jSONObject.has("enableDragToFullScreenInHalfScreen")) {
                boolean z28 = jSONObject.getBoolean("enableDragToFullScreenInHalfScreen");
                if (d0Var.f442190i == 1) {
                    d0Var.f442193l = z28;
                }
            }
            if (jSONObject.has("enterType")) {
                java.lang.String string3 = jSONObject.getString("enterType");
                if (string3.equals("modal")) {
                    d0Var.f442197p = com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0;
                    d0Var.f442198q = com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1;
                } else if (string3.equals(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63)) {
                    d0Var.f442197p = com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea;
                    d0Var.f442198q = com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed;
                }
            } else {
                d0Var.f442197p = com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea;
                d0Var.f442198q = com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed;
            }
            if (jSONObject.has("isRedirect")) {
                this.f163090g = jSONObject.getBoolean("isRedirect");
            }
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("keepAlive");
            if (optJSONObject2 != null) {
                d0Var.A = optJSONObject2.optInt("seconds", 0);
            }
            if (jSONObject.has("ignoreAlive")) {
                d0Var.B = jSONObject.optBoolean("ignoreAlive");
            }
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
            c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.WA_APP;
            c3708xc1f46f80.f14312x721f2ec7 = e9Var.mo48798x74292566();
            d0Var.f442207z = c3708xc1f46f80;
            java.lang.String string4 = jSONObject.has("preInjectData") ? jSONObject.getString("preInjectData") : "";
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.d(20980, new java.lang.Object[0]);
            fVar.w(1293L, 89L, 1L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenLiteApp", "open liteapp:" + string + ", page:" + str);
            d0Var.f442199r = false;
            d0Var.f442200s = false;
            java.lang.Object[] objArr = {null, java.lang.Boolean.FALSE};
            android.content.Context f229340d = e9Var.getF229340d();
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.k(this, objArr, f229340d);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(kVar, 500L, false);
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.C12147xf504cfa7(string, string2, string4, e9Var.mo48798x74292566(), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19)), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.s.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.m(this, objArr, e9Var, i17, d0Var, f229340d));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiOpenLiteApp", e17, "", new java.lang.Object[0]);
            e9Var.a(i17, o("fail"));
        }
    }
}
