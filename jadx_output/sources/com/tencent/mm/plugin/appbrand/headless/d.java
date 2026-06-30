package com.tencent.mm.plugin.appbrand.headless;

/* loaded from: classes7.dex */
public final class d implements com.tencent.mm.ipcinvoker.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78290b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f78291c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.headless.p f78292d;

    public d(java.lang.String str, int i17, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.tencent.mm.plugin.appbrand.headless.p pVar) {
        this.f78289a = str;
        this.f78290b = i17;
        this.f78291c = atomicBoolean;
        this.f78292d = pVar;
    }

    @Override // com.tencent.mm.ipcinvoker.s0
    public void a() {
        com.tencent.mm.plugin.appbrand.headless.p pVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindRemoteService onRemoteProcessDied(");
        java.lang.String str = this.f78289a;
        sb6.append(str);
        sb6.append("), id:");
        sb6.append(this.f78290b);
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandHeadlessStartService", sb6.toString());
        if (!this.f78291c.getAndSet(true) && (pVar = this.f78292d) != null) {
            com.tencent.mm.plugin.appbrand.headless.p.b(pVar, -5, null, 2, null);
        }
        com.tencent.mm.ipcinvoker.d0.i(str, this);
    }
}
