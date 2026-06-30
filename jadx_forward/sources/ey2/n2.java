package ey2;

/* loaded from: classes2.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f338970a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f338971b;

    /* renamed from: c, reason: collision with root package name */
    public r45.r03 f338972c;

    public n2(java.lang.String keyWord) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyWord, "keyWord");
        this.f338970a = keyWord;
        this.f338971b = new java.util.LinkedList();
    }

    /* renamed from: equals */
    public boolean m128356xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ey2.n2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338970a, ((ey2.n2) obj).f338970a);
    }

    /* renamed from: hashCode */
    public int m128357x8cdac1b() {
        return this.f338970a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m128358x9616526c() {
        return "Cache(keyWord=" + this.f338970a + ')';
    }
}
