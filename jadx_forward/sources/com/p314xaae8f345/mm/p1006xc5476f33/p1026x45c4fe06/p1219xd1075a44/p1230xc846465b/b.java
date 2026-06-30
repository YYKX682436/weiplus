package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes7.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.d f173470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f173471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f173472f;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.d dVar, java.lang.String str, l75.w0 w0Var) {
        this.f173470d = dVar;
        this.f173471e = str;
        this.f173472f = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsAppBrandStorageWithCache", "notify cache update");
        java.util.Set set = this.f173470d.f173495f;
        java.lang.String str = this.f173471e;
        l75.w0 w0Var = this.f173472f;
        synchronized (set) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((l75.q0) it.next()).mo735xb0dfc7d8(str, w0Var);
            }
        }
        this.f173470d.f(this.f173471e, this.f173472f);
    }
}
