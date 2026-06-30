package by5;

/* loaded from: classes9.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static android.view.accessibility.AccessibilityManager f117948c;

    /* renamed from: d, reason: collision with root package name */
    public static by5.b f117949d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f117950a;

    /* renamed from: b, reason: collision with root package name */
    public long f117951b;

    public b(android.content.Context context) {
        f117948c = (android.view.accessibility.AccessibilityManager) context.getApplicationContext().getSystemService("accessibility");
    }

    public static by5.b a(android.content.Context context) {
        if (f117949d == null) {
            f117949d = new by5.b(context);
        }
        return f117949d;
    }

    public boolean b() {
        android.view.accessibility.AccessibilityManager accessibilityManager;
        if (android.os.SystemClock.uptimeMillis() - this.f117951b > 2000 && (accessibilityManager = f117948c) != null) {
            this.f117950a = accessibilityManager.isEnabled() && f117948c.isTouchExplorationEnabled();
            this.f117951b = android.os.SystemClock.uptimeMillis();
        }
        return this.f117950a;
    }
}
