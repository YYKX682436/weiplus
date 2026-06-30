package ec2;

/* loaded from: classes2.dex */
public final class a extends fc2.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f332479d;

    /* renamed from: e, reason: collision with root package name */
    public final long f332480e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f332481f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f332482g;

    /* renamed from: h, reason: collision with root package name */
    public ec2.c f332483h;

    public a(int i17, long j17, java.lang.String str) {
        this.f332479d = i17;
        this.f332480e = j17;
        this.f332481f = str;
        this.f332482g = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Vi(j17);
    }

    public final java.lang.String b() {
        return this.f332481f;
    }

    public final ec2.c c() {
        return this.f332483h;
    }

    public final long d() {
        return this.f332480e;
    }

    public final int e() {
        return this.f332479d;
    }

    /* renamed from: equals */
    public boolean m127246xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec2.a)) {
            return false;
        }
        ec2.a aVar = (ec2.a) obj;
        return this.f332479d == aVar.f332479d && this.f332480e == aVar.f332480e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f332481f, aVar.f332481f);
    }

    /* renamed from: hashCode */
    public int m127247x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f332479d) * 31) + java.lang.Long.hashCode(this.f332480e)) * 31;
        java.lang.String str = this.f332481f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m127248x9616526c() {
        return "ActionEvent(type=" + this.f332479d + ", feedId=" + this.f332480e + ", dupFlag=" + this.f332481f + ')';
    }
}
