package sj4;

/* loaded from: classes10.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f490403a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f490404b;

    /* renamed from: c, reason: collision with root package name */
    public final int f490405c;

    /* renamed from: d, reason: collision with root package name */
    public final int f490406d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f490407e;

    public m1(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3) {
        this.f490403a = str;
        this.f490404b = str2;
        this.f490405c = i17;
        this.f490406d = i18;
        this.f490407e = str3;
    }

    /* renamed from: equals */
    public boolean m164710xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj4.m1)) {
            return false;
        }
        sj4.m1 m1Var = (sj4.m1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f490403a, m1Var.f490403a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f490404b, m1Var.f490404b) && this.f490405c == m1Var.f490405c && this.f490406d == m1Var.f490406d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f490407e, m1Var.f490407e);
    }

    /* renamed from: hashCode */
    public int m164711x8cdac1b() {
        java.lang.String str = this.f490403a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f490404b;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Integer.hashCode(this.f490405c)) * 31) + java.lang.Integer.hashCode(this.f490406d)) * 31;
        java.lang.String str3 = this.f490407e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m164712x9616526c() {
        return "WeAppJumpParam(username=" + this.f490403a + ", enterPath=" + this.f490404b + ", version=" + this.f490405c + ", versionType=" + this.f490406d + ", extraData=" + this.f490407e + ')';
    }
}
