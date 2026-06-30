package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31;

/* loaded from: classes15.dex */
public class h extends gb1.h {

    /* renamed from: CTRL_INDEX */
    private static final int f34928x366c91de = 114;

    /* renamed from: NAME */
    public static final java.lang.String f34929x24728b = "operateVideoPlayer";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("videoPlayerId");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // gb1.h
    public boolean K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        char c17;
        oe1.s1 s1Var = new oe1.s1(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateVideoPlayer", "%s onOperateView, data: %s", s1Var, jSONObject);
        if (!(view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateVideoPlayer", "%s view is not a instance of CoverViewContainer", s1Var);
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a.class);
        if (c12262x4a2a25a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOperateVideoPlayer", "%s view not AppBrandVideoView", s1Var);
            return false;
        }
        java.lang.String optString = jSONObject.optString("type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateVideoPlayer", "%s onOperateView operateType=%s", s1Var, optString);
        optString.getClass();
        int i18 = -1;
        switch (optString.hashCode()) {
            case -802181223:
                if (optString.equals("exitFullScreen")) {
                    c17 = 0;
                    break;
                }
                c17 = 65535;
                break;
            case 1222225:
                if (optString.equals("sendDanmu")) {
                    c17 = 1;
                    break;
                }
                c17 = 65535;
                break;
            case 3443508:
                if (optString.equals(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27)) {
                    c17 = 2;
                    break;
                }
                c17 = 65535;
                break;
            case 3526264:
                if (optString.equals("seek")) {
                    c17 = 3;
                    break;
                }
                c17 = 65535;
                break;
            case 3540994:
                if (optString.equals("stop")) {
                    c17 = 4;
                    break;
                }
                c17 = 65535;
                break;
            case 106440182:
                if (optString.equals("pause")) {
                    c17 = 5;
                    break;
                }
                c17 = 65535;
                break;
            case 458133450:
                if (optString.equals("requestFullScreen")) {
                    c17 = 6;
                    break;
                }
                c17 = 65535;
                break;
            case 1355420059:
                if (optString.equals("playbackRate")) {
                    c17 = 7;
                    break;
                }
                c17 = 65535;
                break;
            default:
                c17 = 65535;
                break;
        }
        switch (c17) {
            case 0:
                c12262x4a2a25a.s(false, -1);
                return true;
            case 1:
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                if (optJSONArray == null || optJSONArray.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateVideoPlayer", "%s onOperateView dataArr nil", s1Var);
                    return false;
                }
                if (optJSONArray.length() == 1) {
                    c12262x4a2a25a.b(optJSONArray.optString(0, ""), "");
                } else {
                    c12262x4a2a25a.b(optJSONArray.optString(0, ""), optJSONArray.optString(1, ""));
                }
                return true;
            case 2:
                c12262x4a2a25a.x();
                return true;
            case 3:
                org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                if (optJSONArray2 == null || optJSONArray2.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateVideoPlayer", "%s onOperateView dataArr nil", s1Var);
                    return false;
                }
                double optDouble = optJSONArray2.optDouble(0, -1.0d);
                if (optDouble < 0.0d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateVideoPlayer", "%s pos invalid %s", s1Var, java.lang.Double.valueOf(optDouble));
                    return false;
                }
                c12262x4a2a25a.u(optDouble, false);
                return true;
            case 4:
                c12262x4a2a25a.y();
                return true;
            case 5:
                c12262x4a2a25a.t();
                return true;
            case 6:
                org.json.JSONArray optJSONArray3 = jSONObject.optJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                if (optJSONArray3 == null || optJSONArray3.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateVideoPlayer", "%s onOperateView directionArr nil", s1Var);
                } else {
                    i18 = optJSONArray3.optInt(0, -1);
                }
                c12262x4a2a25a.s(true, i18);
                return true;
            case 7:
                org.json.JSONArray optJSONArray4 = jSONObject.optJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                if (optJSONArray4 == null || optJSONArray4.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateVideoPlayer", "%s onOperateView dataArr nil", s1Var);
                    return false;
                }
                double optDouble2 = optJSONArray4.optDouble(0, -1.0d);
                if (optDouble2 < 0.0d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateVideoPlayer", "%s rate invalid %f", s1Var, java.lang.Double.valueOf(optDouble2));
                    return false;
                }
                float f17 = (float) optDouble2;
                c12262x4a2a25a.o("setPlaybackRate %s", java.lang.Float.valueOf(f17));
                c12262x4a2a25a.f165062f.c(f17);
                return true;
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateVideoPlayer", "%s onOperateView operateType not supported: %s", s1Var, optString);
                return false;
        }
    }
}
