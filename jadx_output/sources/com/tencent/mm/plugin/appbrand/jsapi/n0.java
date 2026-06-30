package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f82355a;

    /* renamed from: b, reason: collision with root package name */
    public final org.json.JSONObject f82356b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82357c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f82358d;

    public n0(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var, org.json.JSONObject jSONObject, int i17) {
        if (k0Var == null || e9Var == null || jSONObject == null) {
            throw new java.lang.IllegalArgumentException("JsApiAsyncRequest");
        }
        this.f82358d = k0Var;
        this.f82355a = e9Var;
        this.f82357c = i17;
        this.f82356b = jSONObject;
    }
}
