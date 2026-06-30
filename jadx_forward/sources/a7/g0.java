package a7;

/* loaded from: classes8.dex */
public final class g0 implements a7.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f83357a;

    public g0(java.lang.String str) {
        this.f83357a = str;
    }

    /* renamed from: equals */
    public boolean m748xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof a7.g0) {
            return this.f83357a.equals(((a7.g0) obj).f83357a);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m749x8cdac1b() {
        return this.f83357a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m750x9616526c() {
        return "StringHeaderFactory{value='" + this.f83357a + "'}";
    }
}
