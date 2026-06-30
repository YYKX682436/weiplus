package bh2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f102383a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f102384b;

    public a(int i17, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f102383a = i17;
        this.f102384b = path;
    }

    /* renamed from: equals */
    public boolean m10543xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh2.a)) {
            return false;
        }
        bh2.a aVar = (bh2.a) obj;
        return this.f102383a == aVar.f102383a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f102384b, aVar.f102384b);
    }

    /* renamed from: hashCode */
    public int m10544x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f102383a) * 31) + this.f102384b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m10545x9616526c() {
        return "BGMData(id=" + this.f102383a + ", path=" + this.f102384b + ')';
    }
}
