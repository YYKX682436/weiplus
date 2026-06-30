package mm2;

/* loaded from: classes3.dex */
public final class o6 {

    /* renamed from: a, reason: collision with root package name */
    public final mm2.p6 f410870a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f410871b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f410872c;

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.f1 f410873d;

    public o6(mm2.p6 state, yz5.a showBlock, yz5.a timeOutBlock, p3325xe03a0797.p3326xc267989b.f1 f1Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        f1Var = (i17 & 8) != 0 ? null : f1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showBlock, "showBlock");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeOutBlock, "timeOutBlock");
        this.f410870a = state;
        this.f410871b = showBlock;
        this.f410872c = timeOutBlock;
        this.f410873d = f1Var;
    }

    /* renamed from: equals */
    public boolean m147994xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.o6)) {
            return false;
        }
        mm2.o6 o6Var = (mm2.o6) obj;
        return this.f410870a == o6Var.f410870a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f410871b, o6Var.f410871b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f410872c, o6Var.f410872c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f410873d, o6Var.f410873d);
    }

    /* renamed from: hashCode */
    public int m147995x8cdac1b() {
        int hashCode = ((((this.f410870a.hashCode() * 31) + this.f410871b.hashCode()) * 31) + this.f410872c.hashCode()) * 31;
        p3325xe03a0797.p3326xc267989b.f1 f1Var = this.f410873d;
        return hashCode + (f1Var == null ? 0 : f1Var.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m147996x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("state: ");
        mm2.p6 p6Var = this.f410870a;
        sb6.append(p6Var.f410890d);
        sb6.append(" priority: ");
        sb6.append(p6Var.f410891e);
        sb6.append(" lockJob: ");
        p3325xe03a0797.p3326xc267989b.f1 f1Var = this.f410873d;
        sb6.append(f1Var != null ? java.lang.Boolean.valueOf(f1Var.a()) : null);
        return sb6.toString();
    }
}
