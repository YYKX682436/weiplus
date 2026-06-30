package o20;

/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f423907a;

    /* renamed from: b, reason: collision with root package name */
    public final int f423908b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f423909c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f423910d;

    public d0(int i17, int i18, java.lang.String str, java.util.Map extraInfo, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i19 & 4) != 0 ? null : str;
        extraInfo = (i19 & 8) != 0 ? kz5.q0.f395534d : extraInfo;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraInfo, "extraInfo");
        this.f423907a = i17;
        this.f423908b = i18;
        this.f423909c = str;
        this.f423910d = extraInfo;
    }

    /* renamed from: equals */
    public boolean m150449xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o20.d0)) {
            return false;
        }
        o20.d0 d0Var = (o20.d0) obj;
        return this.f423907a == d0Var.f423907a && this.f423908b == d0Var.f423908b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f423909c, d0Var.f423909c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f423910d, d0Var.f423910d);
    }

    /* renamed from: hashCode */
    public int m150450x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f423907a) * 31) + java.lang.Integer.hashCode(this.f423908b)) * 31;
        java.lang.String str = this.f423909c;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f423910d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m150451x9616526c() {
        return "PlayerErrorInfo(errorType=" + this.f423907a + ", errorCode=" + this.f423908b + ", errorMessage=" + this.f423909c + ", extraInfo=" + this.f423910d + ')';
    }
}
