package md1;

/* loaded from: classes7.dex */
public abstract class q0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f407318g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f407319h = 2;

    public void C(java.util.Map map, int i17) {
        map.put("errCode", java.lang.Integer.valueOf(i17));
    }

    public int D(int i17, int i18) {
        if (i17 == 0 && i18 == 0) {
            return 0;
        }
        if (i17 != -10086 && i17 != -10087) {
            return -1000;
        }
        if (i18 == -9) {
            return -3;
        }
        if (i18 == -7) {
            return -2;
        }
        if (i18 != -1) {
            return i18 != 0 ? -1000 : 0;
        }
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        boolean z17;
        if (c0Var.Z0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "hy: no page context");
            return;
        }
        if (c0Var.t3().N0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "wx assistant is enable");
            java.lang.String str = android.text.TextUtils.isEmpty("fail:wx assistant is enabled.") ? "fail:internal error" : "fail:wx assistant is enabled.";
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str, jSONObject2));
            return;
        }
        si1.e1.a(c0Var.mo48798x74292566(), new md1.o0(this, c0Var, jSONObject, i17));
        android.content.Context f229340d = c0Var.getF229340d();
        boolean z18 = false;
        if (f229340d == null || !(f229340d instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "fail, requestAudioPermission pageContext is null");
            c0Var.a(i17, o("fail: context is null"));
            z17 = false;
        } else {
            z17 = nf.t.a((android.app.Activity) f229340d, c0Var, "android.permission.RECORD_AUDIO", 121, "", "");
            if (z17) {
                si1.e1.c(c0Var.mo48798x74292566());
            }
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestAudioPermission is fail");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "hy: no record audio permission");
            c0Var.a(i17, o("fail: no record audio permission"));
            return;
        }
        if (jSONObject.optInt("roomType", 2) == 1) {
            si1.e1.a(c0Var.mo48798x74292566(), new md1.p0(this, c0Var, jSONObject, i17));
            android.content.Context f229340d2 = c0Var.getF229340d();
            if (f229340d2 == null || !(f229340d2 instanceof android.app.Activity)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "fail, requestCameraPermission pageContext is null");
                c0Var.a(i17, o("fail: context is null"));
            } else {
                z18 = nf.t.a((android.app.Activity) f229340d2, c0Var, "android.permission.CAMERA", 122, "", "");
                if (z18) {
                    si1.e1.c(c0Var.mo48798x74292566());
                }
            }
            if (!z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestCameraPermission is fail");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "hy: no record video permission");
                c0Var.a(i17, o("fail: no record video permission"));
                return;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "no need to request camera permission");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 x07 = c0Var.t3().x0();
        if (x07.m52169xfdaa7672() != null || x07.m52169xfdaa7672().mo14682x9dee9c37() != null) {
            this.f407318g = x07.m52169xfdaa7672().mo14682x9dee9c37();
        }
        this.f407319h = jSONObject.optInt("roomType", 2);
        F(c0Var, jSONObject, i17);
    }

    public abstract void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject jSONObject, int i17);

    public fw1.b G(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject jSONObject) {
        fw1.b bVar = new fw1.b();
        fw1.a aVar = bVar.f348590k;
        try {
            bVar.f348581b = c0Var.mo48798x74292566();
            bVar.f348583d = jSONObject.optString("signature", "");
            bVar.f348584e = jSONObject.optString("nonceStr", "");
            bVar.f348585f = jSONObject.optString("groupId", "");
            bVar.f348586g = jSONObject.optInt("timeStamp", 0);
            bVar.f348593n = jSONObject.optInt("lifespan", 86400);
            bVar.f348587h = jSONObject.optInt("roomType", 2);
            bVar.f348588i = jSONObject.optInt("maxWidth", 480);
            bVar.f348589j = jSONObject.optInt("maxHeight", 640);
            bVar.f348591l = jSONObject.optString("privateData", "");
            bVar.f348592m = jSONObject.optString("sessionKey", "");
            if (jSONObject.has("roomIdStr")) {
                java.lang.String optString = jSONObject.optString("roomIdStr", "");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "roomIdStr:%s", optString);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                    bVar.f348594o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F1(optString, -1L);
                }
            }
            if (bVar.f348594o == -1) {
                bVar.f348594o = jSONObject.optLong("roomId", -1L);
            }
            bVar.f348595p = jSONObject.optInt("videoRatio", 133);
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("muteConfig");
            aVar.f348577a = jSONObject2.optBoolean("muteMicrophone", false);
            aVar.f348578b = jSONObject2.optBoolean("muteEarphone", false);
            aVar.f348579c = jSONObject.optBoolean("handsFree", false);
            bVar.f348580a = (c0Var.t3() == null || !c0Var.t3().q2()) ? 1 : 0;
            bVar.f348598s = jSONObject.optInt("fixedVideoResolution", 640);
            bVar.f348597r = jSONObject.optInt("maxDecodeFPS", 15);
            bVar.f348596q = jSONObject.optInt("videoRotation", 2);
            return bVar;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenVoice.JsApiOpenVoiceBase", e17, "handle join voice voip data exception", new java.lang.Object[0]);
            return null;
        }
    }
}
