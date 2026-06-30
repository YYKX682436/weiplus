package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class j8 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f81328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f81329e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.m8 f81330f;

    public j8(com.tencent.mm.plugin.appbrand.jsapi.m8 m8Var, com.tencent.mm.plugin.appbrand.y yVar, int i17) {
        this.f81330f = m8Var;
        this.f81328d = yVar;
        this.f81329e = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.tencent.mm.plugin.appbrand.jsapi.m8 m8Var = this.f81330f;
        int i17 = this.f81329e;
        com.tencent.mm.plugin.appbrand.y yVar = this.f81328d;
        if (bundle == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOfflineUserBindQuery", "onCallback，data == null");
            yVar.a(i17, m8Var.o("fail"));
        } else {
            java.lang.String string = bundle.getString("errMsg", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOfflineUserBindQuery", "onCallback，result ：%s", string);
            yVar.a(i17, m8Var.o(string));
        }
    }
}
