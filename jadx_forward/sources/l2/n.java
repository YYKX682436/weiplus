package l2;

/* loaded from: classes14.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final l2.n f396661c = new l2.n(p2.u.b(0), p2.u.b(0), null);

    /* renamed from: a, reason: collision with root package name */
    public final long f396662a;

    /* renamed from: b, reason: collision with root package name */
    public final long f396663b;

    public n(long j17, long j18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f396662a = j17;
        this.f396663b = j18;
    }

    /* renamed from: equals */
    public boolean m144920xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2.n)) {
            return false;
        }
        l2.n nVar = (l2.n) obj;
        return p2.t.a(this.f396662a, nVar.f396662a) && p2.t.a(this.f396663b, nVar.f396663b);
    }

    /* renamed from: hashCode */
    public int m144921x8cdac1b() {
        p2.v[] vVarArr = p2.t.f432933b;
        return (java.lang.Long.hashCode(this.f396662a) * 31) + java.lang.Long.hashCode(this.f396663b);
    }

    /* renamed from: toString */
    public java.lang.String m144922x9616526c() {
        return "TextIndent(firstLine=" + ((java.lang.Object) p2.t.d(this.f396662a)) + ", restLine=" + ((java.lang.Object) p2.t.d(this.f396663b)) + ')';
    }
}
