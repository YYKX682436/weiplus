package df5;

/* loaded from: classes11.dex */
public final class g0 extends df5.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final v11.o f313641a;

    /* renamed from: b, reason: collision with root package name */
    public final int f313642b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(v11.o block, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null);
        i17 = (i18 & 2) != 0 ? block.m170937x8cdac1b() : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        this.f313641a = block;
        this.f313642b = i17;
    }

    @Override // df5.j0
    public int a() {
        return this.f313642b;
    }

    /* renamed from: equals */
    public boolean m124325xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df5.g0)) {
            return false;
        }
        df5.g0 g0Var = (df5.g0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f313641a, g0Var.f313641a) && this.f313642b == g0Var.f313642b;
    }

    /* renamed from: hashCode */
    public int m124326x8cdac1b() {
        return (this.f313641a.m170937x8cdac1b() * 31) + java.lang.Integer.hashCode(this.f313642b);
    }

    /* renamed from: toString */
    public java.lang.String m124327x9616526c() {
        return "MathBlock(block=" + this.f313641a + ", contentHash=" + this.f313642b + ')';
    }
}
