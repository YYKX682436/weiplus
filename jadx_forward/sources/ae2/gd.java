package ae2;

/* loaded from: classes3.dex */
public final class gd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.gd f85161d = new ae2.gd();

    public gd() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(1, "是否清理主播断麦缓存", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_live_mic_anchor_cache_remove_switch, false, 2, null);
        aVar.a("FINDER_LIVE_MIC_ANCHOR_CACHE_REMOVE_SWITCH", kz5.c0.i(1, 0), kz5.c0.i("是", "否"));
        return aVar;
    }
}
