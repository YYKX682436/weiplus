package kh;

/* loaded from: classes12.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kh.k1 f389279a;

    public a1(kh.k1 k1Var) {
        this.f389279a = k1Var;
    }

    public final java.lang.Object a() {
        java.lang.Object obj;
        f06.d a17 = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(android.os.Looper.class);
        try {
            java.util.Iterator it = g06.f.b(a17).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((f06.s) obj).mo9624xfb82e301(), "sObserver")) {
                    break;
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            java.lang.reflect.Field a18 = h06.c.a((f06.v) obj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a18);
            a18.setAccessible(true);
            return a18.get(null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Matrix.battery.LooperTaskMonitorFeatureKt", e17, "reflectLooperObserver failed", new java.lang.Object[0]);
            try {
                java.lang.reflect.Field declaredField = xz5.a.b(a17).getDeclaredField("sObserver");
                declaredField.setAccessible(true);
                return declaredField.get(null);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Matrix.battery.LooperTaskMonitorFeatureKt", e18, "reflectLooperObserver2 failed", new java.lang.Object[0]);
                boolean z17 = kh.k1.f389371n;
                if (kh.k1.f389371n) {
                    ap.a.a(1, "errReflectLooper", e17, null, "reflectLooperObserver", e17.getMessage(), e18.getMessage());
                }
                return null;
            }
        }
    }
}
