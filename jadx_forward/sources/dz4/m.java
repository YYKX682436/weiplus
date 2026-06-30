package dz4;

/* loaded from: classes11.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f326878a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f326879b;

    /* renamed from: c, reason: collision with root package name */
    public final android.net.Uri f326880c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f326881d;

    public m(int i17, java.lang.String text, android.net.Uri uri, java.lang.String str, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        text = (i18 & 2) != 0 ? "" : text;
        uri = (i18 & 4) != 0 ? null : uri;
        str = (i18 & 8) != 0 ? null : str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f326878a = i17;
        this.f326879b = text;
        this.f326880c = uri;
        this.f326881d = str;
    }

    /* renamed from: equals */
    public boolean m126506xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz4.m)) {
            return false;
        }
        dz4.m mVar = (dz4.m) obj;
        return this.f326878a == mVar.f326878a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326879b, mVar.f326879b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326880c, mVar.f326880c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326881d, mVar.f326881d);
    }

    /* renamed from: hashCode */
    public int m126507x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f326878a) * 31) + this.f326879b.hashCode()) * 31;
        android.net.Uri uri = this.f326880c;
        int hashCode2 = (hashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        java.lang.String str = this.f326881d;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m126508x9616526c() {
        return "ClipBoardItemData(type=" + this.f326878a + ", text=" + this.f326879b + ", uri=" + this.f326880c + ", mimeType=" + this.f326881d + ')';
    }
}
