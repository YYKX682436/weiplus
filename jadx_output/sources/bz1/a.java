package bz1;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f36763a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f36764b = new java.util.HashMap();

    public void a(java.util.Map map) {
        java.lang.Object obj;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (java.lang.String str : map.keySet()) {
            if (!u46.l.e(str) && (obj = map.get(str)) != null) {
                ((java.util.HashMap) this.f36764b).put(str, obj);
            }
        }
    }
}
