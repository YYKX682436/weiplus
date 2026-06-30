package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class q0 implements bb5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.s0 f288658a;

    public q0(com.p314xaae8f345.mm.ui.p2690x38b72420.s0 s0Var) {
        this.f288658a = s0Var;
    }

    @Override // bb5.e
    public int a() {
        return this.f288658a.getCount();
    }

    @Override // bb5.e
    public java.lang.String b(int i17) {
        if (i17 >= 0) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.s0 s0Var = this.f288658a;
            if (i17 < s0Var.getCount()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) s0Var.getItem(i17);
                if (z3Var == null) {
                    return null;
                }
                return z3Var.d1();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomContactAdapter", "pos is invalid");
        return null;
    }
}
