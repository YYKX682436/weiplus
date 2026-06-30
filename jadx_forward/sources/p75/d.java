package p75;

/* loaded from: classes4.dex */
public class d implements p75.l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f434158a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f434159b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f434160c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f434161d;

    public d(java.lang.String name, java.lang.String dataType, java.lang.String tableName, java.lang.String referTo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataType, "dataType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(referTo, "referTo");
        this.f434158a = name;
        this.f434159b = dataType;
        this.f434160c = tableName;
        this.f434161d = referTo;
    }

    @Override // p75.r
    public java.lang.String b() {
        return z();
    }

    public final p75.m f(java.lang.Number max, java.lang.Number min, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(max, "max");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(min, "min");
        return (z17 ? new p75.c1(z(), max.toString()) : new p75.d1(z(), max.toString())).c(z18 ? new p75.t0(z(), min.toString()) : new p75.u0(z(), min.toString()));
    }

    public final p75.m g(int i17, int i18) {
        if (i18 == 0) {
            return new p75.o0(z(), i17, i18);
        }
        p75.y yVar = (p75.y) new p75.t0(z(), java.lang.String.valueOf(i18)).d(new p75.c1(z(), java.lang.String.valueOf(0 - i18)));
        yVar.f(new p75.o0(z(), i17, i18));
        return yVar;
    }

    public final p75.j h() {
        return new p75.j(this.f434158a, this.f434159b, this.f434160c, this.f434161d, "count");
    }

    public final p75.m0 i(java.lang.Number value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        return new p75.r0(z(), value.toString());
    }

    public final p75.m0 j(java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        return new p75.r0(z(), value);
    }

    public final p75.m0 k(java.util.List numberList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(numberList, "numberList");
        java.lang.String z17 = z();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(numberList, 10));
        java.util.Iterator it = numberList.iterator();
        while (it.hasNext()) {
            arrayList.add(((java.lang.Number) it.next()).toString());
        }
        return new p75.s0(z17, arrayList);
    }

    public final p75.m0 l(java.util.List strList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(strList, "strList");
        return new p75.s0(z(), strList);
    }

    public final p75.m0 m() {
        return new p75.b1(z());
    }

    public final p75.m0 n(java.lang.Number value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        return new p75.t0(z(), value.toString());
    }

    public final p75.m0 o(java.lang.Number value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        return new p75.u0(z(), value.toString());
    }

    public final p75.m0 p(java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        return new p75.v0(z(), value);
    }

    public final p75.m0 q(java.lang.Number value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        return new p75.w0(z(), value.toString());
    }

    public final p75.m0 r(java.util.List numberList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(numberList, "numberList");
        java.lang.String z17 = z();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(numberList, 10));
        java.util.Iterator it = numberList.iterator();
        while (it.hasNext()) {
            arrayList.add(((java.lang.Number) it.next()).toString());
        }
        return new p75.x0(z17, arrayList);
    }

    public final p75.m0 s(java.util.List numberList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(numberList, "numberList");
        return new p75.x0(z(), numberList);
    }

    public final p75.m0 t(java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        return new p75.y0(z(), value);
    }

    public final p75.s u() {
        return new p75.g(z(), false);
    }

    public final p75.s v() {
        return new p75.g(z(), true);
    }

    public final p75.m0 w(java.lang.Number value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        return new p75.c1(z(), value.toString());
    }

    public final p75.m0 x(java.lang.Number value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        return new p75.d1(z(), value.toString());
    }

    public final p75.j y() {
        return new p75.j(this.f434158a, this.f434159b, this.f434160c, this.f434161d, "sum");
    }

    public java.lang.String z() {
        return this.f434160c + '.' + this.f434158a;
    }
}
