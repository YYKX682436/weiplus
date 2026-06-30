package y;

/* loaded from: classes14.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f539850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f539851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f539852f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(s1.o1 o1Var, long j17, long j18) {
        super(1);
        this.f539850d = o1Var;
        this.f539851e = j17;
        this.f539852f = j18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "$this$layout");
        s1.o1 o1Var = this.f539850d;
        int i17 = p2.m.f432922c;
        long j17 = this.f539851e;
        long j18 = this.f539852f;
        s1.n1.b(layout, o1Var, ((int) (j18 >> 32)) + ((int) (j17 >> 32)), p2.m.b(j18) + p2.m.b(j17), 0.0f, 4, null);
        return jz5.f0.f384359a;
    }
}
