package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class g6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34479x366c91de = 732;

    /* renamed from: NAME */
    public static final java.lang.String f34480x24728b = "getVideoInfo";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetVideoInfo", "fail:internal error");
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiGetVideoInfo", "fail:data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        if (lVar.mo50354x59eafec1() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiGetVideoInfo", "fail:file system is null");
            lVar.a(i17, o("fail:internal error"));
            return;
        }
        java.lang.String optString = jSONObject.optString("src");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiGetVideoInfo", "fail:data src is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        if (!optString.startsWith("wxfile://")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiGetVideoInfo", "fail:src path not supported");
            lVar.a(i17, o("fail:src path not be supported"));
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = lVar.mo50354x59eafec1().mo49620x1d537609(optString);
        if (mo49620x1d537609 == null) {
            lVar.a(i17, o("fail:file doesn't exist"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.s7 c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t7.c(mo49620x1d537609.o());
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiGetVideoInfo", "fail:videoInfo is null");
            lVar.a(i17, o("fail:can't get info from video file"));
            return;
        }
        int i18 = c17.f163584a;
        java.lang.String str = i18 != 90 ? i18 != 180 ? i18 != 270 ? "up" : "left" : "down" : "right";
        java.util.HashMap hashMap = new java.util.HashMap(8);
        hashMap.put("orientation", str);
        hashMap.put("type", c17.f163585b);
        hashMap.put("duration", java.lang.Float.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1(new java.text.DecimalFormat("#.#").format((c17.f163586c * 1.0f) / 1000.0f))));
        hashMap.put("size", java.lang.Integer.valueOf(java.lang.Math.round((((float) c17.f163587d) * 1.0f) / 1024.0f)));
        hashMap.put("height", java.lang.Integer.valueOf(c17.f163589f));
        hashMap.put("width", java.lang.Integer.valueOf(c17.f163588e));
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, java.lang.Integer.valueOf(java.lang.Math.round((c17.f163590g * 1.0f) / 1000.0f)));
        hashMap.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1, java.lang.Float.valueOf(c17.f163591h));
        lVar.a(i17, p("ok", hashMap));
    }
}
