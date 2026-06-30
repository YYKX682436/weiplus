package qx2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f448855a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f448856b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f448857c;

    public a(java.lang.String content, java.lang.String highLightInContent, java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(highLightInContent, "highLightInContent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f448855a = content;
        this.f448856b = highLightInContent;
        this.f448857c = url;
    }

    /* renamed from: equals */
    public boolean m161029xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx2.a)) {
            return false;
        }
        qx2.a aVar = (qx2.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f448855a, aVar.f448855a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f448856b, aVar.f448856b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f448857c, aVar.f448857c);
    }

    /* renamed from: hashCode */
    public int m161030x8cdac1b() {
        return (((this.f448855a.hashCode() * 31) + this.f448856b.hashCode()) * 31) + this.f448857c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m161031x9616526c() {
        return "LawData(content=" + this.f448855a + ", highLightInContent=" + this.f448856b + ", url=" + this.f448857c + ')';
    }

    public /* synthetic */ a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, (i17 & 2) != 0 ? "" : str2, (i17 & 4) != 0 ? "" : str3);
    }
}
