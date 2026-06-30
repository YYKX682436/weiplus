package jh;

/* loaded from: classes13.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jh.g0 f381203d;

    public b0(jh.g0 g0Var) {
        this.f381203d = g0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        jh.g0 g0Var = this.f381203d;
        if (g0Var.f381238a && g0Var.f381239b) {
            jh.m mVar = g0Var.f381241d;
            if (jh.a0.l(mVar.f381263f.f381206a).exists()) {
                jh.t tVar = mVar.f381262e;
                tVar.f381288f.post(new jh.q(tVar, jh.s.RequestConsuming));
            }
        }
        jh.g0 g0Var2 = this.f381203d;
        g0Var2.f381243f = false;
        g0Var2.f381243f = false;
        g0Var2.f381242e.postDelayed(new jh.b0(g0Var2), 21600000L);
    }
}
