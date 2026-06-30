package ae2;

/* loaded from: classes3.dex */
public final class ad extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.ad f3446d = new ae2.ad();

    public ad() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(3, "观众打赏榜单自动刷新间隔/秒", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_member_list_autorefresh, false, 2, null);
        aVar.a("FINDER_LIVE_MEMBER_LIST_AUTO_REFRESH", kz5.c0.i(0, 1, 2, 3, 5, 10, -1), kz5.c0.i("0秒", "1秒", "2秒", "3秒", "5秒", "10秒", "不自动刷新"));
        return aVar;
    }
}
