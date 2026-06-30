package m71;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 f406012a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f406013b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f406014c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f406015d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f406016e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 loginData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loginData, "loginData");
        this.f406012a = loginData;
        this.f406013b = str;
        this.f406014c = str2;
        this.f406015d = str3;
        this.f406016e = str4;
    }

    /* renamed from: equals */
    public boolean m146901xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m71.a)) {
            return false;
        }
        m71.a aVar = (m71.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f406012a, aVar.f406012a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f406013b, aVar.f406013b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f406014c, aVar.f406014c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f406015d, aVar.f406015d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f406016e, aVar.f406016e);
    }

    /* renamed from: hashCode */
    public int m146902x8cdac1b() {
        int hashCode = this.f406012a.hashCode() * 31;
        java.lang.String str = this.f406013b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f406014c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f406015d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f406016e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m146903x9616526c() {
        return "AuthData(loginData=" + this.f406012a + ", authTicket=" + this.f406013b + ", authTargetUserName=" + this.f406014c + ", userSelfShowName=" + this.f406015d + ", extSpamCtxString=" + this.f406016e + ')';
    }
}
