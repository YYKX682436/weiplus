package a7;

/* loaded from: classes8.dex */
public final class h0 implements a7.d0 {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f1827b;

    /* renamed from: c, reason: collision with root package name */
    public volatile java.util.Map f1828c;

    public h0(java.util.Map map) {
        this.f1827b = java.util.Collections.unmodifiableMap(map);
    }

    @Override // a7.d0
    public java.util.Map a() {
        if (this.f1828c == null) {
            synchronized (this) {
                if (this.f1828c == null) {
                    this.f1828c = java.util.Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f1828c;
    }

    public final java.util.Map b() {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry entry : this.f1827b.entrySet()) {
            java.util.List list = (java.util.List) entry.getValue();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int size = list.size();
            for (int i17 = 0; i17 < size; i17++) {
                java.lang.String str = ((a7.g0) ((a7.e0) list.get(i17))).f1824a;
                if (!android.text.TextUtils.isEmpty(str)) {
                    sb6.append(str);
                    if (i17 != list.size() - 1) {
                        sb6.append(',');
                    }
                }
            }
            java.lang.String sb7 = sb6.toString();
            if (!android.text.TextUtils.isEmpty(sb7)) {
                hashMap.put(entry.getKey(), sb7);
            }
        }
        return hashMap;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof a7.h0) {
            return this.f1827b.equals(((a7.h0) obj).f1827b);
        }
        return false;
    }

    public int hashCode() {
        return this.f1827b.hashCode();
    }

    public java.lang.String toString() {
        return "LazyHeaders{headers=" + this.f1827b + '}';
    }
}
