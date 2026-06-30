package df5;

/* loaded from: classes11.dex */
public final class i0 extends df5.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f313665a;

    /* renamed from: b, reason: collision with root package name */
    public final int f313666b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.util.List blocks, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null);
        i17 = (i18 & 2) != 0 ? blocks.hashCode() : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blocks, "blocks");
        this.f313665a = blocks;
        this.f313666b = i17;
    }

    @Override // df5.j0
    public int a() {
        return this.f313666b;
    }

    /* renamed from: equals */
    public boolean m124331xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df5.i0)) {
            return false;
        }
        df5.i0 i0Var = (df5.i0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f313665a, i0Var.f313665a) && this.f313666b == i0Var.f313666b;
    }

    /* renamed from: hashCode */
    public int m124332x8cdac1b() {
        return (this.f313665a.hashCode() * 31) + java.lang.Integer.hashCode(this.f313666b);
    }

    /* renamed from: toString */
    public java.lang.String m124333x9616526c() {
        return "TextSegment(blocks=" + this.f313665a + ", contentHash=" + this.f313666b + ')';
    }
}
