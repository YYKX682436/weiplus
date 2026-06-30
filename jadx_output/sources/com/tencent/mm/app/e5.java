package com.tencent.mm.app;

/* loaded from: classes13.dex */
public class e5 extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f53405d;

    /* renamed from: e, reason: collision with root package name */
    public static int f53406e;

    /* renamed from: f, reason: collision with root package name */
    public static int f53407f;

    public e5() {
        super(0);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            f53406e = 2;
            f53407f = 12;
        } else if (com.tencent.mm.sdk.platformtools.x2.s()) {
            f53406e = 22;
            f53407f = 32;
        } else if (com.tencent.mm.sdk.platformtools.x2.j()) {
            f53406e = 42;
            f53407f = 52;
        }
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.MediaLeakEvent mediaLeakEvent = (com.tencent.mm.autogen.events.MediaLeakEvent) iEvent;
        if (mediaLeakEvent == null) {
            return false;
        }
        am.pj pjVar = mediaLeakEvent.f54492g;
        com.tencent.mars.xlog.Log.w("MicroMsg.MediaLeakReporter", "event audio[%b %d] mediaplayer[%b %d] audioRecord[%b %d] hadRpt[%b]", java.lang.Boolean.valueOf(pjVar.f7622a), java.lang.Integer.valueOf(pjVar.f7623b), java.lang.Boolean.valueOf(pjVar.f7624c), java.lang.Integer.valueOf(pjVar.f7625d), java.lang.Boolean.valueOf(pjVar.f7626e), java.lang.Integer.valueOf(pjVar.f7627f), java.lang.Boolean.valueOf(f53405d));
        if (pjVar.f7622a) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(650L, f53406e, 1L, false);
        }
        if (pjVar.f7624c) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(650L, f53407f, 1L, false);
        }
        if (pjVar.f7626e) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(650L, f53407f + 1, 1L, false);
        }
        if (f53405d) {
            return false;
        }
        if (pjVar.f7623b <= 10 && pjVar.f7625d <= 10 && pjVar.f7627f < 1) {
            return false;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.i("mediaLeak", to.f.b(), null);
        f53405d = true;
        return false;
    }
}
