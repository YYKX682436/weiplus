package t82;

/* loaded from: classes11.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t82.d f497910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.dc f497911e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(t82.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.dc dcVar) {
        super(0);
        this.f497910d = dVar;
        this.f497911e = dcVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h3 a17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h3.f182661c.a();
        java.util.List R6 = this.f497910d.R6();
        a17.getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) R6;
        if (!arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((java.lang.Number) it.next()).intValue();
                if (!a17.a(intValue)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavFinderStorage", "[batchRemove] position invalid return");
                    break;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderStorage", "[batchRemove] use pos remove item in favIdList & favItemList, currentThread = " + java.lang.Thread.currentThread().getName());
                a17.f182664b.remove(intValue);
                a17.f182663a.remove(intValue);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderStorage", "[batchRemove] remove success, position = " + intValue);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavFinderStorage", "[batchRemove] positionList empty return");
        }
        this.f497911e.a();
        return jz5.f0.f384359a;
    }
}
