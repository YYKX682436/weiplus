package ae2;

/* loaded from: classes3.dex */
public final class dl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.dl f3561d = new ae2.dl();

    public dl() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "直播和附近-直播是否打开声音", null, null, 12, null);
        aVar.a("FINDER_NEARBY_LIVE_AUTO_PLAY_MUTE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_nearby_live_auto_play_mute, false, 2, null);
        return aVar;
    }
}
