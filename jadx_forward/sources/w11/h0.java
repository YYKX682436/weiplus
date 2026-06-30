package w11;

/* loaded from: classes4.dex */
public class h0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f523571d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f523572e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final int f523573f;

    /* renamed from: g, reason: collision with root package name */
    public final int f523574g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f523575h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f523576i;

    /* renamed from: m, reason: collision with root package name */
    public final int f523577m;

    /* renamed from: n, reason: collision with root package name */
    public final int f523578n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f523579o;

    public h0(java.util.List list, int i17, int i18, int i19) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f523579o = linkedList;
        this.f523571d = list;
        this.f523573f = i17;
        this.f523574g = i18;
        this.f523578n = list.size();
        this.f523577m = i19;
        linkedList.addAll(list);
    }

    public r45.hg H() {
        return (r45.hg) this.f523576i.f152244b.f152233a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        int i17;
        this.f523575h = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/batchmodcontacttype";
        lVar.f152200d = 3990;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152197a = new r45.gg();
        lVar.f152198b = new r45.hg();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f523576i = a17;
        r45.gg ggVar = (r45.gg) a17.f152243a.f152217a;
        ggVar.f456739e = new java.util.LinkedList();
        int i18 = 0;
        while (true) {
            int i19 = this.f523577m;
            i17 = this.f523573f;
            if (i18 >= i19) {
                break;
            }
            java.util.List list = this.f523571d;
            if (list.size() <= 0) {
                break;
            }
            r45.un4 un4Var = new r45.un4();
            un4Var.f469027d = (java.lang.String) list.remove(0);
            un4Var.f469028e = i17;
            un4Var.f469029f = this.f523574g;
            ggVar.f456739e.add(un4Var);
            i18++;
        }
        ggVar.f456738d = ggVar.f456739e.size();
        if (i17 == 134217728 || i17 == 33554432) {
            ggVar.f456740f = 1;
        }
        return mo9409x10f9447a(sVar, this.f523576i, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3990;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchModContactType", "errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        int i27 = 0;
        if (i18 == 0 && i19 == 0) {
            java.util.Iterator it = ((r45.hg) this.f523576i.f152244b.f152233a).f457660e.iterator();
            while (it.hasNext()) {
                r45.vn4 vn4Var = (r45.vn4) it.next();
                if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
                    int i28 = vn4Var.f469929d;
                    java.lang.String str2 = vn4Var.f469930e.f469027d;
                }
                if (vn4Var.f469929d == 0) {
                    gm0.j1.i();
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(vn4Var.f469930e.f469027d, true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349();
                    if (n17 != null && n17.r2()) {
                        r45.un4 un4Var = vn4Var.f469930e;
                        int i29 = un4Var.f469028e;
                        if (i29 != 8388608) {
                            if (i29 != 33554432) {
                                if (i29 == 134217728) {
                                    if (un4Var.f469029f == 1) {
                                        n17.mo43621x7650bebc(n17.m124896xfb85f7b0() | 134217728);
                                    } else {
                                        n17.mo43621x7650bebc(n17.m124896xfb85f7b0() & (-134217729));
                                    }
                                }
                            } else if (un4Var.f469029f == 1) {
                                n17.mo43621x7650bebc(n17.m124896xfb85f7b0() | com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432);
                            } else {
                                n17.mo43621x7650bebc(n17.m124896xfb85f7b0() & (-33554433));
                            }
                        } else if (un4Var.f469029f == 1) {
                            n17.i3();
                        } else {
                            n17.mo43621x7650bebc(n17.m124896xfb85f7b0() & (-8388609));
                        }
                        gm0.j1.i();
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(n17.d1(), n17);
                        ((java.util.LinkedList) this.f523572e).add(n17.d1());
                    }
                } else {
                    i27++;
                }
            }
            if (i27 == 0 && this.f523571d.size() > 0) {
                if (mo807x6c193ac1(m47995xb7ba1aa7(), this.f523575h) < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBatchModContactType", "onGYNetEnd : doScene fail");
                    this.f523575h.mo815x76e0bfae(3, -1, "", this);
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f523575h;
        if (i27 > 0) {
            i19 = -3500;
        }
        u0Var.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 10;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }
}
