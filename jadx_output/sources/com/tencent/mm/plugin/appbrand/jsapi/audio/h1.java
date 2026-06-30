package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class h1 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f79199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f79200e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f79201f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.audio.k1 f79202g;

    public h1(com.tencent.mm.plugin.appbrand.jsapi.audio.k1 k1Var, com.tencent.mm.plugin.appbrand.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        this.f79202g = k1Var;
        this.f79199d = e9Var;
        this.f79200e = jSONObject;
        this.f79201f = i17;
    }

    @Override // z2.f
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 != 116) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.audio.k1 k1Var = this.f79202g;
        int i18 = this.f79201f;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f79199d;
        if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder, SYS_PERM_DENIED");
            e9Var.a(i18, k1Var.o("fail:system permission denied"));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.JsApiOperateRecorder", "PERMISSION_GRANTED, do invoke again");
            k1Var.A(e9Var, this.f79200e, i18);
        }
    }
}
