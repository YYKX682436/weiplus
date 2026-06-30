package wt3;

/* loaded from: classes5.dex */
public final class d1 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt3.e1 f530924d;

    public d1(wt3.e1 e1Var) {
        this.f530924d = e1Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        wt3.e1 e1Var = this.f530924d;
        java.lang.String str = e1Var.f530941i;
        int i17 = e1Var.f530985b;
        int i18 = e1Var.f530986c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThumbFetcherFactory", "get thumb fetcher, ish265: %s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p962x4177e4be.j.h(str)));
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.p();
        pVar.mo66870x316510(str, e1Var.f530945m, i17, i18);
        return pVar;
    }
}
