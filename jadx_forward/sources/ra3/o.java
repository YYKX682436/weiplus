package ra3;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f475056a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f475057b;

    public o(boolean z17, java.lang.String missingFile) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(missingFile, "missingFile");
        this.f475056a = z17;
        this.f475057b = missingFile;
    }

    /* renamed from: equals */
    public boolean m162103xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra3.o)) {
            return false;
        }
        ra3.o oVar = (ra3.o) obj;
        return this.f475056a == oVar.f475056a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f475057b, oVar.f475057b);
    }

    /* renamed from: hashCode */
    public int m162104x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f475056a) * 31) + this.f475057b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m162105x9616526c() {
        return "LiteAppFileIntegrityResult(result=" + this.f475056a + ", missingFile=" + this.f475057b + ')';
    }
}
