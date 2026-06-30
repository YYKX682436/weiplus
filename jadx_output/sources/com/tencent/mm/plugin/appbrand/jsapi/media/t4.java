package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class t4 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f82073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f82074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f82075f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.a5 f82076g;

    public t4(com.tencent.mm.plugin.appbrand.jsapi.media.a5 a5Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        this.f82076g = a5Var;
        this.f82073d = lVar;
        this.f82074e = jSONObject;
        this.f82075f = i17;
    }

    @Override // z2.f
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 != 115) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.media.a5 a5Var = this.f82076g;
        int i18 = this.f82075f;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f82073d;
        if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
            lVar.a(i18, a5Var.o("fail:system permission denied"));
        } else {
            a5Var.A(lVar, this.f82074e, i18);
        }
    }
}
