package df5;

/* loaded from: classes11.dex */
public final class d0 extends df5.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final v11.k f313603a;

    /* renamed from: b, reason: collision with root package name */
    public final int f313604b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(v11.k block, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null);
        i17 = (i18 & 2) != 0 ? block.m170912x8cdac1b() : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        this.f313603a = block;
        this.f313604b = i17;
    }

    @Override // df5.j0
    public int a() {
        return this.f313604b;
    }

    /* renamed from: equals */
    public boolean m124311xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df5.d0)) {
            return false;
        }
        df5.d0 d0Var = (df5.d0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f313603a, d0Var.f313603a) && this.f313604b == d0Var.f313604b;
    }

    /* renamed from: hashCode */
    public int m124312x8cdac1b() {
        return (this.f313603a.m170912x8cdac1b() * 31) + java.lang.Integer.hashCode(this.f313604b);
    }

    /* renamed from: toString */
    public java.lang.String m124313x9616526c() {
        return "CodeBlock(block=" + this.f313603a + ", contentHash=" + this.f313604b + ')';
    }
}
