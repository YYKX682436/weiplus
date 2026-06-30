package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002;

/* renamed from: com.tencent.thumbplayer.tmediacodec.util.ReflectUtils */
/* loaded from: classes13.dex */
public class C26515x52f94c14 {

    /* renamed from: EMPTY_PARAM_TYPES */
    public static final java.lang.Class<?>[] f54291x8ad4adf5 = new java.lang.Class[0];

    /* renamed from: EMPTY_PARAMS */
    public static final java.lang.Object[] f54290x2409a0d8 = new java.lang.Object[0];

    /* renamed from: getClassName */
    public static java.lang.String m103518xfed68d6d(java.lang.Class<?> cls) {
        java.lang.String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.reflect.Constructor<?>] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* renamed from: getConstructor */
    public static java.lang.reflect.Constructor<?> m103519x7b291ec4(java.lang.Class<?> cls, boolean z17, boolean z18, java.lang.Class<?>... clsArr) {
        try {
            cls = z17 ? cls.getDeclaredConstructor(clsArr) : cls.getConstructor(clsArr);
            return cls;
        } catch (java.lang.NoSuchMethodException unused) {
            java.lang.reflect.Constructor<?> constructor = null;
            if (z18) {
                java.lang.Class superclass = cls.getSuperclass();
                while (constructor == null && superclass != null) {
                    if (z17) {
                        try {
                            constructor = cls.getDeclaredConstructor(clsArr);
                        } catch (java.lang.NoSuchMethodException unused2) {
                            superclass = superclass.getSuperclass();
                        }
                    } else {
                        constructor = cls.getConstructor(clsArr);
                    }
                }
            }
            return constructor;
        }
    }

