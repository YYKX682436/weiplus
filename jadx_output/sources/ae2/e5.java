package ae2;

/* loaded from: classes5.dex */
public final class e5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.e5 f3570d = new ae2.e5();

    public e5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pb2.a aVar = new pb2.a(0L, "直播相关卡片外显主题", null);
        aVar.a("FINDER_LIVE_CARD_SHOW_THEME", kz5.c0.i(0L, 1L, 2L, 4L, 3L, 5L, 6L, 7L), kz5.c0.i("全关", "仅会话", "仅朋友圈", "仅广场", "会话+朋友圈", "会话+广场", "朋友圈+广场", "会话+朋友圈+广场"));
        lb2.j.d(aVar, e42.c0.clicfg_live_card_show_title_options, false, 2, null);
        return aVar;
    }
}
