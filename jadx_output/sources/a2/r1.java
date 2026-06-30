package a2;

/* loaded from: classes9.dex */
public final class r1 extends a2.q1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f806a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(java.lang.String verbatim) {
        super(null);
        kotlin.jvm.internal.o.g(verbatim, "verbatim");
        this.f806a = verbatim;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a2.r1) {
            return kotlin.jvm.internal.o.b(this.f806a, ((a2.r1) obj).f806a);
        }
        return false;
    }

    public int hashCode() {
        return this.f806a.hashCode();
    }

    public java.lang.String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f806a + ')';
    }
}
