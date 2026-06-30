package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes15.dex */
public class o0 implements bb5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.q0 f233727a;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.q0 q0Var) {
        this.f233727a = q0Var;
    }

    @Override // bb5.e
    public int a() {
        return this.f233727a.getCount();
    }

    @Override // bb5.e
    public java.lang.String b(int i17) {
        if (i17 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.q0 q0Var = this.f233727a;
            if (i17 < q0Var.getCount()) {
                r45.b64 b64Var = (r45.b64) ((java.util.LinkedList) q0Var.f233735g.f233626m).get(i17);
                if (b64Var == null) {
                    return null;
                }
                return b64Var.f452083d;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NearbyFriend", "pos is invalid");
        return null;
    }
}
