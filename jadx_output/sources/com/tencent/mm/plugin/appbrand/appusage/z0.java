package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f76663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i11.e f76664e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.c1 f76665f;

    public z0(com.tencent.mm.plugin.appbrand.appusage.c1 c1Var, java.lang.Runnable runnable, i11.e eVar) {
        this.f76665f = c1Var;
        this.f76663d = runnable;
        this.f76664e = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHistoryLogic[collection]", "locTimeOut isGettingLocation:%b", java.lang.Boolean.valueOf(this.f76665f.f76400f));
        if (this.f76665f.f76400f) {
            this.f76663d.run();
            synchronized (this.f76665f) {
                this.f76665f.f76400f = false;
            }
            i11.c cVar = this.f76665f.f76403i;
            if (cVar != null) {
                ((i11.h) this.f76664e).m(cVar);
            }
        }
    }
}
