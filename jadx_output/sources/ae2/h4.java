package ae2;

/* loaded from: classes3.dex */
public final class h4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.h4 f3643d = new ae2.h4();

    public h4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1000, "主播音乐数量上限", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_anchor_music_max_size, false, 2, null);
        aVar.a("FINDER_LIVE_ANCHOR_MUSIC_MAX_SIZE", kz5.c0.i(50, 100, 1000), kz5.c0.i("50首", "100首", "1000首"));
        return aVar;
    }
}
