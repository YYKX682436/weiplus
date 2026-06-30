package by5;

/* loaded from: classes13.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f36425a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f36426b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f36427c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f36428d;

    public static java.lang.String a() {
        java.lang.String string;
        if (android.text.TextUtils.isEmpty(f36426b)) {
            android.os.Bundle bundle = org.xwalk.core.XWalkEnvironment.f347981n;
            synchronized (bundle) {
                string = bundle.getString("deviceModel", null);
            }
            if (string != null) {
                f36426b = string;
                by5.c4.f("CachedSystemBuildInfo", "device model from init args:" + f36426b);
            } else {
                f36426b = android.os.Build.MODEL;
                by5.c4.g("CachedSystemBuildInfo", "device model, not available in init args, use Build.MODEL:" + f36426b);
            }
        }
        return f36426b;
    }
}
