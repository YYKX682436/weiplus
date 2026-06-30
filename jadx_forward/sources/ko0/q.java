package ko0;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final qs5.q f391430a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f391431b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f391432c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f391433d;

    public q(qs5.q protocol, java.lang.String str, java.lang.String str2, java.lang.String transcodeTemplate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(protocol, "protocol");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transcodeTemplate, "transcodeTemplate");
        this.f391430a = protocol;
        this.f391431b = str;
        this.f391432c = str2;
        this.f391433d = transcodeTemplate;
    }

    /* renamed from: equals */
    public boolean m143858xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko0.q)) {
            return false;
        }
        ko0.q qVar = (ko0.q) obj;
        return this.f391430a == qVar.f391430a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391431b, qVar.f391431b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391432c, qVar.f391432c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391433d, qVar.f391433d);
    }

    /* renamed from: hashCode */
    public int m143859x8cdac1b() {
        int hashCode = this.f391430a.hashCode() * 31;
        java.lang.String str = this.f391431b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f391432c;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f391433d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m143860x9616526c() {
        return "StreamUrlInfo(protocol=" + this.f391430a + ", originalStreamId=" + this.f391431b + ", watchStreamId=" + this.f391432c + ", transcodeTemplate=" + this.f391433d + ')';
    }
}
