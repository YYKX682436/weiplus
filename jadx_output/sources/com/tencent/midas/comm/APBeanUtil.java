package com.tencent.midas.comm;

/* loaded from: classes4.dex */
public class APBeanUtil {
    public static void copyProperties(java.lang.Object obj, java.lang.Object obj2) {
        try {
            copyPropertiesExclude(obj, obj2, null, true);
        } catch (java.lang.Exception unused) {
        }
    }

    public static void copyPropertiesExclude(java.lang.Object obj, java.lang.Object obj2, java.lang.String[] strArr, boolean z17) {
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
                java.lang.reflect.Method findMethodByName = findMethodByName(declaredMethods2, "set" + name.substring(3));
                if (findMethodByName != null && (invoke = method.invoke(obj, new java.lang.Object[0])) != null && (!(invoke instanceof java.util.Collection) || ((java.util.Collection) invoke).size() > 0)) {
                    findMethodByName.invoke(obj2, invoke);
                }
            }
        }
    }

    public static void copyPropertiesInclude(java.lang.Object obj, java.lang.Object obj2, java.lang.String[] strArr, boolean z17) {
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
                    java.lang.reflect.Method findMethodByName = findMethodByName(declaredMethods2, "set" + name.substring(3));
                    if (findMethodByName != null && (invoke = method.invoke(obj, new java.lang.Object[0])) != null && (!(invoke instanceof java.util.Collection) || ((java.util.Collection) invoke).size() > 0)) {
                        findMethodByName.invoke(obj2, invoke);
                    }
                }
            }
        }
    }

    public static java.lang.reflect.Method findMethodByName(java.lang.reflect.Method[] methodArr, java.lang.String str) {
        for (int i17 = 0; i17 < methodArr.length; i17++) {
            if (methodArr[i17].getName().equals(str)) {
                return methodArr[i17];
            }
        }
        return null;
    }
}
