package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes15.dex */
public class d7 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f80739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80740b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f80741c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f80743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80744f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80745g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80746h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80747i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80748j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.i7 f80749k;

    public d7(com.tencent.mm.plugin.appbrand.jsapi.i7 i7Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, org.json.JSONObject jSONObject, java.lang.String str, android.os.Bundle bundle, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.f80749k = i7Var;
        this.f80739a = e9Var;
        this.f80740b = i17;
        this.f80741c = jSONObject;
        this.f80742d = str;
        this.f80743e = bundle;
        this.f80744f = str2;
        this.f80745g = str3;
        this.f80746h = str4;
        this.f80747i = str5;
        this.f80748j = str6;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplication", "on RunCgi callback errType:%d errCode:%d msg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        p95.a.a(new com.tencent.mm.plugin.appbrand.jsapi.c7(this, i17, i18, oVar));
    }
}
