package ae2;

/* loaded from: classes3.dex */
public final class k6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.k6 f3972d = new ae2.k6();

    public k6() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "直播观众是否展示分辨率等级", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_definition_level, false, 2, null);
        aVar.a("FINDER_LIVE_DEFINITION_LEVEL", kz5.c0.i(0, 1), kz5.c0.i("是", "否"));
        return aVar;
    }
}
