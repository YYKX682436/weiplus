package bu2;

/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q2 f106082a;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q2 q2Var) {
        this.f106082a = q2Var;
    }

    /* renamed from: equals */
    public boolean m11304xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bu2.m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f106082a, ((bu2.m) obj).f106082a);
    }

    /* renamed from: hashCode */
    public int m11305x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q2 q2Var = this.f106082a;
        if (q2Var == null) {
            return 0;
        }
        return q2Var.m56539x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m11306x9616526c() {
        return "GlobalExtra(wording=" + this.f106082a + ')';
    }
}
