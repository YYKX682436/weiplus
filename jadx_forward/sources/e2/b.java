package e2;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final i2.h f327988a = new i2.h();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f327989b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedHashSet f327990c;

    /* renamed from: d, reason: collision with root package name */
    public int f327991d;

    /* renamed from: e, reason: collision with root package name */
    public int f327992e;

    /* renamed from: f, reason: collision with root package name */
    public int f327993f;

    public b(int i17) {
        if (!(i17 > 0)) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0".toString());
        }
        this.f327989b = new java.util.HashMap(0, 0.75f);
        this.f327990c = new java.util.LinkedHashSet();
    }

    public final java.lang.Object a(java.lang.Object obj) {
        synchronized (this.f327988a) {
            java.lang.Object obj2 = this.f327989b.get(obj);
            if (obj2 == null) {
                this.f327993f++;
                return null;
            }
            this.f327990c.remove(obj);
            this.f327990c.add(obj);
            this.f327992e++;
            return obj2;
        }
    }

    public final java.lang.Object b(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object put;
        java.lang.Object obj3;
        java.lang.Object obj4;
        if (obj == null) {
            throw null;
        }
        if (obj2 == null) {
            throw null;
        }
        synchronized (this.f327988a) {
            this.f327991d = d() + 1;
            put = this.f327989b.put(obj, obj2);
            if (put != null) {
                this.f327991d = d() - 1;
            }
            if (this.f327990c.contains(obj)) {
                this.f327990c.remove(obj);
            }
            this.f327990c.add(obj);
        }
        while (true) {
            synchronized (this.f327988a) {
                if (d() < 0 || ((this.f327989b.isEmpty() && d() != 0) || this.f327989b.isEmpty() != this.f327990c.isEmpty())) {
                    break;
                }
                if (d() <= 16 || this.f327989b.isEmpty()) {
                    obj3 = null;
                    obj4 = null;
                } else {
                    obj3 = kz5.n0.W(this.f327990c);
                    obj4 = this.f327989b.get(obj3);
                    if (obj4 == null) {
                        throw new java.lang.IllegalStateException("inconsistent state");
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(this.f327989b).remove(obj3);
                    p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(this.f327990c).remove(obj3);
                    int d17 = d();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj3);
                    this.f327991d = d17 - 1;
                }
            }
            if (obj3 == null && obj4 == null) {
                return put;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj4);
        }
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
    }

    public final java.lang.Object c(java.lang.Object obj) {
        java.lang.Object remove;
        obj.getClass();
        synchronized (this.f327988a) {
            remove = this.f327989b.remove(obj);
            this.f327990c.remove(obj);
            if (remove != null) {
                this.f327991d = d() - 1;
            }
        }
        return remove;
    }

    public final int d() {
        int i17;
        synchronized (this.f327988a) {
            i17 = this.f327991d;
        }
        return i17;
    }

    /* renamed from: toString */
    public java.lang.String m126787x9616526c() {
        java.lang.String str;
        synchronized (this.f327988a) {
            int i17 = this.f327992e;
            int i18 = this.f327993f + i17;
            str = "LruCache[maxSize=16,hits=" + this.f327992e + ",misses=" + this.f327993f + ",hitRate=" + (i18 != 0 ? (i17 * 100) / i18 : 0) + "%]";
        }
        return str;
    }
}
