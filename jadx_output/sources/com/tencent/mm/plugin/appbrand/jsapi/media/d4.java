package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class d4 implements lk1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f81772d;

    public d4(com.tencent.mm.plugin.appbrand.jsapi.media.q4 q4Var, android.content.Context context) {
        this.f81772d = context;
    }

    @Override // lk1.b
    public void j(int i17, java.lang.String str, lk1.a aVar) {
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "onLocationChange error, errCode: %d.", java.lang.Integer.valueOf(i17));
            return;
        }
        this.f81772d.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_locCache", 0).edit().putString("locStr", ((int) (aVar.f318996a * 1000000.0d)) + "," + ((int) (aVar.f318997b * 1000000.0d))).apply();
        ((lk1.c) nd.f.a(lk1.c.class)).ia("wgs84", this, null);
    }
}
