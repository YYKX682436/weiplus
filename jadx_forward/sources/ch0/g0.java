package ch0;

/* loaded from: classes8.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f122745a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864 f122746b;

    public g0(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864 abstractActivityC19400xd202f864) {
        this.f122745a = z17;
        this.f122746b = abstractActivityC19400xd202f864;
    }

    /* renamed from: equals */
    public boolean m14824xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch0.g0)) {
            return false;
        }
        ch0.g0 g0Var = (ch0.g0) obj;
        return this.f122745a == g0Var.f122745a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f122746b, g0Var.f122746b);
    }

    /* renamed from: hashCode */
    public int m14825x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f122745a) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864 abstractActivityC19400xd202f864 = this.f122746b;
        return hashCode + (abstractActivityC19400xd202f864 == null ? 0 : abstractActivityC19400xd202f864.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m14826x9616526c() {
        return "ValidationResult(isValid=" + this.f122745a + ", activity=" + this.f122746b + ')';
    }

    public /* synthetic */ g0(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864 abstractActivityC19400xd202f864, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(z17, (i17 & 2) != 0 ? null : abstractActivityC19400xd202f864);
    }
}
