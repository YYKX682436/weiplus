package u75;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final u75.a f506709a = new u75.a();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f506710b;

    public final boolean a() {
        if (f506710b == null) {
            java.lang.String str = android.os.Build.BRAND;
            java.lang.String str2 = android.os.Build.MANUFACTURER;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Vendor.Honor", "Build.BRAND:" + str + ", manufacture:" + str2);
            f506710b = java.lang.Boolean.valueOf(r26.i0.p("HONOR", str, true) && r26.i0.p("HONOR", str2, true));
        }
        java.lang.Boolean bool = f506710b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(bool, "null cannot be cast to non-null type kotlin.Boolean");
        return bool.booleanValue();
    }
}
