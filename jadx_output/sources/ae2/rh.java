package ae2;

/* loaded from: classes3.dex */
public final class rh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.rh f4151d = new ae2.rh();

    public rh() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "商品列表外露sku", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_live_ec_goods_sku_pre_choose_allow, false, 2, null);
        aVar.a("FINDER_LIVE_SHOPPING_LIST_SHOW_SKU", kz5.c0.i(0, 1), kz5.c0.i("不允许显示sku选择前置", "允许显示后台下发的sku"));
        return aVar;
    }
}