    /* renamed from: getConstructors */
    public static java.util.List<java.lang.reflect.Constructor<?>> m103520xe9faba2f(java.lang.Class<?> cls, boolean z17, boolean z18, boolean z19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z18) {
            java.util.List<java.lang.Class<?>> m103531x42e56020 = m103531x42e56020(cls, true);
            if (z19) {
                for (int size = m103531x42e56020.size() - 1; size > -1; size--) {
                    for (java.lang.reflect.Constructor<?> constructor : z17 ? m103531x42e56020.get(size).getDeclaredConstructors() : m103531x42e56020.get(size).getConstructors()) {
                        arrayList.add(constructor);
                    }
                }
            } else {
                for (int i17 = 0; i17 < m103531x42e56020.size(); i17++) {
                    for (java.lang.reflect.Constructor<?> constructor2 : z17 ? m103531x42e56020.get(i17).getDeclaredConstructors() : m103531x42e56020.get(i17).getConstructors()) {
                        arrayList.add(constructor2);
                    }
                }
            }
        } else {
            for (java.lang.reflect.Constructor<?> constructor3 : z17 ? cls.getDeclaredConstructors() : cls.getConstructors()) {
                arrayList.add(constructor3);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* renamed from: getField */
    public static java.lang.reflect.Field m103522x746c4744(java.lang.Class<?> cls, java.lang.String str, boolean z17, boolean z18) {
        try {
            cls = z17 ? cls.getDeclaredField(str) : cls.getField(str);
            return cls;
        } catch (java.lang.NoSuchFieldException unused) {
            if (!z18) {
                return null;
            }
            java.lang.Class superclass = cls.getSuperclass();
            java.lang.reflect.Field field = null;
            while (field == null && superclass != null) {
                if (z17) {
                    try {
                        field = superclass.getDeclaredField(str);
                    } catch (java.lang.NoSuchFieldException unused2) {
                        superclass = superclass.getSuperclass();
                    }
                } else {
                    field = superclass.getField(str);
                }
            }
            return field;
        }
    }

    /* renamed from: getFields */
    public static java.util.List<java.lang.reflect.Field> m103524x191ca1af(java.lang.Class<?> cls, boolean z17, boolean z18, boolean z19, boolean z27) {
        java.util.List<java.lang.Class<?>> list;
        java.lang.reflect.Field[] fields;
        java.lang.reflect.Field[] fields2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z18) {
            if (z19) {
                list = m103531x42e56020(cls, true);
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(2);
                arrayList2.add(cls);
                java.lang.Class<? super java.lang.Object> superclass = cls.getSuperclass();
                if (superclass != null) {
                    arrayList2.add(superclass);
                }
                list = arrayList2;
            }
            if (z27) {
                for (int size = list.size() - 1; size > -1; size--) {
                    if (z17) {
                        fields2 = list.get(size).getDeclaredFields();
                    } else {
                        fields2 = list.get(size).getFields();
                    }
                    for (java.lang.reflect.Field field : fields2) {
                        arrayList.add(field);
                    }
                }
            } else {
                for (int i17 = 0; i17 < list.size(); i17++) {
                    if (z17) {
                        fields = list.get(i17).getDeclaredFields();
                    } else {
                        fields = list.get(i17).getFields();
                    }
                    for (java.lang.reflect.Field field2 : fields) {
                        arrayList.add(field2);
                    }
                }
            }
        } else {
            for (java.lang.reflect.Field field3 : z17 ? cls.getDeclaredFields() : cls.getFields()) {
                arrayList.add(field3);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* renamed from: getMethod */
    public static java.lang.reflect.Method m103527x24dcf3d7(java.lang.Class<?> cls, boolean z17, boolean z18, java.lang.String str, java.lang.Class<?>... clsArr) {
        try {
            if (z17) {
                cls = cls.getDeclaredMethod(str, clsArr);
            } else {
                cls = cls.getMethod(str, clsArr);
            }
            return cls;
        } catch (java.lang.NoSuchMethodException unused) {
            if (!z18) {
                return null;
            }
            java.lang.Class superclass = cls.getSuperclass();
            java.lang.reflect.Method method = null;
            while (method == null && superclass != null) {
                if (z17) {
                    try {
                        method = superclass.getDeclaredMethod(str, clsArr);
                    } catch (java.lang.NoSuchMethodException unused2) {
                        superclass = superclass.getSuperclass();
                    }
                } else {
                    method = superclass.getMethod(str, clsArr);
                }
            }
            return method;
        }
    }

    /* renamed from: getMethods */
    public static java.util.List<java.lang.reflect.Method> m103529x76c1877c(java.lang.Class<?> cls, boolean z17, boolean z18, boolean z19) {
        java.lang.reflect.Method[] methods;
        java.lang.reflect.Method[] methods2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z18) {
            java.util.List<java.lang.Class<?>> m103531x42e56020 = m103531x42e56020(cls, true);
            if (z19) {
                for (int size = m103531x42e56020.size() - 1; size > -1; size--) {
                    if (z17) {
                        methods2 = m103531x42e56020.get(size).getDeclaredMethods();
                    } else {
                        methods2 = m103531x42e56020.get(size).getMethods();
                    }
                    for (java.lang.reflect.Method method : methods2) {
                        arrayList.add(method);
                    }
                }
            } else {
                for (int i17 = 0; i17 < m103531x42e56020.size(); i17++) {
                    if (z17) {
                        methods = m103531x42e56020.get(i17).getDeclaredMethods();
                    } else {
                        methods = m103531x42e56020.get(i17).getMethods();
                    }
                    for (java.lang.reflect.Method method2 : methods) {
                        arrayList.add(method2);
                    }
                }
            }
        } else {
            for (java.lang.reflect.Method method3 : z17 ? cls.getDeclaredMethods() : cls.getMethods()) {
                arrayList.add(method3);
            }
        }
        return arrayList;
    }

    /* renamed from: getObjectByFieldName */
    public static <T> T m103530x4dbce699(java.lang.Object obj, java.lang.String str, java.lang.Class<T> cls) {
        if (obj != null && !android.text.TextUtils.isEmpty(str) && cls != null) {
            try {
                java.lang.reflect.Field m103522x746c4744 = m103522x746c4744(obj.getClass(), str, true, true);
                if (m103522x746c4744 != null) {
                    m103522x746c4744.setAccessible(true);
                    return (T) m103522x746c4744.get(obj);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: getSuperClasss */
    public static java.util.List<java.lang.Class<?>> m103531x42e56020(java.lang.Class<?> cls, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!z17) {
            cls = cls.getSuperclass();
        }
        while (cls != null) {
            arrayList.add(cls);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* renamed from: getValueOfMethod */
    public static java.lang.reflect.Method m103532x38837e73(java.lang.Class<?> cls, java.lang.Class<?>... clsArr) {
        return m103527x24dcf3d7(cls, true, true, "valueOf", clsArr);
    }

    /* renamed from: invokeMethod */
    public static java.lang.Object m103533xd8c5c779(java.lang.reflect.Method method, java.lang.Object obj) {
        return method.invoke(obj, f54290x2409a0d8);
    }

    /* renamed from: isArrayByType */
    public static final boolean m103535xba5f2060(java.lang.reflect.Field field, java.lang.Class<?> cls) {
        java.lang.Class<?> type = field.getType();
        return type.isArray() && cls.isAssignableFrom(type.getComponentType());
    }

    /* renamed from: isCollectionByType */
    public static final boolean m103536x202d75b9(java.lang.reflect.Field field, java.lang.Class<? extends java.util.Collection> cls, java.lang.Class<?> cls2) {
        if (cls.isAssignableFrom(field.getType())) {
            return cls2.isAssignableFrom((java.lang.Class) ((java.lang.reflect.ParameterizedType) field.getGenericType()).getActualTypeArguments()[0]);
        }
        return false;
    }

    /* renamed from: setField */
    public static boolean m103537x52fa61b8(java.lang.Object obj, java.lang.String str, java.lang.Object obj2, boolean z17, boolean z18) {
        java.lang.reflect.Field m103522x746c4744 = m103522x746c4744(obj.getClass(), str, z17, z18);
        if (m103522x746c4744 == null) {
            return false;
        }
        try {
            m103522x746c4744.setAccessible(true);
            m103522x746c4744.set(obj, obj2);
            return true;
        } catch (java.lang.IllegalAccessException unused) {
            return false;
        }
    }

    /* renamed from: invokeMethod */
    public static java.lang.Object m103534xd8c5c779(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
        return method.invoke(obj, objArr);
    }

    /* renamed from: getField */
    public static java.lang.reflect.Field m103521x746c4744(java.lang.Class<?> cls, java.lang.String str) {
        return m103522x746c4744(cls, str, true, true);
    }

    /* renamed from: getMethod */
    public static java.lang.reflect.Method m103526x24dcf3d7(java.lang.Class<?> cls, java.lang.String str, java.lang.Class<?>... clsArr) {
        return m103527x24dcf3d7(cls, true, true, str, clsArr);
    }

    /* renamed from: getMethod */
    public static java.lang.reflect.Method m103525x24dcf3d7(java.lang.Class<?> cls, java.lang.String str) {
        return m103526x24dcf3d7(cls, str, f54291x8ad4adf5);
    }

    /* renamed from: getMethods */
    public static java.util.List<java.lang.reflect.Method> m103528x76c1877c(java.lang.Class<?> cls) {
        return m103529x76c1877c(cls, true, true, true);
    }

    /* renamed from: getFields */
    public static java.util.List<java.lang.reflect.Field> m103523x191ca1af(java.lang.Class<?> cls) {
        return m103524x191ca1af(cls, true, true, true, true);
    }
}
