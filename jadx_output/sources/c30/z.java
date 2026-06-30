package c30;

/* loaded from: classes8.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f38168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38169e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(java.util.LinkedList linkedList, java.lang.String str) {
        super(1);
        this.f38168d = linkedList;
        this.f38169e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        c30.e tempDB = (c30.e) obj;
        kotlin.jvm.internal.o.g(tempDB, "tempDB");
        java.util.LinkedList shopLabelInfos = this.f38168d;
        kotlin.jvm.internal.o.f(shopLabelInfos, "$shopLabelInfos");
        if (!shopLabelInfos.isEmpty()) {
            com.tencent.mars.xlog.Log.i("EcsWeShopDB", "insertOrUpdateWeShopItemsWithShopLabels count: " + shopLabelInfos.size());
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = tempDB.a(shopLabelInfos, new c30.c(tempDB));
        } else {
            z17 = true;
        }
        java.lang.String shopHistoryNextKey = this.f38169e;
        kotlin.jvm.internal.o.f(shopHistoryNextKey, "$shopHistoryNextKey");
        return java.lang.Boolean.valueOf(z17 && (shopHistoryNextKey.length() > 0 ? tempDB.d(shopHistoryNextKey) : true));
    }
}
