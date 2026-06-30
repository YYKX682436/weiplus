package kn;

/* loaded from: classes4.dex */
public class n extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f390964d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f390965e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f390966f;

    public n(java.util.LinkedList linkedList) {
        this.f390966f = linkedList;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.r50();
        lVar.f152198b = new r45.s50();
        lVar.f152199c = "/cgi-bin/micromsg-bin/collectchatroom";
        lVar.f152200d = 181;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f390965e = a17;
        r45.r50 r50Var = (r45.r50) a17.f152243a.f152217a;
        r50Var.f466083e = linkedList;
        r50Var.f466082d = linkedList.size();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f390964d = u0Var;
        return mo9409x10f9447a(sVar, this.f390965e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 181;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        m48024x6b3684de(i17);
        if (v0Var.mo13821x7f35c2d1().mo150578x7f2fddf8() != 0) {
            this.f390964d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        java.util.LinkedList linkedList = this.f390966f;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = ((r45.au3) it.next()).f451794d;
                java.util.Map map = c01.v1.f119052a;
                if (str2.toLowerCase().endsWith("@groupcard")) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                    if (Bi.j0(str2)) {
                        Bi.k(str2);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "deleteWholeGroupcard RoomName not exist:[" + str2 + "]");
                    }
                    ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().y0(str2);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "deleteWholeGroupcard: room:[" + str2 + "]");
                }
            }
        }
        this.f390964d.mo815x76e0bfae(i18, i19, str, this);
    }
}
