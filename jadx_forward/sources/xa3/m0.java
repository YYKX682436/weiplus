package xa3;

/* loaded from: classes9.dex */
public class m0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f534335d;

    public m0() {
        super(0);
        this.f534335d = false;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        int t17;
        int t18;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5689x3d19c202 c5689x3d19c202 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5689x3d19c202) abstractC20979x809547d1;
        if (!(c5689x3d19c202 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5689x3d19c202)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LocationServerListener", "e.data.eventType : " + c5689x3d19c202.f136014g.f88092a);
        int i17 = c5689x3d19c202.f136014g.f88092a;
        if (i17 == 0) {
            va3.s Ai = va3.j0.Ai();
            java.lang.String str = c5689x3d19c202.f136014g.f88093b;
            Ai.getClass();
            Ai.f515873a = new java.util.HashSet();
            this.f534335d = true;
        } else if (i17 == 1) {
            va3.s Ai2 = va3.j0.Ai();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = c5689x3d19c202.f136014g.f88094c;
            Ai2.getClass();
            java.lang.String[] strArr = new java.lang.String[2];
            java.lang.String j17 = f9Var.j();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17)) {
                strArr[0] = "";
                strArr[1] = "";
            } else {
                boolean z17 = f9Var.A0() == 0;
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0()) && z17 && (t18 = c01.w9.t(j17)) != -1) {
                    j17 = j17.substring(t18 + 1).trim();
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.b9 H6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().H6(j17);
                if (H6.b()) {
                    java.lang.String str2 = H6.f275312e;
                    java.lang.String str3 = H6.f275313f;
                    strArr[0] = str2;
                    strArr[1] = str3;
                } else {
                    strArr[0] = H6.f275312e;
                    strArr[1] = "";
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(strArr[0]) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(strArr[1])) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationServer", "pull from sever");
                    int hashCode = f9Var.U1().hashCode();
                    java.util.Set set = Ai2.f515873a;
                    if (set != null) {
                        if (!((java.util.HashSet) set).contains(java.lang.Integer.valueOf(hashCode))) {
                            java.lang.String j18 = f9Var.j();
                            boolean z18 = f9Var.A0() == 0;
                            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0()) && z18 && (t17 = c01.w9.t(j18)) != -1) {
                                j18 = j18.substring(t17 + 1).trim();
                            }
                            com.p314xaae8f345.mm.p2621x8fb0427b.b9 d17 = com.p314xaae8f345.mm.p2621x8fb0427b.b9.d(j18);
                            ((java.util.HashSet) Ai2.f515873a).add(java.lang.Integer.valueOf(hashCode));
                            u60.h hVar = new u60.h(d17.f275309b, d17.f275310c);
                            hVar.f506406f = f9Var;
                            ((i11.g) ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi()).b(hVar, Ai2.f515874b);
                        }
                    }
                }
            }
            am.fj fjVar = c5689x3d19c202.f136015h;
            fjVar.f88213a = strArr[0];
            fjVar.f88214b = strArr[1];
        } else if (i17 == 2 && this.f534335d) {
            va3.s Ai3 = va3.j0.Ai();
            java.util.Set set2 = Ai3.f515873a;
            if (set2 != null) {
                ((java.util.HashSet) set2).clear();
            }
            ((i11.g) ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi()).c(Ai3.f515874b);
        }
        return true;
    }
}
