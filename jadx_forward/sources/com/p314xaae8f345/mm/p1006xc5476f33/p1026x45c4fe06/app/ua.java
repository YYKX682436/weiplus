package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public class ua implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.wa f156836d;

    public ua(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.wa waVar) {
        this.f156836d = waVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatMultiProcessInitDelegateImpl", "<init> %s", bm5.f1.a());
        nf.x.f418149b = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.r3.f172077a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.sa saVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.sa(this);
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.d0.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.d0.f167336a = saVar;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s() || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.m48891xd8decb1f() || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.m48892xf615276a()) {
            this.f156836d.f156867b = new yg1.a();
        } else {
            this.f156836d.f156867b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.ta(this);
        }
    }
}
