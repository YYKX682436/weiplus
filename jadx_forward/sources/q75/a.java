package q75;

/* loaded from: classes7.dex */
public abstract class a {
    public static android.app.Activity a(android.content.Context context) {
        android.content.Context baseContext;
        if (context == null) {
            return null;
        }
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (!(context instanceof android.content.ContextWrapper) || (baseContext = ((android.content.ContextWrapper) context).getBaseContext()) == context) {
            return null;
        }
        return a(baseContext);
    }

    public static void b(android.content.Context context) {
        android.view.inputmethod.InputMethodManager inputMethodManager;
        if (context == null || (inputMethodManager = (android.view.inputmethod.InputMethodManager) context.getSystemService("input_method")) == null) {
            return;
        }
        java.lang.String[] strArr = {"mCurRootView", "mServedView", "mNextServedView", "mLastSrvView"};
        for (int i17 = 0; i17 < 4; i17++) {
            try {
                java.lang.reflect.Field declaredField = inputMethodManager.getClass().getDeclaredField(strArr[i17]);
                boolean z17 = true;
                declaredField.setAccessible(true);
                java.lang.Object obj = declaredField.get(inputMethodManager);
                if (obj != null && (obj instanceof android.view.View)) {
                    android.view.View view = (android.view.View) obj;
                    if (view.getContext() != context) {
                        android.content.Context context2 = view.getContext();
                        if (context != context2) {
                            if (context2 instanceof android.content.ContextWrapper) {
                                android.content.Context baseContext = ((android.content.ContextWrapper) context2).getBaseContext();
                                while (context != baseContext) {
                                    if ((baseContext instanceof android.content.ContextWrapper) && (baseContext = ((android.content.ContextWrapper) baseContext).getBaseContext()) != null) {
                                    }
                                }
                            }
                            z17 = false;
                            break;
                        }
                        if (!z17) {
                        }
                    }
                    declaredField.set(inputMethodManager, null);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.AndroidContextUtil", "fixInputMethodManagerLeak %s", th6.getMessage());
            }
        }
    }
}
