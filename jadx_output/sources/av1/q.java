package av1;

/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cast.ui.ScreenCastActivity f14190d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.cast.ui.ScreenCastActivity screenCastActivity) {
        super(1);
        this.f14190d = screenCastActivity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xu1.c it = (xu1.c) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.cast.ui.ScreenCastActivity.f95487q;
        com.tencent.mm.plugin.cast.ui.ScreenCastActivity screenCastActivity = this.f14190d;
        screenCastActivity.getClass();
        switch (it.ordinal()) {
            case 0:
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastActivity", "trans to pc disconnect");
                screenCastActivity.X6(3);
                break;
            case 1:
                screenCastActivity.X6(1);
                break;
            case 2:
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastActivity", "trans to pc CONNECTED");
                if (nu1.n.f340170e == null) {
                    nu1.n.f340170e = new tu1.o();
                }
                tu1.o oVar = nu1.n.f340170e;
                if ((oVar == null || oVar.f422120k) ? false : true) {
                    if (oVar == null) {
                        nu1.n.f340170e = new tu1.o();
                    }
                    tu1.o oVar2 = nu1.n.f340170e;
                    if (oVar2 != null) {
                        oVar2.f422120k = true;
                    }
                    java.lang.Object systemService = screenCastActivity.getSystemService("media_projection");
                    kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
                    android.content.Intent createScreenCaptureIntent = ((android.media.projection.MediaProjectionManager) systemService).createScreenCaptureIntent();
                    kotlin.jvm.internal.o.f(createScreenCaptureIntent, "createScreenCaptureIntent(...)");
                    screenCastActivity.startActivityForResult(createScreenCaptureIntent, screenCastActivity.f95494m);
                    screenCastActivity.X6(4);
                    break;
                }
                break;
            case 3:
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastActivity", "trans to pc timeout");
                screenCastActivity.X6(2);
                break;
            case 4:
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastActivity", "trans to pc ERROR");
                screenCastActivity.X6(5);
                break;
            case 5:
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastActivity", "trans to pc timeout");
                screenCastActivity.W6();
                screenCastActivity.X6(7);
                break;
            case 6:
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastActivity", "trans to pc service removed");
                screenCastActivity.W6();
                screenCastActivity.X6(8);
                break;
        }
        return jz5.f0.f302826a;
    }
}
