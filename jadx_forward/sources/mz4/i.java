package mz4;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f414817a;

    /* renamed from: b, reason: collision with root package name */
    public final int f414818b;

    public i(int i17, int i18) {
        this.f414817a = i17;
        this.f414818b = i18;
    }

    /* renamed from: equals */
    public boolean m148688xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz4.i)) {
            return false;
        }
        mz4.i iVar = (mz4.i) obj;
        return this.f414817a == iVar.f414817a && this.f414818b == iVar.f414818b;
    }

    /* renamed from: hashCode */
    public int m148689x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f414817a) * 31) + java.lang.Integer.hashCode(this.f414818b);
    }

    /* renamed from: toString */
    public java.lang.String m148690x9616526c() {
        return "InsertResult(pos=" + this.f414817a + ", subOffset=" + this.f414818b + ')';
    }
}
