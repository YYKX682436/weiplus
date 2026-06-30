package xn;

/* loaded from: classes4.dex */
public final class d extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f536937d;

    /* renamed from: e, reason: collision with root package name */
    public final xn.b f536938e;

    public d(int i17, java.lang.Object obj, xn.b config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f536937d = obj;
        this.f536938e = config;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        xn.d other = (xn.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        ((a45.e) ((jz5.n) ((a45.g) this.f536938e).f82883d).mo141623x754a37bb()).getClass();
        u15.a thiz = (u15.a) this.f536937d;
        u15.a other2 = (u15.a) other.f536937d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thiz, "thiz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other2, "other");
        return false;
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        xn.d other = (xn.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        ((a45.e) ((jz5.n) ((a45.g) this.f536938e).f82883d).mo141623x754a37bb()).getClass();
        u15.a thiz = (u15.a) this.f536937d;
        u15.a other2 = (u15.a) other.f536937d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thiz, "thiz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other2, "other");
        oi3.e k17 = thiz.k();
        if (k17 == null) {
            return 0;
        }
        long m75942xfb822ef2 = k17.m75942xfb822ef2(k17.f427150d + 2);
        oi3.e k18 = other2.k();
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.j(m75942xfb822ef2, k18 != null ? k18.m75942xfb822ef2(k18.f427150d + 2) : 0L);
    }

    @Override // xm3.a, in5.c
    public int h() {
        int m75939xb282bd08;
        yz5.l lVar;
        xn.b bVar = this.f536938e;
        bVar.getClass();
        java.lang.Object obj = this.f536937d;
        u15.a data = (u15.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data.n()) {
            m75939xb282bd08 = 1000000;
        } else {
            oi3.e k17 = data.k();
            m75939xb282bd08 = k17 != null ? k17.m75939xb282bd08(k17.f427150d + 4) : 0;
        }
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) bVar.f536936b;
        int intValue = (!linkedHashMap.keySet().contains(java.lang.Integer.valueOf(m75939xb282bd08)) || (lVar = (yz5.l) linkedHashMap.get(java.lang.Integer.valueOf(m75939xb282bd08))) == null) ? 0 : ((java.lang.Number) lVar.mo146xb9724478(obj)).intValue();
        xn.a aVar = xn.b.f536934c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int a17 = aVar.a("", m75939xb282bd08, intValue);
        java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) bVar.f536935a;
        if (linkedHashMap2.keySet().contains(java.lang.Integer.valueOf(a17))) {
            return a17;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int a18 = aVar.a("", m75939xb282bd08, 0);
        if (linkedHashMap2.keySet().contains(java.lang.Integer.valueOf(a18))) {
            return a18;
        }
        return 1;
    }

    @Override // xm3.d
    public java.lang.String v() {
        ((a45.e) ((jz5.n) ((a45.g) this.f536938e).f82883d).mo141623x754a37bb()).getClass();
        u15.a data = (u15.a) this.f536937d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        oi3.e k17 = data.k();
        return (k17 != null ? java.lang.Long.valueOf(k17.m75942xfb822ef2(k17.f427150d + 2)) : java.lang.Integer.valueOf(data.hashCode())).toString();
    }
}
