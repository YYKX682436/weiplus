package dk2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f314692a;

    /* renamed from: b, reason: collision with root package name */
    public final int f314693b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f314694c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f314695d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.vy1 f314696e;

    public a(int i17, int i18, boolean z17, byte[] bArr, r45.vy1 vy1Var) {
        this.f314692a = i17;
        this.f314693b = i18;
        this.f314694c = z17;
        this.f314695d = bArr;
        this.f314696e = vy1Var;
    }

    /* renamed from: equals */
    public boolean m124526xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.a)) {
            return false;
        }
        dk2.a aVar = (dk2.a) obj;
        return this.f314692a == aVar.f314692a && this.f314693b == aVar.f314693b && this.f314694c == aVar.f314694c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f314695d, aVar.f314695d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f314696e, aVar.f314696e);
    }

    /* renamed from: hashCode */
    public int m124527x8cdac1b() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f314692a) * 31) + java.lang.Integer.hashCode(this.f314693b)) * 31) + java.lang.Boolean.hashCode(this.f314694c)) * 31;
        byte[] bArr = this.f314695d;
        int hashCode2 = (hashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31;
        r45.vy1 vy1Var = this.f314696e;
        return hashCode2 + (vy1Var != null ? vy1Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m124528x9616526c() {
        return "ApplyLinkRequestParams(micType=" + this.f314692a + ", seatPos=" + this.f314693b + ", canAutoLink=" + this.f314694c + ", buffer=" + java.util.Arrays.toString(this.f314695d) + ", lbsLocation=" + this.f314696e + ')';
    }
}
