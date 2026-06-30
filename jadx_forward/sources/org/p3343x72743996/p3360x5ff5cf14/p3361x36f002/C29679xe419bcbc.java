package org.p3343x72743996.p3360x5ff5cf14.p3361x36f002;

/* renamed from: org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil */
/* loaded from: classes13.dex */
public class C29679xe419bcbc {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f74946x7118e671 = false;

    /* renamed from: org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil$InvocationHandlerWithDelegateGetter */
    /* loaded from: classes13.dex */
    public static class InvocationHandlerWithDelegateGetter implements java.lang.reflect.InvocationHandler {

        /* renamed from: mDelegate */
        private final java.lang.Object f74947x55d38512;

        public InvocationHandlerWithDelegateGetter(java.lang.Object obj) {
            this.f74947x55d38512 = obj;
        }

        /* renamed from: getDelegate */
        public java.lang.Object m154471xacb01afb() {
            return this.f74947x55d38512;
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            try {
                return org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29679xe419bcbc.m154467xa7aaac7(method, this.f74947x55d38512.getClass().getClassLoader()).invoke(this.f74947x55d38512, objArr);
            } catch (java.lang.reflect.InvocationTargetException e17) {
                throw e17.getTargetException();
            } catch (java.lang.ReflectiveOperationException e18) {
                throw new java.lang.RuntimeException("Reflection failed for method " + method, e18);
            }
        }
    }

    /* renamed from: castToSuppLibClass */
    public static <T> T m154462xa5e5ff2f(java.lang.Class<T> cls, java.lang.reflect.InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(java.lang.reflect.Proxy.newProxyInstance(org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29679xe419bcbc.class.getClassLoader(), new java.lang.Class[]{cls}, invocationHandler));
    }

    /* renamed from: containsFeature */
    public static boolean m154463xcd014bd7(java.util.Collection<java.lang.String> collection, java.lang.String str) {
        if (!collection.contains(str)) {
            if (m154470x14236c98()) {
                if (collection.contains(str + org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29680xf287485d.f74951xf379f2db)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: createInvocationHandlerFor */
    public static java.lang.reflect.InvocationHandler m154465xbd9360eb(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return new org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29679xe419bcbc.InvocationHandlerWithDelegateGetter(obj);
    }

    /* renamed from: createInvocationHandlersForArray */
    public static java.lang.reflect.InvocationHandler[] m154466x7d7a5f65(java.lang.Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        java.lang.reflect.InvocationHandler[] invocationHandlerArr = new java.lang.reflect.InvocationHandler[length];
        for (int i17 = 0; i17 < length; i17++) {
            invocationHandlerArr[i17] = m154465xbd9360eb(objArr[i17]);
        }
        return invocationHandlerArr;
    }

    /* renamed from: dupeMethod */
    public static java.lang.reflect.Method m154467xa7aaac7(java.lang.reflect.Method method, java.lang.ClassLoader classLoader) {
        return java.lang.Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    /* renamed from: getDelegateFromInvocationHandler */
    public static java.lang.Object m154468xa35c55d5(java.lang.reflect.InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return ((org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29679xe419bcbc.InvocationHandlerWithDelegateGetter) invocationHandler).m154471xacb01afb();
    }

    /* renamed from: instanceOfInOwnClassLoader */
    public static boolean m154469x42d86236(java.lang.Object obj, java.lang.String str) {
        try {
            return java.lang.Class.forName(str, false, obj.getClass().getClassLoader()).isInstance(obj);
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: isDebuggable */
    private static boolean m154470x14236c98() {
        java.lang.String str = android.os.Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }

    /* renamed from: containsFeature */
    public static boolean m154464xcd014bd7(java.lang.String[] strArr, java.lang.String str) {
        return m154463xcd014bd7(java.util.Arrays.asList(strArr), str);
    }
}
