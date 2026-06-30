package i21;

/* loaded from: classes10.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f369404d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f369405e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f369406f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f369407g;

    /* renamed from: h, reason: collision with root package name */
    public final int f369408h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f369409i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f369410m;

    public a(java.lang.String str, java.util.LinkedList linkedList) {
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        this.f369406f = linkedList2;
        this.f369407g = false;
        this.f369408h = 0;
        this.f369409i = str;
        this.f369410m = gm0.j1.b().h() + "" + java.lang.System.currentTimeMillis();
        linkedList2.clear();
        linkedList2.addAll(linkedList);
        this.f369408h = linkedList2.size();
        this.f369407g = this.f369408h == 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f369404d = u0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadCardImg", "start upload cgi");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.rt6();
        lVar.f152198b = new r45.st6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/uploadcardimg";
        lVar.f152200d = 575;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f369405e = a17;
        r45.rt6 rt6Var = (r45.rt6) a17.f152243a.f152217a;
        rt6Var.set(6, this.f369409i);
        rt6Var.set(2, 0);
        rt6Var.set(3, 0);
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(new byte[0]);
        rt6Var.set(5, cu5Var);
        rt6Var.set(4, 0);
        rt6Var.set(1, this.f369410m);
        rt6Var.set(7, java.lang.Integer.valueOf(this.f369408h));
        rt6Var.set(8, this.f369406f);
        return mo9409x10f9447a(sVar, this.f369405e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 575;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadCardImg", "upload card img error");
            this.f369404d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f369409i, true);
        if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
            r45.o80 o80Var = new r45.o80();
            java.util.LinkedList linkedList = this.f369406f;
            if (linkedList != null && linkedList.size() > 0) {
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.fu fuVar = (r45.fu) it.next();
                    r45.c5 c5Var = new r45.c5();
                    c5Var.f452825d = fuVar.m75945x2fec8307(0);
                    c5Var.f452826e = fuVar.m75945x2fec8307(1);
                    linkedList2.add(c5Var);
                }
                if (o80Var.f463551d == null) {
                    o80Var.f463551d = new java.util.LinkedList();
                }
                o80Var.f463551d.addAll(linkedList2);
                n17.O2(o80Var);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(n17);
            } else if (this.f369407g) {
                n17.O2(null);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(n17);
            }
        }
        this.f369404d.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 100;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }
}
