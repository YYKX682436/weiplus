package c6;

/* loaded from: classes3.dex */
public final class p implements java.lang.Iterable, zz5.a {

    /* renamed from: e, reason: collision with root package name */
    public static final c6.p f120394e = new c6.p(kz5.q0.f395534d);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f120395d;

    public p(java.util.Map map) {
        this.f120395d = map;
    }

    public final java.util.Map d() {
        java.util.Map map = this.f120395d;
        if (map.isEmpty()) {
            return kz5.q0.f395534d;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return linkedHashMap;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(((java.util.Map.Entry) it.next()).getValue());
        throw null;
    }

    /* renamed from: equals */
    public boolean m14216xb2c87fbf(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof c6.p) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120395d, ((c6.p) obj).f120395d)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m14217x8cdac1b() {
        return this.f120395d.hashCode();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        java.util.Map map = this.f120395d;
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            arrayList.add(new jz5.l(str, null));
        }
        return arrayList.iterator();
    }

    /* renamed from: toString */
    public java.lang.String m14218x9616526c() {
        return "Parameters(map=" + this.f120395d + ')';
    }
}
