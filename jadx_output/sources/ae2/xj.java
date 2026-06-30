package ae2;

/* loaded from: classes3.dex */
public final class xj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.xj f4296d = new ae2.xj();

    public xj() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "直播是否打开拍一拍", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_tickle_enable, false, 2, null);
        aVar.a("FINDER_LIVE_TICKLE_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        aVar.f317745p = "T32";
        return aVar;
    }
}
