package nv2;

/* loaded from: classes2.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final nv2.i1 f422106a;

    /* renamed from: b, reason: collision with root package name */
    public int f422107b;

    /* renamed from: c, reason: collision with root package name */
    public final long f422108c = c01.id.a();

    public r(nv2.i1 i1Var) {
        this.f422106a = i1Var;
    }

    public void a(nv2.o1 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f422107b++;
    }

    public final boolean b() {
        return this.f422107b < 2 && c01.id.a() - this.f422108c <= ((long) 1200000);
    }

    public abstract java.lang.String c();
}
