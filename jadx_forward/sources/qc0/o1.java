package qc0;

/* loaded from: classes7.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f442957a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f442958b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Long f442959c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f442960d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f442961e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f442962f;

    public o1(java.lang.String str, java.lang.String str2, java.lang.Long l17, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f442957a = str;
        this.f442958b = str2;
        this.f442959c = l17;
        this.f442960d = str3;
        this.f442961e = str4;
        this.f442962f = str5;
    }

    /* renamed from: equals */
    public boolean m159793xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc0.o1)) {
            return false;
        }
        qc0.o1 o1Var = (qc0.o1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442957a, o1Var.f442957a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442958b, o1Var.f442958b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442959c, o1Var.f442959c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442960d, o1Var.f442960d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442961e, o1Var.f442961e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442962f, o1Var.f442962f);
    }

    /* renamed from: hashCode */
    public int m159794x8cdac1b() {
        java.lang.String str = this.f442957a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f442958b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Long l17 = this.f442959c;
        int hashCode3 = (hashCode2 + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.String str3 = this.f442960d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f442961e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f442962f;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m159795x9616526c() {
        return "MediaTextCoverInfo(aiPicId=" + this.f442957a + ", aiPicPrompt=" + this.f442958b + ", aiPicSource=" + this.f442959c + ", aiPicTemplateId=" + this.f442960d + ", aiPicDataBuf=" + this.f442961e + ", aiPicStyle=" + this.f442962f + ')';
    }
}
