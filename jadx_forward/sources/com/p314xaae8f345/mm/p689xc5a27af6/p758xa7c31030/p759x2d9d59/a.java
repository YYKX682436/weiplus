package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.b f148920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f148921e;

    public a(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.b bVar, int i17) {
        this.f148920d = bVar;
        this.f148921e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.b bVar = this.f148920d;
        sb6.append(bVar.f148928e);
        sb6.append('(');
        sb6.append(bVar.f148926c.e());
        sb6.append(')');
        ap.a.a(10002, "ThreadProfiler", null, null, "AdpfInspect", "alert", sb6.toString(), com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c.b(this.f148921e));
    }
}
