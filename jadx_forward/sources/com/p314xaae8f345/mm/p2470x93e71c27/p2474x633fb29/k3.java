package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes4.dex */
public class k3 extends com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f270886e;

    public k3(java.lang.String str, java.util.LinkedList linkedList) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetUserInfoInApp", "appID: %s", str);
        this.f270886e = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.mq3();
        lVar.f152198b = new r45.nq3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getuserinfoinapp";
        lVar.f152200d = 452;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f270623d = a17;
        r45.mq3 mq3Var = (r45.mq3) a17.f152243a.f152217a;
        mq3Var.f462276d = str;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    linkedList2.add(x51.j1.i(str2));
                }
            }
        }
        mq3Var.f462278f = linkedList2;
        mq3Var.f462277e = linkedList != null ? linkedList.size() : 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3
    public void a(byte[] bArr) {
        if (bArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetUserInfoInApp", "buf is null");
            return;
        }
        try {
            this.f270623d.f152244b.mo13863x347f4535(bArr);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetUserInfoInApp", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetUserInfoInApp", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3
    public int b() {
        return 14;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3
    public byte[] c() {
        try {
            return ((com.p314xaae8f345.mm.p944x882e457a.m) this.f270623d.mo47979x2d63726f()).mo13852xc3d7db06();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetUserInfoInApp", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetUserInfoInApp", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetUserInfoInApp", "errType = " + i18 + ", errCode = " + i19);
        if (i18 == 0 && i19 == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetUserInfoInApp", "errType = " + i18 + ", errCode = " + i19);
    }
}
