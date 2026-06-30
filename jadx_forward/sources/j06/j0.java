package j06;

/* loaded from: classes16.dex */
public abstract class j0 implements j06.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Member f378596a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Type f378597b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Class f378598c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f378599d;

    public j0(java.lang.reflect.Member member, java.lang.reflect.Type type, java.lang.Class cls, java.lang.reflect.Type[] typeArr, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.util.List z07;
        this.f378596a = member;
        this.f378597b = type;
        this.f378598c = cls;
        if (cls != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.l0 l0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.l0(2);
            l0Var.a(cls);
            l0Var.b(typeArr);
            z07 = kz5.c0.i(l0Var.d(new java.lang.reflect.Type[l0Var.c()]));
        } else {
            z07 = kz5.z.z0(typeArr);
        }
        this.f378599d = z07;
    }

    @Override // j06.k
    public java.util.List a() {
        return this.f378599d;
    }

    @Override // j06.k
    public final java.lang.reflect.Member b() {
        return this.f378596a;
    }

    public void c(java.lang.Object[] objArr) {
        j06.j.a(this, objArr);
    }

    public final void d(java.lang.Object obj) {
        if (obj == null || !this.f378596a.getDeclaringClass().isInstance(obj)) {
            throw new java.lang.IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // j06.k
    /* renamed from: getReturnType */
    public final java.lang.reflect.Type mo140167x3df4e080() {
        return this.f378597b;
    }
}
