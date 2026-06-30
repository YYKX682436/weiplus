package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31;

/* loaded from: classes15.dex */
public class m extends gb1.h {

    /* renamed from: CTRL_INDEX */
    private static final int f34934x366c91de = 87;

    /* renamed from: NAME */
    public static final java.lang.String f34935x24728b = "updateVideoPlayer";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("videoPlayerId");
    }

    @Override // gb1.h
    public boolean K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        oe1.s1 s1Var = new oe1.s1(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "%s onUpdateView, data: %s", s1Var, jSONObject);
        if (!(view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiUpdateVideoPlayer", "%s view is not a instance of CoverViewContainer", s1Var);
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a.class);
        if (c12262x4a2a25a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUpdateVideoPlayer", "%s view not AppBrandVideoView", s1Var);
            return false;
        }
        try {
            if (jSONObject.has("showDanmuBtn")) {
                c12262x4a2a25a.m51363x8498f2ac(jSONObject.getBoolean("showDanmuBtn"));
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showDanmuBtn", e17.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("danmuList")) {
                c12262x4a2a25a.m51344x1f8e87be(jSONObject.getJSONArray("danmuList"));
            }
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "danmuList", e18.getLocalizedMessage());
        }
        java.lang.String str = null;
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15495x767d9974)) {
                str = jSONObject.getString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15495x767d9974);
                c12262x4a2a25a.m51357x2f76610(str);
            }
        } catch (org.json.JSONException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15495x767d9974, e19.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15485x340d78e6)) {
                c12262x4a2a25a.m51338xcc520c05(jSONObject.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15485x340d78e6));
            }
        } catch (org.json.JSONException e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15485x340d78e6, e27.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("showBasicControls")) {
                c12262x4a2a25a.m51353xc2e9d13b(jSONObject.getBoolean("showBasicControls"));
            }
        } catch (org.json.JSONException e28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showBasicControls", e28.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("poster")) {
                c12262x4a2a25a.v(jSONObject.getString("poster"), str);
            }
        } catch (org.json.JSONException e29) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "poster", e29.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0)) {
                c12262x4a2a25a.m51348x4e6a0222(jSONObject.getInt(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0));
            }
        } catch (java.lang.Exception e37) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0, e37.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("muted")) {
                c12262x4a2a25a.m51356x764d819b(jSONObject.getBoolean("muted"));
            }
        } catch (org.json.JSONException e38) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "muted", e38.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("loop")) {
                c12262x4a2a25a.m51354x764cf626(jSONObject.getBoolean("loop"));
            }
        } catch (org.json.JSONException e39) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "loop", e39.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306)) {
                c12262x4a2a25a.m51342xbe31a230(jSONObject.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306));
            }
        } catch (org.json.JSONException e47) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, e47.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("pageGesture")) {
                c12262x4a2a25a.m51358x263c1df8(jSONObject.getBoolean("pageGesture"));
            }
        } catch (org.json.JSONException e48) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "pageGesture", e48.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("pageGestureInFullscreen")) {
                c12262x4a2a25a.m51359x3c3538d8(jSONObject.getBoolean("pageGestureInFullscreen"));
            }
        } catch (org.json.JSONException e49) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "pageGestureInFullscreen", e49.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("showControlProgress")) {
                c12262x4a2a25a.m51362xb4d85e2b(jSONObject.getBoolean("showControlProgress"));
            }
        } catch (org.json.JSONException e57) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showControlProgress", e57.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("showProgress")) {
                c12262x4a2a25a.m51368x28c841cc(jSONObject.getBoolean("showProgress"));
            }
        } catch (org.json.JSONException e58) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showProgress", e58.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("showProgressInControlMode")) {
                c12262x4a2a25a.m51369x18e116d4(jSONObject.getBoolean("showProgressInControlMode"));
            }
        } catch (org.json.JSONException e59) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showProgressInControlMode", e59.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("showFullScreenBtn")) {
                c12262x4a2a25a.m51364x1cf93842(jSONObject.getBoolean("showFullScreenBtn"));
            }
        } catch (org.json.JSONException e66) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showFullScreenBtn", e66.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("showPlayBtn")) {
                c12262x4a2a25a.m51366x69f2cf09(jSONObject.getBoolean("showPlayBtn"));
            }
        } catch (org.json.JSONException e67) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showPlayBtn", e67.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("showCenterPlayBtn")) {
                c12262x4a2a25a.m51361x2a96dc34(jSONObject.getBoolean("showCenterPlayBtn"));
            }
        } catch (org.json.JSONException e68) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showCenterPlayBtn", e68.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("showPoster")) {
                c12262x4a2a25a.m51367x45add8ac(jSONObject.getBoolean("showPoster"));
            }
        } catch (org.json.JSONException e69) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showPoster", e69.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("enableProgressGesture")) {
                c12262x4a2a25a.g(jSONObject.getBoolean("enableProgressGesture"));
            }
        } catch (org.json.JSONException e76) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "enableProgressGesture", e76.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("duration")) {
                c12262x4a2a25a.m51345xffd6ec16(jSONObject.getInt("duration"));
            }
        } catch (org.json.JSONException e77) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "disableScroll", e77.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("hide") && jSONObject.getBoolean("hide")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "%s onUpdateView hide stop", s1Var);
                c12262x4a2a25a.y();
            }
        } catch (org.json.JSONException e78) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "hide", e78.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("initialTime")) {
                c12262x4a2a25a.m51351xb9bf966f(jSONObject.getInt("initialTime"));
            }
        } catch (org.json.JSONException e79) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "initialTime", e79.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("needEvent")) {
                if (jSONObject.getBoolean("needEvent")) {
                    if (!(c12262x4a2a25a.C != null)) {
                        c12262x4a2a25a.m51339x6c4ebec7(new xe1.p(c12262x4a2a25a, tVar));
                    }
                } else {
                    c12262x4a2a25a.m51339x6c4ebec7(null);
                }
            }
        } catch (org.json.JSONException e86) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "needEvent", e86.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("showMuteBtn")) {
                c12262x4a2a25a.m51365xdb9e6204(jSONObject.getBoolean("showMuteBtn"));
            }
        } catch (org.json.JSONException e87) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showMuteBtn", e87.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
                c12262x4a2a25a.m51370x53bfe316(jSONObject.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28));
            }
        } catch (org.json.JSONException e88) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, e88.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("playBtnPosition")) {
                c12262x4a2a25a.m51360xb1769f0f(jSONObject.getString("playBtnPosition"));
            }
        } catch (org.json.JSONException e89) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "playBtnPosition", e89.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("enablePlayGesture")) {
                c12262x4a2a25a.m51346x5672bdb0(jSONObject.getBoolean("enablePlayGesture"));
            }
        } catch (org.json.JSONException e96) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "enablePlayGesture", e96.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("autoPauseIfOpenNative")) {
                c12262x4a2a25a.m51337x40e23fe3(jSONObject.getBoolean("autoPauseIfOpenNative"));
            }
        } catch (org.json.JSONException e97) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "autoPauseIfOpenNative", e97.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("autoPauseIfNavigate")) {
                c12262x4a2a25a.m51336xe1cd92d3(jSONObject.getBoolean("autoPauseIfNavigate"));
            }
        } catch (org.json.JSONException e98) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "autoPauseIfNavigate", e98.getLocalizedMessage());
        }
        try {
            if (!jSONObject.has(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1)) {
                return true;
            }
            c12262x4a2a25a.w(jSONObject.getString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1), jSONObject.optBoolean("live"), jSONObject.optInt("duration"));
            return true;
        } catch (org.json.JSONException e99) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, e99.getLocalizedMessage());
            return true;
        }
    }
}
