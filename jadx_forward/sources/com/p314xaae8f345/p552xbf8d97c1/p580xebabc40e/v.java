package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e;

/* loaded from: classes7.dex */
public class v extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.a {
    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        android.view.inputmethod.InputMethodManager inputMethodManager;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (activity != null && (inputMethodManager = (android.view.inputmethod.InputMethodManager) activity.getSystemService("input_method")) != null) {
            java.lang.String[] strArr = {"mCurRootView", "mServedView", "mNextServedView"};
            for (int i17 = 0; i17 < 3; i17++) {
                try {
                    java.lang.reflect.Field declaredField = inputMethodManager.getClass().getDeclaredField(strArr[i17]);
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    java.lang.Object obj = declaredField.get(inputMethodManager);
                    if (obj instanceof android.view.View) {
                        android.view.View view = (android.view.View) obj;
                        if (view.getContext() != activity) {
                            oj.j.c("Matrix.ActivityLeakFixer", "fixInputMethodManagerLeak break, context is not suitable, get_context=" + view.getContext() + " dest_context=" + activity, new java.lang.Object[0]);
                            break;
                        }
                        declaredField.set(inputMethodManager, null);
                    } else {
                        continue;
                    }
                } catch (java.lang.Throwable th6) {
                    oj.j.b("Matrix.ActivityLeakFixer", "failed to fix InputMethodManagerLeak, %s", th6.toString());
                }
            }
        }
        oj.j.c("Matrix.ActivityLeakFixer", "fixInputMethodManagerLeak done, cost: %s ms.", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        if (activity == null || activity.getWindow() == null || activity.getWindow().peekDecorView() == null) {
            oj.j.c("Matrix.ActivityLeakFixer", "unbindDrawables, ui or ui's window is null, skip rest works.", new java.lang.Object[0]);
        } else {
            android.view.View rootView = activity.getWindow().peekDecorView().getRootView();
            try {
                com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.b.b(rootView);
                if (android.os.Build.VERSION.SDK_INT >= 31 && com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.b.f134471b) {
                    rootView = activity.getWindow().getDecorView().findViewById(android.R.id.content);
                }
                if (rootView instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) rootView).removeAllViews();
                }
            } catch (java.lang.Throwable th7) {
                oj.j.f("Matrix.ActivityLeakFixer", "caught unexpected exception when unbind drawables.", th7);
            }
        }
        oj.j.c("Matrix.ActivityLeakFixer", "unbindDrawables done, cost: %s ms.", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
        if (android.os.Build.VERSION.SDK_INT != 28) {
            return;
        }
        try {
            android.content.Context applicationContext = activity.getApplicationContext();
            if (com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.b.f134470a == null) {
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(applicationContext);
                for (int i18 = 0; i18 < 32; i18++) {
                    frameLayout.addView(new android.view.View(applicationContext));
                }
                com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.b.f134470a = new android.util.Pair(frameLayout, new java.util.ArrayList());
            }
            android.util.Pair pair = com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.b.f134470a;
            ((android.view.ViewGroup) pair.first).addChildrenForAccessibility((java.util.ArrayList) pair.second);
        } catch (java.lang.Throwable th8) {
            oj.j.d("Matrix.ActivityLeakFixer", th8, "fixViewLocationHolderLeakApi28 err", new java.lang.Object[0]);
        }
    }
}
