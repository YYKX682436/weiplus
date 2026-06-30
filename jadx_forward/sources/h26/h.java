package h26;

/* loaded from: classes16.dex */
public class h implements y16.s {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f359868b;

    public h(h26.i kind, java.lang.String... formatParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(formatParams, "formatParams");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(formatParams, formatParams.length);
        java.lang.String format = java.lang.String.format(kind.f359875d, java.util.Arrays.copyOf(copyOf, copyOf.length));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        this.f359868b = format;
    }

    @Override // y16.s
    public java.util.Set a() {
        return kz5.r0.f395535d;
    }

    @Override // y16.s
    public java.util.Set d() {
        return kz5.r0.f395535d;
    }

    @Override // y16.w
    public o06.j e(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        h26.b[] bVarArr = h26.b.f359860d;
        java.lang.String format = java.lang.String.format("<Error class: %s>", java.util.Arrays.copyOf(new java.lang.Object[]{name}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return new h26.a(n16.g.m(format));
    }

    @Override // y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kindFilter, "kindFilter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameFilter, "nameFilter");
        return kz5.p0.f395529d;
    }

    @Override // y16.s
    public java.util.Set g() {
        return kz5.r0.f395535d;
    }

    @Override // y16.s
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public java.util.Set b(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        h26.m mVar = h26.m.f359907a;
        return kz5.o1.c(new h26.d(h26.m.f359909c));
    }

    @Override // y16.s
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public java.util.Set c(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        h26.m mVar = h26.m.f359907a;
        return h26.m.f359912f;
    }

    /* renamed from: toString */
    public java.lang.String mo132804x9616526c() {
        return "ErrorScope{" + this.f359868b + '}';
    }
}
