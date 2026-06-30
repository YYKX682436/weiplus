package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3082x294b574a;

/* renamed from: com.tencent.tinker.loader.hotplug.handler.PMSInterceptHandler */
/* loaded from: classes13.dex */
public class C26622xcc469e3e implements com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26626x4b238806.BinderInvocationHandler {
    private static final java.lang.String TAG = "Tinker.PMSIntrcptHndlr";

    /* renamed from: handleGetActivityInfo */
    private java.lang.Object m104594x9774738b(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        android.content.ComponentName componentName;
        java.lang.Class<?>[] exceptionTypes = method.getExceptionTypes();
        try {
            java.lang.Object invoke = method.invoke(obj, objArr);
            if (invoke != null) {
                return invoke;
            }
            int i17 = 0;
            while (true) {
                if (i17 >= objArr.length) {
                    componentName = null;
                    break;
                }
                if (objArr[i17] instanceof android.content.ComponentName) {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "locate componentName field of " + method.getName() + " done at idx: " + i17, new java.lang.Object[0]);
                    componentName = (android.content.ComponentName) objArr[i17];
                    break;
                }
                i17++;
            }
            if (componentName != null) {
                return com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.m104573xe1c42d45(componentName.getClassName());
            }
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "failed to locate componentName field of " + method.getName() + ", notice any crashes or mistakes after resolve works.", new java.lang.Object[0]);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e17) {
            e = e17;
            java.lang.Throwable targetException = e.getTargetException();
            if (exceptionTypes != null && exceptionTypes.length > 0) {
                if (targetException != null) {
                    throw targetException;
                }
                throw e;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            if (targetException != null) {
                e = targetException;
            }
            objArr2[0] = e;
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "unexpected exception.", objArr2);
            return null;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "unexpected exception.", th6);
            return null;
        }
    }

    /* renamed from: handleResolveIntent */
    private java.lang.Object m104595xe17f8660(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        android.content.Intent intent;
        java.lang.Class<?>[] exceptionTypes = method.getExceptionTypes();
        try {
            java.lang.Object invoke = method.invoke(obj, objArr);
            if (invoke != null) {
                return invoke;
            }
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "failed to resolve activity in base package, try again in patch package.", new java.lang.Object[0]);
            int i17 = 0;
            while (true) {
                if (i17 >= objArr.length) {
                    intent = null;
                    break;
                }
                if (objArr[i17] instanceof android.content.Intent) {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "locate intent field of " + method.getName() + " done at idx: " + i17, new java.lang.Object[0]);
                    intent = (android.content.Intent) objArr[i17];
                    break;
                }
                i17++;
            }
            if (intent != null) {
                return com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.m104574xde5883a8(intent);
            }
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "failed to locate intent field of " + method.getName() + ", notice any crashes or mistakes after resolve works.", new java.lang.Object[0]);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e17) {
            e = e17;
            java.lang.Throwable targetException = e.getTargetException();
            if (exceptionTypes != null && exceptionTypes.length > 0) {
                if (targetException != null) {
                    throw targetException;
                }
                throw e;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            if (targetException != null) {
                e = targetException;
            }
            objArr2[0] = e;
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "unexpected exception.", objArr2);
            return null;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "unexpected exception.", th6);
            return null;
        }
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26626x4b238806.BinderInvocationHandler
    /* renamed from: invoke */
    public java.lang.Object mo104588xb9724478(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.String name = method.getName();
        return "getActivityInfo".equals(name) ? m104594x9774738b(obj, method, objArr) : "resolveIntent".equals(name) ? m104595xe17f8660(obj, method, objArr) : method.invoke(obj, objArr);
    }
}
