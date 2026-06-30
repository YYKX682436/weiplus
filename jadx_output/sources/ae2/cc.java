package ae2;

/* loaded from: classes3.dex */
public final class cc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.cc f3527d = new ae2.cc();

    public cc() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "直播列表是否允许自动播放", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_list_auto_play, false, 2, null);
        aVar.a("FINDER_LIVE_LIST_AUTO_PLAY", kz5.c0.i(0, 1), kz5.c0.i("是", "否"));
        return aVar;
    }
}
