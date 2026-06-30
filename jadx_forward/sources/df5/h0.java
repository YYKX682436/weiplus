package df5;

/* loaded from: classes11.dex */
public final class h0 extends df5.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final v11.q f313651a;

    /* renamed from: b, reason: collision with root package name */
    public final int f313652b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(v11.q block, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null);
        i17 = (i18 & 2) != 0 ? block.m170943x8cdac1b() : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        this.f313651a = block;
        this.f313652b = i17;
    }

    @Override // df5.j0
    public int a() {
        return this.f313652b;
    }

    /* renamed from: equals */
    public boolean m124328xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df5.h0)) {
            return false;
        }
        df5.h0 h0Var = (df5.h0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f313651a, h0Var.f313651a) && this.f313652b == h0Var.f313652b;
    }

    /* renamed from: hashCode */
    public int m124329x8cdac1b() {
        return (this.f313651a.m170943x8cdac1b() * 31) + java.lang.Integer.hashCode(this.f313652b);
    }

    /* renamed from: toString */
    public java.lang.String m124330x9616526c() {
        return "Table(block=" + this.f313651a + ", contentHash=" + this.f313652b + ')';
    }
}
