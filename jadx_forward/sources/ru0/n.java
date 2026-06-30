package ru0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f481223a;

    /* renamed from: b, reason: collision with root package name */
    public final long f481224b;

    /* renamed from: c, reason: collision with root package name */
    public final long f481225c;

    public n(java.lang.String word, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(word, "word");
        this.f481223a = word;
        this.f481224b = j17;
        this.f481225c = j18;
    }

    /* renamed from: equals */
    public boolean m163029xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru0.n)) {
            return false;
        }
        ru0.n nVar = (ru0.n) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481223a, nVar.f481223a) && this.f481224b == nVar.f481224b && this.f481225c == nVar.f481225c;
    }

    /* renamed from: hashCode */
    public int m163030x8cdac1b() {
        return (((this.f481223a.hashCode() * 31) + java.lang.Long.hashCode(this.f481224b)) * 31) + java.lang.Long.hashCode(this.f481225c);
    }

    /* renamed from: toString */
    public java.lang.String m163031x9616526c() {
        return "WordInfo(word=" + this.f481223a + ", beginTimeMs=" + this.f481224b + ", endTimeMs=" + this.f481225c + ')';
    }
}
