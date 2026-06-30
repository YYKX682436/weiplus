package j06;

/* loaded from: classes16.dex */
public final class l0 extends j06.n0 implements j06.i {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f378601d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(java.lang.reflect.Method unboxMethod, java.lang.Object obj) {
        super(unboxMethod, kz5.p0.f395529d, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unboxMethod, "unboxMethod");
        this.f378601d = obj;
    }

    @Override // j06.k
    /* renamed from: call */
    public java.lang.Object mo140163x2e7a5e(java.lang.Object[] args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        j06.j.a(this, args);
        return this.f378603a.invoke(this.f378601d, java.util.Arrays.copyOf(args, args.length));
    }
}
