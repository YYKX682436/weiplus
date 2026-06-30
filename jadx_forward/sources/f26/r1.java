package f26;

/* loaded from: classes14.dex */
public final class r1 extends l26.g {

    /* renamed from: e, reason: collision with root package name */
    public static final f26.q1 f340747e = new f26.q1(null);

    /* renamed from: f, reason: collision with root package name */
    public static final f26.r1 f340748f = new f26.r1(kz5.p0.f395529d);

    public r1(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            f26.o1 o1Var = (f26.o1) it.next();
            ((f26.o) o1Var).getClass();
            f06.d tClass = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(f26.o.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tClass, "tClass");
            java.lang.String d17 = tClass.d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
            int a17 = f340747e.a(d17);
            int d18 = this.f396760d.d();
            if (d18 != 0) {
                if (d18 == 1) {
                    l26.d dVar = this.f396760d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(dVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                    l26.c0 c0Var = (l26.c0) dVar;
                    int i17 = c0Var.f396752e;
                    if (i17 == a17) {
                        this.f396760d = new l26.c0(o1Var, a17);
                    } else {
                        l26.f fVar = new l26.f();
                        this.f396760d = fVar;
                        fVar.e(i17, c0Var.f396751d);
                    }
                }
                this.f396760d.e(a17, o1Var);
            } else {
                this.f396760d = new l26.c0(o1Var, a17);
            }
        }
    }
}
