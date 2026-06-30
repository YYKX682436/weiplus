package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625;

/* renamed from: com.tencent.tinker.loader.hotplug.interceptor.TinkerHackInstrumentation */
/* loaded from: classes13.dex */
public class InstrumentationC26627xa7feb44e extends android.app.Instrumentation {
    private static final java.lang.String TAG = "Tinker.Instrumentation";

    /* renamed from: mActivityThread */
    private final java.lang.Object f55605x78c02fc6;

    /* renamed from: mInstrumentationField */
    private final java.lang.reflect.Field f55606x3d16b239;

    /* renamed from: mOriginal */
    private final android.app.Instrumentation f55607x7730315e;

    private InstrumentationC26627xa7feb44e(android.app.Instrumentation instrumentation, java.lang.Object obj, java.lang.reflect.Field field) {
        this.f55607x7730315e = instrumentation;
        this.f55605x78c02fc6 = obj;
        this.f55606x3d16b239 = field;
        try {
            m104609x74616bc5(instrumentation);
        } catch (java.lang.Throwable th6) {
            throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6(th6.getMessage(), th6);
        }
    }

    /* renamed from: copyAllFields */
    private void m104609x74616bc5(android.app.Instrumentation instrumentation) {
        java.lang.reflect.Field[] declaredFields = android.app.Instrumentation.class.getDeclaredFields();
        for (int i17 = 0; i17 < declaredFields.length; i17++) {
            declaredFields[i17].setAccessible(true);
            declaredFields[i17].set(this, declaredFields[i17].get(instrumentation));
        }
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.InstrumentationC26627xa7feb44e m104610xaf65a0fc(android.content.Context context) {
        try {
            java.lang.Object m104706x60a4f2ef = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104706x60a4f2ef(context, null);
            java.lang.reflect.Field m104703x183d66c1 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(m104706x60a4f2ef, "mInstrumentation");
            android.app.Instrumentation instrumentation = (android.app.Instrumentation) m104703x183d66c1.get(m104706x60a4f2ef);
            return instrumentation instanceof com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.InstrumentationC26627xa7feb44e ? (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.InstrumentationC26627xa7feb44e) instrumentation : new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.InstrumentationC26627xa7feb44e(instrumentation, m104706x60a4f2ef, m104703x183d66c1);
        } catch (java.lang.Throwable th6) {
            throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6("see next stacktrace", th6);
        }
    }

    /* renamed from: fixActivityParams */
    private void m104611xf67a20ea(android.app.Activity activity, android.content.pm.ActivityInfo activityInfo) {
        activity.setRequestedOrientation(activityInfo.screenOrientation);
        activity.setTheme(activityInfo.theme);
        try {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(activity, "mActivityInfo").set(activity, activityInfo);
        } catch (java.lang.Throwable th6) {
            throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6("see next stacktrace.", th6);
        }
    }

    /* renamed from: processIntent */
    private boolean m104612x3d6871eb(java.lang.ClassLoader classLoader, android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104641xade803da(intent, classLoader);
        android.content.ComponentName componentName = (android.content.ComponentName) intent.getParcelableExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55568x56eed873);
        if (componentName == null) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "oldComponent was null, start " + intent.getComponent() + " next.", new java.lang.Object[0]);
            return false;
        }
        java.lang.String className = componentName.getClassName();
        if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.m104573xe1c42d45(className) != null) {
            intent.setComponent(componentName);
            intent.removeExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55568x56eed873);
            return true;
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "Failed to query target activity's info, perhaps the target is not hotpluged component. Target: " + className, new java.lang.Object[0]);
        return false;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(android.app.Activity activity, android.os.Bundle bundle) {
        android.content.pm.ActivityInfo m104573xe1c42d45;
        if (activity != null && (m104573xe1c42d45 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.m104573xe1c42d45(activity.getClass().getName())) != null) {
            m104611xf67a20ea(activity, m104573xe1c42d45);
        }
        super.callActivityOnCreate(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnNewIntent(android.app.Activity activity, android.content.Intent intent) {
        if (activity != null) {
            m104612x3d6871eb(activity.getClass().getClassLoader(), intent);
        }
        super.callActivityOnNewIntent(activity, intent);
    }

    /* renamed from: install */
    public void m104613x74ae259b() {
        if (this.f55606x3d16b239.get(this.f55605x78c02fc6) instanceof com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.InstrumentationC26627xa7feb44e) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "already installed, skip rest logic.", new java.lang.Object[0]);
        } else {
            this.f55606x3d16b239.set(this.f55605x78c02fc6, this);
        }
    }

    @Override // android.app.Instrumentation
    public android.app.Activity newActivity(java.lang.Class<?> cls, android.content.Context context, android.os.IBinder iBinder, android.app.Application application, android.content.Intent intent, android.content.pm.ActivityInfo activityInfo, java.lang.CharSequence charSequence, android.app.Activity activity, java.lang.String str, java.lang.Object obj) {
        m104612x3d6871eb(context.getClassLoader(), intent);
        return super.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }

    /* renamed from: uninstall */
    public void m104614xdab628e2() {
        this.f55606x3d16b239.set(this.f55605x78c02fc6, this.f55607x7730315e);
    }

    @Override // android.app.Instrumentation
    public android.app.Activity newActivity(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) {
        if (m104612x3d6871eb(classLoader, intent)) {
            return super.newActivity(classLoader, intent.getComponent().getClassName(), intent);
        }
        return super.newActivity(classLoader, str, intent);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(android.app.Activity activity, android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        android.content.pm.ActivityInfo m104573xe1c42d45;
        if (activity != null && (m104573xe1c42d45 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.m104573xe1c42d45(activity.getClass().getName())) != null) {
            m104611xf67a20ea(activity, m104573xe1c42d45);
        }
        super.callActivityOnCreate(activity, bundle, persistableBundle);
    }
}
