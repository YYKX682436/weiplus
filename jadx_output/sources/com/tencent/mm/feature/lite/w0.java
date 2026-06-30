package com.tencent.mm.feature.lite;

/* loaded from: classes7.dex */
public class w0 implements java.lang.Runnable {
    public w0(com.tencent.mm.feature.lite.i iVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.DynamicLibraryCheckService", "check dynamic library");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] strArr = com.tencent.mm.plugin.lite.logic.e1.f143923d;
        for (int i17 = 0; i17 < 2; i17++) {
            java.lang.String str = strArr[i17];
            if (((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_6d71aa8c", str) == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.DynamicLibraryCheckService", "need download library: %s", str);
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.DynamicLibraryCheckService", "all dynamic libraries are exist.");
            return;
        }
        com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
        qVar.c("ilinkres_6d71aa8c");
        qVar.f217548e.addAll(arrayList);
        qVar.f217550g[2] = true;
        ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Di(qVar, new com.tencent.mm.plugin.lite.logic.d1());
        ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Bi(qVar);
    }
}
