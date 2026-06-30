package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f86782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f86784f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oi1.k f86785g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f86786h;

    public j3(com.tencent.mm.plugin.appbrand.page.i3 i3Var, int i17, java.lang.String str, org.json.JSONObject jSONObject, oi1.k kVar) {
        this.f86786h = i3Var;
        this.f86782d = i17;
        this.f86783e = str;
        this.f86784f = jSONObject;
        this.f86785g = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.i3.f(this.f86786h, this.f86782d, this.f86783e, this.f86784f, this.f86785g, null);
    }
}
