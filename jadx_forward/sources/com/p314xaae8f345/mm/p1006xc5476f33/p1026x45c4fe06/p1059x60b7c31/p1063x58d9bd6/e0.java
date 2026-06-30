package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes11.dex */
public class e0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f33785x366c91de = 159;

    /* renamed from: NAME */
    public static final java.lang.String f33786x24728b = "getBackgroundAudioState";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11976x8944bc6e c11976x8944bc6e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11976x8944bc6e();
        c11976x8944bc6e.f160518f = mo48798x74292566;
        if (!c11976x8944bc6e.s()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetBackgroundAudioState", "getBackgroundAudioState fail");
            return o("fail");
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("duration", java.lang.Double.valueOf(c11976x8944bc6e.f160519g));
        hashMap.put("currentTime", java.lang.Double.valueOf(c11976x8944bc6e.f160520h));
        hashMap.put("paused", java.lang.Boolean.valueOf(c11976x8944bc6e.f160521i == 1));
        hashMap.put("buffered", java.lang.Double.valueOf(c11976x8944bc6e.f160522m));
        hashMap.put("src", c11976x8944bc6e.f160523n);
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, c11976x8944bc6e.f160524o);
        hashMap.put("epname", c11976x8944bc6e.f160525p);
        hashMap.put("singer", c11976x8944bc6e.f160526q);
        hashMap.put("coverImgUrl", c11976x8944bc6e.f160527r);
        hashMap.put("webUrl", c11976x8944bc6e.f160528s);
        java.lang.String str = c11976x8944bc6e.f160529t;
        if (str == null) {
            str = "";
        }
        hashMap.put("protocol", str);
        hashMap.put("startTime", java.lang.Integer.valueOf(c11976x8944bc6e.f160530u / 1000));
        hashMap.put("songLyric", c11976x8944bc6e.f160531v);
        hashMap.put("playbackRate", java.lang.Double.valueOf(c11976x8944bc6e.f160532w));
        hashMap.put("referrerPolicy", c11976x8944bc6e.f160533x);
        java.lang.String str2 = android.text.TextUtils.isEmpty(c11976x8944bc6e.f160535z) ? "" : c11976x8944bc6e.f160535z;
        if (!c11976x8944bc6e.f160534y) {
            return p("ok", hashMap);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetBackgroundAudioState", "getBackgroundAudioState fail, err:%s", str2);
        return o("fail:" + str2);
    }
}
