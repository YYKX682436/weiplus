package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes.dex */
public class l1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f264525d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f264526e;

    public l1(java.util.List list) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.b34();
        lVar.f152198b = new r45.c34();
        lVar.f152199c = "/cgi-bin/mmux-bin/jslog";
        lVar.f152200d = 1803;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f264526e = a17;
        r45.b34 b34Var = (r45.b34) a17.f152243a.f152217a;
        r45.d44 d44Var = new r45.d44();
        d44Var.f453624d = o45.wf.f424558c;
        d44Var.f453625e = o45.wf.f424557b;
        d44Var.f453626f = o45.wf.f424560e;
        d44Var.f453627g = wo.q.f529318f;
        d44Var.f453628h = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        d44Var.f453629i = (int) (java.lang.System.currentTimeMillis() / 1000);
        b34Var.f452030d = d44Var;
        b34Var.f452031e.addAll(list);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f264525d = u0Var;
        return mo9409x10f9447a(sVar, this.f264526e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1803;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneJsLog", "onGYNetEnd, netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str);
        if (i18 == 0 && i19 == 0) {
            r45.c34 c34Var = (r45.c34) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneJsLog", "received InvalidLogList: ");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{ ");
            boolean L0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c34Var.f452787d);
            java.util.LinkedList<r45.i04> linkedList = c34Var.f452787d;
            if (L0) {
                sb6.append("{  }");
            } else {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.i04 i04Var = (r45.i04) it.next();
                    sb6.append(java.lang.String.format(" { logId(%d), interval(%d) },", java.lang.Integer.valueOf(i04Var.f458154d), java.lang.Integer.valueOf(i04Var.f458155e)));
                }
            }
            sb6.append(" }");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneJsLog", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.v0.f264666a.getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                for (r45.i04 i04Var2 : linkedList) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Ui().f264645e.c(java.lang.Integer.valueOf(i04Var2.f458154d), java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() + i04Var2.f458155e));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Ui().f264645e.a(true);
            }
        }
        this.f264525d.mo815x76e0bfae(i18, i19, str, this);
    }
}
