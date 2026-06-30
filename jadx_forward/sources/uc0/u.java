package uc0;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f507811a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f507812b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.kl5 f507813c;

    public u(java.util.List remark, java.util.List phone, r45.kl5 kl5Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remark, "remark");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(phone, "phone");
        this.f507811a = remark;
        this.f507812b = phone;
        this.f507813c = kl5Var;
    }

    /* renamed from: equals */
    public boolean m167816xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc0.u)) {
            return false;
        }
        uc0.u uVar = (uc0.u) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f507811a, uVar.f507811a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f507812b, uVar.f507812b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f507813c, uVar.f507813c);
    }

    /* renamed from: hashCode */
    public int m167817x8cdac1b() {
        int hashCode = ((this.f507811a.hashCode() * 31) + this.f507812b.hashCode()) * 31;
        r45.kl5 kl5Var = this.f507813c;
        return hashCode + (kl5Var == null ? 0 : kl5Var.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m167818x9616526c() {
        return "RecommendRemarkSplit(remark=" + this.f507811a + ", phone=" + this.f507812b + ", imgMsgData=" + this.f507813c + ')';
    }
}
