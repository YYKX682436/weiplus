package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f77722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77724f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77725g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77726h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f77727i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77728m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77729n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f77730o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f77731p;

    public d0(com.tencent.mm.plugin.appbrand.debugger.c0 c0Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, l81.b1 b1Var, java.lang.String str5, java.lang.String str6, int i18, boolean z17) {
        this.f77722d = i17;
        this.f77723e = str;
        this.f77724f = str2;
        this.f77725g = str3;
        this.f77726h = str4;
        this.f77727i = b1Var;
        this.f77728m = str5;
        this.f77729n = str6;
        this.f77730o = i18;
        this.f77731p = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f77722d;
        if (com.tencent.mm.plugin.appbrand.appcache.g0.a(i17) && !android.text.TextUtils.isEmpty(this.f77723e) && !android.text.TextUtils.isEmpty(this.f77724f)) {
            com.tencent.mm.plugin.appbrand.app.r9.Di().k(this.f77725g, this.f77722d, this.f77723e, this.f77724f, 0L, 0L);
        }
        boolean a17 = com.tencent.mm.plugin.appbrand.appcache.g0.a(i17);
        java.lang.String str = this.f77725g;
        if (a17) {
            java.lang.String str2 = this.f77726h;
            if (!android.text.TextUtils.isEmpty(str2)) {
                ((com.tencent.mm.plugin.appbrand.launching.a5) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.launching.a5.class)).z0(str, i17, str2);
            }
        }
        l81.b1 b1Var = this.f77727i;
        b1Var.f317014b = str;
        b1Var.f317012a = this.f77728m;
        b1Var.f317016c = i17;
        b1Var.f317022f = this.f77729n;
        b1Var.f317018d = this.f77730o;
        b1Var.f317032k = mc1.c.CTRL_INDEX;
        b1Var.f317013a0 = this.f77731p;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(com.tencent.mm.sdk.platformtools.x2.f193071a, b1Var);
    }
}
