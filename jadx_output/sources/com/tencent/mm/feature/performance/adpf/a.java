package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.performance.adpf.b f67387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f67388e;

    public a(com.tencent.mm.feature.performance.adpf.b bVar, int i17) {
        this.f67387d = bVar;
        this.f67388e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.feature.performance.adpf.b bVar = this.f67387d;
        sb6.append(bVar.f67395e);
        sb6.append('(');
        sb6.append(bVar.f67393c.e());
        sb6.append(')');
        ap.a.a(10002, "ThreadProfiler", null, null, "AdpfInspect", "alert", sb6.toString(), com.tencent.mm.feature.performance.adpf.c.b(this.f67388e));
    }
}
