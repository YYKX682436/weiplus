package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class z2 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f79323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f79324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f79325f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.audio.d3 f79326g;

    public z2(com.tencent.mm.plugin.appbrand.jsapi.audio.d3 d3Var, com.tencent.mm.plugin.appbrand.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        this.f79326g = d3Var;
        this.f79323d = e9Var;
        this.f79324e = jSONObject;
        this.f79325f = i17;
    }

    @Override // z2.f
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 != 116) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.audio.d3 d3Var = this.f79326g;
        int i18 = this.f79325f;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f79323d;
        if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
            e9Var.a(i18, d3Var.o("fail:system permission denied"));
        } else {
            d3Var.A(e9Var, this.f79324e, i18);
        }
    }
}
