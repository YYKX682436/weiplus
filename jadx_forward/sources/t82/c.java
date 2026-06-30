package t82;

/* loaded from: classes11.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f497914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f497915e;

    public c(int i17, java.lang.Runnable runnable) {
        this.f497914d = i17;
        this.f497915e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h3 a17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h3.f182661c.a();
        int i17 = this.f497914d;
        if (a17.a(i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderStorage", "[remove] use pos remove item in favIdList & favItemList, currentThread = " + java.lang.Thread.currentThread().getName());
            a17.f182664b.remove(i17);
            a17.f182663a.remove(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderStorage", "[remove] remove success, position = " + i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavFinderStorage", "[remove] position invalid return");
        }
        this.f497915e.run();
    }
}
