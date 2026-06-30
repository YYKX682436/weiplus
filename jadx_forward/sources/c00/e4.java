package c00;

/* loaded from: classes9.dex */
public final class e4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f118500a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f118501b;

    /* renamed from: c, reason: collision with root package name */
    public final int f118502c;

    public e4(java.lang.String str, java.lang.String str2, int i17) {
        this.f118500a = str;
        this.f118501b = str2;
        this.f118502c = i17;
    }

    /* renamed from: equals */
    public boolean m13684xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c00.e4)) {
            return false;
        }
        c00.e4 e4Var = (c00.e4) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f118500a, e4Var.f118500a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f118501b, e4Var.f118501b) && this.f118502c == e4Var.f118502c;
    }

    /* renamed from: hashCode */
    public int m13685x8cdac1b() {
        java.lang.String str = this.f118500a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f118501b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f118502c);
    }

    /* renamed from: toString */
    public java.lang.String m13686x9616526c() {
        return "EcsUserInfo(displayNickname=" + this.f118500a + ", remoteAvatarUrl=" + this.f118501b + ", sex=" + this.f118502c + ')';
    }
}
