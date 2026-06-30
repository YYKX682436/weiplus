package cf;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final cf.b f40819a = new cf.b();

    public static final int a(java.lang.Object obj) {
        kotlin.jvm.internal.o.g(obj, "<this>");
        return obj.hashCode() & 65535;
    }

    public static final boolean b(android.app.Activity activity, int i17) {
        kotlin.jvm.internal.o.g(activity, "<this>");
        if (activity instanceof androidx.appcompat.app.AppCompatActivity) {
            return ((androidx.appcompat.app.AppCompatActivity) activity).supportRequestWindowFeature(i17);
        }
        android.view.Window window = activity.getWindow();
        if (!((window == null || window.hasFeature(i17)) ? false : true)) {
            return true;
        }
        try {
            return activity.requestWindowFeature(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.ActivityUtils", th6, "safeRequestWindowFeature failed", new java.lang.Object[0]);
            return false;
        }
    }
}
