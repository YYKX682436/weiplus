package c30;

/* loaded from: classes8.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f119701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119702e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(java.util.LinkedList linkedList, java.lang.String str) {
        super(1);
        this.f119701d = linkedList;
        this.f119702e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        c30.e tempDB = (c30.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tempDB, "tempDB");
        java.util.LinkedList shopLabelInfos = this.f119701d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shopLabelInfos, "$shopLabelInfos");
        if (!shopLabelInfos.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsWeShopDB", "insertOrUpdateWeShopItemsWithShopLabels count: " + shopLabelInfos.size());
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = tempDB.a(shopLabelInfos, new c30.c(tempDB));
        } else {
            z17 = true;
        }
        java.lang.String shopHistoryNextKey = this.f119702e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shopHistoryNextKey, "$shopHistoryNextKey");
        return java.lang.Boolean.valueOf(z17 && (shopHistoryNextKey.length() > 0 ? tempDB.d(shopHistoryNextKey) : true));
    }
}
