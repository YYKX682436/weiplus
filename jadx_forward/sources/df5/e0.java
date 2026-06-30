package df5;

/* loaded from: classes11.dex */
public final class e0 extends df5.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final v11.l f313614a;

    /* renamed from: b, reason: collision with root package name */
    public final int f313615b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(v11.l block, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null);
        i17 = (i18 & 2) != 0 ? block.m170918x8cdac1b() : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        this.f313614a = block;
        this.f313615b = i17;
    }

    @Override // df5.j0
    public int a() {
        return this.f313615b;
    }

    /* renamed from: equals */
    public boolean m124317xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df5.e0)) {
            return false;
        }
        df5.e0 e0Var = (df5.e0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f313614a, e0Var.f313614a) && this.f313615b == e0Var.f313615b;
    }

    /* renamed from: hashCode */
    public int m124318x8cdac1b() {
        return (this.f313614a.m170918x8cdac1b() * 31) + java.lang.Integer.hashCode(this.f313615b);
    }

    /* renamed from: toString */
    public java.lang.String m124319x9616526c() {
        return "Heading(block=" + this.f313614a + ", contentHash=" + this.f313615b + ')';
    }
}
