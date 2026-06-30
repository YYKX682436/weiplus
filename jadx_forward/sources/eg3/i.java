package eg3;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f334196a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f334197b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f334198c;

    public i(java.lang.String filePath, java.lang.String fileId, java.lang.String aesKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileId, "fileId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aesKey, "aesKey");
        this.f334196a = filePath;
        this.f334197b = fileId;
        this.f334198c = aesKey;
    }

    /* renamed from: equals */
    public boolean m127694xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg3.i)) {
            return false;
        }
        eg3.i iVar = (eg3.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f334196a, iVar.f334196a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f334197b, iVar.f334197b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f334198c, iVar.f334198c);
    }

    /* renamed from: hashCode */
    public int m127695x8cdac1b() {
        return (((this.f334196a.hashCode() * 31) + this.f334197b.hashCode()) * 31) + this.f334198c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m127696x9616526c() {
        return "TranslationParam(filePath=" + this.f334196a + ", fileId=" + this.f334197b + ", aesKey=" + this.f334198c + ')';
    }

    public /* synthetic */ i(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? "" : str, (i17 & 2) != 0 ? "" : str2, (i17 & 4) != 0 ? "" : str3);
    }
}
