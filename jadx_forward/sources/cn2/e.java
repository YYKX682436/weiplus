package cn2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f125029a;

    public e(int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f125029a = (i18 & 1) != 0 ? -1 : i17;
    }

    /* renamed from: equals */
    public boolean m15330xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cn2.e) && this.f125029a == ((cn2.e) obj).f125029a;
    }

    /* renamed from: hashCode */
    public int m15331x8cdac1b() {
        return java.lang.Integer.hashCode(this.f125029a);
    }

    /* renamed from: toString */
    public java.lang.String m15332x9616526c() {
        return "Extra(level=" + this.f125029a + ')';
    }
}
