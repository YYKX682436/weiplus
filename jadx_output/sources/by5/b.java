package by5;

/* loaded from: classes9.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static android.view.accessibility.AccessibilityManager f36415c;

    /* renamed from: d, reason: collision with root package name */
    public static by5.b f36416d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f36417a;

    /* renamed from: b, reason: collision with root package name */
    public long f36418b;

    public b(android.content.Context context) {
        f36415c = (android.view.accessibility.AccessibilityManager) context.getApplicationContext().getSystemService("accessibility");
    }

    public static by5.b a(android.content.Context context) {
        if (f36416d == null) {
            f36416d = new by5.b(context);
        }
        return f36416d;
    }

    public boolean b() {
        android.view.accessibility.AccessibilityManager accessibilityManager;
        if (android.os.SystemClock.uptimeMillis() - this.f36418b > 2000 && (accessibilityManager = f36415c) != null) {
            this.f36417a = accessibilityManager.isEnabled() && f36415c.isTouchExplorationEnabled();
            this.f36418b = android.os.SystemClock.uptimeMillis();
        }
        return this.f36417a;
    }
}
