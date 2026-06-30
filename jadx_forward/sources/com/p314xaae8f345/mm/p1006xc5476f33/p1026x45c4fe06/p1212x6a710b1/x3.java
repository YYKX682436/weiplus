package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public abstract class x3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f172151a;

    static {
        java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap(8);
        f172151a = identityHashMap;
        identityHashMap.put(java.lang.Boolean.class, java.lang.Boolean.TYPE);
        identityHashMap.put(java.lang.Byte.class, java.lang.Byte.TYPE);
        identityHashMap.put(java.lang.Character.class, java.lang.Character.TYPE);
        identityHashMap.put(java.lang.Double.class, java.lang.Double.TYPE);
        identityHashMap.put(java.lang.Float.class, java.lang.Float.TYPE);
        identityHashMap.put(java.lang.Integer.class, java.lang.Integer.TYPE);
        identityHashMap.put(java.lang.Long.class, java.lang.Long.TYPE);
        identityHashMap.put(java.lang.Short.class, java.lang.Short.TYPE);
        identityHashMap.put(java.lang.Void.class, java.lang.Void.TYPE);
        identityHashMap.put(java.lang.String.class, null);
        identityHashMap.put(java.util.Map[].class, null);
    }

    public static java.util.Map a(int i17, java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.reflect.Field field : obj.getClass().getDeclaredFields()) {
            boolean z17 = true;
            field.setAccessible(true);
            java.lang.String name = field.getName();
            if (i17 == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(name)) {
                int length = name.length();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(length);
                boolean z18 = false;
                for (int i18 = 0; i18 < length; i18++) {
                    char charAt = name.charAt(i18);
                    if (charAt == '_') {
                        z18 = true;
                    } else if (z18) {
                        sb6.append(java.lang.Character.toUpperCase(charAt));
                        z18 = false;
                    } else {
                        sb6.append(charAt);
                    }
                }
                name = sb6.toString();
            }
            try {
                obj2 = field.get(obj);
            } catch (java.lang.IllegalAccessException unused) {
                obj2 = null;
            }
            if (obj2 == null) {
                obj2 = "";
            } else if (obj2 instanceof java.util.List) {
                java.util.List list = (java.util.List) obj2;
                int size = list.size();
                java.util.Map[] mapArr = new java.util.Map[size];
                for (int i19 = 0; i19 < size; i19++) {
                    mapArr[i19] = a(i17, list.get(i19));
                }
                obj2 = mapArr;
            }
            if (!obj2.getClass().isPrimitive()) {
                if (!((java.util.IdentityHashMap) f172151a).containsKey(obj2.getClass())) {
                    z17 = false;
                }
            }
            if (!z17) {
                obj2 = a(i17, obj2);
            }
            hashMap.put(name, obj2);
        }
        nf.f.c(hashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ObjToMapUtil", new org.json.JSONObject(hashMap).toString());
        return hashMap;
    }
}
