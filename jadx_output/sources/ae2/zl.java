package ae2;

/* loaded from: classes3.dex */
public final class zl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.zl f4346d = new ae2.zl();

    public zl() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "直播间右下角点赞彩蛋是否开启SurfaceView渲染", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_live_confetti_enable_surface_render, false, 2, null);
        aVar.a("FinderLiveConfettiEnableSurfaceRender", kz5.c0.i(1, 0), kz5.c0.i("是", "否"));
        return aVar;
    }
}
