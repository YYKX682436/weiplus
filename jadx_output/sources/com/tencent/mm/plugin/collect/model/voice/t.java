package com.tencent.mm.plugin.collect.model.voice;

/* loaded from: classes15.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.collect.model.voice.p f96204a = new com.tencent.mm.plugin.collect.model.voice.p();

    public t(com.tencent.mm.plugin.collect.model.voice.r rVar) {
    }

    public void a() {
        com.tencent.mm.plugin.collect.model.voice.p pVar = this.f96204a;
        pVar.f96198g = true;
        java.lang.Thread thread = pVar.f96194c;
        if (thread != null) {
            try {
                thread.join();
            } catch (java.lang.InterruptedException e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.InnerSynthesizer", "stop() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
        }
        try {
            ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
            pVar.f96195d.release();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.InnerSynthesizer", "destroy() Exception:%s %s", th6.getClass().getSimpleName(), th6.getMessage());
        }
        pVar.f96197f = false;
    }
}
