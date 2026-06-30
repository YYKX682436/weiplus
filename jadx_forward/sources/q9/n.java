package q9;

/* loaded from: classes15.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f442400a;

    /* renamed from: b, reason: collision with root package name */
    public final q9.m[] f442401b;

    /* renamed from: c, reason: collision with root package name */
    public int f442402c;

    public n(q9.m... mVarArr) {
        this.f442401b = mVarArr;
        this.f442400a = mVarArr.length;
    }

    /* renamed from: equals */
    public boolean m159623xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q9.n.class != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.f442401b, ((q9.n) obj).f442401b);
    }

    /* renamed from: hashCode */
    public int m159624x8cdac1b() {
        if (this.f442402c == 0) {
            this.f442402c = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + java.util.Arrays.hashCode(this.f442401b);
        }
        return this.f442402c;
    }
}
