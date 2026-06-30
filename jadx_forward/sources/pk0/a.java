package pk0;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f436946a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f436947b = new java.util.HashMap();

    public static void a(java.lang.String str) {
        java.util.Set<pk0.b> set;
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.Map map = f436947b;
        synchronized (map) {
            set = (java.util.Set) ((java.util.HashMap) map).remove(str);
        }
        if (set == null) {
            return;
        }
        rk0.c.c("IPC.ObjectRecycler", "recycleAll(%s)", str);
        synchronized (set) {
            for (pk0.b bVar : set) {
                rk0.c.c("IPC.ObjectRecycler", "recycle(%s)", java.lang.Integer.valueOf(bVar.hashCode()));
                ((com.p314xaae8f345.mm.p794xb0fa9b5e.b0) bVar).e();
            }
            set.clear();
        }
    }
}
