package e60;

/* loaded from: classes11.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public long f331258a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f331259b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f331260c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f331261d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f331262e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f331263f;

    public s0(long j17, java.lang.String cdnFileId, java.lang.String cdnAesKey, java.lang.String cdnAuthKey, java.lang.String cdnDownloadUrl, java.lang.String cdnFileMD5, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i17 & 1) != 0 ? 0L : j17;
        cdnFileId = (i17 & 2) != 0 ? "" : cdnFileId;
        cdnAesKey = (i17 & 4) != 0 ? "" : cdnAesKey;
        cdnAuthKey = (i17 & 8) != 0 ? "" : cdnAuthKey;
        cdnDownloadUrl = (i17 & 16) != 0 ? "" : cdnDownloadUrl;
        cdnFileMD5 = (i17 & 32) != 0 ? "" : cdnFileMD5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnFileId, "cdnFileId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnAesKey, "cdnAesKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnAuthKey, "cdnAuthKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnDownloadUrl, "cdnDownloadUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnFileMD5, "cdnFileMD5");
        this.f331258a = j17;
        this.f331259b = cdnFileId;
        this.f331260c = cdnAesKey;
        this.f331261d = cdnAuthKey;
        this.f331262e = cdnDownloadUrl;
        this.f331263f = cdnFileMD5;
    }

    /* renamed from: equals */
    public boolean m127045xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e60.s0)) {
            return false;
        }
        e60.s0 s0Var = (e60.s0) obj;
        return this.f331258a == s0Var.f331258a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f331259b, s0Var.f331259b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f331260c, s0Var.f331260c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f331261d, s0Var.f331261d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f331262e, s0Var.f331262e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f331263f, s0Var.f331263f);
    }

    /* renamed from: hashCode */
    public int m127046x8cdac1b() {
        return (((((((((java.lang.Long.hashCode(this.f331258a) * 31) + this.f331259b.hashCode()) * 31) + this.f331260c.hashCode()) * 31) + this.f331261d.hashCode()) * 31) + this.f331262e.hashCode()) * 31) + this.f331263f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m127047x9616526c() {
        return "GalleryCDNInfo(cdnTotalLen=" + this.f331258a + ", cdnFileId=" + this.f331259b + ", cdnAesKey=" + this.f331260c + ", cdnAuthKey=" + this.f331261d + ", cdnDownloadUrl=" + this.f331262e + ", cdnFileMD5=" + this.f331263f + ')';
    }
}
