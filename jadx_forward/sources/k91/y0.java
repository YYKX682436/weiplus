package k91;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk91/y0;", "Lcom/tencent/mm/plugin/appbrand/jsapi/g0;", "<init>", "()V", "luggage-wxa-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class y0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f387356d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public k91.r f387357e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3 f387358f;

    public final void a(k91.r rVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3 y3Var, java.lang.String str) {
        java.io.InputStream i17 = y3Var.i(s46.c.a(str, "plugin.json"));
        java.lang.String d17 = i17 == null ? null : s46.d.d(i17, java.nio.charset.StandardCharsets.UTF_8);
        java.io.InputStream i18 = y3Var.i(s46.c.a(str, "plugin-darkmode.json"));
        java.lang.String d18 = i18 != null ? s46.d.d(i18, java.nio.charset.StandardCharsets.UTF_8) : null;
        rVar.getClass();
        java.util.Map emptyMap = java.util.Collections.emptyMap();
        try {
            if (!android.text.TextUtils.isEmpty(d17)) {
                emptyMap = k91.r.i(new org.json.JSONObject(d17).optJSONObject(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f), rVar.f387272f, rVar.f387289z);
            }
        } catch (java.lang.Exception e17) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = str;
            objArr[1] = java.lang.Integer.valueOf(emptyMap == null ? -1 : emptyMap.size());
            objArr[2] = e17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandAppConfig", "addPageConfigs(%s), parse extPagesJson(%d) get exception:%s", objArr);
        }
        java.util.Map emptyMap2 = java.util.Collections.emptyMap();
        try {
            if (!android.text.TextUtils.isEmpty(d18)) {
                emptyMap2 = k91.r.i(new org.json.JSONObject(d18).optJSONObject(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f), rVar.f387273g, rVar.f387289z);
            }
        } catch (java.lang.Exception e18) {
            java.lang.Object[] objArr2 = new java.lang.Object[3];
            objArr2[0] = str;
            objArr2[1] = java.lang.Integer.valueOf(emptyMap2 != null ? emptyMap2.size() : -1);
            objArr2[2] = e18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandAppConfig", "addPageConfigs(%s), parse extDarkModePagesJson(%d) get exception:%s", objArr2);
        }
        if (emptyMap.isEmpty() && emptyMap2.isEmpty()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAppConfig", "addPageConfigs(%s), extPages.size:%d, extDarkModePages.size:%d", str, java.lang.Integer.valueOf(emptyMap.size()), java.lang.Integer.valueOf(emptyMap2.size()));
        synchronized (rVar.f387274h) {
            ((java.util.HashMap) rVar.f387275i).putAll(emptyMap);
            java.util.Map map = rVar.f387276m;
            if (map != null) {
                map.putAll(emptyMap2);
            }
        }
    }
}
