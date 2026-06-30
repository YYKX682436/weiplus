package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f76585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f76586e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f76587f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f76588g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f76589h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f76590i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f76591m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.b1 f76592n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ft.i f76593o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.c1 f76594p;

    public v0(com.tencent.mm.plugin.appbrand.appusage.c1 c1Var, int i17, int i18, boolean z17, long j17, android.os.Bundle bundle, int i19, long j18, com.tencent.mm.plugin.appbrand.appusage.b1 b1Var, ft.i iVar) {
        this.f76594p = c1Var;
        this.f76585d = i17;
        this.f76586e = i18;
        this.f76587f = z17;
        this.f76588g = j17;
        this.f76589h = bundle;
        this.f76590i = i19;
        this.f76591m = j18;
        this.f76592n = b1Var;
        this.f76593o = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.appusage.c1 c1Var = this.f76594p;
        int i17 = this.f76585d;
        int i18 = this.f76586e;
        boolean z17 = this.f76587f;
        java.lang.Integer num = com.tencent.mm.plugin.appbrand.appusage.x2.f76645d;
        com.tencent.mm.plugin.appbrand.appusage.c1.m0(c1Var, i17, i18, (z17 & true ? 2 : 0) | 1, this.f76588g, z17, this.f76589h, this.f76590i, this.f76591m, this.f76592n, this.f76593o);
    }
}
