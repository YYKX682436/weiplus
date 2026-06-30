package ae2;

/* loaded from: classes3.dex */
public final class bj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.bj f85042d = new ae2.bj();

    public bj() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(0, "直播主播是否立体声采集", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_anchor_stereo_capture_strategy, false, 2, null);
        aVar.a("FINDER_LIVE_STEREO_CAPTURE_STRATEGY", kz5.c0.i(0, 1), kz5.c0.i("是", "否"));
        return aVar;
    }
}
