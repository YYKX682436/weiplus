package kn;

/* loaded from: classes4.dex */
public class x extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, m65.a {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f391018d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f391019e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f391020f;

    /* renamed from: g, reason: collision with root package name */
    public final int f391021g;

    public x(java.lang.String str, java.util.List list, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.j04();
        lVar.f152198b = new r45.k04();
        lVar.f152199c = "/cgi-bin/micromsg-bin/invitechatroommember";
        lVar.f152200d = 610;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f391019e = a17;
        r45.j04 j04Var = (r45.j04) a17.f152243a.f152217a;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            r45.kk4 kk4Var = new r45.kk4();
            kk4Var.f460313d = x51.j1.i(str2);
            linkedList.add(kk4Var);
        }
        j04Var.f459001e = linkedList;
        j04Var.f459000d = linkedList.size();
        j04Var.f459002f = x51.j1.i(str);
        j04Var.f459003g = i17;
        if (obj instanceof com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.LocalHistoryInfo) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInviteChatRoomMember", "localHistoryInfo:%s", obj.toString());
            r45.rw3 rw3Var = new r45.rw3();
            j04Var.f459005i = rw3Var;
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
        this.f391018d = u0Var;
        return mo9409x10f9447a(sVar, this.f391019e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 610;
    }

    @Override // m65.a
    public o65.b l(o65.b bVar) {
        if (bVar instanceof o65.a) {
            o65.a aVar = (o65.a) bVar;
            ((o65.e) aVar).f424755b = this.f391021g;
            ((o65.e) aVar).f424754a = this.f391020f;
        }
        return bVar;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f391018d.mo815x76e0bfae(i18, i19, str, this);
    }

    public x(java.lang.String str, java.util.List list, int i17, java.lang.String str2, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f391020f = f9Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.j04();
        lVar.f152198b = new r45.k04();
        lVar.f152199c = "/cgi-bin/micromsg-bin/invitechatroommember";
        lVar.f152200d = 610;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f391019e = a17;
        r45.j04 j04Var = (r45.j04) a17.f152243a.f152217a;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            r45.kk4 kk4Var = new r45.kk4();
            kk4Var.f460313d = x51.j1.i(str3);
            linkedList.add(kk4Var);
        }
        this.f391021g = linkedList.size();
        j04Var.f459001e = linkedList;
        j04Var.f459000d = linkedList.size();
        j04Var.f459002f = x51.j1.i(str);
        j04Var.f459003g = i17;
        j04Var.f459004h = str2;
    }
}
