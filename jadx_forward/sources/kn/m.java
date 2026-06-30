package kn;

/* loaded from: classes4.dex */
public class m extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, m65.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f390952d;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f390954f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f390955g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f390956h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f390957i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f390958m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f390959n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f390960o;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f390962q;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f390953e = null;

    /* renamed from: p, reason: collision with root package name */
    public int f390961p = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f390963r = "";

    public m(java.lang.String str, java.util.List list, java.lang.String str2, java.lang.Object obj) {
        this.f390962q = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.z3();
        lVar.f152198b = new r45.a4();
        lVar.f152199c = "/cgi-bin/micromsg-bin/addchatroommember";
        lVar.f152200d = 120;
        lVar.f152201e = 36;
        lVar.f152202f = 1000000036;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f390952d = a17;
        r45.z3 z3Var = (r45.z3) a17.f152243a.f152217a;
        z3Var.f473190f = x51.j1.i(str);
        this.f390962q = str;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            r45.kk4 kk4Var = new r45.kk4();
            kk4Var.f460313d = x51.j1.i(str3);
            linkedList.add(kk4Var);
        }
        z3Var.f473189e = linkedList;
        z3Var.f473188d = linkedList.size();
        this.f390954f = new java.util.ArrayList();
        this.f390955g = new java.util.LinkedList();
        this.f390956h = new java.util.LinkedList();
        this.f390957i = new java.util.LinkedList();
        this.f390958m = new java.util.LinkedList();
        this.f390959n = new java.util.ArrayList();
        this.f390960o = new java.util.ArrayList();
        z3Var.f473192h = str2;
        if (obj instanceof com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.LocalHistoryInfo) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAddChatRoomMember", "localHistoryInfo:%s", obj.toString());
            r45.rw3 rw3Var = new r45.rw3();
            z3Var.f473193i = rw3Var;
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.LocalHistoryInfo localHistoryInfo = (com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.LocalHistoryInfo) obj;
            rw3Var.f466768d = localHistoryInfo.f145250d;
            rw3Var.f466769e = localHistoryInfo.f145251e;
            rw3Var.f466770f = localHistoryInfo.f145252f;
            rw3Var.f466771g = localHistoryInfo.f145253g;
            rw3Var.f466772h = localHistoryInfo.f145254h;
            rw3Var.f466773i = localHistoryInfo.f145255i;
            rw3Var.f466774m = localHistoryInfo.f145256m;
            rw3Var.f466775n = localHistoryInfo.f145257n;
            rw3Var.f466776o = localHistoryInfo.f145258o;
            rw3Var.f466777p = localHistoryInfo.f145259p;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f390953e = u0Var;
        return mo9409x10f9447a(sVar, this.f390952d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 120;
    }

    @Override // m65.a
    public o65.b l(o65.b bVar) {
        if (!(bVar instanceof o65.d)) {
            return bVar;
        }
        o65.d dVar = (o65.d) bVar;
        dVar.f424751i = this.f390962q;
        dVar.f424744b = this.f390955g;
        dVar.f424750h = this.f390961p;
        dVar.f424745c = this.f390956h;
        dVar.f424743a = this.f390954f;
        dVar.f424746d = this.f390957i;
        dVar.f424748f = this.f390959n;
        dVar.f424747e = this.f390958m;
        dVar.f424749g = this.f390960o;
        dVar.f424753k = this.f390963r;
        return dVar;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        m48024x6b3684de(i17);
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f390952d;
        r45.z3 z3Var = (r45.z3) oVar.f152243a.f152217a;
        r45.a4 a4Var = (r45.a4) oVar.f152244b.f152233a;
        this.f390961p = a4Var.f451242d;
        this.f390963r = a4Var.f451244f;
        java.util.LinkedList linkedList = a4Var.f451243e;
        for (int i27 = 0; i27 < linkedList.size(); i27++) {
            int i28 = ((r45.lk4) linkedList.get(i27)).f461077e;
            if (i28 == 0) {
                ((java.util.ArrayList) this.f390954f).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f461076d));
            } else if (i28 == 3) {
                r45.du5 du5Var = ((r45.lk4) linkedList.get(i27)).f461076d;
                ((java.util.LinkedList) this.f390956h).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f461076d));
            } else if (i28 == 1) {
                r45.du5 du5Var2 = ((r45.lk4) linkedList.get(i27)).f461076d;
                ((java.util.LinkedList) this.f390957i).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f461076d));
            } else if (i28 == 2) {
                r45.du5 du5Var3 = ((r45.lk4) linkedList.get(i27)).f461076d;
                ((java.util.LinkedList) this.f390955g).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f461076d));
            } else if (i28 == 4) {
                r45.du5 du5Var4 = ((r45.lk4) linkedList.get(i27)).f461076d;
                ((java.util.LinkedList) this.f390958m).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f461076d));
            } else if (i28 != 5) {
                if (i28 == 6) {
                    ((java.util.ArrayList) this.f390959n).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f461076d));
                } else if (i28 == 10) {
                    r45.du5 du5Var5 = ((r45.lk4) linkedList.get(i27)).f461076d;
                    ((java.util.ArrayList) this.f390960o).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f461076d));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneAddChatRoomMember", "unknown member status : status = " + i28);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAddChatRoomMember", "onSceneEnd: errType = " + i18 + " errCode = " + i19 + " errMsg = " + str + " memberCount = " + this.f390961p + " tips = " + this.f390963r);
        this.f390953e.mo815x76e0bfae(i18, i19, str, this);
        if (i18 == 0 && i19 == 0) {
            java.lang.String g17 = x51.j1.g(z3Var.f473190f);
            if (!c01.v1.B(g17) || a4Var.f451242d == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "AddChatroomMember: room:[" + g17 + "] listCnt:" + a4Var.f451242d);
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
            for (int i29 = 0; i29 < a4Var.f451242d; i29++) {
                java.lang.String g18 = x51.j1.g(((r45.lk4) linkedList.get(i29)).f461076d);
                if (((r45.lk4) linkedList.get(i29)).f461077e == 0) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g18)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "this member name is null! chatRoomName : %s", g17);
                    } else {
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(g18, true);
                        if (((int) n17.E2) != 0) {
                            n17.G2();
                            Bi.p0(n17.d1(), n17);
                        } else {
                            c01.v1.H(n17, (r45.lk4) linkedList.get(i29));
                            Bi.h0(n17);
                        }
                        arrayList.add(n17.d1());
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            c01.v1.t(g17, arrayList, null);
        }
    }
}
