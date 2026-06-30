package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes11.dex */
public final class i0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f33795x366c91de = 1318;

    /* renamed from: NAME */
    public static final java.lang.String f33796x24728b = "getTingAudioState";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l service, org.json.JSONObject data) {
        java.lang.String mErrorMsg;
        java.lang.String concat;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String mo48798x74292566 = service.mo48798x74292566();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11978x73bd47ae c11978x73bd47ae = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11978x73bd47ae();
        c11978x73bd47ae.U(mo48798x74292566);
        if (!c11978x73bd47ae.s()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.JsApiGetTingAudioState", "getTingAudioState fail");
            concat = android.text.TextUtils.isEmpty(null) ? "fail" : null;
            str = concat != null ? concat : "";
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            java.lang.String u17 = u(str, jSONObject);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "makeReturnJson(...)");
            return u17;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("duration", java.lang.Double.valueOf(c11978x73bd47ae.getDuration()));
        hashMap.put("currentTime", java.lang.Double.valueOf(c11978x73bd47ae.getCurrentTime()));
        hashMap.put("paused", java.lang.Boolean.valueOf(c11978x73bd47ae.getPaused() == 1));
        hashMap.put("buffered", java.lang.Double.valueOf(c11978x73bd47ae.getBuffered()));
        hashMap.put("src", c11978x73bd47ae.getSrc());
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, c11978x73bd47ae.getCom.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE java.lang.String());
        hashMap.put("epname", c11978x73bd47ae.getEpname());
        hashMap.put("singer", c11978x73bd47ae.getSinger());
        hashMap.put("coverImgUrl", c11978x73bd47ae.getCoverImgUrl());
        hashMap.put("webUrl", c11978x73bd47ae.getWebUrl());
        hashMap.put("protocol", c11978x73bd47ae.getProtocol() == null ? "" : c11978x73bd47ae.getProtocol());
        hashMap.put("startTime", java.lang.Integer.valueOf(c11978x73bd47ae.getStartTime()));
        hashMap.put("songLyric", c11978x73bd47ae.getSongLyric());
        hashMap.put("playbackRate", java.lang.Double.valueOf(c11978x73bd47ae.getPlaybackRate()));
        if (android.text.TextUtils.isEmpty(c11978x73bd47ae.getMErrorMsg())) {
            mErrorMsg = "";
        } else {
            mErrorMsg = c11978x73bd47ae.getMErrorMsg();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mErrorMsg);
        }
        if (!c11978x73bd47ae.getError()) {
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 0);
            java.lang.String t17 = t("ok", hashMap);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t17);
            return t17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.JsApiGetTingAudioState", "getTingAudioState fail, err:".concat(mErrorMsg));
        concat = android.text.TextUtils.isEmpty(null) ? "fail:".concat(mErrorMsg) : null;
        str = concat != null ? concat : "";
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        java.lang.String u18 = u(str, jSONObject2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u18);
        return u18;
    }
}
