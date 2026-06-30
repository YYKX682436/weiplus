package cr0;

/* loaded from: classes12.dex */
public final class c0 extends rh.o2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cr0.d0 f303133e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(cr0.d0 d0Var, cr0.d0 d0Var2) {
        super(d0Var, d0Var2);
        this.f303133e = d0Var;
    }

    @Override // rh.o2
    public rh.d3 a() {
        cr0.d0 d0Var = (cr0.d0) this.f477018b;
        java.lang.String str = d0Var.f303137d;
        java.lang.Number number = rh.p2.a(this.f303133e.f303138e, d0Var.f303138e).f477085a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number, "get(...)");
        return new cr0.d0(str, number.longValue());
    }
}
