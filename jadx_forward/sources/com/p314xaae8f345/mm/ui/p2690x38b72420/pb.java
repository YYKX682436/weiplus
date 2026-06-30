package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class pb extends com.p314xaae8f345.mm.ui.p2690x38b72420.p6 {
    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p6, com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        int i18;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u0 u0Var;
        if (i17 == this.f288619q) {
            return u(i17);
        }
        if (i17 < 0) {
            return null;
        }
        if (this.f288622t == 1) {
            i18 = i17 - 1;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsSelectConversationAdapter", "Actually dead branch. position=%d", java.lang.Integer.valueOf(i17));
            i18 = i17;
        }
        if (!this.f288618p.moveToPosition(i18)) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.k0 k0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.k0(4, i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsSelectConversationAdapter", "wrong case: %s, %s", java.lang.Boolean.valueOf(this.f288618p.isClosed()), java.lang.Integer.valueOf(i18));
            return k0Var;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.f0 f0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.f0(i17);
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
        l4Var.mo9015xbf5d97fd(this.f288618p);
        gm0.j1.i();
        f0Var.f(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(l4Var.h1()));
        if (f0Var.B == null) {
            gm0.j1.i();
            f0Var.f(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(l4Var.h1()));
        }
        f0Var.f288369e = this.f288611f;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(l4Var.h1())) {
            f0Var.f288377m = true;
            if (i17 == this.f288619q + 1 && (u0Var = this.F) != null) {
                this.G = true;
                u0Var.h(com.p314xaae8f345.mm.R.C30861xcebc809e.agd);
            }
        }
        if (i17 == this.f288619q - 1) {
            f0Var.f288376l = true;
        }
        java.lang.String str = f0Var.f288383s;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(str)) {
            this.f288626x++;
        }
        ((java.util.HashMap) this.f288624v).put(str, java.lang.Integer.valueOf(i17 - this.f288619q));
        return f0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p6, com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSelectConversationAdapter", "resetData");
        t();
        int i17 = this.f288621s;
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(i17, 4)) {
            java.util.List c17 = com.p314xaae8f345.mm.ui.p2690x38b72420.k3.c();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c17)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                java.util.List list = this.f288121m;
                l75.e0 e0Var = pp.a.f438897e2;
                this.f288617o = Di.t(c17, 3, list, null, this.f288120i, "");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSelectConversationAdapter", "resetData: recent forward control switch on");
            com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            java.util.List list2 = this.f288121m;
            l75.e0 e0Var2 = pp.a.f438897e2;
            this.f288616n = Di2.C(3, list2, null, this.f288120i, "");
        } else if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(i17, 16)) {
            java.util.List b17 = com.p314xaae8f345.mm.ui.p2690x38b72420.k3.b();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(b17)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                java.util.List list3 = this.f288121m;
                l75.e0 e0Var3 = pp.a.f438897e2;
                this.f288617o = Di3.t(b17, 5, list3, null, this.f288120i, "");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSelectConversationAdapter", "resetData: recent forward control switch on");
            com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di4 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            java.util.List list4 = this.f288121m;
            l75.e0 e0Var4 = pp.a.f438897e2;
            this.f288616n = Di4.C(5, list4, null, this.f288120i, "");
        } else {
            java.util.List d17 = com.p314xaae8f345.mm.ui.p2690x38b72420.k3.d();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(d17)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di5 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                java.util.List list5 = this.f288121m;
                l75.e0 e0Var5 = pp.a.f438897e2;
                this.f288617o = Di5.t(d17, 1, list5, null, this.f288120i, "");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSelectConversationAdapter", "resetData: recent forward control switch on");
            com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            java.util.List list6 = this.f288121m;
            l75.e0 e0Var6 = pp.a.f438897e2;
            this.f288616n = Di6.C(1, list6, null, this.f288120i, "");
        }
        int count = this.f288616n.getCount();
        this.A = count;
        if (count > 0) {
            this.f288619q = 0;
        } else {
            this.f288619q = this.f288609d.O3().getHeaderViewsCount();
        }
        this.f288618p = this.f288616n;
        h();
    }
}
