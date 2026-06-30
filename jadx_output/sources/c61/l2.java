package c61;

/* loaded from: classes5.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final c61.l2 f39111d = new c61.l2();

    public l2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean isEmpty;
        com.tencent.mm.plugin.finder.viewmodel.component.pt.R = android.provider.Settings.System.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "accelerometer_rotation", 1) == 1;
        com.tencent.mars.xlog.Log.i("FinderVideoOrientationUIC", "checkSysAllowRotate: systemEnableLandscape = " + com.tencent.mm.plugin.finder.viewmodel.component.pt.R);
        yp.f fVar = yp.f.f464378a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        bb2.x2 x2Var = new bb2.x2(context);
        synchronized (yp.f.f464380c) {
            isEmpty = fVar.a(0).isEmpty();
        }
        if (isEmpty) {
            d75.b.g(new yp.d(x2Var));
        }
        return jz5.f0.f302826a;
    }
}
