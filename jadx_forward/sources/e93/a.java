package e93;

/* loaded from: classes11.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f331881d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f331882e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f331883f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f331884g;

    public a(java.lang.String str) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f331883f = linkedList;
        this.f331884g = new java.util.LinkedList();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.b4();
        lVar.f152198b = new r45.c4();
        lVar.f152199c = "/cgi-bin/micromsg-bin/addcontactlabel";
        lVar.f152200d = kd1.c.f72435x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f331881d = lVar.a();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        r45.f54 f54Var = new r45.f54();
        f54Var.f455554d = str;
        linkedList.add(f54Var);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f331882e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f331881d;
        r45.b4 b4Var = (r45.b4) oVar.f152243a.f152217a;
        java.util.LinkedList linkedList = this.f331883f;
        if (linkedList == null || linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Label.NetSceneAddContactLabel", "cpan[doScene] label list is null.");
            u0Var.mo815x76e0bfae(3, -1, "[doScene]empty contact list.", this);
            return 0;
        }
        b4Var.f452039e = linkedList;
        b4Var.f452038d = linkedList.size();
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return kd1.c.f72435x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.c4 c4Var = (r45.c4) this.f331881d.f152244b.f152233a;
        if (c4Var != null) {
            java.util.LinkedList linkedList = c4Var.f452793e;
            java.util.LinkedList linkedList2 = this.f331884g;
            linkedList2.clear();
            linkedList2.addAll(linkedList);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int size = linkedList.size();
            for (int i27 = 0; i27 < size; i27++) {
                r45.f54 f54Var = (r45.f54) linkedList.get(i27);
                com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.d4();
                d4Var.f66585x70ce48ca = f54Var.f455555e;
                java.lang.String str2 = f54Var.f455554d;
                d4Var.f66586x7661fe9a = str2;
                d4Var.f66587x68c44467 = x51.k.a(str2);
                d4Var.f66588xb0759da4 = x51.k.b(f54Var.f455554d);
                d4Var.f66584x284d1882 = false;
                arrayList.add(d4Var);
            }
            b93.r.wi().W0(arrayList);
            b93.r.wi().T1(arrayList);
        }
        this.f331882e.mo815x76e0bfae(i18, i19, str, this);
    }

    public a(java.util.List list) {
        this.f331883f = new java.util.LinkedList();
        this.f331884g = new java.util.LinkedList();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.b4();
        lVar.f152198b = new r45.c4();
        lVar.f152199c = "/cgi-bin/micromsg-bin/addcontactlabel";
        lVar.f152200d = kd1.c.f72435x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f331881d = lVar.a();
        if (list == null || list.size() <= 0) {
            return;
        }
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            r45.f54 f54Var = new r45.f54();
            f54Var.f455554d = (java.lang.String) list.get(i17);
            this.f331883f.add(f54Var);
        }
    }
}
