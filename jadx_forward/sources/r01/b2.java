package r01;

/* loaded from: classes9.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f449560a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f449561b;

    /* renamed from: c, reason: collision with root package name */
    public final long f449562c;

    /* renamed from: d, reason: collision with root package name */
    public final long f449563d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f449564e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f449565f;

    public b2(int i17, java.lang.String msgContent, long j17, long j18, java.lang.String username, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgContent, "msgContent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f449560a = i17;
        this.f449561b = msgContent;
        this.f449562c = j17;
        this.f449563d = j18;
        this.f449564e = username;
        this.f449565f = str;
    }

    /* renamed from: equals */
    public boolean m161180xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r01.b2)) {
            return false;
        }
        r01.b2 b2Var = (r01.b2) obj;
        return this.f449560a == b2Var.f449560a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f449561b, b2Var.f449561b) && this.f449562c == b2Var.f449562c && this.f449563d == b2Var.f449563d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f449564e, b2Var.f449564e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f449565f, b2Var.f449565f);
    }

    /* renamed from: hashCode */
    public int m161181x8cdac1b() {
        int hashCode = ((((((((java.lang.Integer.hashCode(this.f449560a) * 31) + this.f449561b.hashCode()) * 31) + java.lang.Long.hashCode(this.f449562c)) * 31) + java.lang.Long.hashCode(this.f449563d)) * 31) + this.f449564e.hashCode()) * 31;
        java.lang.String str = this.f449565f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m161182x9616526c() {
        return "ClickBizContentInfo(fromScene=" + this.f449560a + ", msgContent=" + this.f449561b + ", msgSvrId=" + this.f449562c + ", msgId=" + this.f449563d + ", username=" + this.f449564e + ", talkerUserName=" + this.f449565f + ')';
    }
}
