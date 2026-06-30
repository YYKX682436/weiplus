package a7;

/* loaded from: classes8.dex */
public final class h0 implements a7.d0 {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f83360b;

    /* renamed from: c, reason: collision with root package name */
    public volatile java.util.Map f83361c;

    public h0(java.util.Map map) {
        this.f83360b = java.util.Collections.unmodifiableMap(map);
    }

    @Override // a7.d0
    public java.util.Map a() {
        if (this.f83361c == null) {
            synchronized (this) {
                if (this.f83361c == null) {
                    this.f83361c = java.util.Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f83361c;
    }

    public final java.util.Map b() {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry entry : this.f83360b.entrySet()) {
            java.util.List list = (java.util.List) entry.getValue();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int size = list.size();
            for (int i17 = 0; i17 < size; i17++) {
                java.lang.String str = ((a7.g0) ((a7.e0) list.get(i17))).f83357a;
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

    /* renamed from: equals */
    public boolean m752xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof a7.h0) {
            return this.f83360b.equals(((a7.h0) obj).f83360b);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m753x8cdac1b() {
        return this.f83360b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m754x9616526c() {
        return "LazyHeaders{headers=" + this.f83360b + '}';
    }
}
