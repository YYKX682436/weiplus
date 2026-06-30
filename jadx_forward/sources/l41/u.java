package l41;

/* loaded from: classes5.dex */
public class u extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f397464d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f397465e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f397466f;

    public u(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.vj3();
        lVar.f152198b = new r45.wj3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getopenimchatroomcontact";
        lVar.f152200d = 407;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f397465e = a17;
        this.f397466f = str;
        ((r45.vj3) a17.f152243a.f152217a).f469842d = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneGetOpenIMChatRoomContact", "get roomname:%s", str);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f397464d = u0Var;
        return mo9409x10f9447a(sVar, this.f397465e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 407;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.uz4 uz4Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneGetOpenIMChatRoomContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, this.f397466f);
        if (i18 == 0 && i19 == 0 && (uz4Var = ((r45.wj3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a).f470754d) != null) {
            int i27 = uz4Var.f469290e;
            t41.c.c(uz4Var, i27, i27);
            try {
                boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(uz4Var.f469289d) != null;
                rv1.e eVar = (rv1.e) i95.n0.c(rv1.e.class);
                java.lang.String str2 = uz4Var.f469289d;
                ((c01.w1) eVar).getClass();
                boolean A = c01.v1.A(str2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenIMChatRoomContactLogic", "updateChatroomContactByGetRoomContact chatroom:%s isExistConversation:%s isNeedUpdateChatRoomInfo:%s", uz4Var.f469289d, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(A));
                if (z17 && A) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5592xbb1d2e52 c5592xbb1d2e52 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5592xbb1d2e52();
                    c5592xbb1d2e52.f135916g.f88680a = uz4Var.f469289d;
                    c5592xbb1d2e52.e();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("OpenIMChatRoomContactLogic", "updateChatroomContactByGetRoomContact chatroom:%s, exception:%s %s", uz4Var.f469289d, e17.getClass().getSimpleName(), e17.getMessage());
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f397464d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
