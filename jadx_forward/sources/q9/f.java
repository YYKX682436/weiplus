package q9;

/* loaded from: classes15.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f442386a;

    /* renamed from: b, reason: collision with root package name */
    public final int f442387b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f442388c;

    public f(int i17, int i18, java.lang.String str) {
        this.f442386a = i17;
        this.f442387b = i18;
        this.f442388c = str;
    }

    /* renamed from: equals */
    public boolean m159618xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q9.f.class != obj.getClass()) {
            return false;
        }
        q9.f fVar = (q9.f) obj;
        return this.f442386a == fVar.f442386a && this.f442387b == fVar.f442387b && android.text.TextUtils.equals(this.f442388c, fVar.f442388c);
    }

    /* renamed from: hashCode */
    public int m159619x8cdac1b() {
        int i17 = ((this.f442386a * 31) + this.f442387b) * 31;
        java.lang.String str = this.f442388c;
        return i17 + (str != null ? str.hashCode() : 0);
    }
}
