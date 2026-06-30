package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class g4 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f81820e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f81821f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.q4 f81822g;

    public g4(com.tencent.mm.plugin.appbrand.jsapi.media.q4 q4Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        this.f81822g = q4Var;
        this.f81819d = lVar;
        this.f81820e = jSONObject;
        this.f81821f = i17;
    }

    @Override // z2.f
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 != 113) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.media.q4 q4Var = this.f81822g;
        int i18 = this.f81821f;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81819d;
        if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
            lVar.a(i18, q4Var.o("fail:system permission denied"));
        } else {
            q4Var.A(lVar, this.f81820e, i18);
        }
    }
}
