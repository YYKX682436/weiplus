package c6;

/* loaded from: classes3.dex */
public final class p implements java.lang.Iterable, zz5.a {

    /* renamed from: e, reason: collision with root package name */
    public static final c6.p f38861e = new c6.p(kz5.q0.f314001d);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f38862d;

    public p(java.util.Map map) {
        this.f38862d = map;
    }

    public final java.util.Map d() {
        java.util.Map map = this.f38862d;
        if (map.isEmpty()) {
            return kz5.q0.f314001d;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return linkedHashMap;
        }
        android.support.v4.media.f.a(((java.util.Map.Entry) it.next()).getValue());
        throw null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof c6.p) {
                if (kotlin.jvm.internal.o.b(this.f38862d, ((c6.p) obj).f38862d)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f38862d.hashCode();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        java.util.Map map = this.f38862d;
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            android.support.v4.media.f.a(entry.getValue());
            arrayList.add(new jz5.l(str, null));
        }
        return arrayList.iterator();
    }

    public java.lang.String toString() {
        return "Parameters(map=" + this.f38862d + ')';
    }
}
