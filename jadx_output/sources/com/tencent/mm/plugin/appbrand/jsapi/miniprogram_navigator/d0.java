package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public class d0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f82216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d f82217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel f82218c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f82219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i0 f82220e;

    public d0(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i0 i0Var, com.tencent.mm.plugin.appbrand.y yVar, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d dVar, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel, org.json.JSONObject jSONObject) {
        this.f82220e = i0Var;
        this.f82216a = yVar;
        this.f82217b = dVar;
        this.f82218c = launchParcel;
        this.f82219d = jSONObject;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        km5.u.a(this.f82220e.d(this.f82216a, this.f82217b, this.f82218c, this.f82219d));
        return null;
    }
}
