package m06;

/* loaded from: classes15.dex */
public final class a implements q06.c {

    /* renamed from: a, reason: collision with root package name */
    public final e26.c0 f404122a;

    /* renamed from: b, reason: collision with root package name */
    public final o06.v0 f404123b;

    public a(e26.c0 storageManager, o06.v0 module) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(module, "module");
        this.f404122a = storageManager;
        this.f404123b = module;
    }

    @Override // q06.c
    public boolean a(n16.c packageFqName, n16.g name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageFqName, "packageFqName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        java.lang.String h17 = name.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "asString(...)");
        if (!r26.i0.y(h17, "Function", false) && !r26.i0.y(h17, "KFunction", false) && !r26.i0.y(h17, "SuspendFunction", false) && !r26.i0.y(h17, "KSuspendFunction", false)) {
            return false;
        }
        m06.o oVar = m06.o.f404144b;
        return m06.o.f404144b.a(packageFqName, h17) != null;
    }

    @Override // q06.c
    public java.util.Collection b(n16.c packageFqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageFqName, "packageFqName");
        return kz5.r0.f395535d;
    }

    @Override // q06.c
    public o06.g c(n16.b classId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classId, "classId");
        if (classId.f415691c || classId.k()) {
            return null;
        }
        java.lang.String b17 = classId.i().b();
        if (!r26.n0.B(b17, "Function", false)) {
            return null;
        }
        n16.c h17 = classId.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getPackageFqName(...)");
        m06.n a17 = m06.o.f404144b.a(h17, b17);
        if (a17 == null) {
            return null;
        }
        r06.o0 o0Var = (r06.o0) this.f404123b.Q(h17);
        java.util.List list = (java.util.List) e26.b0.a(o0Var.f450030h, o0Var, r06.o0.f450027n[0]);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof l06.d) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(kz5.n0.Z(arrayList2));
        return new m06.c(this.f404122a, (l06.d) kz5.n0.X(arrayList), a17.f404142a, a17.f404143b);
    }
}
