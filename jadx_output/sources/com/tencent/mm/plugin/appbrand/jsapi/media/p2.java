package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class p2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f81986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f81987f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f81988g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.e3 f81989h;

    public p2(com.tencent.mm.plugin.appbrand.jsapi.media.e3 e3Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17, android.content.Context context) {
        this.f81989h = e3Var;
        this.f81985d = lVar;
        this.f81986e = jSONObject;
        this.f81987f = i17;
        this.f81988g = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f81985d.getContext();
        com.tencent.mm.plugin.appbrand.jsapi.media.n2 n2Var = new com.tencent.mm.plugin.appbrand.jsapi.media.n2(this);
        com.tencent.mm.plugin.appbrand.jsapi.media.o2 o2Var = new com.tencent.mm.plugin.appbrand.jsapi.media.o2(this);
        com.tencent.mm.plugin.appbrand.jsapi.media.e3 e3Var = this.f81989h;
        e3Var.getClass();
        com.tencent.mm.ui.tools.s6 s6Var = new com.tencent.mm.ui.tools.s6(context);
        s6Var.f210721e.C = new com.tencent.mm.plugin.appbrand.jsapi.media.r2(e3Var, o2Var);
        s6Var.a(null, new com.tencent.mm.plugin.appbrand.jsapi.media.s2(e3Var, context), n2Var, new com.tencent.mm.plugin.appbrand.jsapi.media.t2(e3Var, o2Var));
    }
}
