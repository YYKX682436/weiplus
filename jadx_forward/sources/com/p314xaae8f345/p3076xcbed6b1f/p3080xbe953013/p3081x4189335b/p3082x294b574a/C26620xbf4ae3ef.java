package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3082x294b574a;

/* renamed from: com.tencent.tinker.loader.hotplug.handler.AMSInterceptHandler */
/* loaded from: classes13.dex */
public class C26620xbf4ae3ef implements com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26626x4b238806.BinderInvocationHandler {

    /* renamed from: INTENT_SENDER_ACTIVITY */
    private static final int f55580xa09cfa36;
    private static final java.lang.String TAG = "Tinker.AMSIntrcptHndlr";

    /* renamed from: TRANSLUCENT_ATTR_ID */
    private static final int[] f55581xd2cb7b23 = {android.R.attr.windowIsTranslucent};

    /* renamed from: mContext */
    private final android.content.Context f55582xd6cfe882;

    static {
        int i17 = 2;
        if (android.os.Build.VERSION.SDK_INT < 27) {
            try {
                i17 = ((java.lang.Integer) com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1((java.lang.Class<?>) android.app.ActivityManager.class, "INTENT_SENDER_ACTIVITY").get(null)).intValue();
            } catch (java.lang.Throwable unused) {
            }
        }
        f55580xa09cfa36 = i17;
    }

    public C26620xbf4ae3ef(android.content.Context context) {
        android.content.Context baseContext;
        while ((context instanceof android.content.ContextWrapper) && (baseContext = ((android.content.ContextWrapper) context).getBaseContext()) != null) {
            context = baseContext;
        }
        this.f55582xd6cfe882 = context;
    }

    /* renamed from: handleGetIntentSender */
    private java.lang.Object m104582xb7459f1f(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        int i17 = 0;
        while (true) {
            if (i17 >= objArr.length) {
                i17 = -1;
                break;
            }
            if (objArr[i17] instanceof android.content.Intent[]) {
                break;
            }
            i17++;
        }
        if (i17 != -1 && ((java.lang.Integer) objArr[0]).intValue() == f55580xa09cfa36) {
            android.content.Intent[] intentArr = (android.content.Intent[]) objArr[i17];
            for (int i18 = 0; i18 < intentArr.length; i18++) {
                android.content.Intent intent = new android.content.Intent(intentArr[i18]);
                m104586x8347cada(intent);
                intentArr[i18] = intent;
            }
        }
        return method.invoke(obj, objArr);
    }

    /* renamed from: handleStartActivities */
    private java.lang.Object m104583xc0d07ea7(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        int i17 = 0;
        while (true) {
            if (i17 >= objArr.length) {
                i17 = -1;
                break;
            }
            if (objArr[i17] instanceof android.content.Intent[]) {
                break;
            }
            i17++;
        }
        if (i17 != -1) {
            android.content.Intent[] intentArr = (android.content.Intent[]) objArr[i17];
            for (int i18 = 0; i18 < intentArr.length; i18++) {
                android.content.Intent intent = new android.content.Intent(intentArr[i18]);
                m104586x8347cada(intent);
                intentArr[i18] = intent;
            }
        }
        return method.invoke(obj, objArr);
    }

    /* renamed from: handleStartActivity */
    private java.lang.Object m104584xa8069c49(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        int i17 = 0;
        while (true) {
            if (i17 >= objArr.length) {
                i17 = -1;
                break;
            }
            if (objArr[i17] instanceof android.content.Intent) {
                break;
            }
            i17++;
        }
        if (i17 != -1) {
            android.content.Intent intent = new android.content.Intent((android.content.Intent) objArr[i17]);
            m104586x8347cada(intent);
            objArr[i17] = intent;
        }
        return method.invoke(obj, objArr);
    }

    /* renamed from: hasTransparentTheme */
    private boolean m104585xe650e51(android.content.pm.ActivityInfo activityInfo) {
        int themeResource = activityInfo.getThemeResource();
        android.content.res.Resources.Theme newTheme = this.f55582xd6cfe882.getResources().newTheme();
        newTheme.applyStyle(themeResource, true);
        android.content.res.TypedArray typedArray = null;
        try {
            typedArray = newTheme.obtainStyledAttributes(f55581xd2cb7b23);
            boolean z17 = typedArray.getBoolean(0, false);
            typedArray.recycle();
            return z17;
        } catch (java.lang.Throwable unused) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            return false;
        }
    }

    /* renamed from: processActivityIntent */
    private void m104586x8347cada(android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        android.content.IntentFilter intentFilter;
        if (intent.getComponent() != null) {
            str = intent.getComponent().getPackageName();
            str2 = intent.getComponent().getClassName();
        } else {
            android.content.pm.ResolveInfo resolveActivity = this.f55582xd6cfe882.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity == null) {
                resolveActivity = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.m104574xde5883a8(intent);
            }
            if (resolveActivity == null || (intentFilter = resolveActivity.filter) == null || !intentFilter.hasCategory("android.intent.category.DEFAULT")) {
                str = null;
                str2 = null;
            } else {
                android.content.pm.ActivityInfo activityInfo = resolveActivity.activityInfo;
                java.lang.String str3 = activityInfo.packageName;
                str2 = activityInfo.name;
                str = str3;
            }
        }
        if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.m104569xd06cef94(str2)) {
            android.content.pm.ActivityInfo m104573xe1c42d45 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.m104573xe1c42d45(str2);
            m104587xd12654d9(intent, str, str2, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26614x27d36c70.m104559x3d1fee3d(str2, m104573xe1c42d45.launchMode, m104585xe650e51(m104573xe1c42d45)));
        }
    }

    /* renamed from: storeAndReplaceOriginalComponentName */
    private void m104587xd12654d9(android.content.Intent intent, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.content.ComponentName componentName = new android.content.ComponentName(str, str2);
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104641xade803da(intent, this.f55582xd6cfe882.getClassLoader());
        intent.putExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55568x56eed873, componentName);
        intent.setComponent(new android.content.ComponentName(str, str3));
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26626x4b238806.BinderInvocationHandler
    /* renamed from: invoke */
    public java.lang.Object mo104588xb9724478(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.String name = method.getName();
        if ("startActivity".equals(name)) {
            return m104584xa8069c49(obj, method, objArr);
        }
        if ("startActivities".equals(name)) {
            return m104583xc0d07ea7(obj, method, objArr);
        }
        if (!"startActivityAndWait".equals(name) && !"startActivityWithConfig".equals(name) && !"startActivityAsUser".equals(name)) {
            return "getIntentSender".equals(name) ? m104582xb7459f1f(obj, method, objArr) : method.invoke(obj, objArr);
        }
        return m104584xa8069c49(obj, method, objArr);
    }
}
