package t0;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f495793a;

    public a(int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f495793a = (i18 & 1) != 0 ? 0 : i17;
    }

    /* renamed from: equals */
    public boolean m165549xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0.a) && this.f495793a == ((t0.a) obj).f495793a;
    }

    /* renamed from: hashCode */
    public int m165550x8cdac1b() {
        return java.lang.Integer.hashCode(this.f495793a);
    }

    /* renamed from: toString */
    public java.lang.String m165551x9616526c() {
        return "DeltaCounter(count=" + this.f495793a + ')';
    }
}
