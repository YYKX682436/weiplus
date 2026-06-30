package rk4;

/* loaded from: classes14.dex */
public final class u5 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.C18710x505d67f f478544d;

    public u5(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.C18710x505d67f c18710x505d67f) {
        this.f478544d = c18710x505d67f;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        al5.f3 f3Var = (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) obj;
        boolean z17 = f3Var instanceof lk5.a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.C18710x505d67f c18710x505d67f = this.f478544d;
        if (z17) {
            rk4.t5 t5Var = new rk4.t5(c18710x505d67f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2) ((lk5.a) f3Var);
            activityC16840x4302a3e2.getClass();
            java.util.Objects.toString(t5Var);
            activityC16840x4302a3e2.T = t5Var;
        }
        if (f3Var instanceof m40.p0) {
            c18710x505d67f.f256169n = (m40.p0) f3Var;
        }
        return jz5.f0.f384359a;
    }
}
