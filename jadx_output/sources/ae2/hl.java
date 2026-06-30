package ae2;

/* loaded from: classes3.dex */
public final class hl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.hl f3660d = new ae2.hl();

    public hl() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "打开附近的直播和人", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_friends, false, 2, null);
        aVar.a("FINDER_NEARBY_LIVE_FRIENDS", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        aVar.f317745p = "T32";
        return aVar;
    }
}
