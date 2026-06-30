package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public class p0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f82257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel f82258b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d f82259c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f82260d;

    public p0(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.q0 q0Var, com.tencent.mm.plugin.appbrand.y yVar, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d dVar, org.json.JSONObject jSONObject) {
        this.f82257a = yVar;
        this.f82258b = launchParcel;
        this.f82259c = dVar;
        this.f82260d = jSONObject;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        km5.b c17 = km5.u.c();
        new com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask(this.f82257a.getF147807d(), this.f82258b, new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.o0(this, c17)).H(true).G(false).I();
        return null;
    }
}
