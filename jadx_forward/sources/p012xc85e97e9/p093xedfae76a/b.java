package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f93135a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f93136b;

    public b(java.util.Map map) {
        this.f93136b = map;
        for (java.util.Map.Entry entry : map.entrySet()) {
            p012xc85e97e9.p093xedfae76a.m mVar = (p012xc85e97e9.p093xedfae76a.m) entry.getValue();
            java.util.List list = (java.util.List) this.f93135a.get(mVar);
            if (list == null) {
                list = new java.util.ArrayList();
                this.f93135a.put(mVar, list);
            }
            list.add((p012xc85e97e9.p093xedfae76a.c) entry.getKey());
        }
    }

    public static void a(java.util.List list, p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m mVar, java.lang.Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                p012xc85e97e9.p093xedfae76a.c cVar = (p012xc85e97e9.p093xedfae76a.c) list.get(size);
                cVar.getClass();
                try {
                    int i17 = cVar.f93145a;
                    java.lang.reflect.Method method = cVar.f93146b;
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
