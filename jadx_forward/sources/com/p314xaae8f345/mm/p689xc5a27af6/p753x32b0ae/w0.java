package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes7.dex */
public class w0 implements java.lang.Runnable {
    public w0(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.DynamicLibraryCheckService", "check dynamic library");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.e1.f225456d;
        for (int i17 = 0; i17 < 2; i17++) {
            java.lang.String str = strArr[i17];
            if (((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui("ilinkres_6d71aa8c", str) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.DynamicLibraryCheckService", "need download library: %s", str);
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.DynamicLibraryCheckService", "all dynamic libraries are exist.");
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
        qVar.c("ilinkres_6d71aa8c");
        qVar.f299081e.addAll(arrayList);
        qVar.f299083g[2] = true;
        ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Di(qVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d1());
        ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Bi(qVar);
    }
}
