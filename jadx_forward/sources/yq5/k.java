package yq5;

/* loaded from: classes11.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final yq5.d f546133a;

    /* renamed from: b, reason: collision with root package name */
    public final yq5.c f546134b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f546135c;

    public k(yq5.d imageSource, yq5.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageSource, "imageSource");
        this.f546133a = imageSource;
        this.f546134b = cVar;
        this.f546135c = jz5.h.b(new yq5.j(this));
    }

    public final java.lang.String a() {
        return (java.lang.String) ((jz5.n) this.f546135c).mo141623x754a37bb();
    }

    /* renamed from: equals */
    public boolean m177526xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq5.k)) {
            return false;
        }
        yq5.k kVar = (yq5.k) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546133a, kVar.f546133a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546134b, kVar.f546134b);
    }

    /* renamed from: hashCode */
    public int m177527x8cdac1b() {
        int hashCode = this.f546133a.hashCode() * 31;
        yq5.c cVar = this.f546134b;
        return hashCode + (cVar == null ? 0 : cVar.m177518x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m177528x9616526c() {
        return "SubsamplingImage(imageSource=" + this.f546133a + ", imageInfo=" + this.f546134b + ')';
    }
}
