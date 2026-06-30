package ae2;

/* loaded from: classes3.dex */
public final class db extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.db f3551d = new ae2.db();

    public db() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "KTV封面顶部渐变遮罩开关", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_live_ktv_cover_shadow_enabled, false, 2, null);
        aVar.a("FINDER_LIVE_KTV_COVER_SHADOW_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
