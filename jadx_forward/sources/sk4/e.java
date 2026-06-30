package sk4;

/* loaded from: classes15.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sk4.p f490505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f490506e;

    public e(sk4.p pVar, yz5.l lVar) {
        this.f490505d = pVar;
        this.f490506e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jm4.q4.a(jm4.r4.f381954a, "RecordStart", false, 0L, null, 14, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start, ");
        sk4.p pVar = this.f490505d;
        sb6.append(pVar.f490527i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioRecorderImpl", sb6.toString());
        tl.w wVar = new tl.w(pVar.f490522d, pVar.f490523e, pVar.f490524f);
        wVar.f501705y = pVar.f490531p;
        pVar.f490532q = wVar;
        if (pVar.f490533r == 0) {
            tl.w wVar2 = pVar.f490532q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar2);
            pVar.f490533r = (((wVar2.f501687g * wVar2.f501688h) * wVar2.f501686f) / 1000) * 2;
        }
        boolean z17 = pVar.f490527i;
        yz5.l lVar = this.f490506e;
        if (!z17) {
            tl.w wVar3 = pVar.f490532q;
            if (!((wVar3 == null || wVar3.k()) ? false : true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioRecorderImpl", "started");
                java.util.Iterator it = pVar.f490529n.iterator();
                while (it.hasNext()) {
                    jm4.y0 y0Var = (jm4.y0) ((com.p314xaae8f345.p3118xeeebfacc.C26845xac206036) it.next()).m106052x32c52b();
                    if (y0Var != null) {
                        y0Var.n1();
                    }
                }
                pVar.f490526h = false;
                pVar.f490527i = true;
                pVar.f490528m = 0L;
                pVar.f490525g = false;
                if (lVar != null) {
                    lVar.mo146xb9724478("");
                    return;
                }
                return;
            }
        }
        if (lVar != null) {
            lVar.mo146xb9724478("isRunning or MMPcmRecorder start error");
        }
    }
}
