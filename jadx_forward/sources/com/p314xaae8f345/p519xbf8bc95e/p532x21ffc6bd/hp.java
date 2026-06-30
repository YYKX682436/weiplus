package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes7.dex */
public final class hp {

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        static final java.util.Map<java.lang.Class<?>, java.lang.Object> f131365a;

        static {
            java.util.HashMap hashMap = new java.util.HashMap();
            f131365a = hashMap;
            java.lang.Class cls = java.lang.Boolean.TYPE;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            hashMap.put(cls, bool);
            hashMap.put(java.lang.Boolean.class, bool);
            hashMap.put(java.lang.Byte.TYPE, (byte) 0);
            hashMap.put(java.lang.Byte.class, (byte) 0);
            hashMap.put(java.lang.Short.TYPE, (short) 0);
            hashMap.put(java.lang.Short.class, (short) 0);
            hashMap.put(java.lang.Integer.TYPE, 0);
            hashMap.put(java.lang.Integer.class, 0);
            hashMap.put(java.lang.Long.TYPE, 0L);
            hashMap.put(java.lang.Long.class, 0L);
            hashMap.put(java.lang.Character.TYPE, (char) 0);
            hashMap.put(java.lang.Character.class, (char) 0);
            java.lang.Class cls2 = java.lang.Float.TYPE;
            java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
            hashMap.put(cls2, valueOf);
            hashMap.put(java.lang.Float.class, valueOf);
            java.lang.Class cls3 = java.lang.Double.TYPE;
            java.lang.Double valueOf2 = java.lang.Double.valueOf(0.0d);
            hashMap.put(cls3, valueOf2);
            hashMap.put(java.lang.Double.class, valueOf2);
            hashMap.put(java.lang.String.class, "");
        }

