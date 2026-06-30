package cr0;

/* loaded from: classes12.dex */
public final class u1 implements kh.e2 {

    /* renamed from: a, reason: collision with root package name */
    public static final cr0.u1 f303293a = new cr0.u1();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f303294b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f303295c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f303296d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f303297e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f303298f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f303299g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f303300h;

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f303301i;

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f303302j;

    static {
        jz5.i iVar = jz5.i.f384362d;
        f303294b = jz5.h.a(iVar, cr0.l1.f303208d);
        f303295c = jz5.h.a(iVar, cr0.f1.f303156d);
        f303296d = jz5.h.a(iVar, cr0.g1.f303163d);
        f303297e = jz5.h.a(iVar, cr0.q1.f303254d);
        f303298f = mm.o.j(false, 1, null);
        f303299g = jz5.h.a(iVar, cr0.r1.f303266d);
        f303300h = jz5.h.a(iVar, cr0.t1.f303284d);
        f303301i = jz5.h.a(iVar, cr0.h1.f303174d);
        f303302j = jz5.h.b(cr0.m1.f303217d);
    }

    public static final void a(cr0.u1 u1Var, yz5.a aVar) {
        u1Var.getClass();
        if (java.lang.System.currentTimeMillis() % 100 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BinderTracker", (java.lang.String) aVar.mo152xb9724478());
        }
    }

    public static final java.lang.reflect.Method b(cr0.u1 u1Var, java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr) {
        java.lang.Object obj;
        java.lang.reflect.Method b17;
        u1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cls, "<this>");
        java.util.Iterator it = ((java.util.ArrayList) g06.f.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(cls))).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((f06.g) obj).mo9624xfb82e301(), str)) {
                break;
            }
        }
        f06.g gVar = (f06.g) obj;
        if (gVar != null && (b17 = h06.c.b(gVar)) != null) {
            return b17;
        }
        if (clsArr == null) {
            java.lang.reflect.Method method = cls.getMethod(str, new java.lang.Class[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(method, "getMethod(...)");
            return method;
        }
        java.lang.reflect.Method method2 = cls.getMethod(str, (java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(method2, "getMethod(...)");
        return method2;
    }

    public final java.util.Map c() {
        return (java.util.Map) f303301i.mo141623x754a37bb();
    }

    @Override // kh.e2
    public void d() {
        cr0.u0 g17 = g();
        if (g17.f303290a) {
            g17.c().m40834x32c52b(new cr0.k1(g17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BinderTracker", "dump ProxyCalls: unsupported");
        }
        ((cr0.x0) f303300h.mo141623x754a37bb()).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BinderTracker", "dump StubCalls: unsupported");
    }

    public final boolean e() {
        return ((java.lang.Boolean) f303294b.mo141623x754a37bb()).booleanValue();
    }

    @Override // kh.e2
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BinderTracker", "#clearStats");
        cr0.u0 g17 = g();
        if (g17.f303290a) {
            g17.c().m40834x32c52b(new cr0.i1(g17));
        }
        ((cr0.x0) f303300h.mo141623x754a37bb()).getClass();
    }

    public final cr0.u0 g() {
        return (cr0.u0) f303299g.mo141623x754a37bb();
    }
}
