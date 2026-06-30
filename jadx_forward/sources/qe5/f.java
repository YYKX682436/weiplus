package qe5;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f443625a;

    /* renamed from: b, reason: collision with root package name */
    public final long f443626b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f443627c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f443628d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f443629e;

    public f(int i17, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f443625a = i17;
        this.f443626b = j17;
        this.f443627c = str;
        this.f443628d = str2;
        this.f443629e = str3;
    }

    /* renamed from: equals */
    public boolean m159918xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe5.f)) {
            return false;
        }
        qe5.f fVar = (qe5.f) obj;
        return this.f443625a == fVar.f443625a && this.f443626b == fVar.f443626b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f443627c, fVar.f443627c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f443628d, fVar.f443628d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f443629e, fVar.f443629e);
    }

    /* renamed from: hashCode */
    public int m159919x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f443625a) * 31) + java.lang.Long.hashCode(this.f443626b)) * 31;
        java.lang.String str = this.f443627c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f443628d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f443629e;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m159920x9616526c() {
        return "AppAttachQueryParams(appType=" + this.f443625a + ", msgId=" + this.f443626b + ", talker=" + this.f443627c + ", mediaId=" + this.f443628d + ", msgContent=" + this.f443629e + ')';
    }
}
