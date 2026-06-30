package ae2;

/* loaded from: classes3.dex */
public final class s8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.s8 f4166d = new ae2.s8();

    public s8() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频号直播是否本地过滤后台下发的extFlag", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_filter_anchor_ext_flag, false, 2, null);
        aVar.a("FINDER_LIVE_FILTER_ANCHOR_EXT_FLAG", kz5.c0.i(0, 1), kz5.c0.i("是", "否"));
        return aVar;
    }
}
