package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132;

/* loaded from: classes15.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.p f177737a = new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.p();

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.r rVar) {
    }

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.p pVar = this.f177737a;
        pVar.f177731g = true;
        java.lang.Thread thread = pVar.f177727c;
        if (thread != null) {
            try {
                thread.join();
            } catch (java.lang.InterruptedException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.InnerSynthesizer", "stop() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
        }
        try {
            ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
            pVar.f177728d.m54555x41012807();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.InnerSynthesizer", "destroy() Exception:%s %s", th6.getClass().getSimpleName(), th6.getMessage());
        }
        pVar.f177730f = false;
    }
}
