package pk3;

/* loaded from: classes8.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk3.l f437983d;

    public i(pk3.l lVar) {
        this.f437983d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pk3.l lVar = this.f437983d;
        pk3.e eVar = lVar.f437991d;
        if (eVar != null) {
            if (eVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16602xcd2cf222 c16602xcd2cf222 = eVar.f437974a;
                if (c16602xcd2cf222 != null && c16602xcd2cf222.getVisibility() == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16602xcd2cf222 c16602xcd2cf2222 = eVar.f437974a;
                    if (c16602xcd2cf2222 != null && c16602xcd2cf2222.getVisibility() == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16602xcd2cf222 c16602xcd2cf2223 = eVar.f437974a;
                        java.lang.Boolean valueOf = c16602xcd2cf2223 != null ? java.lang.Boolean.valueOf(c16602xcd2cf2223.f232055u) : null;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "detachFromWindow, hide floatBallView, needTranslateAnimation: %b", valueOf);
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.TRUE)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16602xcd2cf222 c16602xcd2cf2224 = eVar.f437974a;
                            if (c16602xcd2cf2224 != null) {
                                c16602xcd2cf2224.m(new pk3.c(eVar));
                            }
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16602xcd2cf222 c16602xcd2cf2225 = eVar.f437974a;
                            if (c16602xcd2cf2225 != null) {
                                c16602xcd2cf2225.l(false, false, null);
                            }
                            eVar.a();
                        }
                    }
                } else {
                    eVar.a();
                }
            }
            lVar.f437991d = null;
        }
    }
}
