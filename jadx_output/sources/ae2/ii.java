package ae2;

/* loaded from: classes3.dex */
public final class ii extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.ii f3682d = new ae2.ii();

    public ii() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "广场进入防重入检查", null, null, 12, null);
        aVar.a("FINDER_LIVE_SQUARE_CHECK_ENTER", kz5.c0.i(0, 1), kz5.c0.i("关", "开"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_live_square_check_enter, false, 2, null);
        return aVar;
    }
}
