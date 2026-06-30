package x1;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final i1.e f532876a;

    /* renamed from: b, reason: collision with root package name */
    public final int f532877b;

    public c(i1.e imageVector, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageVector, "imageVector");
        this.f532876a = imageVector;
        this.f532877b = i17;
    }

    /* renamed from: equals */
    public boolean m174894xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1.c)) {
            return false;
        }
        x1.c cVar = (x1.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f532876a, cVar.f532876a) && this.f532877b == cVar.f532877b;
    }

    /* renamed from: hashCode */
    public int m174895x8cdac1b() {
        return (this.f532876a.m134435x8cdac1b() * 31) + java.lang.Integer.hashCode(this.f532877b);
    }

    /* renamed from: toString */
    public java.lang.String m174896x9616526c() {
        return "ImageVectorEntry(imageVector=" + this.f532876a + ", configFlags=" + this.f532877b + ')';
    }
}
