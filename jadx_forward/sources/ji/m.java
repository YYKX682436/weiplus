package ji;

/* loaded from: classes12.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ji.o f381425d;

    public m(ji.o oVar) {
        this.f381425d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        ji.o oVar = this.f381425d;
        oVar.getClass();
        com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403 b17 = com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403.f134628p.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        c0Var.f391645d = false;
        ji.p pVar = oVar.f381429c;
        ji.q qVar = pVar.f381430a;
        com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4719xe988d781 c4719xe988d781 = b17.f134632g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4719xe988d781);
        jz5.l lVar = new jz5.l("java", java.lang.Boolean.valueOf(qVar.a(c4719xe988d781.f134624f, new ji.i(b17, c0Var))));
        com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4721x2f1a0bec c4721x2f1a0bec = b17.f134633h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4721x2f1a0bec);
        jz5.l lVar2 = new jz5.l("native", java.lang.Boolean.valueOf(pVar.f381431b.a(c4721x2f1a0bec.f134640f, new ji.j(b17, c0Var))));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17.f134636n);
        jz5.l lVar3 = new jz5.l("debugPss", java.lang.Boolean.valueOf(pVar.f381432c.a(r4.f134647d, new ji.k(b17, c0Var))));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17.f134635m);
        jz5.l[] lVarArr = {lVar, lVar2, lVar3, new jz5.l("amsPss", java.lang.Boolean.valueOf(pVar.f381433d.a(r4.f134647d, new ji.l(b17, c0Var))))};
        for (int i17 = 0; i17 < 4; i17++) {
            oj.j.c("Matrix.monitor.BackgroundMemoryMonitor", "is over threshold ? " + lVarArr[i17], new java.lang.Object[0]);
        }
        int i18 = 0;
        while (true) {
            if (i18 >= 4) {
                z17 = false;
                break;
            } else {
                if (((java.lang.Boolean) lVarArr[i18].f384367e).booleanValue()) {
                    z17 = true;
                    break;
                }
                i18++;
            }
        }
        oj.j.c("Matrix.monitor.BackgroundMemoryMonitor", "check: overThreshold: " + z17 + ", shouldCallback: " + c0Var.f391645d + ' ' + b17, new java.lang.Object[0]);
        if (z17 && c0Var.f391645d) {
            oj.j.c("Matrix.monitor.BackgroundMemoryMonitor", "report over threshold", new java.lang.Object[0]);
            pVar.f381437h.mo146xb9724478(b17);
        }
    }
}
