package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3082x294b574a;

/* renamed from: com.tencent.tinker.loader.hotplug.handler.MHMessageHandler */
/* loaded from: classes13.dex */
public class C26621x3f3d93be implements com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26623x6fa72868.MessageHandler {

    /* renamed from: LAUNCH_ACTIVITY */
    private static final int f55583xdeef61b;
    private static final java.lang.String TAG = "Tinker.MHMsgHndlr";

    /* renamed from: mContext */
    private final android.content.Context f55584xd6cfe882;

    static {
        int i17 = 100;
        if (android.os.Build.VERSION.SDK_INT < 27) {
            try {
                i17 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1(java.lang.Class.forName("android.app.ActivityThread$H"), "LAUNCH_ACTIVITY").getInt(null);
            } catch (java.lang.Throwable unused) {
            }
        }
        f55583xdeef61b = i17;
    }

    public C26621x3f3d93be(android.content.Context context) {
        android.content.Context baseContext;
        while ((context instanceof android.content.ContextWrapper) && (baseContext = ((android.content.ContextWrapper) context).getBaseContext()) != null) {
            context = baseContext;
        }
        this.f55584xd6cfe882 = context;
    }

    /* renamed from: copyInstanceFields */
    private <T> void m104590xc5214683(T t17, T t18) {
        if (t17 == null || t18 == null) {
            return;
        }
        for (java.lang.Class<?> cls = t17.getClass(); !cls.equals(java.lang.Object.class); cls = cls.getSuperclass()) {
            for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                if (!field.isSynthetic() && !java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                    if (!field.isAccessible()) {
                        field.setAccessible(true);
                    }
                    try {
                        field.set(t18, field.get(t17));
                    } catch (java.lang.Throwable unused) {
                    }
                }
            }
        }
    }

    /* renamed from: fixActivityScreenOrientation */
    private void m104591x5f7b3e0(java.lang.Object obj, int i17) {
        if (i17 == -1) {
            i17 = 2;
        }
        try {
            java.lang.Object obj2 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(obj, "token").get(obj);
            java.lang.Object invoke = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104704xfb2fc3fa(java.lang.Class.forName("android.app.ActivityManagerNative"), "getDefault", (java.lang.Class<?>[]) new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104705xfb2fc3fa(invoke, "setRequestedOrientation", (java.lang.Class<?>[]) new java.lang.Class[]{android.os.IBinder.class, java.lang.Integer.TYPE}).invoke(invoke, obj2, java.lang.Integer.valueOf(i17));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "Failed to fix screen orientation.", th6);
        }
    }

    /* renamed from: fixStubActivityInfo */
    private void m104592x2e717a60(android.content.pm.ActivityInfo activityInfo, android.content.pm.ActivityInfo activityInfo2) {
        m104590xc5214683(activityInfo2, activityInfo);
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26623x6fa72868.MessageHandler
    /* renamed from: handleMessage */
    public boolean mo104593x5b586cbf(android.os.Message message) {
        if (message.what == f55583xdeef61b) {
            try {
                java.lang.Object obj = message.obj;
                if (obj == null) {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "msg: [" + message.what + "] has no 'obj' value.", new java.lang.Object[0]);
                    return false;
                }
                android.content.Intent intent = (android.content.Intent) com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(obj, "intent").get(obj);
                if (intent == null) {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "cannot fetch intent from message received by mH.", new java.lang.Object[0]);
                    return false;
                }
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104641xade803da(intent, this.f55584xd6cfe882.getClassLoader());
                android.content.ComponentName componentName = (android.content.ComponentName) intent.getParcelableExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55568x56eed873);
                if (componentName == null) {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "oldComponent was null, start " + intent.getComponent() + " next.", new java.lang.Object[0]);
                    return false;
                }
                android.content.pm.ActivityInfo activityInfo = (android.content.pm.ActivityInfo) com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(obj, "activityInfo").get(obj);
                if (activityInfo == null) {
                    return false;
                }
                android.content.pm.ActivityInfo m104573xe1c42d45 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.m104573xe1c42d45(componentName.getClassName());
                if (m104573xe1c42d45 == null) {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "Failed to query target activity's info, perhaps the target is not hotpluged component. Target: " + componentName.getClassName(), new java.lang.Object[0]);
                    return false;
                }
                m104591x5f7b3e0(obj, m104573xe1c42d45.screenOrientation);
                m104592x2e717a60(activityInfo, m104573xe1c42d45);
                intent.setComponent(componentName);
                intent.removeExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55568x56eed873);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "exception in handleMessage.", th6);
            }
        }
        return false;
    }
}
