package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827;

/* loaded from: classes7.dex */
public final class o extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f33695x366c91de = 251;

    /* renamed from: NAME */
    public static final java.lang.String f33696x24728b = "navigateToMiniProgram";

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f160301g = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.n.f160300d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f160302h = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.i.f160287d);

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r17, org.json.JSONObject r18, int r19) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.o.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 C(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        int i17;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("mode"), "halfPage") || (optJSONObject = jSONObject.optJSONObject("halfPage")) == null) {
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.BackgroundShapeConfig backgroundShapeConfig = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.BackgroundShapeConfig((float) optJSONObject.optDouble("cornerRadius", 35.0d), true, true, false, false, 24, null);
        k91.t2 t2Var = optJSONObject.optBoolean("hideCapsuleMenu") ? k91.t2.f387301f : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "singleClose") ? k91.t2.f387300e : k91.t2.f387299d;
        boolean optBoolean = optJSONObject.optBoolean("forceLightMode");
        boolean optBoolean2 = optJSONObject.optBoolean("needShowTemplateNav");
        boolean optBoolean3 = optJSONObject.optBoolean("enableFullScreenGesture");
        k91.s2 s2Var = optJSONObject.optBoolean("usePushAnimation", false) ? k91.s2.f387294e : k91.s2.f387293d;
        try {
            i17 = ik1.w.l(optJSONObject.optString("backgroundColor", ""));
        } catch (java.lang.Exception unused) {
            i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.Z;
        }
        boolean optBoolean4 = optJSONObject.optBoolean("forbidFullScreenDragUpGesture", false);
        boolean z17 = !optJSONObject.optBoolean("hideSimulatedNativeLeftReturnButton", false);
        java.lang.String optString2 = optJSONObject.optString("loadingDarkModeStyle", jSONObject.optString("loadingDarkModeStyle"));
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1(true, i18, s2Var, true, backgroundShapeConfig, optBoolean, null, t2Var, optBoolean3, optBoolean2, null, null, false, optBoolean4, p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString2, "dark") ? k91.b1.f387075f : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString2, "light") ? k91.b1.f387074e : k91.b1.f387073d, true, i17, null, 0, 0, i19, false, z17, false, null, false, null, 0, false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -7463872, 2047, null);
    }

    public final void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, yz5.l lVar2, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.f(this, jSONObject, map, lVar, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.c(this, jSONObject, str, str3, map, lVar2, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.d(fVar, str, str3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.e eVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.e(fVar, str, str3);
        ((com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.k) ((com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.i) i95.n0.c(com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.i.class))).wi(lVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.m(cVar, jSONObject, this, i17, eVar, dVar));
    }

    public final xj.p E() {
        return (xj.p) ((jz5.n) this.f160301g).mo141623x754a37bb();
    }

    public final void F(org.json.JSONObject jSONObject, mq0.a aVar, java.util.Map map) {
        mq0.z zVar;
        java.lang.String str;
        if (jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0) != 1095) {
            return;
        }
        java.lang.String str2 = "";
        java.lang.String optString = jSONObject.optString("adUxInfo", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (optString.length() == 0) {
            return;
        }
        java.util.Map m17 = kz5.c1.m(kz5.b1.e(new jz5.l("uxinfo", optString)), map == null ? kz5.q0.f395534d : map);
        i95.m c17 = i95.n0.c(mq0.d0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        mq0.d0.M3((mq0.d0) c17, aVar, m17, null, 4, null);
        try {
            java.lang.String optString2 = jSONObject.optString("traceId", "");
            java.lang.String optString3 = jSONObject.optString("frameSetName", "");
            java.lang.String optString4 = jSONObject.optString("implType", "");
            java.lang.String optString5 = jSONObject.optString("bizName", "");
            java.lang.String optString6 = jSONObject.optString("bizScene", "");
            switch (aVar.ordinal()) {
                case 19:
                    zVar = mq0.z.f412180u;
                    break;
                case 20:
                    zVar = mq0.z.f412181v;
                    break;
                case 21:
                    zVar = mq0.z.f412182w;
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
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString5);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString6);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString4);
                    mq0.c0.ig(c0Var, zVar2, optString5, optString6, optString2, optString3, optString4, null, l17, 64, null);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBADFullLinkReporter", "[MBAd] report full-link failed", e17);
        }
    }
}
