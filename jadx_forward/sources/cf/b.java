package cf;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final cf.b f122352a = new cf.b();

    public static final int a(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "<this>");
        return obj.hashCode() & 65535;
    }

    public static final boolean b(android.app.Activity activity, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "<this>");
        if (activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            return ((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).mo2550x7c2abd06(i17);
        }
        android.view.Window window = activity.getWindow();
        if (!((window == null || window.hasFeature(i17)) ? false : true)) {
            return true;
        }
        try {
            return activity.requestWindowFeature(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.ActivityUtils", th6, "safeRequestWindowFeature failed", new java.lang.Object[0]);
            return false;
        }
    }
}
