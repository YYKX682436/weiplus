package pr0;

/* loaded from: classes14.dex */
public abstract class h0 extends pr0.n {

    /* renamed from: r, reason: collision with root package name */
    public static int f439375r;

    public h0() {
        as0.a aVar = as0.a.f94958a;
        int i17 = this.f439366d;
        int i18 = f439375r;
        f439375r = i18 + 1;
        android.util.SparseArray sparseArray = as0.a.f94959b;
        if (sparseArray.get(i17) == null) {
            sparseArray.put(i17, new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e());
        }
        java.lang.Object obj = sparseArray.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e c6358xa3635a0e = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e) obj;
        c6358xa3635a0e.f137097m = java.lang.System.currentTimeMillis();
        qr0.a aVar2 = qr0.a.f447588a;
        c6358xa3635a0e.f137089e = aVar2.d(true) ? 2 : 1;
        c6358xa3635a0e.f137090f = aVar2.a();
        c6358xa3635a0e.f137106v = aVar2.c() ? 1 : 0;
        com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.C10891x95c0498 c10891x95c0498 = nr0.a.f420599c;
        c6358xa3635a0e.F = c6358xa3635a0e.b("FrontCameraId", c10891x95c0498.f150389d, true);
        c6358xa3635a0e.G = c6358xa3635a0e.b("FrontCameraSupportLevel", c10891x95c0498.f150392g, true);
        com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.C10891x95c0498 c10891x95c04982 = nr0.a.f420600d;
        c6358xa3635a0e.H = c6358xa3635a0e.b("BackCameraId", c10891x95c04982.f150389d, true);
        c6358xa3635a0e.I = c6358xa3635a0e.b("BackCameraSupportLevel", c10891x95c04982.f150392g, true);
        c6358xa3635a0e.f137086J = i18;
    }
}
