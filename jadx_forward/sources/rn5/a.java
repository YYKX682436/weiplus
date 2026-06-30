package rn5;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f479504a;

    public a(int i17, long j17, int i18) {
        this.f479504a = j17;
    }

    /* renamed from: equals */
    public boolean m162773xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn5.a)) {
            return false;
        }
        rn5.a aVar = (rn5.a) obj;
        aVar.getClass();
        return this.f479504a == aVar.f479504a;
    }

    /* renamed from: hashCode */
    public int m162774x8cdac1b() {
        return (((java.lang.Integer.hashCode(4) * 31) + java.lang.Long.hashCode(this.f479504a)) * 31) + java.lang.Integer.hashCode(2);
    }

    /* renamed from: toString */
    public java.lang.String m162775x9616526c() {
        return "LoaderExtInfo(pullType=4, loaderId=" + this.f479504a + ", specialRequestScene=2)";
    }
}
