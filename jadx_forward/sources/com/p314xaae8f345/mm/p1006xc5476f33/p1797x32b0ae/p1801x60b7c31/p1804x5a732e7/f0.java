package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/f0;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "com/tencent/mm/plugin/lite/jsapi/comms/c0", "com/tencent/mm/plugin/lite/jsapi/comms/d0", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class f0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.c0 f225106g = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.c0(null);

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppJsApiCompressImage", "fail:data is null");
            this.f224976f.a("fail:data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("src");
        java.lang.String optString2 = jSONObject.optString(dm.i4.f66867x2a5c95c7);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = jSONObject.optString("fileExt");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppJsApiCompressImage", "fail:data localId is null");
            this.f224976f.a("fail:data localId is null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            optString = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f224975e.f380557a, optString2);
        }
        int optInt = jSONObject.optInt("quality", 80);
        if (optInt < 1 || optInt > 100) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppJsApiCompressImage", "invalid quality %d", java.lang.Integer.valueOf(optInt));
            this.f224976f.a("invalid quality");
            return;
        }
        int optInt2 = jSONObject.optInt("compressedWidth", -1);
        int optInt3 = jSONObject.optInt("compressedHeight", -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiCompressImage", "compressImage, quality:%d, src:%s", java.lang.Integer.valueOf(optInt), optString);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.e0 e0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.e0(optString, optInt, optInt2, optInt3, h0Var, this);
        java.lang.String format = java.lang.String.format(java.util.Locale.US, "AppBrandJsApiCompressImage[%s#%d]", java.util.Arrays.copyOf(new java.lang.Object[]{optString, java.lang.Integer.valueOf(optInt)}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        s75.d.c(e0Var, format, 10);
    }
}
