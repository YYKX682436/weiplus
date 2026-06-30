package id3;

@fd3.a(m129354x337a8b = "batchUpdateWepkg")
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lid3/a;", "Llc3/e;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/d;", "<init>", "()V", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a<T extends lc3.e> extends com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.d {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f372442h = "MBJsApiBatchUpdateWepkg";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.d
    public void c(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String str = this.f372442h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "invokeInMM");
        java.lang.String optString = data.optString("pkgIdList");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(optString);
                if (jSONArray.length() > 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int length = jSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        java.lang.String optString2 = jSONArray.optString(i17);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                        arrayList.add(optString2);
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6276xb08681d3 c6276xb08681d3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6276xb08681d3();
                        am.t20 t20Var = c6276xb08681d3.f136525g;
                        t20Var.f89502a = 8;
                        t20Var.f89508g = 0;
                        t20Var.f89509h = arrayList;
                        c6276xb08681d3.e();
                        a(e());
                        return;
                    }
                }
            } catch (org.json.JSONException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "data is not json");
                lc3.z zVar = lc3.t.f399453a;
                lc3.c0 c0Var = this.f229583g;
                if (c0Var != null) {
                    a(c0Var.i(zVar));
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFakeJsApi");
                    throw null;
                }
            }
        }
        a(d(6, "pkgIds is null"));
    }
}
