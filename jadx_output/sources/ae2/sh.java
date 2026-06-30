package ae2;

/* loaded from: classes3.dex */
public final class sh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.sh f4175d = new ae2.sh();

    public sh() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "是否展示商品列表分类标签", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_live_shop_shelf_classify_switch, false, 2, null);
        aVar.a("FINDER_LIVE_SHOPPING_LIST_TAG", kz5.c0.i(0, 1), kz5.c0.i("隐藏", "显示"));
        return aVar;
    }
}
