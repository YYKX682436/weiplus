package com.tencent.mm.plugin.appbrand.jsapi.picker;

/* loaded from: classes15.dex */
public final class k0 extends com.tencent.mm.plugin.appbrand.jsapi.picker.k {

    /* renamed from: m, reason: collision with root package name */
    public int f82745m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f82746n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f82747o = Integer.MAX_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public int f82748p = Integer.MAX_VALUE;

    /* renamed from: q, reason: collision with root package name */
    public int f82749q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f82750r = -1;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.k
    public void e(org.json.JSONObject jSONObject) {
        super.e(jSONObject);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.k
    public void f(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("range");
        if (optJSONObject != null) {
            java.lang.String optString = optJSONObject.optString("start");
            java.lang.String optString2 = optJSONObject.optString("end");
            int[] a17 = tl1.c0.a(optString);
            if (a17 != null) {
                this.f82745m = a17[0];
                this.f82746n = a17[1];
            }
            int[] a18 = tl1.c0.a(optString2);
            if (a18 != null) {
                this.f82747o = a18[0];
                this.f82748p = a18[1];
            }
        }
        this.f82745m = java.lang.Math.max(this.f82745m, 0);
        this.f82746n = java.lang.Math.max(this.f82746n, 0);
        this.f82747o = java.lang.Math.min(this.f82747o, 23);
        this.f82748p = java.lang.Math.min(this.f82748p, 59);
        int[] a19 = tl1.c0.a(jSONObject.optString("current"));
        if (a19 != null) {
            this.f82749q = a19[0];
            this.f82750r = a19[1];
        }
        h(new com.tencent.mm.plugin.appbrand.jsapi.picker.i0(this));
    }
}
