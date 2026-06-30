package bt3;

/* loaded from: classes9.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bt3.l0 f105888d;

    public n0(bt3.l0 l0Var) {
        this.f105888d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        bt3.l0 l0Var = this.f105888d;
        com.p314xaae8f345.mm.p944x882e457a.v0 v0Var = l0Var.f105847f;
        if (v0Var != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = l0Var.f105848g;
            v0Var.S(dVar.f68109x90a9378, dVar.f68113xeb1a61d6, l0Var);
        }
    }
}
