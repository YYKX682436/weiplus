package a31;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f82477a;

    /* renamed from: b, reason: collision with root package name */
    public final int f82478b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82479c;

    public b(java.lang.CharSequence resultText, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultText, "resultText");
        this.f82477a = resultText;
        this.f82478b = i17;
        this.f82479c = i18;
    }

    /* renamed from: equals */
    public boolean m477xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a31.b)) {
            return false;
        }
        a31.b bVar = (a31.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82477a, bVar.f82477a) && this.f82478b == bVar.f82478b && this.f82479c == bVar.f82479c;
    }

    /* renamed from: hashCode */
    public int m478x8cdac1b() {
        return (((this.f82477a.hashCode() * 31) + java.lang.Integer.hashCode(this.f82478b)) * 31) + java.lang.Integer.hashCode(this.f82479c);
    }

    /* renamed from: toString */
    public java.lang.String m479x9616526c() {
        return "W2WTask(resultText=" + ((java.lang.Object) this.f82477a) + ", start=" + this.f82478b + ", end=" + this.f82479c + ')';
    }
}
