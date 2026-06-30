package w11;

/* loaded from: classes11.dex */
public class p0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w11.q0 f523634d;

    public p0(w11.q0 q0Var) {
        this.f523634d = q0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m1Var.m48017xd0f4c159(true);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        w11.q0 q0Var = this.f523634d;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(((java.util.ArrayList) q0Var.f523645e.f523656o).size());
        w11.r0 r0Var = q0Var.f523645e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "summerdktext verifypsw onSceneEnd[%d, %d] needVerifyPswList size[%d] errMsg[%s] verifyingPsw[%b], retryVerifyCount[%d]", valueOf, valueOf2, valueOf3, str, java.lang.Boolean.valueOf(r0Var.f523655n), java.lang.Integer.valueOf(r0Var.f523654m));
        if (i17 == 0 && i18 == 0) {
            ((java.util.ArrayList) r0Var.f523656o).clear();
            r0Var.H(str);
        } else {
            java.util.List list = r0Var.f523656o;
            int i19 = 0;
            while (true) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (i19 >= arrayList.size()) {
                    break;
                }
                r0Var.J((com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList.get(i19));
                i19++;
            }
            r0Var.f523648d.mo815x76e0bfae(4, -49, q0Var.f523644d, r0Var);
            java.util.List list2 = r0Var.f523656o;
            int i27 = 0;
            while (true) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) list2;
                if (i27 >= arrayList2.size()) {
                    break;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList2.get(i27);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5991xa0d42363 c5991xa0d42363 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5991xa0d42363();
                c5991xa0d42363.f136286g.f88994a = f9Var;
                c5991xa0d42363.e();
                f9Var.m124847x74d37ac6();
                i27++;
            }
            ((java.util.ArrayList) r0Var.f523656o).clear();
        }
        r0Var.f523655n = false;
        x51.o1.K = false;
    }
}
