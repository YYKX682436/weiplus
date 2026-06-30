package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class hl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f280705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f280706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21672x160faeea f280708g;

    public hl(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21672x160faeea c21672x160faeea, int i17, int i18, java.lang.String str) {
        this.f280708g = c21672x160faeea;
        this.f280705d = i17;
        this.f280706e = i18;
        this.f280707f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        int i17 = this.f280705d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i18 = this.f280706e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr SilenceNotifyEvent in chatting lastSeq[%d], undeliverCount[%d]", valueOf, java.lang.Integer.valueOf(i18));
        long j18 = i17;
        long j19 = i18;
        long V5 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().V5(this.f280707f);
        if (V5 <= 0 || V5 >= j18) {
            j17 = j18;
        } else {
            j19 = (V5 - V5) - 1;
            j17 = V5;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr SilenceNotifyEvent in chatting down [%d, %d, %d, %d]", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(V5), java.lang.Long.valueOf(j19 > 0 ? j19 : 1L));
        this.f280708g.f280100d.getClass();
    }
}
