package androidx.work;

/* loaded from: classes12.dex */
public final class ArrayCreatingInputMerger extends a5.q {
    @Override // a5.q
    public a5.m a(java.util.List list) {
        java.lang.Object newInstance;
        java.lang.Object newInstance2;
        a5.l lVar = new a5.l();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            for (java.util.Map.Entry entry : java.util.Collections.unmodifiableMap(((a5.m) it.next()).f1411a).entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.Object value = entry.getValue();
                java.lang.Class<?> cls = value.getClass();
                java.lang.Object obj = hashMap.get(str);
                if (obj != null) {
                    java.lang.Class<?> cls2 = obj.getClass();
                    if (!cls2.equals(cls)) {
                        if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                            int length = java.lang.reflect.Array.getLength(obj);
                            newInstance = java.lang.reflect.Array.newInstance(value.getClass(), length + 1);
                            java.lang.System.arraycopy(obj, 0, newInstance, 0, length);
                            java.lang.reflect.Array.set(newInstance, length, value);
                        } else {
                            if (!cls.isArray() || !cls.getComponentType().equals(cls2)) {
                                throw new java.lang.IllegalArgumentException();
                            }
                            int length2 = java.lang.reflect.Array.getLength(value);
                            newInstance = java.lang.reflect.Array.newInstance(obj.getClass(), length2 + 1);
                            java.lang.System.arraycopy(value, 0, newInstance, 0, length2);
                            java.lang.reflect.Array.set(newInstance, length2, obj);
                        }
                        value = newInstance;
                    } else if (cls2.isArray()) {
                        int length3 = java.lang.reflect.Array.getLength(obj);
                        int length4 = java.lang.reflect.Array.getLength(value);
                        java.lang.Object newInstance3 = java.lang.reflect.Array.newInstance(obj.getClass().getComponentType(), length3 + length4);
                        java.lang.System.arraycopy(obj, 0, newInstance3, 0, length3);
                        java.lang.System.arraycopy(value, 0, newInstance3, length3, length4);
                        value = newInstance3;
                    } else {
                        newInstance2 = java.lang.reflect.Array.newInstance(obj.getClass(), 2);
                        java.lang.reflect.Array.set(newInstance2, 0, obj);
                        java.lang.reflect.Array.set(newInstance2, 1, value);
                        value = newInstance2;
                    }
                    hashMap.put(str, value);
                } else if (cls.isArray()) {
                    hashMap.put(str, value);
                } else {
                    newInstance2 = java.lang.reflect.Array.newInstance(value.getClass(), 1);
                    java.lang.reflect.Array.set(newInstance2, 0, value);
                    value = newInstance2;
                    hashMap.put(str, value);
                }
            }
        }
        lVar.c(hashMap);
        return lVar.a();
    }
}
