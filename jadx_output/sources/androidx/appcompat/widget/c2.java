package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f9537a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f9538b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f9539c;

    public c2() {
        try {
            java.lang.reflect.Method declaredMethod = android.widget.AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new java.lang.Class[0]);
            this.f9537a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (java.lang.NoSuchMethodException unused) {
        }
        try {
            java.lang.reflect.Method declaredMethod2 = android.widget.AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new java.lang.Class[0]);
            this.f9538b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (java.lang.NoSuchMethodException unused2) {
        }
        try {
            java.lang.reflect.Method method = android.widget.AutoCompleteTextView.class.getMethod("ensureImeVisible", java.lang.Boolean.TYPE);
            this.f9539c = method;
            method.setAccessible(true);
        } catch (java.lang.NoSuchMethodException unused3) {
        }
    }
}
