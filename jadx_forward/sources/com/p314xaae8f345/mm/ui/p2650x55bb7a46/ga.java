package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class ga implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x72.b f282059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f282060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.la f282061f;

    public ga(com.p314xaae8f345.mm.ui.p2650x55bb7a46.la laVar, x72.b bVar, java.lang.Object obj) {
        this.f282061f = laVar;
        this.f282059d = bVar;
        this.f282060e = obj;
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        x72.b bVar = this.f282059d;
        if (bVar.f533968d.z0().equals(r1Var.f527062a)) {
            ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
            java.lang.String str = r1Var.f527062a;
            t21.v2 h17 = t21.d3.h(str);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = bVar.f533968d;
            if (h17 == null || !h17.i()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMsgHandle", "oreh downloadVideoAndFav fialed msgID:%d, fileName:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), str);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMsgHandle", "oreh downloadVideoAndFav suc msgID:%d, fileName:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), str);
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            t21.o2.Ui().A(this);
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.fa(this));
        }
    }
}
