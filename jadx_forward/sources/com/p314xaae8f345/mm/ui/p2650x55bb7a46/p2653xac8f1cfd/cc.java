package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class cc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gc f280419e;

    public cc(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gc gcVar, java.lang.String str) {
        this.f280419e = gcVar;
        this.f280418d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f280419e.f280630g = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(this.f280418d);
        if (this.f280419e.f280630g == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomComponent", "[onChattingInit] cost:%sms talker:%s createTime:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), this.f280418d, java.lang.Long.valueOf(this.f280419e.f280630g.mo78012x3fdd41df()));
    }
}
