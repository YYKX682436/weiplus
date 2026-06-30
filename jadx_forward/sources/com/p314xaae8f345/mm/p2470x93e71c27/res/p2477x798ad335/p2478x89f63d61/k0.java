package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61;

/* loaded from: classes9.dex */
public class k0 extends com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.m0 implements com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.j0 {
    public k0(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.NetSceneCheckResUpdate", "NetSceneCheckResUpdate init, resType:%d", java.lang.Integer.valueOf(i17));
        r45.fs5 fs5Var = new r45.fs5();
        fs5Var.f456124d = i17;
        ((java.util.LinkedList) this.f271157e).clear();
        ((java.util.LinkedList) this.f271157e).add(fs5Var);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.m0
    public com.p314xaae8f345.mm.p971x6de15a2e.v0 H() {
        boolean m40092xb9aa8b5f;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.c20 c20Var = new r45.c20();
        c20Var.f452771d.addAll(this.f271157e);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!r75.d.f474792f) {
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context);
        } else if (r75.d.f474790d == -100) {
            int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(context);
            r75.d.f474790d = m40067xab9ed241;
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(m40067xab9ed241);
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(r75.d.f474790d);
        }
        if (m40092xb9aa8b5f) {
            c20Var.f452772e = 1;
        } else {
            c20Var.f452772e = 2;
        }
        lVar.f152197a = c20Var;
        lVar.f152198b = new r45.d20();
        lVar.f152199c = "/cgi-bin/micromsg-bin/checkresupdate";
        lVar.f152200d = 721;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        return lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.m0
    public java.lang.String I() {
        return "MicroMsg.ResDownloader.CheckResUpdate.NetSceneCheckResUpdate";
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.m0
    public r45.d20 J(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return (r45.d20) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 721;
    }

    public k0(java.util.List list) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdate.NetSceneCheckResUpdate", "NetSceneCheckResUpdate init, resType:%s", list.toString());
        ((java.util.LinkedList) this.f271157e).clear();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            r45.fs5 fs5Var = new r45.fs5();
            fs5Var.f456124d = num.intValue();
            ((java.util.LinkedList) this.f271157e).add(fs5Var);
        }
    }
}
