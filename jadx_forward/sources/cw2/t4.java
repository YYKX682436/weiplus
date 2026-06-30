package cw2;

/* loaded from: classes2.dex */
public final class t4 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.gn2 f305553a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 f305554b;

    public t4(r45.gn2 gn2Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 scaleType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scaleType, "scaleType");
        this.f305553a = gn2Var;
        this.f305554b = scaleType;
    }

    /* renamed from: equals */
    public boolean m122926xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2.t4)) {
            return false;
        }
        cw2.t4 t4Var = (cw2.t4) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f305553a, t4Var.f305553a) && this.f305554b == t4Var.f305554b;
    }

    /* renamed from: hashCode */
    public int m122927x8cdac1b() {
        r45.gn2 gn2Var = this.f305553a;
        return ((gn2Var == null ? 0 : gn2Var.hashCode()) * 31) + this.f305554b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m122928x9616526c() {
        return "FinderObjectScalingInfoWrapper(scalingInfo=" + this.f305553a + ", scaleType=" + this.f305554b + ')';
    }
}
