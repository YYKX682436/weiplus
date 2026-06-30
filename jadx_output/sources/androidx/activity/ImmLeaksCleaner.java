package androidx.activity;

/* loaded from: classes5.dex */
final class ImmLeaksCleaner implements androidx.lifecycle.v {

    /* renamed from: e, reason: collision with root package name */
    public static int f9018e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.reflect.Field f9019f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.reflect.Field f9020g;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.reflect.Field f9021h;

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f9022d;

    public ImmLeaksCleaner(android.app.Activity activity) {
        this.f9022d = activity;
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y yVar, androidx.lifecycle.m mVar) {
        if (mVar != androidx.lifecycle.m.ON_DESTROY) {
            return;
        }
        if (f9018e == 0) {
            try {
                f9018e = 2;
                java.lang.reflect.Field declaredField = android.view.inputmethod.InputMethodManager.class.getDeclaredField("mServedView");
                f9020g = declaredField;
                declaredField.setAccessible(true);
                java.lang.reflect.Field declaredField2 = android.view.inputmethod.InputMethodManager.class.getDeclaredField("mNextServedView");
                f9021h = declaredField2;
                declaredField2.setAccessible(true);
                java.lang.reflect.Field declaredField3 = android.view.inputmethod.InputMethodManager.class.getDeclaredField("mH");
                f9019f = declaredField3;
                declaredField3.setAccessible(true);
                f9018e = 1;
            } catch (java.lang.NoSuchFieldException unused) {
            }
        }
        if (f9018e == 1) {
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.f9022d.getSystemService("input_method");
            try {
                java.lang.Object obj = f9019f.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            android.view.View view = (android.view.View) f9020g.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f9021h.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (java.lang.IllegalAccessException unused2) {
                            }
                        } catch (java.lang.ClassCastException unused3) {
                        } catch (java.lang.IllegalAccessException unused4) {
                        }
                    } catch (java.lang.Throwable th6) {
                        throw th6;
                    }
                }
            } catch (java.lang.IllegalAccessException unused5) {
            }
        }
    }
}
