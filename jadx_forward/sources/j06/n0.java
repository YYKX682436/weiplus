package j06;

/* loaded from: classes16.dex */
public abstract class n0 implements j06.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f378603a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f378604b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Type f378605c;

    public n0(java.lang.reflect.Method method, java.util.List list, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f378603a = method;
        this.f378604b = list;
        java.lang.Class<?> returnType = method.getReturnType();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(returnType, "getReturnType(...)");
        this.f378605c = returnType;
    }

    @Override // j06.k
    public final java.util.List a() {
        return this.f378604b;
    }

    @Override // j06.k
    public /* bridge */ /* synthetic */ java.lang.reflect.Member b() {
        return null;
    }

    @Override // j06.k
    /* renamed from: getReturnType */
    public final java.lang.reflect.Type mo140167x3df4e080() {
        return this.f378605c;
    }
}
