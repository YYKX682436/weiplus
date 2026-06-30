package gr3;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f356387a;

    /* renamed from: b, reason: collision with root package name */
    public final int f356388b;

    /* renamed from: c, reason: collision with root package name */
    public final long f356389c;

    public d(long j17, int i17, long j18) {
        this.f356387a = j17;
        this.f356388b = i17;
        this.f356389c = j18;
    }

    /* renamed from: equals */
    public boolean m132068xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr3.d)) {
            return false;
        }
        gr3.d dVar = (gr3.d) obj;
        return this.f356387a == dVar.f356387a && this.f356388b == dVar.f356388b && this.f356389c == dVar.f356389c;
    }

    /* renamed from: hashCode */
    public int m132069x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f356387a) * 31) + java.lang.Integer.hashCode(this.f356388b)) * 31) + java.lang.Long.hashCode(this.f356389c);
    }

    /* renamed from: toString */
    public java.lang.String m132070x9616526c() {
        return "BizProfileMsgTripletInfo(mid=" + this.f356387a + ", idx=" + this.f356388b + ", bizUin=" + this.f356389c + ')';
    }
}
