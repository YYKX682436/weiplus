package dd5;

/* loaded from: classes8.dex */
public final class b1 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy2.a5 f310624a;

    /* renamed from: b, reason: collision with root package name */
    public final long f310625b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f310626c;

    public b1(zy2.a5 snapshot, long j17, java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        this.f310624a = snapshot;
        this.f310625b = j17;
        this.f310626c = talker;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return this.f310624a.f558882c;
    }

    /* renamed from: equals */
    public boolean m123999xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.b1)) {
            return false;
        }
        dd5.b1 b1Var = (dd5.b1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310624a, b1Var.f310624a) && this.f310625b == b1Var.f310625b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310626c, b1Var.f310626c);
    }

    /* renamed from: hashCode */
    public int m124000x8cdac1b() {
        return (((this.f310624a.m179925x8cdac1b() * 31) + java.lang.Long.hashCode(this.f310625b)) * 31) + this.f310626c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124001x9616526c() {
        return "ViewModel(snapshot=" + this.f310624a + ", msgId=" + this.f310625b + ", talker=" + this.f310626c + ')';
    }
}