        public static <T> T a(java.lang.Class<T> cls) {
            return (T) f131365a.get(cls);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T a(java.lang.Class<T> r10, java.lang.Object... r11) {
        /*
            r0 = 0
            if (r10 == 0) goto L9a
            boolean r1 = r10.isEnum()
            if (r1 != 0) goto L9a
            boolean r1 = r10.isInterface()
            if (r1 != 0) goto L9a
            boolean r1 = r10.isAnnotation()
            if (r1 != 0) goto L9a
            boolean r1 = r10.isArray()
            if (r1 == 0) goto L1d
            goto L9a
        L1d:
            java.lang.reflect.Constructor[] r1 = r10.getDeclaredConstructors()
            r2 = 0
            r3 = r2
        L23:
            int r4 = r1.length
            if (r3 >= r4) goto L84
            r4 = r1[r3]
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r5 = r4.length
            int r6 = r11.length
            r7 = 1
            if (r5 != r6) goto L58
            r5 = r2
            r6 = r5
        L33:
            int r8 = r4.length
            if (r5 >= r8) goto L53
            r8 = r4[r5]
            r9 = r11[r5]
            java.lang.Class r9 = r9.getClass()
            if (r8 == r9) goto L4e
            r8 = r4[r5]
            r9 = r11[r5]
            java.lang.Class r9 = r9.getClass()
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 == 0) goto L50
        L4e:
            int r6 = r6 + 1
        L50:
            int r5 = r5 + 1
            goto L33
        L53:
            int r4 = r4.length
            if (r6 != r4) goto L58
            r4 = r7
            goto L59
        L58:
            r4 = r2
        L59:
            if (r4 == 0) goto L81
            r4 = r1[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L67 java.lang.InstantiationException -> L70 java.lang.IllegalAccessException -> L79
            r4.setAccessible(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L67 java.lang.InstantiationException -> L70 java.lang.IllegalAccessException -> L79
            r4 = r1[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L67 java.lang.InstantiationException -> L70 java.lang.IllegalAccessException -> L79
            java.lang.Object r10 = r4.newInstance(r11)     // Catch: java.lang.reflect.InvocationTargetException -> L67 java.lang.InstantiationException -> L70 java.lang.IllegalAccessException -> L79
            return r10
        L67:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(r5, r4)
            goto L81
        L70:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(r5, r4)
            goto L81
        L79:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(r5, r4)
        L81:
            int r3 = r3 + 1
            goto L23
        L84:
            java.lang.Object r10 = r10.newInstance()     // Catch: java.lang.InstantiationException -> L89 java.lang.IllegalAccessException -> L92
            return r10
        L89:
            r10 = move-exception
            java.lang.String r11 = r10.getMessage()
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(r11, r10)
            goto L9a
        L92:
            r10 = move-exception
            java.lang.String r11 = r10.getMessage()
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(r11, r10)
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hp.a(java.lang.Class, java.lang.Object[]):java.lang.Object");
    }

    private static <C> C b(java.lang.Class<C> cls, java.lang.String str) {
        return (C) a((java.lang.Class) cls, str);
    }

    private static <C> C a(java.lang.Class<C> cls) {
        return (C) a((java.lang.Class) cls, "接口[" + cls + "]未实现，调用方法都返回默认值");
    }

    public static <C> C a(final java.lang.Class<C> cls, final java.lang.String str) {
        if (cls.isInterface()) {
            return (C) java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, new java.lang.reflect.InvocationHandler() { // from class: com.tencent.mapsdk.internal.hp.1

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ java.lang.Object f131362a = null;

                @Override // java.lang.reflect.InvocationHandler
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
                    if (this.f131362a != null) {
                        method.setAccessible(true);
                        return method.invoke(this.f131362a, objArr);
                    }
                    if (cls == method.getReturnType() || method.getReturnType().isAssignableFrom(cls) || cls.isAssignableFrom(method.getReturnType())) {
                        return obj;
                    }
                    java.lang.System.out.println(str + "：call method[" + method.getName() + "(...)->" + method.getReturnType() + "]");
                    return com.tencent.mapsdk.internal.hp.a.a(method.getReturnType());
                }
            });
        }
        return null;
    }

    private static boolean a(java.lang.Class<?>[] clsArr, java.lang.Object[] objArr) {
        if (clsArr.length != objArr.length) {
            return false;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < clsArr.length; i18++) {
            if (clsArr[i18] == objArr[i18].getClass() || clsArr[i18].isAssignableFrom(objArr[i18].getClass())) {
                i17++;
            }
        }
        return i17 == clsArr.length;
    }

    private static void a(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        if (obj == null) {
            return;
        }
        try {
            java.lang.reflect.Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (java.lang.IllegalAccessException e17) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(e17.getMessage(), e17);
        } catch (java.lang.NoSuchFieldException e18) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(e18.getMessage(), e18);
        }
    }

    public static java.lang.Object a(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            return null;
        }
        java.lang.Class<?> cls = obj.getClass();
        if (obj instanceof java.lang.Class) {
            cls = (java.lang.Class) obj;
        }
        try {
            java.lang.reflect.Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            if (java.lang.reflect.Modifier.isStatic(declaredField.getModifiers())) {
                return declaredField.get(cls);
            }
            return declaredField.get(obj);
        } catch (java.lang.IllegalAccessException e17) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(e17.getMessage(), e17);
            return null;
        } catch (java.lang.NoSuchFieldException e18) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(e18.getMessage(), e18);
            return null;
        }
    }

    private static java.lang.Object a(java.lang.Object obj, java.lang.String str, java.lang.Object... objArr) {
        if (obj == null) {
            return null;
        }
        int length = objArr.length;
        java.lang.Class[] clsArr = new java.lang.Class[length];
        for (int i17 = 0; i17 < length; i17++) {
            clsArr[i17] = objArr[i17].getClass();
        }
        try {
            java.lang.reflect.Method a17 = a((java.lang.Class) obj.getClass(), str, clsArr);
            if (a17 != null) {
                a17.setAccessible(true);
                return a17.invoke(obj, objArr);
            }
        } catch (java.lang.IllegalAccessException e17) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(e17.getMessage(), e17);
        } catch (java.lang.reflect.InvocationTargetException e18) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(e18.getMessage(), e18);
        }
        return null;
    }

    private static java.lang.Object a(java.lang.Object obj, java.lang.String str, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
        if (obj == null) {
            return null;
        }
        try {
            java.lang.reflect.Method a17 = a((java.lang.Class) obj.getClass(), str, clsArr);
            if (a17 != null) {
                a17.setAccessible(true);
                return a17.invoke(obj, objArr);
            }
        } catch (java.lang.IllegalAccessException e17) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(e17.getMessage(), e17);
        } catch (java.lang.reflect.InvocationTargetException e18) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(e18.getMessage(), e18);
        }
        return null;
    }

    private static java.lang.reflect.Method a(java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (java.lang.NoSuchMethodException e17) {
            if (cls.getSuperclass() != java.lang.Object.class) {
                return a(cls.getSuperclass(), str, clsArr);
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(e17.getMessage(), e17);
            return null;
        }
    }

    public static java.lang.Class a(java.lang.String str, java.lang.ClassLoader classLoader) {
        try {
            return java.lang.Class.forName(str, false, classLoader);
        } catch (java.lang.ClassNotFoundException e17) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(e17.getMessage(), e17);
            return null;
        }
    }

    public static <T> java.lang.Class<? extends T> a(java.lang.String str, java.lang.Class<T> cls, java.lang.ClassLoader classLoader) {
        try {
            java.lang.Class<? extends T> cls2 = (java.lang.Class<? extends T>) java.lang.Class.forName(str, false, classLoader);
            if (cls.isAssignableFrom(cls2)) {
                return cls2;
            }
            return null;
        } catch (java.lang.ClassNotFoundException e17) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(e17.getMessage(), e17);
            return null;
        }
    }
}
