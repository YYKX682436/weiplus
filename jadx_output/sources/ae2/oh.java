package ae2;

/* loaded from: classes3.dex */
public final class oh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.oh f4079d = new ae2.oh();

    public oh() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(3, "视频号商品免责声明弹窗策略", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_shopping_third_party_disclaimer, false, 2, null);
        aVar.a("FINDER_LIVE_SHOPPING_DISCLAIMER_STRATEGY", kz5.c0.i(0, 1, 2, 3), kz5.c0.i("关闭", "每个appid弹一次", "每个appid一天一次", "每次"));
        return aVar;
    }
}
