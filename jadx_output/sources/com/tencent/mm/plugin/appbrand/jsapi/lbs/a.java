package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class a implements nf.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f81387b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f81388c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.b f81389d;

    public a(com.tencent.mm.plugin.appbrand.jsapi.lbs.b bVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        this.f81389d = bVar;
        this.f81386a = lVar;
        this.f81387b = jSONObject;
        this.f81388c = i17;
    }

    @Override // nf.n
    public void b(java.lang.String[] strArr, int[] iArr) {
        int i17 = this.f81388c;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81386a;
        com.tencent.mm.plugin.appbrand.jsapi.lbs.b bVar = this.f81389d;
        if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BaseLbsAsyncJsApi", "PERMISSION_GRANTED, do invoke again");
            bVar.A(lVar, this.f81387b, i17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.BaseLbsAsyncJsApi", "SYS_PERM_DENIED");
            bVar.f81391g = true;
            lVar.a(i17, bVar.o("fail:system permission denied"));
        }
    }
}
