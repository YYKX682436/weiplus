package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f81038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f81039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.t f81040f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f81041g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f81042h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.file.b1 f81043i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(org.json.JSONArray jSONArray, com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, com.tencent.mm.plugin.appbrand.jsruntime.t tVar, com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.file.b1 b1Var) {
        super(1);
        this.f81038d = jSONArray;
        this.f81039e = iCommLibReader;
        this.f81040f = tVar;
        this.f81041g = v5Var;
        this.f81042h = i17;
        this.f81043i = b1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONArray jSONArray = this.f81038d;
        android.util.ArrayMap arrayMap = new android.util.ArrayMap(jSONArray.length());
        cf.d dVar = new cf.d(new com.tencent.mm.plugin.appbrand.jsapi.file.z0(arrayMap, this.f81041g, this.f81042h, this.f81043i), jSONArray.length());
        java.lang.String obj2 = obj != null ? obj.toString() : null;
        if (obj2 == null || obj2.length() == 0) {
            dVar.a();
        } else {
            java.lang.String M = this.f81039e.M(obj2);
            if (M == null || M.length() == 0) {
                arrayMap.put(obj2, "file not exists");
                dVar.a();
            } else {
                com.tencent.mm.plugin.appbrand.utils.d3.b(this.f81040f, new java.net.URL("https", com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyj), obj2), M, new com.tencent.mm.plugin.appbrand.jsapi.file.y0(arrayMap, obj2, dVar));
            }
        }
        return jz5.f0.f302826a;
    }
}
