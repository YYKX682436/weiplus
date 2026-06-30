package ae2;

/* loaded from: classes3.dex */
public final class z4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.z4 f4329d = new ae2.z4();

    public z4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "强行启用品牌标签", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_brand_tag_debug_enable, false, 2, null);
        aVar.a("FINDER_LIVE_BRAND_TAG_DEBUG_ENABLE", kz5.c0.i(1, 0), kz5.c0.i("是", "否"));
        return aVar;
    }
}
