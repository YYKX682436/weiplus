package bd;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: e, reason: collision with root package name */
    public static final bd.i f100748e = new bd.i();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f100749a = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f100750b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f100751c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f100752d = new java.util.concurrent.ConcurrentHashMap();

    public final java.util.List a(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map map = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) this.f100751c).get(str);
        if (map != null && !map.isEmpty()) {
            arrayList.addAll(map.values());
        }
        java.util.Map map2 = this.f100750b;
        if (!((java.util.concurrent.ConcurrentHashMap) map2).isEmpty()) {
            arrayList.addAll(((java.util.concurrent.ConcurrentHashMap) map2).values());
        }
        return arrayList;
    }

    public final java.util.Map b(bd.f fVar) {
        if (fVar.f100740e == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.reflect.Field field : fVar.f100740e.getDeclaredFields()) {
            java.lang.String name = field.getName();
            java.lang.String lowerCase = field.getType().getName().toLowerCase();
            if (lowerCase.contains("list") || lowerCase.contains("map") || lowerCase.contains("json") || lowerCase.contains("string")) {
                hashMap.put(name, 4);
            } else if (lowerCase.contains("short") || lowerCase.contains("int") || lowerCase.contains("long") || lowerCase.contains("float") || lowerCase.contains("double") || lowerCase.contains("bool")) {
                hashMap.put(name, 0);
            } else if (lowerCase.contains("char")) {
                hashMap.put(name, 2);
            } else if (lowerCase.contains("byte")) {
                hashMap.put(name, 5);
            }
        }
        return hashMap;
    }
}
