package com.tencent.mm.plugin.appbrand.jsapi.advertise;

/* loaded from: classes7.dex */
public final class o extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 251;
    public static final java.lang.String NAME = "navigateToMiniProgram";

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f78768g = jz5.h.b(com.tencent.mm.plugin.appbrand.jsapi.advertise.n.f78767d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f78769h = jz5.h.b(com.tencent.mm.plugin.appbrand.jsapi.advertise.i.f78754d);

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l r17, org.json.JSONObject r18, int r19) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.advertise.o.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }

    public final com.tencent.mm.plugin.appbrand.config.HalfScreenConfig C(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        int i17;
        if (!kotlin.jvm.internal.o.b(jSONObject.optString("mode"), "halfPage") || (optJSONObject = jSONObject.optJSONObject("halfPage")) == null) {
            return null;
        }
        java.lang.String optString = optJSONObject.optString("capsuleMenuType");
        int i18 = -2;
        int b17 = vp0.b.b(java.lang.Integer.valueOf(optJSONObject.optInt("landscapeWidth", -2)));
        int i19 = b17 == 0 ? -2 : b17;
        double optDouble = optJSONObject.optDouble("height");
        if (java.lang.Double.isNaN(optDouble)) {
            i18 = -1;
        } else {
            if (!(optDouble == 0.0d)) {
                i18 = vp0.b.b(java.lang.Double.valueOf(optDouble));
            }
        }
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig backgroundShapeConfig = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig((float) optJSONObject.optDouble("cornerRadius", 35.0d), true, true, false, false, 24, null);
        k91.t2 t2Var = optJSONObject.optBoolean("hideCapsuleMenu") ? k91.t2.f305768f : kotlin.jvm.internal.o.b(optString, "singleClose") ? k91.t2.f305767e : k91.t2.f305766d;
        boolean optBoolean = optJSONObject.optBoolean("forceLightMode");
        boolean optBoolean2 = optJSONObject.optBoolean("needShowTemplateNav");
        boolean optBoolean3 = optJSONObject.optBoolean("enableFullScreenGesture");
        k91.s2 s2Var = optJSONObject.optBoolean("usePushAnimation", false) ? k91.s2.f305761e : k91.s2.f305760d;
        try {
            i17 = ik1.w.l(optJSONObject.optString("backgroundColor", ""));
        } catch (java.lang.Exception unused) {
            i17 = com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.Z;
        }
        boolean optBoolean4 = optJSONObject.optBoolean("forbidFullScreenDragUpGesture", false);
        boolean z17 = !optJSONObject.optBoolean("hideSimulatedNativeLeftReturnButton", false);
        java.lang.String optString2 = optJSONObject.optString("loadingDarkModeStyle", jSONObject.optString("loadingDarkModeStyle"));
        return new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(true, i18, s2Var, true, backgroundShapeConfig, optBoolean, null, t2Var, optBoolean3, optBoolean2, null, null, false, optBoolean4, kotlin.jvm.internal.o.b(optString2, "dark") ? k91.b1.f305542f : kotlin.jvm.internal.o.b(optString2, "light") ? k91.b1.f305541e : k91.b1.f305540d, true, i17, null, 0, 0, i19, false, z17, false, null, false, null, 0, false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -7463872, 2047, null);
    }

    public final void D(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, yz5.l lVar2, java.util.Map map) {
        com.tencent.mm.plugin.appbrand.jsapi.advertise.f fVar = new com.tencent.mm.plugin.appbrand.jsapi.advertise.f(this, jSONObject, map, lVar, i17);
        com.tencent.mm.plugin.appbrand.jsapi.advertise.c cVar = new com.tencent.mm.plugin.appbrand.jsapi.advertise.c(this, jSONObject, str, str3, map, lVar2, str2);
        com.tencent.mm.plugin.appbrand.jsapi.advertise.d dVar = new com.tencent.mm.plugin.appbrand.jsapi.advertise.d(fVar, str, str3);
        com.tencent.mm.plugin.appbrand.jsapi.advertise.e eVar = new com.tencent.mm.plugin.appbrand.jsapi.advertise.e(fVar, str, str3);
        ((com.tencent.mm.magicbrush.plugin.scl.jsapi.k) ((com.tencent.mm.magicbrush.plugin.scl.jsapi.i) i95.n0.c(com.tencent.mm.magicbrush.plugin.scl.jsapi.i.class))).wi(lVar, new com.tencent.mm.plugin.appbrand.jsapi.advertise.m(cVar, jSONObject, this, i17, eVar, dVar));
    }

    public final xj.p E() {
        return (xj.p) ((jz5.n) this.f78768g).getValue();
    }

    public final void F(org.json.JSONObject jSONObject, mq0.a aVar, java.util.Map map) {
        mq0.z zVar;
        java.lang.String str;
        if (jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0) != 1095) {
            return;
        }
        java.lang.String str2 = "";
        java.lang.String optString = jSONObject.optString("adUxInfo", "");
        kotlin.jvm.internal.o.d(optString);
        if (optString.length() == 0) {
            return;
        }
        java.util.Map m17 = kz5.c1.m(kz5.b1.e(new jz5.l("uxinfo", optString)), map == null ? kz5.q0.f314001d : map);
        i95.m c17 = i95.n0.c(mq0.d0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        mq0.d0.M3((mq0.d0) c17, aVar, m17, null, 4, null);
        try {
            java.lang.String optString2 = jSONObject.optString("traceId", "");
            java.lang.String optString3 = jSONObject.optString("frameSetName", "");
            java.lang.String optString4 = jSONObject.optString("implType", "");
            java.lang.String optString5 = jSONObject.optString("bizName", "");
            java.lang.String optString6 = jSONObject.optString("bizScene", "");
            switch (aVar.ordinal()) {
                case 19:
                    zVar = mq0.z.f330647u;
                    break;
                case 20:
                    zVar = mq0.z.f330648v;
                    break;
                case 21:
                    zVar = mq0.z.f330649w;
                    break;
                default:
                    zVar = null;
                    break;
            }
            mq0.z zVar2 = zVar;
            if (zVar2 != null) {
                if (map != null && (str = (java.lang.String) map.get("errMsg")) != null) {
                    str2 = str;
                }
                java.util.Map l17 = kz5.c1.l(new jz5.l("apiName", "navigateToMiniProgram"));
                if (optString.length() > 0) {
                    l17.put("uxinfo", optString);
                }
                if (str2.length() > 0) {
                    l17.put("errMsg", str2);
                }
                mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
                if (c0Var != null) {
                    kotlin.jvm.internal.o.d(optString5);
                    kotlin.jvm.internal.o.d(optString6);
                    kotlin.jvm.internal.o.d(optString2);
                    kotlin.jvm.internal.o.d(optString3);
                    kotlin.jvm.internal.o.d(optString4);
                    mq0.c0.ig(c0Var, zVar2, optString5, optString6, optString2, optString3, optString4, null, l17, 64, null);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MBADFullLinkReporter", "[MBAd] report full-link failed", e17);
        }
    }
}
