package qb2;

/* loaded from: classes5.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f442693a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f442694b = true;

    public a1(int i17) {
        this.f442693a = i17;
    }

    /* renamed from: equals */
    public boolean m159694xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qb2.a1) && this.f442693a == ((qb2.a1) obj).f442693a;
    }

    /* renamed from: hashCode */
    public int m159695x8cdac1b() {
        return java.lang.Integer.hashCode(this.f442693a);
    }

    /* renamed from: toString */
    public java.lang.String m159696x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f442693a);
        sb6.append('@');
        sb6.append(this.f442694b);
        return sb6.toString();
    }
}
