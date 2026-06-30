package r61;

/* loaded from: classes4.dex */
public class n1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f474452d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f474453e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f474454f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f474455g;

    public n1(java.util.ArrayList arrayList) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.q04();
        lVar.f152198b = new r45.r04();
        lVar.f152199c = "/cgi-bin/micromsg-bin/invitegooglecontact";
        lVar.f152200d = 489;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f474452d = lVar.a();
        this.f474454f = new java.util.LinkedList();
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            r45.p04 p04Var = new r45.p04();
            p04Var.f464178d = (java.lang.String) arrayList.get(i17);
            this.f474454f.add(p04Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "doScene");
        this.f474453e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f474452d;
        r45.q04 q04Var = (r45.q04) oVar.f152243a.f152217a;
        java.util.LinkedList linkedList = this.f474454f;
        q04Var.f465066d = linkedList.size();
        q04Var.f465067e = linkedList;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 489;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "NetId:%d, ErrType:%d, ErrCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f474453e.mo815x76e0bfae(i18, i19, str, this);
        } else {
            this.f474453e.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
