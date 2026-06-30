package ae2;

/* loaded from: classes3.dex */
public final class lb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.lb f4001d = new ae2.lb();

    public lb() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "KTV歌曲封面图裁剪开关", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_live_ktv_singing_bg_cut_enabled, false, 2, null);
        aVar.a("FINDER_LIVE_KTV_SINGING_BG_CUT_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
