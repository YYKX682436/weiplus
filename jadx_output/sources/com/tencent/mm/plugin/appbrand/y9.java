package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class y9 implements cl.k3 {

    /* renamed from: a, reason: collision with root package name */
    public long f92420a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f92421b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.x9 f92422c;

    public y9(com.tencent.mm.plugin.appbrand.x9 x9Var, boolean z17) {
        this.f92422c = x9Var;
        this.f92421b = z17;
    }

    public void a(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWorkerContainer", "js inject cost[%d]", java.lang.Long.valueOf(j17));
        if (this.f92421b) {
            synchronized (this.f92422c.f92387g) {
                em1.c cVar = this.f92422c.f92386f;
                cVar.f255020e = j17;
                cVar.f255021f = this.f92420a;
                java.util.Iterator it = new java.util.LinkedList(this.f92422c.f92387g).iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.appbrand.c cVar2 = (com.tencent.mm.plugin.appbrand.c) ((com.tencent.mm.plugin.appbrand.aa) it.next());
                    cVar2.f77021g = this.f92420a;
                    cVar2.f77022h = j17;
                }
            }
        }
    }
}
