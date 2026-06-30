package y06;

/* loaded from: classes16.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final y06.h f540210a = new y06.h();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f540211b = kz5.c1.k(new jz5.l("PACKAGE", java.util.EnumSet.noneOf(p06.u.class)), new jz5.l("TYPE", java.util.EnumSet.of(p06.u.f432315f, p06.u.f432327u)), new jz5.l("ANNOTATION_TYPE", java.util.EnumSet.of(p06.u.f432316g)), new jz5.l("TYPE_PARAMETER", java.util.EnumSet.of(p06.u.f432317h)), new jz5.l("FIELD", java.util.EnumSet.of(p06.u.f432319m)), new jz5.l("LOCAL_VARIABLE", java.util.EnumSet.of(p06.u.f432320n)), new jz5.l("PARAMETER", java.util.EnumSet.of(p06.u.f432321o)), new jz5.l("CONSTRUCTOR", java.util.EnumSet.of(p06.u.f432322p)), new jz5.l("METHOD", java.util.EnumSet.of(p06.u.f432323q, p06.u.f432324r, p06.u.f432325s)), new jz5.l("TYPE_USE", java.util.EnumSet.of(p06.u.f432326t)));

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f540212c = kz5.c1.k(new jz5.l("RUNTIME", p06.t.f432310d), new jz5.l("CLASS", p06.t.f432311e), new jz5.l("SOURCE", p06.t.f432312f));

    public final t16.g a(java.util.List arguments) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arguments, "arguments");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : arguments) {
            if (obj instanceof e16.m) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Iterable iterable = (java.util.EnumSet) f540211b.get(n16.g.k(((u06.c0) ((e16.m) it.next())).f505026b.name()).h());
            if (iterable == null) {
                iterable = kz5.r0.f395535d;
            }
            kz5.h0.u(arrayList2, iterable);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            arrayList3.add(new t16.k(n16.b.l(l06.w.f396474v), n16.g.k(((p06.u) it6.next()).name())));
        }
        return new t16.b(arrayList3, y06.g.f540209d);
    }
}
