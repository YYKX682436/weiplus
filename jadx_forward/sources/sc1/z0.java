package sc1;

/* loaded from: classes7.dex */
public class z0 extends gb1.h {

    /* renamed from: CTRL_INDEX */
    private static final int f76770x366c91de = 367;

    /* renamed from: NAME */
    public static final java.lang.String f76771x24728b = "operateLivePlayer";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("livePlayerId");
    }

    @Override // gb1.h
    public boolean J() {
        return true;
    }

    @Override // gb1.h
    public boolean L(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject, gb1.n nVar) {
        int i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateLivePlayer", "onOperateView : livePlayerId=%d", java.lang.Integer.valueOf(i17));
        if (!(view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateLivePlayer", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return false;
        }
        android.view.View view2 = (android.view.View) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(android.view.View.class);
        if (!(view2 instanceof sc1.f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOperateLivePlayer", "targetView not AppBrandLivePlayerView");
            return false;
        }
        sc1.f fVar = (sc1.f) view2;
        java.lang.String optString = jSONObject.optString("type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateLivePlayer", "onOperateView operateType=%s", optString);
        if (optString.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0.f159978f)) {
            fVar.m164241x8ba6f71a(new sc1.y0(this, nVar, tVar));
            if (!fVar.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0.f159978f, jSONObject)) {
                java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 4);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                nVar.a(u(str, jSONObject2));
            }
        } else {
            boolean equalsIgnoreCase = optString.equalsIgnoreCase("requestFullScreen");
            jc1.d dVar = jc1.f.f380445a;
            jc1.d dVar2 = jc1.f.f380448d;
            if (equalsIgnoreCase) {
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                if (optJSONArray == null || optJSONArray.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateLivePlayer", "onOperateView directionArr nil");
                    i18 = 0;
                } else {
                    i18 = optJSONArray.optInt(0, 0);
                }
                fVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLivePlayerView", "enterFullScreen direction:%s", java.lang.Integer.valueOf(i18));
                sc1.c cVar = fVar.f487194f;
                if (cVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandLivePlayerView", "enterFullScreen mFullScreenDelegate null");
                } else {
                    sc1.q qVar = (sc1.q) cVar;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia iaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia) qVar.f487251a.M(qVar.f487252b);
                    int i19 = iaVar.f168298i;
                    int i27 = qVar.f487253c;
                    if (i19 == i27 || iaVar.f168293d == i27) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLivePlayerView", "enterFullScreen already full screen");
                    } else {
                        sc1.q qVar2 = (sc1.q) fVar.f487194f;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia) qVar2.f487251a.M(qVar2.f487252b)).i(qVar2.f487253c, qVar2.f487254d, i18);
                        fVar.f487196h = i18;
                        fVar.b(true);
                    }
                    r1 = true;
                }
                if (!r1) {
                    dVar = dVar2;
                }
                nVar.a(r(null, dVar, null));
            } else if (optString.equalsIgnoreCase("exitFullScreen")) {
                fVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLivePlayerView", "quitFullScreen");
                sc1.c cVar2 = fVar.f487194f;
                if (cVar2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandLivePlayerView", "quitFullScreen mFullScreenDelegate null");
                } else {
                    sc1.q qVar3 = (sc1.q) cVar2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia iaVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia) qVar3.f487251a.M(qVar3.f487252b);
                    int i28 = iaVar2.f168298i;
                    int i29 = qVar3.f487253c;
                    if (i28 == i29 || iaVar2.f168293d == i29) {
                        sc1.q qVar4 = (sc1.q) fVar.f487194f;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia) qVar4.f487251a.M(qVar4.f487252b)).j(qVar4.f487253c);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLivePlayerView", "quitFullScreen already quit full screen");
                    }
                    r1 = true;
                }
                if (!r1) {
                    dVar = dVar2;
                }
                nVar.a(r(null, dVar, null));
            } else {
                if (!fVar.c(optString, jSONObject)) {
                    dVar = dVar2;
                }
                nVar.a(r(null, dVar, null));
            }
        }
        return true;
    }
}
