package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes15.dex */
public class a1 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f78930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78931b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78932c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f78933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78935f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78936g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78937h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78938i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.appdownload.f1 f78939j;

    public a1(com.tencent.mm.plugin.appbrand.jsapi.appdownload.f1 f1Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, java.lang.String str, android.os.Bundle bundle, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.f78939j = f1Var;
        this.f78930a = e9Var;
        this.f78931b = i17;
        this.f78932c = str;
        this.f78933d = bundle;
        this.f78934e = str2;
        this.f78935f = str3;
        this.f78936g = str4;
        this.f78937h = str5;
        this.f78938i = str6;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationForNative", "on RunCgi callback errType:%d errCode:%d msg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        p95.a.a(new com.tencent.mm.plugin.appbrand.jsapi.appdownload.z0(this, i17, i18, oVar));
    }
}
