package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public abstract class o1 implements java.lang.reflect.InvocationHandler {
    public static java.lang.Object a(java.lang.String str, java.lang.Class cls) {
        return cls.cast(java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, new com.tencent.mm.plugin.appbrand.utils.n1(str)));
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.Class<?> returnType = method.getReturnType();
        if (returnType.equals(java.lang.Integer.TYPE)) {
            return 0;
        }
        if (returnType.equals(java.lang.Long.TYPE)) {
            return 0L;
        }
        if (returnType.equals(java.lang.Double.TYPE)) {
            return java.lang.Double.valueOf(0.0d);
        }
        if (returnType.equals(java.lang.Float.TYPE)) {
            return java.lang.Float.valueOf(0.0f);
        }
        if (returnType.equals(java.lang.Short.TYPE) || returnType.equals(java.lang.Byte.TYPE) || returnType.equals(java.lang.Character.TYPE)) {
            return 0;
        }
        if (!returnType.equals(java.lang.Boolean.TYPE) && !returnType.equals(java.lang.Boolean.class)) {
            returnType.isInterface();
            return null;
        }
        return java.lang.Boolean.FALSE;
    }
}
