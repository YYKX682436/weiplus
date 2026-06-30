package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes4.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.dv3 f221847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.h f221848e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.h hVar, r45.dv3 dv3Var) {
        this.f221848e = hVar;
        this.f221847d = dv3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f221848e.f221855d;
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.l.f221888a;
        r45.dv3 dv3Var = this.f221847d;
        if (dv3Var == null) {
            return;
        }
        java.util.LinkedList linkedList = dv3Var.f454303d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCommOpertionProcessor", "menu list is null. appid:%s", str);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(linkedList);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.l.a(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.i(str, dv3Var));
    }
}
