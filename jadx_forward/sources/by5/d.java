package by5;

/* loaded from: classes13.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f117958a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f117959b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f117960c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f117961d;

    public static java.lang.String a() {
        java.lang.String string;
        if (android.text.TextUtils.isEmpty(f117959b)) {
            android.os.Bundle bundle = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429514n;
            synchronized (bundle) {
                string = bundle.getString("deviceModel", null);
            }
            if (string != null) {
                f117959b = string;
                by5.c4.f("CachedSystemBuildInfo", "device model from init args:" + f117959b);
            } else {
                f117959b = android.os.Build.MODEL;
                by5.c4.g("CachedSystemBuildInfo", "device model, not available in init args, use Build.MODEL:" + f117959b);
            }
        }
        return f117959b;
    }
}
