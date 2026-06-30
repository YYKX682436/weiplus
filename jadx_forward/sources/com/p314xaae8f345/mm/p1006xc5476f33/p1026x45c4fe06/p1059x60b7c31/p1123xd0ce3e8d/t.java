package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d;

/* loaded from: classes7.dex */
public final class t extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34974x366c91de = 1206;

    /* renamed from: NAME */
    public static final java.lang.String f34975x24728b = "requestSRFile";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f165389g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f165390h = "";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiRequestSRFile", "invoke, env is null");
            return;
        }
        if (wo.w0.q()) {
            this.f165389g = "https://mmgame.qpic.cn/h5/minigame/cloudgame/arm64-v8a.zip";
            this.f165390h = "1ac39c1bb2d8db344b671a40401c4b9a";
        } else {
            this.f165389g = "https://mmgame.qpic.cn/h5/minigame/cloudgame/armeabi-v7a.zip";
            this.f165390h = "da7b68479bd4bd7b510bb66105e65795";
        }
        java.lang.String cdnUrl = this.f165389g;
        java.lang.String fileMd5 = this.f165390h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnUrl, "cdnUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileMd5, "fileMd5");
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.C12288xc9934c61(cdnUrl, fileMd5), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.r.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.s(lVar, i17, this));
    }
}
