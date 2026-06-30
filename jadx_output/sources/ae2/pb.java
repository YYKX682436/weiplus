package ae2;

/* loaded from: classes3.dex */
public final class pb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.pb f4097d = new ae2.pb();

    public pb() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "直播间列表是否增加额外的child空间", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_layout_enable_extra_space, false, 2, null);
        aVar.a("FINDER_LIVE_LAYOUT_ENABLE_EXTRA_SPACE", kz5.c0.i(0, 1), kz5.c0.i("允许", "不允许"));
        return aVar;
    }
}
