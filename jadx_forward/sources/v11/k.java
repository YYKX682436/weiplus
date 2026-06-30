package v11;

/* loaded from: classes11.dex */
public final class k extends v11.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f513958a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f513959b;

    /* renamed from: c, reason: collision with root package name */
    public final v11.s f513960c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String language, java.lang.String content, v11.s sVar) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(language, "language");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f513958a = language;
        this.f513959b = content;
        this.f513960c = sVar;
    }

    /* renamed from: equals */
    public boolean m170911xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.k)) {
            return false;
        }
        v11.k kVar = (v11.k) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513958a, kVar.f513958a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513959b, kVar.f513959b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513960c, kVar.f513960c);
    }

    /* renamed from: hashCode */
    public int m170912x8cdac1b() {
        int hashCode = ((this.f513958a.hashCode() * 31) + this.f513959b.hashCode()) * 31;
        v11.s sVar = this.f513960c;
        return hashCode + (sVar == null ? 0 : sVar.m170946x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m170913x9616526c() {
        return "CodeBlock(language=" + this.f513958a + ", content=" + this.f513959b + ", sourceRange=" + this.f513960c + ')';
    }
}
