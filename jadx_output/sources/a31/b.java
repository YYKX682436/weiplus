package a31;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f944a;

    /* renamed from: b, reason: collision with root package name */
    public final int f945b;

    /* renamed from: c, reason: collision with root package name */
    public final int f946c;

    public b(java.lang.CharSequence resultText, int i17, int i18) {
        kotlin.jvm.internal.o.g(resultText, "resultText");
        this.f944a = resultText;
        this.f945b = i17;
        this.f946c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a31.b)) {
            return false;
        }
        a31.b bVar = (a31.b) obj;
        return kotlin.jvm.internal.o.b(this.f944a, bVar.f944a) && this.f945b == bVar.f945b && this.f946c == bVar.f946c;
    }

    public int hashCode() {
        return (((this.f944a.hashCode() * 31) + java.lang.Integer.hashCode(this.f945b)) * 31) + java.lang.Integer.hashCode(this.f946c);
    }

    public java.lang.String toString() {
        return "W2WTask(resultText=" + ((java.lang.Object) this.f944a) + ", start=" + this.f945b + ", end=" + this.f946c + ')';
    }
}
