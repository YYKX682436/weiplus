package t82;

/* loaded from: classes11.dex */
public final class d extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f497916d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f497917e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f497916d = new java.util.ArrayList();
        this.f497917e = new java.util.ArrayList();
    }

    public final void O6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[clearAllSelectFavItemInfo] clear all select favItemInfos");
        this.f497916d.clear();
        this.f497917e.clear();
    }

    public final o72.r2 P6(int i17) {
        return com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h3.f182661c.a().b(i17);
    }

    public final int Q6() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h3 a17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h3.f182661c.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getTotalSize] favIdList size = ");
        java.util.ArrayList arrayList = a17.f182664b;
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderStorage", sb6.toString());
        return arrayList.size();
    }

    public final java.util.List R6() {
        java.util.ArrayList arrayList = this.f497917e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        arrayList2.addAll(arrayList);
        return arrayList2;
    }

    public final java.util.List S6() {
        java.util.ArrayList arrayList = this.f497916d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        arrayList2.addAll(arrayList);
        return arrayList2;
    }

    public final void T6(int i17) {
        o72.r2 b17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h3.f182661c.a().b(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[selectFavItemInfo] position = " + i17);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[selectFavItemInfo] favItemInfo = null");
            return;
        }
        java.util.ArrayList arrayList = this.f497916d;
        if (!arrayList.contains(b17)) {
            arrayList.add(b17);
            this.f497917e.add(java.lang.Integer.valueOf(i17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[selectFavItemInfo] error, select second time of same favItemInfo = " + b17.f67645x88be67a1);
        }
    }

    public final void U6(int i17) {
        o72.r2 b17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h3.f182661c.a().b(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[unSelectFavItemInfo] position = " + i17);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[unSelectFavItemInfo] favItemInfo = null");
            return;
        }
        java.util.ArrayList arrayList = this.f497916d;
        if (arrayList.contains(b17)) {
            arrayList.remove(b17);
            this.f497917e.remove(java.lang.Integer.valueOf(i17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[unSelectFavItemInfo] error, select second time of same favItemInfo = " + b17.f67645x88be67a1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h3 a17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h3.f182661c.a();
        a17.f182663a.clear();
        a17.f182664b.clear();
    }
}
