package r01;

/* loaded from: classes11.dex */
public class p3 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r01.q3 f449717a;

    public p3(r01.q3 q3Var) {
        this.f449717a = q3Var;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBiz", "onEnterForeground");
        r01.q3 q3Var = this.f449717a;
        if (q3Var.A.booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBiz", "onEnterForeground check me tab and fetch biz status");
            ox.g gVar = (ox.g) ((tk.o) i95.n0.c(tk.o.class));
            gVar.getClass();
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.y0.f300325a = ox.e.f430995a;
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.y0.f300326b = ox.f.f431001a;
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.l0.f299291c.e(gVar.fj(), gVar.mj(), new ox.b(gVar));
            ((r01.l1) i95.n0.c(r01.l1.class)).cj();
        }
        q3Var.A = java.lang.Boolean.TRUE;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
        zg0.y2 y2Var = (zg0.y2) i95.n0.c(zg0.y2.class);
        if (y2Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MpScreenshotCleanupService", "onProcessExitForeground: dispatched");
            ((ku5.t0) ku5.t0.f394148d).B(new zx4.f((zx4.g) y2Var));
        }
    }
}
