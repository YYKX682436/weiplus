package uy1;

/* loaded from: classes13.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f513447a = new java.util.WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f513448b = new java.util.WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f513449c = new java.util.WeakHashMap();

    public static vy1.b a(java.lang.Object obj, boolean z17) {
        if (obj == null) {
            return null;
        }
        java.util.Map map = f513447a;
        vy1.b bVar = (vy1.b) ((java.util.WeakHashMap) map).get(obj);
        if (bVar != null || !z17) {
            return bVar;
        }
        vy1.b bVar2 = new vy1.b();
        ((java.util.WeakHashMap) map).put(obj, bVar2);
        return bVar2;
    }

    public static vy1.c b(java.lang.Object obj, boolean z17) {
        if (obj == null) {
            return null;
        }
        java.util.Map map = f513448b;
        vy1.c cVar = (vy1.c) ((java.util.WeakHashMap) map).get(obj);
        if (cVar != null || !z17) {
            return cVar;
        }
        vy1.c cVar2 = new vy1.c();
        ((java.util.WeakHashMap) map).put(obj, cVar2);
        return cVar2;
    }
}
