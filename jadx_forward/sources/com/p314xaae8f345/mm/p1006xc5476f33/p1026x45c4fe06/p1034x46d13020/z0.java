package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f158196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i11.e f158197e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1 f158198f;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1 c1Var, java.lang.Runnable runnable, i11.e eVar) {
        this.f158198f = c1Var;
        this.f158196d = runnable;
        this.f158197e = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHistoryLogic[collection]", "locTimeOut isGettingLocation:%b", java.lang.Boolean.valueOf(this.f158198f.f157933f));
        if (this.f158198f.f157933f) {
            this.f158196d.run();
            synchronized (this.f158198f) {
                this.f158198f.f157933f = false;
            }
            i11.c cVar = this.f158198f.f157936i;
            if (cVar != null) {
                ((i11.h) this.f158197e).m(cVar);
            }
        }
    }
}
