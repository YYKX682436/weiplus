package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public class j1 extends l75.s0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f158015d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r1 f158016e;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r1 r1Var) {
        this.f158016e = r1Var;
    }

    @Override // l75.s0, l75.l0
    public void add(l75.q0 q0Var) {
        add(q0Var, android.os.Looper.getMainLooper());
    }

    @Override // l75.s0, l75.l0
    /* renamed from: remove */
    public void mo49775xc84af884(l75.q0 q0Var) {
        if (q0Var == null) {
            return;
        }
        super.mo49775xc84af884(q0Var);
        synchronized (this.f158015d) {
            ((java.util.HashSet) this.f158015d).remove(q0Var);
        }
    }

    @Override // l75.s0, l75.l0
    public void add(l75.q0 q0Var, android.os.Looper looper) {
        boolean z17;
        if (q0Var == null || looper == null) {
            return;
        }
        super.add(q0Var, looper);
        synchronized (this.f158015d) {
            ((java.util.HashSet) this.f158015d).add(q0Var);
            z17 = true;
            if (((java.util.HashSet) this.f158015d).size() != 1) {
                z17 = false;
            }
        }
        if (z17) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.p1.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.i1(this));
        }
    }
}
