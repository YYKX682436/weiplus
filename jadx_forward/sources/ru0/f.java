package ru0;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f481200a;

    /* renamed from: b, reason: collision with root package name */
    public final long f481201b;

    /* renamed from: c, reason: collision with root package name */
    public final long f481202c;

    public f(java.lang.String text, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f481200a = text;
        this.f481201b = j17;
        this.f481202c = j18;
    }

    /* renamed from: equals */
    public boolean m163021xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru0.f)) {
            return false;
        }
        ru0.f fVar = (ru0.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481200a, fVar.f481200a) && this.f481201b == fVar.f481201b && this.f481202c == fVar.f481202c;
    }

    /* renamed from: hashCode */
    public int m163022x8cdac1b() {
        return (((this.f481200a.hashCode() * 31) + java.lang.Long.hashCode(this.f481201b)) * 31) + java.lang.Long.hashCode(this.f481202c);
    }

    /* renamed from: toString */
    public java.lang.String m163023x9616526c() {
        return "SentenceInfo(text=" + this.f481200a + ", beginTimeMs=" + this.f481201b + ", endTimeMs=" + this.f481202c + ')';
    }
}
