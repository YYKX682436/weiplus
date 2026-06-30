package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes4.dex */
public class x3 extends com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f270673e;

    public x3(java.util.List list) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.x93();
        lVar.f152198b = new r45.y93();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getappsetting";
        lVar.f152200d = zd.d.f77569x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f270623d = lVar.a();
        this.f270673e = list;
        list.size();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (str != null && str.length() > 0) {
                r45.aa aaVar = new r45.aa();
                aaVar.f451395d = str;
                linkedList.add(aaVar);
            }
        }
        if (linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetAppSetting", "doScene fail, reqList is empty");
        }
        r45.x93 x93Var = (r45.x93) this.f270623d.f152243a.f152217a;
        x93Var.f471427e = linkedList;
        x93Var.f471426d = linkedList.size();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3
    public void a(byte[] bArr) {
        if (bArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetAppSetting", "buf is null");
            return;
        }
        try {
            this.f270623d.f152244b.mo13863x347f4535(bArr);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetAppSetting", "bufToResp error: " + e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetAppSetting", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3
    public int b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3
    public byte[] c() {
        try {
            return ((com.p314xaae8f345.mm.p944x882e457a.m) this.f270623d.mo47979x2d63726f()).mo13852xc3d7db06();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetAppSetting", "toProtBuf error: " + e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetAppSetting", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetAppSetting", "onGYNetEnd, errType = " + i18 + ", errCode = " + i19);
            return;
        }
        r45.y93 y93Var = (r45.y93) this.f270623d.f152244b.f152233a;
        int i27 = y93Var.f472417d;
        java.util.LinkedList linkedList = y93Var.f472418e;
        if (linkedList == null || linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetAppSetting", "onGYNetEnd, settingList is empty");
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z Ri = zo3.p.Ri();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.z9 z9Var = (r45.z9) it.next();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(z9Var.f473325d, false, false);
            if (j17 != null) {
                j17.f67381x731b46d9 = z9Var.f473326e;
                j17.f67384x996f3ea = z9Var.f473327f;
                Ri.mo9952xce0038c9(j17, new java.lang.String[0]);
            }
        }
    }
}
