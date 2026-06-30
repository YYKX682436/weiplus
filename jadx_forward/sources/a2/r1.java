package a2;

/* loaded from: classes9.dex */
public final class r1 extends a2.q1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f82339a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(java.lang.String verbatim) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(verbatim, "verbatim");
        this.f82339a = verbatim;
    }

    /* renamed from: equals */
    public boolean m396xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a2.r1) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82339a, ((a2.r1) obj).f82339a);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m397x8cdac1b() {
        return this.f82339a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m398x9616526c() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f82339a + ')';
    }
}
