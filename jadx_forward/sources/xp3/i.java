package xp3;

/* loaded from: classes7.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f537460a = new java.util.HashMap();

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328 a(java.lang.Class cls) {
        java.util.HashMap hashMap = f537460a;
        if (hashMap.containsKey(cls)) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328) hashMap.get(cls);
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328 abstractC16790x31088328 = (com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328) cls.newInstance();
            hashMap.put(cls, abstractC16790x31088328);
            return abstractC16790x31088328;
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
            return null;
        }
    }
}
