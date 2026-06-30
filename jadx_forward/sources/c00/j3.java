package c00;

/* loaded from: classes9.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f118525a;

    /* renamed from: b, reason: collision with root package name */
    public final c00.e4 f118526b;

    public j3(java.lang.String talkerUsername, c00.e4 talkerUserInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerUsername, "talkerUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerUserInfo, "talkerUserInfo");
        this.f118525a = talkerUsername;
        this.f118526b = talkerUserInfo;
    }

    /* renamed from: equals */
    public boolean m13705xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c00.j3)) {
            return false;
        }
        c00.j3 j3Var = (c00.j3) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f118525a, j3Var.f118525a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f118526b, j3Var.f118526b);
    }

    /* renamed from: hashCode */
    public int m13706x8cdac1b() {
        return (this.f118525a.hashCode() * 31) + this.f118526b.m13685x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m13707x9616526c() {
        return "GiftSender(talkerUsername=" + this.f118525a + ", talkerUserInfo=" + this.f118526b + ')';
    }
}
