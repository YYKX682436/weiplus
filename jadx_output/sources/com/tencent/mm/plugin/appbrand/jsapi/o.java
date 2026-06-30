package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f82437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k0 f82439f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82440g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82441h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82442i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.c0 f82443m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.m f82444n;

    public o(com.tencent.mm.plugin.appbrand.jsapi.m mVar, int i17, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, java.lang.String str2, java.lang.String str3, int i18, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        this.f82444n = mVar;
        this.f82437d = i17;
        this.f82438e = str;
        this.f82439f = k0Var;
        this.f82440g = str2;
        this.f82441h = str3;
        this.f82442i = i18;
        this.f82443m = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f82444n.f81583p.a(this.f82437d, this.f82438e);
        com.tencent.mm.plugin.appbrand.jsapi.m mVar = this.f82444n;
        mVar.o0(this.f82439f, this.f82440g, this.f82441h, this.f82442i, this.f82443m, mVar.j0().getLooper());
    }
}
