package ix3;

/* loaded from: classes10.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.i f376961d;

    public h(ix3.i iVar) {
        this.f376961d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ix3.i iVar = this.f376961d;
        long j17 = iVar.f376974e;
        long j18 = iVar.f376976g;
        java.lang.StackTraceElement[] stackTrace = iVar.f376972c.getStackTrace();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTrace, "getStackTrace(...)");
        ix3.c cVar = new ix3.c(j17, j18, stackTrace);
        ix3.f fVar = ix3.i.f376967j;
        fVar.a().add(cVar);
        com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI repairerBlockDetectUI = iVar.f376975f;
        if (repairerBlockDetectUI != null) {
            ix3.g0 g0Var = new ix3.g0(fVar.a().size() + 1, cVar);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 b17 = repairerBlockDetectUI.U6().b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getRecyclerView(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(b17);
            if (a17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.q(a17, g0Var, false, 2, null);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Repairer.BlockDetect", "dumpMainThreadStack");
    }
}
