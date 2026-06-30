package tu5;

/* loaded from: classes12.dex */
public class e extends tu5.b {
    @Override // uu5.b
    public long d(tu5.h hVar, java.util.concurrent.TimeUnit timeUnit) {
        java.lang.Object obj = hVar.f503705a.get("INCREMENT");
        long longValue = obj == null ? 1L : ((java.lang.Long) obj).longValue();
        java.util.HashMap hashMap = hVar.f503705a;
        java.lang.Object obj2 = hashMap.get("LAST_INCREMENT");
        long longValue2 = (obj2 == null ? 0L : ((java.lang.Long) obj2).longValue()) + longValue;
        hashMap.put("LAST_INCREMENT", java.lang.Long.valueOf(longValue));
        hashMap.put("INCREMENT", java.lang.Long.valueOf(longValue2));
        return timeUnit.convert(longValue2, java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}
