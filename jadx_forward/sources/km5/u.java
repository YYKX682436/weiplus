package km5;

/* loaded from: classes9.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final km5.a f390902a = new km5.a();

    public static final void a(km5.g gVar) {
        km5.b c17 = c();
        ((km5.q) gVar.a(new km5.t(c17))).s(new km5.s(c17));
    }

    public static final km5.b b() {
        java.lang.ThreadLocal threadLocal = km5.r.f390898b.f390899a;
        java.util.Stack stack = (java.util.Stack) threadLocal.get();
        km5.d dVar = (stack == null || stack.size() == 0) ? null : (km5.d) ((java.util.Stack) threadLocal.get()).peek();
        return dVar != null ? ((km5.q) dVar).f390889r : f390902a;
    }

    public static final km5.b c() {
        km5.b b17 = b();
        if (b17 != null) {
            b17.b();
        } else {
            jm5.b.c("Vending.QuickAccess", "dummy mario", new java.lang.Object[0]);
        }
        return b17;
    }

    public static final km5.d d() {
        km5.q qVar = new km5.q();
        qVar.y(new java.lang.Object[0]);
        return qVar;
    }

    public static final km5.d e(java.lang.Object obj) {
        km5.q qVar = new km5.q();
        qVar.y(obj);
        return qVar;
    }

    public static final km5.d f(java.lang.Object obj, java.lang.Object obj2) {
        km5.q qVar = new km5.q();
        qVar.y(obj, obj2);
        return qVar;
    }

    public static final km5.d g(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        km5.q qVar = new km5.q();
        qVar.y(obj, obj2, obj3);
        return qVar;
    }

    public static final void h(km5.b bVar, java.lang.Object... objArr) {
        if (bVar == null) {
            jm5.b.c("Vending.QuickAccess", "dummy mario", new java.lang.Object[0]);
        } else if (objArr.length > 0) {
            bVar.c(objArr);
        } else {
            bVar.mo143715xc84dc82d();
        }
    }
}
