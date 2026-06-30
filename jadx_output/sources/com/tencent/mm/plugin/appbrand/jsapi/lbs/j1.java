package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class j1 extends k75.k implements com.tencent.mm.plugin.appbrand.jsapi.h0 {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.lbs.c f81434g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.lbs.d f81435h;

    /* renamed from: i, reason: collision with root package name */
    public final lk1.b f81436i;

    /* renamed from: m, reason: collision with root package name */
    public android.os.Bundle f81437m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f81438n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f81439o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f81440p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f81441q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.lbs.i1 f81442r;

    /* renamed from: s, reason: collision with root package name */
    public final k75.c f81443s;

    /* renamed from: t, reason: collision with root package name */
    public final k75.c f81444t;

    /* renamed from: u, reason: collision with root package name */
    public final k75.c f81445u;

    public j1(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        super("RuntimeLocationUpdateStateManager[" + lVar.getAppId() + "]", android.os.Looper.getMainLooper());
        this.f81436i = new com.tencent.mm.plugin.appbrand.jsapi.lbs.e1(this);
        this.f81439o = false;
        this.f81440p = false;
        this.f81441q = false;
        com.tencent.mm.plugin.appbrand.jsapi.lbs.f1 f1Var = new com.tencent.mm.plugin.appbrand.jsapi.lbs.f1(this);
        this.f81443s = f1Var;
        com.tencent.mm.plugin.appbrand.jsapi.lbs.g1 g1Var = new com.tencent.mm.plugin.appbrand.jsapi.lbs.g1(this);
        this.f81444t = g1Var;
        com.tencent.mm.plugin.appbrand.jsapi.lbs.h1 h1Var = new com.tencent.mm.plugin.appbrand.jsapi.lbs.h1(this);
        this.f81445u = h1Var;
        this.f81434g = new com.tencent.mm.plugin.appbrand.jsapi.lbs.c(lVar);
        this.f81435h = new com.tencent.mm.plugin.appbrand.jsapi.lbs.d(lVar);
        c(f1Var);
        c(g1Var);
        c(h1Var);
        m(f1Var);
    }
}
