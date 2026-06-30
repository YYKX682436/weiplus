package i06;

/* loaded from: classes15.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f26.o0 f368137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i06.f1 f368138e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i06.k1 f368139f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(f26.o0 o0Var, i06.f1 f1Var, i06.k1 k1Var) {
        super(0);
        this.f368137d = o0Var;
        this.f368138e = f1Var;
        this.f368139f = k1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        o06.j i17 = this.f368137d.w0().i();
        if (!(i17 instanceof o06.g)) {
            throw new i06.a4("Supertype not a class: " + i17);
        }
        java.lang.Class k17 = i06.o4.k((o06.g) i17);
        i06.f1 f1Var = this.f368138e;
        if (k17 == null) {
            throw new i06.a4("Unsupported superclass of " + f1Var + ": " + i17);
        }
        i06.k1 k1Var = this.f368139f;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k1Var.f368213e.getSuperclass(), k17);
        java.lang.Class cls = k1Var.f368213e;
        if (b17) {
            java.lang.reflect.Type genericSuperclass = cls.getGenericSuperclass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(genericSuperclass);
            return genericSuperclass;
        }
        java.lang.Class<?>[] interfaces = cls.getInterfaces();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(interfaces, "getInterfaces(...)");
        int X = kz5.z.X(interfaces, k17);
        if (X >= 0) {
            java.lang.reflect.Type type = cls.getGenericInterfaces()[X];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(type);
            return type;
        }
        throw new i06.a4("No superclass of " + f1Var + " in Java reflection for " + i17);
    }
}
