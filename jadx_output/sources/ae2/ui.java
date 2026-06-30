package ae2;

/* loaded from: classes3.dex */
public final class ui extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.ui f4223d = new ae2.ui();

    public ui() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "发现页触摸时提前预加载直播广场流", null, null, 12, null);
        aVar.a("FINDER_LIVE_SQUARE_TOUCH_PRELOAD", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_nearby_square_touch_preload, false, 2, null);
        return aVar;
    }
}
