package mm2;

/* loaded from: classes3.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f410897a;

    /* renamed from: b, reason: collision with root package name */
    public final int f410898b;

    public q2(boolean z17, int i17) {
        this.f410897a = z17;
        this.f410898b = i17;
    }

    /* renamed from: equals */
    public boolean m148003xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.q2)) {
            return false;
        }
        mm2.q2 q2Var = (mm2.q2) obj;
        return this.f410897a == q2Var.f410897a && this.f410898b == q2Var.f410898b;
    }

    /* renamed from: hashCode */
    public int m148004x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f410897a) * 31) + java.lang.Integer.hashCode(this.f410898b);
    }

    /* renamed from: toString */
    public java.lang.String m148005x9616526c() {
        return "PanelTurnOnParameters(isTurnOn=" + this.f410897a + ", from=" + this.f410898b + ')';
    }

    public /* synthetic */ q2(boolean z17, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(z17, (i18 & 2) != 0 ? 0 : i17);
    }
}
