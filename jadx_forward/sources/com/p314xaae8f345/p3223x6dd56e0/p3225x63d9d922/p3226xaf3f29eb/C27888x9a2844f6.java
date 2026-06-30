package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb;

/* renamed from: com.tencent.youtu.sdkkitframework.common.WeJson */
/* loaded from: classes13.dex */
public class C27888x9a2844f6 {

    /* renamed from: EMPTY_ARR */
    private static final java.lang.String f61642x51885c2f = "[]";

    /* renamed from: EMPTY_MAP */
    private static final java.lang.String f61643x5188872a = "{}";

    /* renamed from: fromArr */
    private <T> T m120587xdc92d257(org.json.JSONArray jSONArray, java.lang.Class<T> cls) {
        java.lang.Class<?> componentType = cls.getComponentType();
        T t17 = (T) java.lang.reflect.Array.newInstance(componentType, jSONArray.length());
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            java.lang.reflect.Array.set(t17, i17, m120589xf9b6ce7c(m120595x2817c635(jSONArray, i17), componentType, componentType));
        }
        return t17;
    }

    /* renamed from: fromJsonArr */
    private <T> T m120588xb579794f(org.json.JSONArray jSONArray, java.lang.Class<T> cls, java.lang.Class<?> cls2) {
        if (cls.equals(java.util.List.class)) {
            return (T) m120591xb5cc5768(jSONArray, cls, cls2);
        }
        if (cls.isArray()) {
            return (T) m120587xdc92d257(jSONArray, cls);
        }
        throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("json 解析错误:不支持的类型:".concat(cls.getName()));
    }

    /* renamed from: fromJsonData */
    private java.lang.Object m120589xf9b6ce7c(java.lang.Object obj, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
        return obj instanceof org.json.JSONArray ? m120588xb579794f((org.json.JSONArray) obj, cls, cls2) : obj instanceof org.json.JSONObject ? m120590xb579abe5((org.json.JSONObject) obj, cls, cls2) : obj;
    }

    /* renamed from: fromJsonObj */
    private <T> T m120590xb579abe5(org.json.JSONObject jSONObject, java.lang.Class<T> cls, java.lang.Class<?> cls2) {
        return cls.equals(java.util.Map.class) ? (T) m120592xdc92fd52(jSONObject, cls, cls2) : (T) m120593xb5ce3e4e(jSONObject, cls);
    }

    /* renamed from: fromList */
    private java.util.List m120591xb5cc5768(org.json.JSONArray jSONArray, java.lang.Class<java.util.List> cls, java.lang.Class<?> cls2) {
        java.util.List newInstance;
        if (cls2 == null) {
            throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("无法确定列表项的类型");
        }
        if (cls.getName().equals("java.util.List")) {
            newInstance = new java.util.ArrayList();
        } else {
            try {
                newInstance = cls.newInstance();
            } catch (java.lang.Exception e17) {
                throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("创建List类型失败,该列表不支持无参实例化", e17);
            }
        }
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            java.lang.Object m120595x2817c635 = m120595x2817c635(jSONArray, i17);
            if (m120595x2817c635 instanceof org.json.JSONArray) {
                newInstance.add(m120588xb579794f((org.json.JSONArray) m120595x2817c635, cls, cls2));
            } else if (m120595x2817c635 instanceof org.json.JSONObject) {
                newInstance.add(m120590xb579abe5((org.json.JSONObject) m120595x2817c635, cls, cls2));
            } else {
                newInstance.add(m120595x2817c635);
            }
        }
        return newInstance;
    }

    /* renamed from: fromMap */
    private java.util.Map m120592xdc92fd52(org.json.JSONObject jSONObject, java.lang.Class<java.util.Map> cls, java.lang.Class<?> cls2) {
        java.util.Map newInstance;
        if (cls2 == null) {
            throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("无法确定列表项的类型");
        }
        if (cls.getName().equals("java.util.Map")) {
            newInstance = new java.util.HashMap();
        } else {
            try {
                newInstance = cls.newInstance();
            } catch (java.lang.Exception e17) {
                throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("创建Map类型失败,该Map不支持无参实例化", e17);
            }
        }
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.Object m120596x2817c635 = m120596x2817c635(jSONObject, next);
            if (m120596x2817c635 != null) {
                newInstance.put(next, m120589xf9b6ce7c(m120596x2817c635, cls, cls2));
            } else {
                newInstance.put(next, null);
            }
        }
        return newInstance;
    }

    /* renamed from: fromPojo */
    private <T> T m120593xb5ce3e4e(org.json.JSONObject jSONObject, java.lang.Class<T> cls) {
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
                java.lang.String name = field.getName();
                if (!name.contains("$")) {
                    int modifiers = field.getModifiers();
                    java.lang.Object opt = jSONObject.opt(name);
                    if (opt == null) {
                        continue;
                    } else {
                        java.lang.Object m120589xf9b6ce7c = m120589xf9b6ce7c(opt, m120594x9e5068ea(cls, field), m120597xce6ddd64(cls, field, opt));
                        if (org.json.JSONObject.NULL.equals(m120589xf9b6ce7c)) {
                            m120589xf9b6ce7c = null;
                        }
                        if ((modifiers & 1) != 0) {
                            try {
                                field.set(newInstance, m120589xf9b6ce7c);
                            } catch (java.lang.IllegalAccessException e17) {
                                throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("设置成员变量值失败.", e17);
                            }
                        } else {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set");
                            sb6.append(name.substring(0, 1).toUpperCase());
                            sb6.append(name.length() == 1 ? "" : name.substring(1));
                            try {
                                try {
                                    cls.getMethod(sb6.toString(), field.getType()).invoke(newInstance, m120589xf9b6ce7c);
                                } catch (java.lang.Exception e18) {
                                    throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("调用set方法失败.", e18);
                                }
                            } catch (java.lang.NoSuchMethodException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            return newInstance;
        } catch (java.lang.Exception e19) {
            throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("必须为该类型提供一个无参构造方法:".concat(cls.getName()), e19);
        }
    }

    /* renamed from: getMemberType */
    private <T> java.lang.Class<?> m120594x9e5068ea(java.lang.Class<T> cls, java.lang.reflect.Field field) {
        if (!(field.getGenericType() instanceof java.lang.reflect.TypeVariable)) {
            return field.getType();
        }
        cls.getTypeParameters();
        java.lang.reflect.Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof java.lang.reflect.ParameterizedType)) {
            throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("缺少泛型信息:" + cls);
        }
        java.lang.reflect.Type type = ((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        if (type instanceof java.lang.Class) {
            return (java.lang.Class) type;
        }
        throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("不支持嵌套泛型");
    }

    /* renamed from: getObject */
    private java.lang.Object m120595x2817c635(org.json.JSONArray jSONArray, int i17) {
        try {
            return jSONArray.get(i17);
        } catch (org.json.JSONException e17) {
            throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("JSONArray.get() cause JSONException", e17);
        }
    }

    /* renamed from: getSubType */
    private <T> java.lang.Class<?> m120597xce6ddd64(java.lang.Class<T> cls, java.lang.reflect.Field field, java.lang.Object obj) {
        if (field.getGenericType() instanceof java.lang.reflect.TypeVariable) {
            cls.getTypeParameters();
            java.lang.reflect.Type genericSuperclass = cls.getGenericSuperclass();
            if (!(genericSuperclass instanceof java.lang.reflect.ParameterizedType)) {
                throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("缺少泛型信息:" + cls);
            }
            java.lang.reflect.Type type = ((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
            if (type instanceof java.lang.Class) {
                return (java.lang.Class) type;
            }
            throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("不支持嵌套泛型");
        }
        if (field.getType().equals(java.util.List.class)) {
            java.lang.reflect.Type genericType = field.getGenericType();
            if (!(genericType instanceof java.lang.reflect.ParameterizedType)) {
                throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("缺少泛型类型声明:" + field.getName());
            }
            java.lang.reflect.Type type2 = ((java.lang.reflect.ParameterizedType) genericType).getActualTypeArguments()[0];
            if (type2 instanceof java.lang.Class) {
                return (java.lang.Class) type2;
            }
            throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("不支持嵌套泛型:" + field.getName());
        }
        if (!field.getType().equals(java.util.Map.class)) {
            return field.getType();
        }
        java.lang.reflect.Type genericType2 = field.getGenericType();
        if (!(genericType2 instanceof java.lang.reflect.ParameterizedType)) {
            throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("缺少泛型类型声明:" + field.getName());
        }
        java.lang.reflect.Type type3 = ((java.lang.reflect.ParameterizedType) genericType2).getActualTypeArguments()[1];
        if (type3 instanceof java.lang.Class) {
            return (java.lang.Class) type3;
        }
        throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("不支持嵌套泛型:" + field.getName());
    }

    /* renamed from: getValidStr */
    private java.lang.String m120598x2723220b(java.lang.String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"").replace("\b", "\\b").replace("\n", "\\n").replace("\r", "\\r").replace("\f", "\\f").replace("\t", "\\t");
    }

    /* renamed from: isPrimitivePackageType */
    private <T> boolean m120599x39760183(T t17) {
        return (t17 instanceof java.lang.Integer) || (t17 instanceof java.lang.Short) || (t17 instanceof java.lang.Long) || (t17 instanceof java.lang.Byte) || (t17 instanceof java.lang.Boolean) || (t17 instanceof java.lang.Float) || (t17 instanceof java.lang.Double) || (t17 instanceof java.lang.Character);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: process */
    private <T> void m120600xed8d1e6f(java.lang.StringBuilder sb6, T t17) {
        if (t17.getClass().isPrimitive()) {
            sb6.append(t17);
            return;
        }
        if (t17 instanceof java.lang.String) {
            sb6.append('\"');
            sb6.append(m120598x2723220b((java.lang.String) t17));
            sb6.append('\"');
        } else {
            if (m120599x39760183(t17)) {
                sb6.append(t17);
                return;
            }
            if (t17.getClass().isArray()) {
                m120601x19299972(sb6, (java.lang.Object[]) t17);
                return;
            }
            if (t17 instanceof java.lang.Iterable) {
                m120602xa9916801(sb6, (java.lang.Iterable) t17);
            } else if (t17 instanceof java.util.Map) {
                m120603x1929c46d(sb6, (java.util.Map) t17);
            } else {
                m120604x1929cc08(sb6, t17);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: processArr */
    private <T> void m120601x19299972(java.lang.StringBuilder sb6, java.lang.Object[] objArr) {
        if (objArr.length == 0) {
            sb6.append(f61642x51885c2f);
            return;
        }
        sb6.append('[');
        for (int i17 = 0; i17 < objArr.length; i17++) {
            m120600xed8d1e6f(sb6, objArr[i17]);
            if (i17 < objArr.length - 1) {
                sb6.append(',');
            }
        }
        sb6.append(']');
    }

    /* renamed from: processIterable */
    private void m120602xa9916801(java.lang.StringBuilder sb6, java.lang.Iterable iterable) {
        java.util.Iterator it = iterable.iterator();
        sb6.append('[');
        int i17 = 0;
        while (it.hasNext()) {
            i17++;
            m120600xed8d1e6f(sb6, it.next());
            sb6.append(',');
        }
        if (i17 > 0) {
            sb6.deleteCharAt(sb6.length() - 1);
        }
        sb6.append(']');
    }

    /* renamed from: processMap */
    private void m120603x1929c46d(java.lang.StringBuilder sb6, java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map.size() == 0) {
            sb6.append(f61643x5188872a);
            return;
        }
        sb6.append('{');
        int size = map.size();
        int i17 = 0;
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            java.lang.Object value = entry.getValue();
            java.lang.String key = entry.getKey();
            if (key != null && !key.equals("") && value != null && (!(value instanceof java.lang.String) || !entry.equals(""))) {
                sb6.append('\"');
                sb6.append(key);
                sb6.append('\"');
                sb6.append(':');
                m120600xed8d1e6f(sb6, value);
                if (i17 < size - 1) {
                    sb6.append(',');
                }
                i17++;
            }
        }
        sb6.append('}');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: processObj */
    private <T> void m120604x1929cc08(java.lang.StringBuilder sb6, T t17) {
        java.lang.Object invoke;
        java.lang.reflect.Field[] declaredFields = t17.getClass().getDeclaredFields();
        java.lang.reflect.Field[] declaredFields2 = t17.getClass().getSuperclass().getDeclaredFields();
        int length = declaredFields.length + declaredFields2.length;
        java.lang.reflect.Field[] fieldArr = new java.lang.reflect.Field[length];
        int i17 = 0;
        for (int i18 = 0; i18 < declaredFields.length; i18++) {
            fieldArr[i18] = declaredFields[i18];
        }
        for (int length2 = declaredFields.length; length2 < length; length2++) {
            fieldArr[length2] = declaredFields2[length2 - declaredFields.length];
        }
        if (length == 0) {
            sb6.append(f61643x5188872a);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        int i19 = 0;
        while (true) {
            java.lang.String str = "";
            if (i19 >= length) {
                break;
            }
            try {
                java.lang.reflect.Field field = fieldArr[i19];
                int modifiers = field.getModifiers();
                if ((modifiers & 8) == 0) {
                    java.lang.String name = field.getName();
                    if (!name.contains("$")) {
                        if ((modifiers & 1) != 0) {
                            java.lang.Object obj = field.get(t17);
                            if (obj != null) {
                                hashMap.put(name, obj);
                            }
                        } else {
                            java.lang.Class<?> cls = t17.getClass();
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            sb7.append("get");
                            sb7.append(name.substring(0, 1).toUpperCase());
                            if (name.length() != 1) {
                                str = name.substring(1);
                            }
                            sb7.append(str);
                            java.lang.reflect.Method method = cls.getMethod(sb7.toString(), new java.lang.Class[0]);
                            if (method != null && (invoke = method.invoke(t17, new java.lang.Object[0])) != null) {
                                hashMap.put(name, invoke);
                            }
                        }
                    }
                }
            } catch (java.lang.Exception unused) {
            }
            i19++;
        }
        sb6.append('{');
        int size = hashMap.size();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            i17++;
            java.lang.String str2 = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            if ((value instanceof java.lang.String) && value.equals("")) {
                if (str2.equals("image")) {
                    value = "";
                }
            }
            sb6.append('\"');
            sb6.append(str2);
            sb6.append('\"');
            sb6.append(':');
            m120600xed8d1e6f(sb6, value);
            if (i17 < size) {
                sb6.append(',');
            }
        }
        sb6.append('}');
    }

    /* renamed from: fromJson */
    public <T> T m120605xb5cb93b2(java.lang.String str, java.lang.Class<T> cls) {
        if (str == null) {
            return null;
        }
        if (cls == null) {
            throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("必须指定classOfT");
        }
        java.lang.String trim = str.trim();
        if (trim.startsWith("[")) {
            try {
                T t17 = (T) m120588xb579794f(new org.json.JSONArray(trim), cls, null);
                if (t17 != null) {
                    return t17;
                }
            } catch (java.lang.Exception e17) {
                throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("json 解析错误" + e17.getMessage(), e17);
            }
        } else if (trim.startsWith("{")) {
            try {
                return (T) m120590xb579abe5(new org.json.JSONObject(trim), cls, null);
            } catch (java.lang.Exception e18) {
                throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("json 解析错误:" + e18.getMessage(), e18);
            }
        }
        throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("classOfT 指定错误");
    }

    /* renamed from: toJson */
    public <T> java.lang.String m120606xcc31ba03(T t17) {
        return m120607xcc31ba03(t17, 0);
    }

    /* renamed from: toJson */
    public <T> java.lang.String m120607xcc31ba03(T t17, int i17) {
        if (t17 == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        m120600xed8d1e6f(sb6, t17);
        return sb6.toString();
    }

    /* renamed from: getObject */
    private java.lang.Object m120596x2817c635(org.json.JSONObject jSONObject, java.lang.String str) {
        try {
            return jSONObject.get(str);
        } catch (org.json.JSONException e17) {
            throw new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27889x6338dff9("JSONObject.get() cause JSONException", e17);
        }
    }
}
