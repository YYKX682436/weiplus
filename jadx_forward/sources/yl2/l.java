package yl2;

/* loaded from: classes3.dex */
public final class l extends yl2.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f544573a;

    public l(int i17) {
        super(null);
        this.f544573a = i17;
    }

    /* renamed from: equals */
    public boolean m177263xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yl2.l) && this.f544573a == ((yl2.l) obj).f544573a;
    }

    /* renamed from: hashCode */
    public int m177264x8cdac1b() {
        return java.lang.Integer.hashCode(this.f544573a);
    }

    /* renamed from: toString */
    public java.lang.String m177265x9616526c() {
        return "Blocked(errCode=" + this.f544573a + ')';
    }

    public /* synthetic */ l(int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17);
    }
}
