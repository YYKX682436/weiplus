package mk1;

/* loaded from: classes7.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f408655a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f408656b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f408657c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f408658d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f408659e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Long f408660f;

    public w(java.lang.String srcUrl, java.lang.String finalSrcUrl, boolean z17, java.lang.String str, java.lang.String str2, java.lang.Long l17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcUrl, "srcUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finalSrcUrl, "finalSrcUrl");
        this.f408655a = srcUrl;
        this.f408656b = finalSrcUrl;
        this.f408657c = z17;
        this.f408658d = str;
        this.f408659e = str2;
        this.f408660f = l17;
    }

    /* renamed from: equals */
    public boolean m147409xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk1.w)) {
            return false;
        }
        mk1.w wVar = (mk1.w) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408655a, wVar.f408655a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408656b, wVar.f408656b) && this.f408657c == wVar.f408657c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408658d, wVar.f408658d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408659e, wVar.f408659e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408660f, wVar.f408660f);
    }

    /* renamed from: hashCode */
    public int m147410x8cdac1b() {
        int hashCode = ((((this.f408655a.hashCode() * 31) + this.f408656b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f408657c)) * 31;
        java.lang.String str = this.f408658d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f408659e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Long l17 = this.f408660f;
        return hashCode3 + (l17 != null ? l17.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m147411x9616526c() {
        return "VideoDataSourceBasicPack(srcUrl=" + this.f408655a + ", finalSrcUrl=" + this.f408656b + ", isHls=" + this.f408657c + ", contentType=" + this.f408658d + ", transferEncoding=" + this.f408659e + ", totalContentLength=" + this.f408660f + ')';
    }
}
