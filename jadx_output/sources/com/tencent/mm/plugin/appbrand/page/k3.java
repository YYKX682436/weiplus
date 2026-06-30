package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f86819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86820e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f86821f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oi1.k f86822g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86823h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f86824i;

    public k3(com.tencent.mm.plugin.appbrand.page.i3 i3Var, int i17, java.lang.String str, org.json.JSONObject jSONObject, oi1.k kVar, java.lang.String str2) {
        this.f86824i = i3Var;
        this.f86819d = i17;
        this.f86820e = str;
        this.f86821f = jSONObject;
        this.f86822g = kVar;
        this.f86823h = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.i3.f(this.f86824i, this.f86819d, this.f86820e, this.f86821f, this.f86822g, this.f86823h);
    }
}
