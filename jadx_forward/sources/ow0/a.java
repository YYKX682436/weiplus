package ow0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final sw0.f f430811a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f430812b;

    public a(sw0.f page, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        this.f430811a = page;
        this.f430812b = z17;
    }

    /* renamed from: equals */
    public boolean m157262xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow0.a)) {
            return false;
        }
        ow0.a aVar = (ow0.a) obj;
        return this.f430811a == aVar.f430811a && this.f430812b == aVar.f430812b;
    }

    /* renamed from: hashCode */
    public int m157263x8cdac1b() {
        return (this.f430811a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f430812b);
    }

    /* renamed from: toString */
    public java.lang.String m157264x9616526c() {
        return "Args(page=" + this.f430811a + ", isAutoRecognitionSubtitle=" + this.f430812b + ')';
    }
}
