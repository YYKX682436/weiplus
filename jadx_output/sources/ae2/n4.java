package ae2;

/* loaded from: classes3.dex */
public final class n4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.n4 f4042d = new ae2.n4();

    public n4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(100, "主播点歌歌单上限", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_anchor_sing_song_list_max_size, false, 2, null);
        aVar.a("FINDER_LIVE_ANCHOR_SING_SONG_LIST_MAX_SIZE", kz5.c0.i(50, 100), kz5.c0.i("50首", "100首"));
        return aVar;
    }
}
