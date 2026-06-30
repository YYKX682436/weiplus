package r61;

/* loaded from: classes11.dex */
public class h1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f474411d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f474412e = null;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f474413f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f474414g;

    public h1() {
        H();
        r45.gi3 gi3Var = (r45.gi3) this.f474411d.f152243a.f152217a;
        gi3Var.f456812e = "";
        gi3Var.f456816i = null;
        gi3Var.f456815h = 0;
        gi3Var.f456814g = null;
        gi3Var.f456813f = 0;
        gi3Var.f456811d = 0;
        gi3Var.f456817m = 1;
    }

    public final void H() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.gi3();
        lVar.f152198b = new r45.hi3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getmfriend";
        lVar.f152200d = com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50673x992affbf;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f474411d = lVar.a();
    }

    public final void I(r61.a aVar, r45.je4 je4Var) {
        aVar.f474338u = je4Var.f459280f;
        aVar.f474339v = je4Var.f459281g;
        aVar.f474340w = je4Var.f459282h;
        aVar.f474341x = je4Var.f459283i;
        aVar.f474342y = je4Var.f459284m;
        aVar.f474343z = je4Var.f459285n;
        aVar.A = je4Var.f459286o;
        aVar.B = je4Var.f459288q;
        aVar.D = je4Var.f459290s;
        aVar.C = je4Var.f459289r;
        aVar.E = je4Var.f459292u;
        aVar.F = je4Var.f459293v;
        r45.cb6 cb6Var = je4Var.f459291t;
        if (cb6Var != null) {
            aVar.G = cb6Var.f452961d;
            aVar.H = cb6Var.f452962e;
            aVar.I = cb6Var.f452963f;
        }
        r45.va0 va0Var = je4Var.f459294w;
        if (va0Var != null) {
            aVar.f474317J = va0Var.f469554d;
            aVar.K = va0Var.f469555e;
            aVar.L = va0Var.f469556f;
            aVar.M = va0Var.f469557g;
        }
    }

    public void J() {
        r45.gi3 gi3Var = (r45.gi3) this.f474411d.f152243a.f152217a;
        gi3Var.f456812e = (java.lang.String) gm0.j1.u().c().l(65828, null);
        gi3Var.f456811d = 1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f474412e = u0Var;
        r45.gi3 gi3Var = (r45.gi3) this.f474411d.f152243a.f152217a;
        if (gi3Var.f456811d == 2) {
            java.util.List<java.lang.String> list = this.f474414g;
            java.util.List<java.lang.String> list2 = this.f474413f;
            if ((list2 == null || list2.size() == 0) && (list == null || list.size() == 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetMFriend", "doScene failed, mobile list and email list empty.");
                return -1;
            }
            if (list2 != null && list2.size() > 0) {
                list2.size();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (java.lang.String str : list2) {
                    r45.en4 en4Var = new r45.en4();
                    en4Var.f455148d = str;
                    linkedList.add(en4Var);
                }
                gi3Var.f456814g = linkedList;
                gi3Var.f456813f = linkedList.size();
            }
            if (list != null && list.size() > 0) {
                list.size();
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                for (java.lang.String str2 : list) {
                    r45.ie4 ie4Var = new r45.ie4();
                    ie4Var.f458502d = str2;
                    linkedList2.add(ie4Var);
                }
                gi3Var.f456816i = linkedList2;
                gi3Var.f456815h = linkedList2.size();
            }
        }
        return mo9409x10f9447a(sVar, this.f474411d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022f  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r24, int r25, int r26, java.lang.String r27, com.p314xaae8f345.mm.p971x6de15a2e.v0 r28, byte[] r29) {
        /*
            Method dump skipped, instructions count: 1321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r61.h1.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    public h1(java.util.List list, java.util.List list2) {
        H();
        if ((list == null || list.size() == 0) && (list2 == null || list2.size() == 0)) {
            return;
        }
        this.f474413f = list;
        this.f474414g = list2;
        r45.gi3 gi3Var = (r45.gi3) this.f474411d.f152243a.f152217a;
        gi3Var.f456812e = "";
        gi3Var.f456811d = 2;
        gi3Var.f456817m = 1;
    }
}
