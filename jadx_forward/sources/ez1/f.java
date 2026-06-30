package ez1;

/* loaded from: classes13.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ez1.f f339372d = new ez1.f();

    @Override // java.lang.Runnable
    public final void run() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() || ez1.g.f339376o.m170826x35e001() != 0 || ez1.g.f339378q || ez1.g.f339379r) {
            return;
        }
        ez1.g gVar = ez1.g.f339373i;
        android.app.Activity activity = null;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityThread");
            java.lang.Object invoke = cls.getMethod("currentActivityThread", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            java.lang.reflect.Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(invoke);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type android.util.ArrayMap<*, *>");
            android.util.ArrayMap arrayMap = (android.util.ArrayMap) obj;
            if (!arrayMap.isEmpty()) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrayMap.values(), "<get-values>(...)");
                if (!r4.isEmpty()) {
                    java.util.Collection values = arrayMap.values();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
                    java.util.Iterator it = kz5.n0.x0(values).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        java.lang.reflect.Field declaredField2 = next.getClass().getDeclaredField(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
                        declaredField2.setAccessible(true);
                        java.lang.Object obj2 = declaredField2.get(next);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type android.app.Activity");
                        android.app.Activity activity2 = (android.app.Activity) obj2;
                        if (!gVar.X(activity2)) {
                            activity = activity2;
                            break;
                        }
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
        if (activity != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.AppEventMonitor", "[startMonitor] mainProcess already start activity : ".concat(activity.getClass().getSimpleName()));
            ez1.g.f339373i.mo54653x59297693(activity);
        }
    }
}
