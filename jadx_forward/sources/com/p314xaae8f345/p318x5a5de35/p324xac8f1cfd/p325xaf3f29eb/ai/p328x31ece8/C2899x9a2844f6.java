package com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8;

/* renamed from: com.tencent.cloud.component.common.ai.json.WeJson */
/* loaded from: classes13.dex */
public class C2899x9a2844f6 {
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void a(java.lang.StringBuilder sb6, T t17, int i17) {
        java.lang.reflect.Field field;
        int modifiers;
        java.lang.Class<?> cls;
        java.lang.StringBuilder sb7;
        java.lang.Object invoke;
        if (t17.getClass().isPrimitive()) {
            sb6.append(t17);
            return;
        }
        if (t17 instanceof java.lang.String) {
            sb6.append('\"');
            sb6.append(((java.lang.String) t17).replace("\\", "\\\\").replace("\"", "\\\"").replace("\b", "\\b").replace("\n", "\\n").replace("\r", "\\r").replace("\f", "\\f").replace("\t", "\\t"));
            sb6.append('\"');
            return;
        }
        if ((t17 instanceof java.lang.Integer) || (t17 instanceof java.lang.Short) || (t17 instanceof java.lang.Long) || (t17 instanceof java.lang.Byte) || (t17 instanceof java.lang.Boolean) || (t17 instanceof java.lang.Float) || (t17 instanceof java.lang.Double) || (t17 instanceof java.lang.Character)) {
            sb6.append(t17);
            return;
        }
        if (t17.getClass().isArray()) {
            java.lang.Object[] objArr = (java.lang.Object[]) t17;
            if (objArr.length == 0) {
                sb6.append("[]");
                return;
            }
            sb6.append('[');
            for (int i18 = 0; i18 < objArr.length; i18++) {
                a(sb6, (java.lang.StringBuilder) objArr[i18], i17);
                if (i18 < objArr.length - 1) {
                    sb6.append(',');
                }
            }
            sb6.append(']');
            return;
        }
        if (t17 instanceof java.lang.Iterable) {
            java.util.Iterator<T> it = ((java.lang.Iterable) t17).iterator();
            sb6.append('[');
            int i19 = 0;
            while (it.hasNext()) {
                i19++;
                a(sb6, (java.lang.StringBuilder) it.next(), i17);
                sb6.append(',');
            }
            if (i19 > 0) {
                sb6.deleteCharAt(sb6.length() - 1);
            }
            sb6.append(']');
            return;
        }
        char c17 = '{';
        if (t17 instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) t17;
            if (map.size() == 0) {
                sb6.append("{}");
                return;
            }
            sb6.append('{');
            int size = map.size();
            int i27 = 0;
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.Object value = entry.getValue();
                java.lang.String str = (java.lang.String) entry.getKey();
                if (str != null && !str.equals("") && value != null && (!(value instanceof java.lang.String) || !entry.equals(""))) {
                    sb6.append('\"');
                    sb6.append(str);
                    sb6.append('\"');
                    sb6.append(':');
                    a(sb6, (java.lang.StringBuilder) value, i17);
                    if (i27 < size - 1) {
                        sb6.append(',');
                    }
                    i27++;
                }
            }
            sb6.append('}');
            return;
        }
        java.lang.reflect.Field[] declaredFields = t17.getClass().getDeclaredFields();
        java.lang.reflect.Field[] declaredFields2 = t17.getClass().getSuperclass().getDeclaredFields();
        int length = declaredFields.length + declaredFields2.length;
        java.lang.reflect.Field[] fieldArr = new java.lang.reflect.Field[length];
        for (int i28 = 0; i28 < declaredFields.length; i28++) {
            fieldArr[i28] = declaredFields[i28];
        }
        for (int length2 = declaredFields.length; length2 < length; length2++) {
            fieldArr[length2] = declaredFields2[length2 - declaredFields.length];
        }
        if (length == 0) {
            sb6.append("{}");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        int i29 = 0;
        while (i29 < length) {
            try {
                field = fieldArr[i29];
                modifiers = field.getModifiers();
            } catch (java.lang.Exception unused) {
            }
            if ((modifiers & 8) == 0 && ((com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.InterfaceC2901xd5b0345a) field.getAnnotation(com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.InterfaceC2901xd5b0345a.class)) == null) {
                java.lang.String name = field.getName();
                com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.InterfaceC2902xc8822cc5 interfaceC2902xc8822cc5 = (com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.InterfaceC2902xc8822cc5) field.getAnnotation(com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.InterfaceC2902xc8822cc5.class);
                java.lang.String m21628x6ac9171 = interfaceC2902xc8822cc5 != null ? interfaceC2902xc8822cc5.m21628x6ac9171() : name;
                if (!name.contains("$")) {
                    if ((modifiers & 1) != 0) {
                        java.lang.Object obj = field.get(t17);
                        if (obj != null) {
                            hashMap.put(m21628x6ac9171, obj);
                        }
                    } else {
                        java.lang.String str2 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56125x52684c03.equals(field.getType().getName()) ? "is" : "get";
                        try {
                            cls = t17.getClass();
                            sb7 = new java.lang.StringBuilder();
                            sb7.append(str2);
                        } catch (java.lang.NoSuchMethodException unused2) {
                        }
                        try {
                            try {
                                sb7.append(name.substring(0, 1).toUpperCase());
                                sb7.append(name.length() == 1 ? "" : name.substring(1));
                                java.lang.reflect.Method method = cls.getMethod(sb7.toString(), new java.lang.Class[0]);
                                if (method != null && (invoke = method.invoke(t17, new java.lang.Object[0])) != null) {
                                    hashMap.put(m21628x6ac9171, invoke);
                                }
                            } catch (java.lang.Exception unused3) {
                            }
                        } catch (java.lang.NoSuchMethodException unused4) {
                            boolean isAccessible = field.isAccessible();
                            field.setAccessible(true);
                            java.lang.Object obj2 = field.get(t17);
                            if (obj2 != null) {
                                hashMap.put(m21628x6ac9171, obj2);
                            }
                            field.setAccessible(isAccessible);
                            i29++;
                            c17 = '{';
                        }
                        i29++;
                        c17 = '{';
                    }
                }
            }
            i29++;
            c17 = '{';
        }
        sb6.append(c17);
        int size2 = hashMap.size();
        int i37 = 0;
        for (java.util.Map.Entry entry2 : hashMap.entrySet()) {
            i37++;
            java.lang.String str3 = (java.lang.String) entry2.getKey();
            java.lang.Object value2 = entry2.getValue();
            if ((value2 instanceof java.lang.String) && value2.equals("") && i17 < 1) {
                if (str3.equals("image")) {
                    value2 = "";
                }
            }
            sb6.append('\"');
            sb6.append(str3);
            sb6.append('\"');
            sb6.append(':');
            a(sb6, (java.lang.StringBuilder) value2, i17);
            if (i37 < size2) {
                sb6.append(',');
            }
        }
        sb6.append('}');
    }

    /* renamed from: fromJson */
    public <T> T m21622xb5cb93b2(java.lang.String str, java.lang.Class<T> cls) {
        if (str == null) {
            return null;
        }
        if (cls == null) {
            throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("必须指定classOfT");
        }
        java.lang.String trim = str.trim();
        if (trim.startsWith("[")) {
            try {
                T t17 = (T) a(new org.json.JSONArray(trim), cls, (java.lang.Class<?>) null);
                if (t17 != null) {
                    return t17;
                }
            } catch (java.lang.Exception e17) {
                throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("json 解析错误" + e17.getMessage(), e17);
            }
        } else if (trim.startsWith("{")) {
            try {
                return (T) a(new org.json.JSONObject(trim), cls, (java.lang.Class<?>) null);
            } catch (java.lang.Exception e18) {
                throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("json 解析错误:" + e18.getMessage(), e18);
            }
        }
        throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("classOfT 指定错误");
    }

    /* renamed from: toJson */
    public <T> java.lang.String m21623xcc31ba03(T t17) {
        return m21624xcc31ba03(t17, 0);
    }

    /* renamed from: toJson */
    public <T> java.lang.String m21624xcc31ba03(T t17, int i17) {
        if (t17 == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        a(sb6, (java.lang.StringBuilder) t17, i17);
        return sb6.toString();
    }

    public final <T> T a(org.json.JSONArray jSONArray, java.lang.Class<T> cls, java.lang.Class<?> cls2) {
        T t17;
        if (!cls.equals(java.util.List.class)) {
            if (cls.isArray()) {
                return (T) a(jSONArray, cls);
            }
            throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("json 解析错误:不支持的类型:".concat(cls.getName()));
        }
        if (cls2 != null) {
            if (cls.getName().equals("java.util.List")) {
                t17 = (T) new java.util.ArrayList();
            } else {
                try {
                    t17 = (T) ((java.util.List) cls.newInstance());
                } catch (java.lang.Exception e17) {
                    throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("创建List类型失败,该列表不支持无参实例化", e17);
                }
            }
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                try {
                    java.lang.Object obj = jSONArray.get(i17);
                    if (obj instanceof org.json.JSONArray) {
                        ((java.util.List) t17).add(a((org.json.JSONArray) obj, cls, cls2));
                    } else if (obj instanceof org.json.JSONObject) {
                        ((java.util.List) t17).add(a((org.json.JSONObject) obj, (java.lang.Class) cls2, cls2));
                    } else {
                        ((java.util.List) t17).add(obj);
                    }
                } catch (org.json.JSONException e18) {
                    throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("JSONArray.get() cause JSONException", e18);
                }
            }
            return t17;
        }
        throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("无法确定列表项的类型");
    }

    public final <T> T a(org.json.JSONObject jSONObject, java.lang.Class<T> cls, java.lang.Class<?> cls2) {
        java.lang.Class<?> type;
        T t17;
        if (cls.equals(java.util.Map.class)) {
            if (cls2 != null) {
                if (cls.getName().equals("java.util.Map")) {
                    t17 = (T) new java.util.HashMap();
                } else {
                    try {
                        t17 = (T) ((java.util.Map) cls.newInstance());
                    } catch (java.lang.Exception e17) {
                        throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("创建Map类型失败,该Map不支持无参实例化", e17);
                    }
                }
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    try {
                        java.lang.Object obj = jSONObject.get(next);
                        if (obj != null) {
                            ((java.util.Map) t17).put(next, a(obj, (java.lang.Class<?>) cls, cls2));
                        } else {
                            ((java.util.Map) t17).put(next, null);
                        }
                    } catch (org.json.JSONException e18) {
                        throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("JSONObject.get() cause JSONException", e18);
                    }
                }
                return t17;
            }
            throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("无法确定列表项的类型");
        }
        java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
        java.lang.Class<? super T> superclass = cls.getSuperclass();
        java.lang.reflect.Field[] fieldArr = new java.lang.reflect.Field[0];
        if (superclass != null) {
            fieldArr = superclass.getDeclaredFields();
        }
        int length = declaredFields.length + fieldArr.length;
        java.lang.reflect.Field[] fieldArr2 = new java.lang.reflect.Field[length];
        for (int i17 = 0; i17 < declaredFields.length; i17++) {
            fieldArr2[i17] = declaredFields[i17];
        }
        for (int length2 = declaredFields.length; length2 < length; length2++) {
            fieldArr2[length2] = fieldArr[length2 - declaredFields.length];
        }
        if (length == 0) {
            return null;
        }
        try {
            T newInstance = cls.newInstance();
            for (int i18 = 0; i18 < length; i18++) {
                java.lang.reflect.Field field = fieldArr2[i18];
                if (((com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.InterfaceC2901xd5b0345a) field.getAnnotation(com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.InterfaceC2901xd5b0345a.class)) == null) {
                    java.lang.String name = field.getName();
                    com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.InterfaceC2902xc8822cc5 interfaceC2902xc8822cc5 = (com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.InterfaceC2902xc8822cc5) field.getAnnotation(com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.InterfaceC2902xc8822cc5.class);
                    java.lang.String m21628x6ac9171 = interfaceC2902xc8822cc5 != null ? interfaceC2902xc8822cc5.m21628x6ac9171() : name;
                    if (m21628x6ac9171.contains("$")) {
                        continue;
                    } else {
                        int modifiers = field.getModifiers();
                        java.lang.Object opt = jSONObject.opt(m21628x6ac9171);
                        if (opt != null) {
                            if (field.getGenericType() instanceof java.lang.reflect.TypeVariable) {
                                cls.getTypeParameters();
                                java.lang.reflect.Type genericSuperclass = cls.getGenericSuperclass();
                                if (genericSuperclass instanceof java.lang.reflect.ParameterizedType) {
                                    java.lang.reflect.Type type2 = ((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
                                    if (type2 instanceof java.lang.Class) {
                                        type = (java.lang.Class) type2;
                                    } else {
                                        throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("不支持嵌套泛型");
                                    }
                                } else {
                                    throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("缺少泛型信息:" + cls);
                                }
                            } else {
                                type = field.getType();
                            }
                            java.lang.Object a17 = a(opt, type, (java.lang.Class<?>) a(cls, field));
                            if (org.json.JSONObject.NULL.equals(a17)) {
                                a17 = null;
                            }
                            if ((modifiers & 1) != 0) {
                                try {
                                    field.set(newInstance, a17);
                                } catch (java.lang.IllegalAccessException e19) {
                                    throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("设置成员变量值失败.", e19);
                                }
                            } else {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set");
                                sb6.append(name.substring(0, 1).toUpperCase());
                                sb6.append(name.length() == 1 ? "" : name.substring(1));
                                try {
                                    try {
                                        cls.getMethod(sb6.toString(), field.getType()).invoke(newInstance, a17);
                                    } catch (java.lang.Exception e27) {
                                        throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("调用set方法失败.", e27);
                                    }
                                } catch (java.lang.NoSuchMethodException unused) {
                                    continue;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return newInstance;
        } catch (java.lang.Exception e28) {
            throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("必须为该类型提供一个无参构造方法:".concat(cls.getName()), e28);
        }
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
        if (obj instanceof org.json.JSONArray) {
            return a((org.json.JSONArray) obj, (java.lang.Class) cls, cls2);
        }
        return obj instanceof org.json.JSONObject ? a((org.json.JSONObject) obj, (java.lang.Class) cls, cls2) : obj;
    }

    public final <T> T a(org.json.JSONArray jSONArray, java.lang.Class<T> cls) {
        java.lang.Class<?> componentType = cls.getComponentType();
        T t17 = (T) java.lang.reflect.Array.newInstance(componentType, jSONArray.length());
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            try {
                java.lang.reflect.Array.set(t17, i17, a(jSONArray.get(i17), componentType, componentType));
            } catch (org.json.JSONException e17) {
                throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("JSONArray.get() cause JSONException", e17);
            }
        }
        return t17;
    }

    public final java.lang.Class a(java.lang.Class cls, java.lang.reflect.Field field) {
        if (field.getGenericType() instanceof java.lang.reflect.TypeVariable) {
            cls.getTypeParameters();
            java.lang.reflect.Type genericSuperclass = cls.getGenericSuperclass();
            if (genericSuperclass instanceof java.lang.reflect.ParameterizedType) {
                java.lang.reflect.Type type = ((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
                if (type instanceof java.lang.Class) {
                    return (java.lang.Class) type;
                }
                throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("不支持嵌套泛型");
            }
            throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("缺少泛型信息:" + cls);
        }
        if (field.getType().equals(java.util.List.class)) {
            java.lang.reflect.Type genericType = field.getGenericType();
            if (genericType instanceof java.lang.reflect.ParameterizedType) {
                java.lang.reflect.Type type2 = ((java.lang.reflect.ParameterizedType) genericType).getActualTypeArguments()[0];
                if (type2 instanceof java.lang.Class) {
                    return (java.lang.Class) type2;
                }
                throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("不支持嵌套泛型:" + field.getName());
            }
            throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("缺少泛型类型声明:" + field.getName());
        }
        if (field.getType().equals(java.util.Map.class)) {
            java.lang.reflect.Type genericType2 = field.getGenericType();
            if (genericType2 instanceof java.lang.reflect.ParameterizedType) {
                java.lang.reflect.Type type3 = ((java.lang.reflect.ParameterizedType) genericType2).getActualTypeArguments()[1];
                if (type3 instanceof java.lang.Class) {
                    return (java.lang.Class) type3;
                }
                throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("不支持嵌套泛型:" + field.getName());
            }
            throw new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2900x6338dff9("缺少泛型类型声明:" + field.getName());
        }
        return field.getType();
    }
}
