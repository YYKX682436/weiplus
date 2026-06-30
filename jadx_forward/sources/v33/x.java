package v33;

/* loaded from: classes2.dex */
public class x extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f514690d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f514691e;

    public x(java.lang.String str, int i17, long j17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15831xc91bf7e8();
        lVar.f152198b = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15832x5d8aba08();
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/userconfirmstatus";
        lVar.f152200d = 4530;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f514691e = a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15831xc91bf7e8 c15831xc91bf7e8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15831xc91bf7e8) a17.f152243a.f152217a;
        c15831xc91bf7e8.f36895x3923b317 = str;
        c15831xc91bf7e8.f36896x44bfce51 = i17;
        c15831xc91bf7e8.f36897xb084bcef = j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CgiUserConfirmStatus", "chatRoomName:%s, status:%d, id:%d", str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f514690d = u0Var;
        return mo9409x10f9447a(sVar, this.f514691e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4530;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CgiUserConfirmStatus", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15831xc91bf7e8 c15831xc91bf7e8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15831xc91bf7e8) this.f514691e.f152243a.f152217a;
            if (c15831xc91bf7e8.f36896x44bfce51 == 1) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5238x93162a6b c5238x93162a6b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5238x93162a6b();
                am.c2 c2Var = c5238x93162a6b.f135571g;
                c2Var.f87835a = 2;
                c2Var.f87836b = c15831xc91bf7e8.f36895x3923b317;
                c5238x93162a6b.e();
            }
        }
        this.f514690d.mo815x76e0bfae(i18, i19, str, this);
    }
}
