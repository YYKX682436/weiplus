package androidx.lifecycle;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f11602a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f11603b;

    public b(java.util.Map map) {
        this.f11603b = map;
        for (java.util.Map.Entry entry : map.entrySet()) {
            androidx.lifecycle.m mVar = (androidx.lifecycle.m) entry.getValue();
            java.util.List list = (java.util.List) this.f11602a.get(mVar);
            if (list == null) {
                list = new java.util.ArrayList();
                this.f11602a.put(mVar, list);
            }
            list.add((androidx.lifecycle.c) entry.getKey());
        }
    }

    public static void a(java.util.List list, androidx.lifecycle.y yVar, androidx.lifecycle.m mVar, java.lang.Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                androidx.lifecycle.c cVar = (androidx.lifecycle.c) list.get(size);
                cVar.getClass();
                try {
                    int i17 = cVar.f11612a;
                    java.lang.reflect.Method method = cVar.f11613b;
                    if (i17 == 0) {
                        method.invoke(obj, new java.lang.Object[0]);
                    } else if (i17 == 1) {
                        method.invoke(obj, yVar);
                    } else if (i17 == 2) {
                        method.invoke(obj, yVar, mVar);
                    }
                } catch (java.lang.IllegalAccessException e17) {
                    throw new java.lang.RuntimeException(e17);
                } catch (java.lang.reflect.InvocationTargetException e18) {
                    throw new java.lang.RuntimeException("Failed to call observer method", e18.getCause());
                }
            }
        }
    }
}
