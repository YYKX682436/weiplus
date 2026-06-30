package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class f0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 f172972d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 q0Var) {
        this.f172972d = q0Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 q0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4 e4Var;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) this.f172972d.f173143o.get();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 q0Var2 = this.f172972d;
            java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.f173174d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m.f173073a.e(v5Var, q0Var2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 q0Var3 = this.f172972d;
        if (q0Var3.f173146r == null) {
            q0Var3.f173146r = q0Var3.n();
        }
        boolean z18 = false;
        if (z17) {
            q0Var3.B();
            if (q0Var3.f173142n.f438140u.booleanValue()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(q0Var3.f173150v, 100L);
            }
        } else if (q0Var3.f173145q != null) {
            if (q0Var3.f173142n.T) {
                q0Var3.l(false);
                q0Var3.f173146r.e(q0Var3.f173145q);
                q0Var3.z(q0Var3.f173145q);
                q0Var3.f173145q.n();
                q0Var3.f173145q = null;
                ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.f172083a).remove(q0Var3);
            } else {
                if (q0Var3.f173141m == null) {
                    q0Var3.l(false);
                }
                q0Var3.f173145q.setFocusable(false);
                q0Var3.f173145q.setFocusableInTouchMode(false);
                q0Var3.f173146r.e(q0Var3.f173145q);
            }
        }
        if (z17 && (!this.f172972d.f173142n.T || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.na.k(this.f172972d.f173145q))) {
            z18 = true;
        }
        if (!z18 || (e4Var = (q0Var = this.f172972d).f173145q) == null || q0Var.f173146r == null) {
            return;
        }
        e4Var.requestFocus();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 q0Var4 = this.f172972d;
        q0Var4.f173146r.k(q0Var4.F);
        this.f172972d.f173146r.I();
    }
}
