package so2;

/* loaded from: classes2.dex */
public final class f5 {

    /* renamed from: a, reason: collision with root package name */
    public int f491878a;

    /* renamed from: b, reason: collision with root package name */
    public int f491879b;

    /* renamed from: c, reason: collision with root package name */
    public r45.px2 f491880c;

    public f5(int i17, int i18, r45.px2 px2Var, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        px2Var = (i19 & 4) != 0 ? null : px2Var;
        this.f491878a = i17;
        this.f491879b = i18;
        this.f491880c = px2Var;
    }

    /* renamed from: equals */
    public boolean m164875xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.f5)) {
            return false;
        }
        so2.f5 f5Var = (so2.f5) obj;
        return this.f491878a == f5Var.f491878a && this.f491879b == f5Var.f491879b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f491880c, f5Var.f491880c);
    }

    /* renamed from: hashCode */
    public int m164876x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f491878a) * 31) + java.lang.Integer.hashCode(this.f491879b)) * 31;
        r45.px2 px2Var = this.f491880c;
        return hashCode + (px2Var == null ? 0 : px2Var.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m164877x9616526c() {
        return "FriendTabLikeTipsState(state=" + this.f491878a + ", position=" + this.f491879b + ", tipsShowInfo=" + this.f491880c + ')';
    }
}
