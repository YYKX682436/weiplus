package u75;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f506719a;

    public static boolean a() {
        if (f506719a == null) {
            java.lang.String str = android.os.Build.BRAND;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Vendor.OnePlus", "Build.BRAND = %s", str);
            if (str.toLowerCase().contains("oneplus")) {
                f506719a = java.lang.Boolean.TRUE;
            } else {
                f506719a = java.lang.Boolean.FALSE;
            }
        }
        return f506719a.booleanValue();
    }
}
