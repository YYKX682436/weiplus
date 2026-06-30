package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class t0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.file.v0 f81126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.n[] f81128c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f81129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f81130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f81131f;

    public t0(com.tencent.mm.plugin.appbrand.jsapi.file.v0 v0Var, java.lang.String str, com.tencent.luggage.sdk.jsapi.component.n[] nVarArr, boolean[] zArr, java.lang.Object[] objArr, long j17) {
        this.f81126a = v0Var;
        this.f81127b = str;
        this.f81128c = nVarArr;
        this.f81129d = zArr;
        this.f81130e = objArr;
        this.f81131f = j17;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.appbrand.jsapi.file.v0 v0Var = this.f81126a;
        if (v0Var != null) {
            v0Var.l(this.f81127b, this.f81128c, this.f81129d, this.f81130e, this.f81131f, currentTimeMillis);
        }
    }
}
