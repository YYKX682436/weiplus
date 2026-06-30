package zy;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f558817a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f558818b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f558819c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f558820d;

    /* renamed from: e, reason: collision with root package name */
    public final dn.h f558821e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f558822f;

    public a(boolean z17, java.lang.String second, java.lang.String unZipPath, java.lang.String errorMsg, dn.h hVar, java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(second, "second");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unZipPath, "unZipPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f558817a = z17;
        this.f558818b = second;
        this.f558819c = unZipPath;
        this.f558820d = errorMsg;
        this.f558821e = hVar;
        this.f558822f = url;
    }

    /* renamed from: equals */
    public boolean m179883xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy.a)) {
            return false;
        }
        zy.a aVar = (zy.a) obj;
        return this.f558817a == aVar.f558817a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558818b, aVar.f558818b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558819c, aVar.f558819c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558820d, aVar.f558820d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558821e, aVar.f558821e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558822f, aVar.f558822f);
    }

    /* renamed from: hashCode */
    public int m179884x8cdac1b() {
        int hashCode = ((((((java.lang.Boolean.hashCode(this.f558817a) * 31) + this.f558818b.hashCode()) * 31) + this.f558819c.hashCode()) * 31) + this.f558820d.hashCode()) * 31;
        dn.h hVar = this.f558821e;
        return ((hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31) + this.f558822f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m179885x9616526c() {
        return "DownloadResultParams(success=" + this.f558817a + ", second=" + this.f558818b + ", unZipPath=" + this.f558819c + ", errorMsg=" + this.f558820d + ", result=" + this.f558821e + ", url=" + this.f558822f + ')';
    }
}
