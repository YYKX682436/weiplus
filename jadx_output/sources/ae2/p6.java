package ae2;

/* loaded from: classes3.dex */
public final class p6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.p6 f4092d = new ae2.p6();

    public p6() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "直播是否允许调整自定义编码分辨率", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_enable_adjust_custom_enc_resolution, false, 2, null);
        aVar.a("FINDER_LIVE_ENABLE_ADJUST_CUSTOM_SET_ENC_RESOLUTION", kz5.c0.i(0, 1), kz5.c0.i("是", "否"));
        return aVar;
    }
}
