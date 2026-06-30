package com.tencent.mm.plugin.appbrand.jsapi.advertise;

/* loaded from: classes.dex */
public final class t implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f78773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78774b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.advertise.u f78775c;

    public t(com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.advertise.u uVar) {
        this.f78773a = c0Var;
        this.f78774b = i17;
        this.f78775c = uVar;
    }

    @Override // nf.j
    public final void onResult(int i17, android.content.Intent intent) {
        this.f78773a.a(this.f78774b, this.f78775c.o("ok"));
    }
}
