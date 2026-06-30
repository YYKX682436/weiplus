package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1;

/* renamed from: com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil */
/* loaded from: classes13.dex */
public class C26161xb0ecee32 {

    /* renamed from: REVERSE_MAP_NAME_SUFFIX */
    private static final java.lang.String f50275xb3629185 = ".reverseMap";
    private static final java.lang.String TAG = "TPNativeKeyMapUtil";

    /* renamed from: sNameToMap */
    private static final java.util.Map<java.lang.String, java.util.Map<java.lang.Number, java.lang.Number>> f50278x7d5dade3 = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: sHasThisAnnotationInitMap */
    private static final java.util.Map<java.lang.Class<?>, java.util.concurrent.atomic.AtomicBoolean> f50277xfd1b618 = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: sToNativeOptionalIdMap */
    private static final android.util.SparseArray<com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.OptionIdMapping> f50280x142042bc = new android.util.SparseArray<>();

    /* renamed from: sOptionalIdKeyToNameMap */
    private static final android.util.SparseArray<java.lang.String> f50279x741efcc5 = new android.util.SparseArray<>();

    /* renamed from: sHasOptionalIdMapInit */
    private static final java.util.concurrent.atomic.AtomicBoolean f50276x9c47290a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: buildBiDirectionMapForAnnotation */
    private static <T extends java.lang.annotation.Annotation> void m100870x55dfa8a6(java.lang.Class<T> cls) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "buildBiDirectionMapForAnnotation, clazz=" + cls);
        java.util.Map<java.lang.Class<?>, java.util.concurrent.atomic.AtomicBoolean> map = f50277xfd1b618;
        synchronized (map) {
            atomicBoolean = map.get(cls);
            if (atomicBoolean == null) {
                atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
                map.put(cls, atomicBoolean);
            }
        }
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                m100885x7d1bc70e(cls);
                atomicBoolean.set(true);
            } else {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "className=" + cls.getSimpleName() + " already init");
            }
        }
    }

    /* renamed from: buildNativeInitConfigMap */
    private static void m100871x74c29365() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapInitConfig mapInitConfig;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.class.getName());
            for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                if (field.getType().toString().equals("int") && (mapInitConfig = (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapInitConfig) field.getAnnotation(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapInitConfig.class)) != null) {
                    int i17 = field.getInt(cls);
                    f50279x741efcc5.put(i17, mapInitConfig.m100838xcf62458a());
                    if (mapInitConfig.m100840x6ac9171() == -1) {
                        f50280x142042bc.put(i17, new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.OptionIdMapping());
                    } else {
                        field.setAccessible(true);
                        f50280x142042bc.put(i17, new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.OptionIdMapping(mapInitConfig.m100839x368f3a(), mapInitConfig.m100840x6ac9171()));
                    }
                }
            }
        } catch (java.lang.ClassNotFoundException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
        } catch (java.lang.IllegalAccessException e18) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e18);
        }
    }

    /* renamed from: buildNativeOptionalIdToMapInternal */
    private static void m100872x6a164ffe(java.lang.Class<?> cls) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapOptionalId mapOptionalId;
        try {
            for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                if (field.getType().toString().equals("int") && (mapOptionalId = (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapOptionalId) field.getAnnotation(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapOptionalId.class)) != null) {
                    int i17 = field.getInt(cls);
                    f50279x741efcc5.put(i17, mapOptionalId.m100843xcf62458a());
                    if (mapOptionalId.m100845x6ac9171() == -1) {
                        f50280x142042bc.put(i17, new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.OptionIdMapping());
                    } else {
                        field.setAccessible(true);
                        f50280x142042bc.put(i17, new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.OptionIdMapping(mapOptionalId.m100844x368f3a(), mapOptionalId.m100845x6ac9171()));
                    }
                }
            }
        } catch (java.lang.IllegalAccessException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
        }
    }

    /* renamed from: buildOptionalIdMap */
    private static void m100873x1b92f2f3() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f50276x9c47290a;
        synchronized (atomicBoolean) {
            if (f50280x142042bc.size() != 0) {
                return;
            }
            if (atomicBoolean.get()) {
                throw new java.lang.IllegalStateException("构建Map错误，请查看【--keep class com.tencent.thumbplayer.api.** { *; }】是否加入反混淆");
            }
            m100871x74c29365();
            m100875x3df41338();
            m100874xb5ddf13a();
            atomicBoolean.set(true);
        }
    }

    /* renamed from: buildPrivateToNativeOptionalIdMap */
    private static void m100874xb5ddf13a() {
        try {
            m100872x6a164ffe(java.lang.Class.forName(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26519xa2011bf4.class.getName()));
        } catch (java.lang.ClassNotFoundException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
        }
    }

    /* renamed from: buildPublicToNativeOptionalIdMap */
    private static void m100875x3df41338() {
        try {
            m100872x6a164ffe(java.lang.Class.forName(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.class.getName()));
        } catch (java.lang.ClassNotFoundException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
        }
    }

    /* renamed from: checkFillMapValidity */
    private static <T extends java.lang.annotation.Annotation> void m100876x21e57903(java.lang.Class<T> cls, java.util.Map<java.lang.Number, java.lang.Number> map, java.util.Map<java.lang.Number, java.lang.Number> map2, java.lang.Class<?> cls2, java.lang.Number number, java.lang.Number number2) {
        if (map.containsKey(number2)) {
            throw new java.lang.IllegalStateException(cls2.getName() + " 配置了重复的成员变量，注解=" + cls.getName() + " 成员变量值=" + number2 + " 请查找一下使用这个注解@" + cls.getName() + "的哪两个成员变量值相等");
        }
        if (map2.containsKey(number)) {
            throw new java.lang.IllegalStateException(cls2.getName() + " 配置了重复的注解值，注解=" + cls.getName() + " 成员变量值=" + number2 + " 请查找一下@" + cls.getName() + "(这个值)在哪里重复了");
        }
    }

    /* renamed from: convertToNativeOptionalId */
    public static com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.OptionIdMapping m100877x151827c0(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17) {
        android.util.SparseArray<com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.OptionIdMapping> sparseArray = f50280x142042bc;
        if (sparseArray.size() == 0) {
            m100873x1b92f2f3();
        }
        return sparseArray.get(i17, new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.OptionIdMapping());
    }

    @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.NativeSurfaceType
    /* renamed from: convertToNativeSurfaceType */
    public static int m100878x4f940b02(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSurfaceType int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapSurfaceType mapSurfaceType;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6.class.getName());
            for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                if (field.getType().toString().equals("int")) {
                    field.setAccessible(true);
                    if (i17 == field.getInt(cls) && (mapSurfaceType = (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapSurfaceType) field.getAnnotation(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapSurfaceType.class)) != null) {
                        return mapSurfaceType.m100854x6ac9171();
                    }
                }
            }
        } catch (java.lang.ClassNotFoundException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
        } catch (java.lang.IllegalAccessException e18) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e18);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "convertToNativeSurfaceType, player surface type is invalid(" + i17 + "), return unspecified instead");
        return 0;
    }

    /* renamed from: getEntrySetOfToNativeMap */
    public static <T extends java.lang.annotation.Annotation> java.util.Set<java.util.Map.Entry<java.lang.Number, java.lang.Number>> m100879x1d1f8cd(java.lang.Class<T> cls) {
        return new java.util.HashSet(m100881x85f33452(cls, true).entrySet());
    }

    /* renamed from: getEntrySetOfToTPMap */
    public static <T extends java.lang.annotation.Annotation> java.util.Set<java.util.Map.Entry<java.lang.Number, java.lang.Number>> m100880x4baf9c68(java.lang.Class<T> cls) {
        return new java.util.HashSet(m100881x85f33452(cls, false).entrySet());
    }

    /* renamed from: getMapForAnnotation */
    private static <T extends java.lang.annotation.Annotation> java.util.Map<java.lang.Number, java.lang.Number> m100881x85f33452(java.lang.Class<T> cls, boolean z17) {
        java.lang.String m100882x24a25659 = m100882x24a25659(cls, z17);
        java.util.Map<java.lang.String, java.util.Map<java.lang.Number, java.lang.Number>> map = f50278x7d5dade3;
        java.util.Map<java.lang.Number, java.lang.Number> map2 = map.get(m100882x24a25659);
        if (map2 == null || map2.size() == 0) {
            m100870x55dfa8a6(cls);
            map2 = map.get(m100882x24a25659);
        }
        if (((com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.SearchConfig) cls.getAnnotation(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.SearchConfig.class)) == null) {
            throw new java.lang.IllegalArgumentException(cls.getSimpleName().concat("has not SearchConfig annotation"));
        }
        if (map2 == null || map2.size() == 0) {
            throw new java.lang.IllegalStateException(cls.getSimpleName().concat(" is null after buildBiDirectionMap"));
        }
        return map2;
    }

    /* renamed from: getMapKey */
    private static <T extends java.lang.annotation.Annotation> java.lang.String m100882x24a25659(java.lang.Class<T> cls, boolean z17) {
        java.lang.String canonicalName = cls.getCanonicalName();
        if (z17) {
            return canonicalName;
        }
        return canonicalName + f50275xb3629185;
    }

    /* renamed from: getOptionalIdName */
    public static java.lang.String m100883x964bf2bc(int i17) {
        if (!f50276x9c47290a.get()) {
            m100873x1b92f2f3();
        }
        return f50279x741efcc5.get(i17, "");
    }

    /* renamed from: init */
    public static void m100884x316510() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Class<?>[] declaredClasses = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.class.getDeclaredClasses();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "init BiDirectionMap for tp&native value");
        for (java.lang.Class<?> cls : declaredClasses) {
            if (cls.isAnnotation() && java.lang.reflect.Modifier.isPublic(cls.getModifiers()) && ((com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.SearchConfig) cls.getAnnotation(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.SearchConfig.class)) != null) {
                m100870x55dfa8a6(cls);
            }
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "init cost time=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: searchClassToFillMap */
    private static <T extends java.lang.annotation.Annotation> void m100885x7d1bc70e(java.lang.Class<T> cls) {
        java.lang.annotation.Annotation annotation;
        boolean z17;
        java.lang.Number valueOf;
        java.lang.Number number;
        int i17;
        boolean z18;
        boolean z19 = true;
        java.lang.String m100882x24a25659 = m100882x24a25659(cls, true);
        java.util.Map<java.lang.String, java.util.Map<java.lang.Number, java.lang.Number>> map = f50278x7d5dade3;
        java.util.Map<java.lang.Number, java.lang.Number> map2 = map.get(m100882x24a25659);
        java.lang.String m100882x24a256592 = m100882x24a25659(cls, false);
        java.util.Map<java.lang.Number, java.lang.Number> map3 = map.get(m100882x24a256592);
        if (map2 == null || map3 == null) {
            map2 = new java.util.HashMap<>();
            map.put(m100882x24a25659, map2);
            map3 = new java.util.HashMap<>();
            map.put(m100882x24a256592, map3);
        }
        java.util.Map<java.lang.Number, java.lang.Number> map4 = map2;
        java.util.Map<java.lang.Number, java.lang.Number> map5 = map3;
        try {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.SearchConfig searchConfig = (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.SearchConfig) cls.getAnnotation(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.SearchConfig.class);
            if (searchConfig == null) {
                throw new java.lang.IllegalArgumentException(cls.getCanonicalName() + "has not SearchConfig annotation");
            }
            java.lang.Class<?> m100866xde4d9cb0 = searchConfig.m100866xde4d9cb0();
            java.lang.reflect.Field[] declaredFields = m100866xde4d9cb0.getDeclaredFields();
            int length = declaredFields.length;
            int i18 = 0;
            while (i18 < length) {
                java.lang.reflect.Field field = declaredFields[i18];
                java.lang.String str = "";
                java.lang.Class<? extends java.lang.Number> m100868x783c6687 = searchConfig.m100868x783c6687();
                java.lang.Class<? extends java.lang.Number> cls2 = java.lang.Integer.TYPE;
                if (m100868x783c6687 == cls2) {
                    str = "int";
                } else if (searchConfig.m100868x783c6687() == java.lang.Long.TYPE) {
                    str = "long";
                }
                if (android.text.TextUtils.isEmpty(str)) {
                    throw new java.lang.IllegalArgumentException("代码还没实现对" + searchConfig.m100868x783c6687().getName() + "的支持");
                }
                if (field.getType().toString().equals(str) && (annotation = field.getAnnotation(cls)) != null) {
                    field.setAccessible(z19);
                    int i19 = i18;
                    java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("value", new java.lang.Class[0]);
                    z19 = true;
                    declaredMethod.setAccessible(true);
                    if (searchConfig.m100868x783c6687() == cls2) {
                        java.lang.Integer num = (java.lang.Integer) declaredMethod.invoke(annotation, new java.lang.Object[0]);
                        valueOf = java.lang.Integer.valueOf(field.getInt(m100866xde4d9cb0));
                        number = num;
                        z17 = false;
                    } else {
                        if (searchConfig.m100868x783c6687() != java.lang.Long.TYPE) {
                            throw new java.lang.IllegalArgumentException("代码还没实现对" + searchConfig.m100868x783c6687().getName() + "的支持");
                        }
                        z17 = false;
                        java.lang.Long l17 = (java.lang.Long) declaredMethod.invoke(annotation, new java.lang.Object[0]);
                        valueOf = java.lang.Long.valueOf(field.getLong(m100866xde4d9cb0));
                        number = l17;
                    }
                    java.lang.Number number2 = number;
                    i17 = i19;
                    z18 = z17;
                    m100876x21e57903(cls, map4, map5, m100866xde4d9cb0, number2, valueOf);
                    map4.put(valueOf, number2);
                    map5.put(number2, valueOf);
                    i18 = i17 + 1;
                }
                i17 = i18;
                z18 = false;
                i18 = i17 + 1;
            }
        } catch (java.lang.IllegalAccessException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
        } catch (java.lang.NoSuchMethodException e18) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e18);
            throw new java.lang.IllegalStateException("com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap下所有元素需要加到混淆中, 并且每个MapXXX注解需要有value方法");
        } catch (java.lang.reflect.InvocationTargetException e19) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e19);
        }
    }

    /* renamed from: toNativeIntValue */
    public static <T extends java.lang.annotation.Annotation> int m100886x2999bb54(java.lang.Class<T> cls, int i17) {
        java.util.Map<java.lang.Number, java.lang.Number> m100881x85f33452 = m100881x85f33452(cls, true);
        if (m100881x85f33452.containsKey(java.lang.Integer.valueOf(i17))) {
            return m100881x85f33452.get(java.lang.Integer.valueOf(i17)).intValue();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "toNativeValue, tpValue=" + i17 + "return default value, clazz" + cls);
        return (int) ((com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.SearchConfig) cls.getAnnotation(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.SearchConfig.class)).m100865x3db585a3();
    }

    /* renamed from: toNativeLongValue */
    public static <T extends java.lang.annotation.Annotation> long m100887xd490603(java.lang.Class<T> cls, long j17) {
        java.util.Map<java.lang.Number, java.lang.Number> m100881x85f33452 = m100881x85f33452(cls, true);
        if (m100881x85f33452.containsKey(java.lang.Long.valueOf(j17))) {
            return m100881x85f33452.get(java.lang.Long.valueOf(j17)).longValue();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "toNativeValue, tpValue=" + j17 + "return default value, clazz" + cls);
        return ((com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.SearchConfig) cls.getAnnotation(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.SearchConfig.class)).m100865x3db585a3();
    }

    /* renamed from: toTPIntValue */
    public static <T extends java.lang.annotation.Annotation> int m100888xae234a19(java.lang.Class<T> cls, int i17) {
        java.util.Map<java.lang.Number, java.lang.Number> m100881x85f33452 = m100881x85f33452(cls, false);
        if (m100881x85f33452.containsKey(java.lang.Integer.valueOf(i17))) {
            return m100881x85f33452.get(java.lang.Integer.valueOf(i17)).intValue();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "toTPValue, nativeValue=" + i17 + "return default value, clazz" + cls);
        return (int) ((com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.SearchConfig) cls.getAnnotation(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.SearchConfig.class)).m100867xb8d50f08();
    }

    /* renamed from: toTPLongValue */
    public static <T extends java.lang.annotation.Annotation> long m100889x19f14fde(java.lang.Class<T> cls, long j17) {
        java.util.Map<java.lang.Number, java.lang.Number> m100881x85f33452 = m100881x85f33452(cls, false);
        if (m100881x85f33452.containsKey(java.lang.Long.valueOf(j17))) {
            return m100881x85f33452.get(java.lang.Long.valueOf(j17)).longValue();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "toTPValue, nativeValue=" + j17 + "return default value, clazz" + cls);
        return ((com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.SearchConfig) cls.getAnnotation(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.SearchConfig.class)).m100867xb8d50f08();
    }
}
