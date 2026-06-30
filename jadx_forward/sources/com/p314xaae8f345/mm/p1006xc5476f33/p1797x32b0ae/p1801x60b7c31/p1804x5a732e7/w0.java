package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/w0;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class w0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString = jSONObject != null ? jSONObject.optString("md5") : null;
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("emojiInfo") : null;
        java.lang.String optString3 = jSONObject != null ? jSONObject.optString("aesKey") : null;
        java.lang.String optString4 = jSONObject != null ? jSONObject.optString("cdnUrl") : null;
        java.lang.String optString5 = jSONObject != null ? jSONObject.optString("encryptUrl") : null;
        java.lang.String optString6 = jSONObject != null ? jSONObject.optString("externMd5") : null;
        java.lang.String optString7 = jSONObject != null ? jSONObject.optString("externUrl") : null;
        java.lang.String optString8 = jSONObject != null ? jSONObject.optString("tpUrl") : null;
        java.lang.String optString9 = jSONObject != null ? jSONObject.optString("authKey") : null;
        if (str == null || optString == null) {
            this.f224976f.a("emoticonGetSingleEmotionPath:fail_missing arguments");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiEmoticonGetSingleEmotionPath", "invoke: " + c());
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Zi = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class))).Zi(optString, optString2);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Zi).f68642xf11e6e15 = optString3;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString4)) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Zi).f68654xf47770e7 = optString4;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString5)) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Zi).f68659x5efe714f = optString5;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString6)) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Zi).f68660x7650f4b9 = optString6;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString7)) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Zi).f68661x765114aa = optString7;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString8)) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Zi).f68688x29e035ee = optString8;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString9)) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Zi).f68687x159b18b6 = optString9;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6 o6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.v0 v0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.v0(optString, this);
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 c4Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) o6Var;
        c4Var.getClass();
        c4Var.ij(Zi, true, v0Var);
    }
}
