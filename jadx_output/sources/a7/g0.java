package a7;

/* loaded from: classes8.dex */
public final class g0 implements a7.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f1824a;

    public g0(java.lang.String str) {
        this.f1824a = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof a7.g0) {
            return this.f1824a.equals(((a7.g0) obj).f1824a);
        }
        return false;
    }

    public int hashCode() {
        return this.f1824a.hashCode();
    }

    public java.lang.String toString() {
        return "StringHeaderFactory{value='" + this.f1824a + "'}";
    }
}
