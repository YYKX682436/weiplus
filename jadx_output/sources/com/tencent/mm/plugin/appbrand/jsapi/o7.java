package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes15.dex */
public class o7 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f82448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82449b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82450c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82453f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82454g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82455h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82456i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f82457j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f82458k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82459l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.x7 f82460m;

    public o7(com.tencent.mm.plugin.appbrand.jsapi.x7 x7Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, org.json.JSONObject jSONObject, android.os.Bundle bundle, java.lang.String str8) {
        this.f82460m = x7Var;
        this.f82448a = e9Var;
        this.f82449b = i17;
        this.f82450c = str;
        this.f82451d = str2;
        this.f82452e = str3;
        this.f82453f = str4;
        this.f82454g = str5;
        this.f82455h = str6;
        this.f82456i = str7;
        this.f82457j = jSONObject;
        this.f82458k = bundle;
        this.f82459l = str8;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "on RunCgi callback errType:%d errCode:%d msg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        p95.a.a(new com.tencent.mm.plugin.appbrand.jsapi.n7(this, i17, i18, oVar));
    }
}
