package com.p314xaae8f345.mm.p950x112e8cc1;

/* loaded from: classes11.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f152776d;

    public g(com.p314xaae8f345.mm.p950x112e8cc1.C11122x575f5f47 c11122x575f5f47, java.lang.Object obj) {
        this.f152776d = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        xg3.w wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).wi();
        java.lang.String str = (java.lang.String) this.f152776d;
        com.p314xaae8f345.mm.p2621x8fb0427b.d3 d3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.d3) wi6;
        if (d3Var.n(str)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.c3 i17 = d3Var.i(str);
            mo.d dVar = i17.f69294xbf0c1c61;
            if (dVar != null) {
                dVar.f411788d.clear();
            }
            i17.f69291x16eb58cf = i17.f69293xcef36faa;
            i17.f69290xfc6f0f79 = i17.f69292xe2e39c3e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgReceiver", "[onNotifyChange] username:" + str + " ret:" + d3Var.o(i17) + " chatroomMsgSeq:" + i17.m77961x9616526c());
        }
    }
}
