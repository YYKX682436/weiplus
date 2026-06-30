package u26;

/* loaded from: classes14.dex */
public final class a0 extends u26.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Throwable f505668a;

    public a0(java.lang.Throwable th6) {
        this.f505668a = th6;
    }

    /* renamed from: equals */
    public boolean m167469xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof u26.a0) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f505668a, ((u26.a0) obj).f505668a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m167470x8cdac1b() {
        java.lang.Throwable th6 = this.f505668a;
        if (th6 != null) {
            return th6.hashCode();
        }
        return 0;
    }

    @Override // u26.b0
    /* renamed from: toString */
    public java.lang.String mo167471x9616526c() {
        return "Closed(" + this.f505668a + ')';
    }
}
