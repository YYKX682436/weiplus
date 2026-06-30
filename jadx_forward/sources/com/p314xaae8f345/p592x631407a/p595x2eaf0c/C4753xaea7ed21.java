package com.p314xaae8f345.p592x631407a.p595x2eaf0c;

/* renamed from: com.tencent.midas.comm.APBeanUtil */
/* loaded from: classes4.dex */
public class C4753xaea7ed21 {
    /* renamed from: copyProperties */
    public static void m41592xc1050a88(java.lang.Object obj, java.lang.Object obj2) {
        try {
            m41593xf350232(obj, obj2, null, true);
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: copyPropertiesExclude */
    public static void m41593xf350232(java.lang.Object obj, java.lang.Object obj2, java.lang.String[] strArr, boolean z17) {
        java.lang.reflect.Method[] declaredMethods;
        java.lang.reflect.Method[] declaredMethods2;
        java.lang.Object invoke;
        java.util.List asList = (strArr == null || strArr.length <= 0) ? null : java.util.Arrays.asList(strArr);
        if (z17) {
            declaredMethods = obj.getClass().getMethods();
            declaredMethods2 = obj2.getClass().getMethods();
        } else {
            declaredMethods = obj.getClass().getDeclaredMethods();
            declaredMethods2 = obj2.getClass().getDeclaredMethods();
        }
        for (java.lang.reflect.Method method : declaredMethods) {
            java.lang.String name = method.getName();
            if (name.contains("get") && (asList == null || !asList.contains(name.substring(3).toLowerCase()))) {
                java.lang.reflect.Method m41595x1b55441c = m41595x1b55441c(declaredMethods2, "set" + name.substring(3));
                if (m41595x1b55441c != null && (invoke = method.invoke(obj, new java.lang.Object[0])) != null && (!(invoke instanceof java.util.Collection) || ((java.util.Collection) invoke).size() > 0)) {
                    m41595x1b55441c.invoke(obj2, invoke);
                }
            }
        }
    }

    /* renamed from: copyPropertiesInclude */
    public static void m41594xd1bd7900(java.lang.Object obj, java.lang.Object obj2, java.lang.String[] strArr, boolean z17) {
        java.lang.reflect.Method[] declaredMethods;
        java.lang.reflect.Method[] declaredMethods2;
        java.lang.Object invoke;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        java.util.List asList = java.util.Arrays.asList(strArr);
        if (z17) {
            declaredMethods = obj.getClass().getMethods();
            declaredMethods2 = obj2.getClass().getMethods();
        } else {
            declaredMethods = obj.getClass().getDeclaredMethods();
            declaredMethods2 = obj2.getClass().getDeclaredMethods();
        }
        for (java.lang.reflect.Method method : declaredMethods) {
            java.lang.String name = method.getName();
            if (name.contains("get")) {
                java.lang.String substring = name.substring(3);
                if (asList.contains(substring.substring(0, 1).toLowerCase() + substring.substring(1))) {
                    java.lang.reflect.Method m41595x1b55441c = m41595x1b55441c(declaredMethods2, "set" + name.substring(3));
                    if (m41595x1b55441c != null && (invoke = method.invoke(obj, new java.lang.Object[0])) != null && (!(invoke instanceof java.util.Collection) || ((java.util.Collection) invoke).size() > 0)) {
                        m41595x1b55441c.invoke(obj2, invoke);
                    }
                }
            }
        }
    }

    /* renamed from: findMethodByName */
    public static java.lang.reflect.Method m41595x1b55441c(java.lang.reflect.Method[] methodArr, java.lang.String str) {
        for (int i17 = 0; i17 < methodArr.length; i17++) {
            if (methodArr[i17].getName().equals(str)) {
                return methodArr[i17];
            }
        }
        return null;
    }
}
