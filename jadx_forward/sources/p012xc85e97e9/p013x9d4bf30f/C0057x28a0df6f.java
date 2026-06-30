package p012xc85e97e9.p013x9d4bf30f;

/* renamed from: androidx.activity.ImmLeaksCleaner */
/* loaded from: classes5.dex */
final class C0057x28a0df6f implements p012xc85e97e9.p093xedfae76a.v {

    /* renamed from: e, reason: collision with root package name */
    public static int f90551e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.reflect.Field f90552f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.reflect.Field f90553g;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.reflect.Field f90554h;

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f90555d;

    public C0057x28a0df6f(android.app.Activity activity) {
        this.f90555d = activity;
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m mVar) {
        if (mVar != p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
            return;
        }
        if (f90551e == 0) {
            try {
                f90551e = 2;
                java.lang.reflect.Field declaredField = android.view.inputmethod.InputMethodManager.class.getDeclaredField("mServedView");
                f90553g = declaredField;
                declaredField.setAccessible(true);
                java.lang.reflect.Field declaredField2 = android.view.inputmethod.InputMethodManager.class.getDeclaredField("mNextServedView");
                f90554h = declaredField2;
                declaredField2.setAccessible(true);
                java.lang.reflect.Field declaredField3 = android.view.inputmethod.InputMethodManager.class.getDeclaredField("mH");
                f90552f = declaredField3;
                declaredField3.setAccessible(true);
                f90551e = 1;
            } catch (java.lang.NoSuchFieldException unused) {
            }
        }
        if (f90551e == 1) {
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.f90555d.getSystemService("input_method");
            try {
                java.lang.Object obj = f90552f.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            android.view.View view = (android.view.View) f90553g.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f90554h.set(inputMethodManager, null);
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
