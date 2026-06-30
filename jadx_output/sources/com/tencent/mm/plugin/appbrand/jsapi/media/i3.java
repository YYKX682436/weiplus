package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class i3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest f81846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f81848f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f81849g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.z3 f81850h;

    public i3(com.tencent.mm.plugin.appbrand.jsapi.media.z3 z3Var, com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest jsApiChooseMedia$ChooseRequest, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        this.f81850h = z3Var;
        this.f81846d = jsApiChooseMedia$ChooseRequest;
        this.f81847e = lVar;
        this.f81848f = jSONObject;
        this.f81849g = i17;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        int i18 = this.f81849g;
        org.json.JSONObject jSONObject = this.f81848f;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81847e;
        com.tencent.mm.plugin.appbrand.jsapi.media.z3 z3Var = this.f81850h;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest jsApiChooseMedia$ChooseRequest = this.f81846d;
        if (itemId == 1) {
            jsApiChooseMedia$ChooseRequest.f81635e = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "reset toAlbum to false");
            z3Var.C(lVar, jSONObject, i18, jsApiChooseMedia$ChooseRequest);
        } else {
            if (itemId != 2) {
                return;
            }
            jsApiChooseMedia$ChooseRequest.f81636f = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "reset toCamera to false");
            z3Var.C(lVar, jSONObject, i18, jsApiChooseMedia$ChooseRequest);
        }
    }
}
