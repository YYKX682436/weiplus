package bt3;

/* loaded from: classes9.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bt3.l0 f105878d;

    public m0(bt3.l0 l0Var) {
        this.f105878d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar;
        bt3.l0 l0Var = this.f105878d;
        com.p314xaae8f345.mm.p944x882e457a.v0 v0Var = l0Var.f105847f;
        if (v0Var == null || (dVar = l0Var.f105848g) == null) {
            return;
        }
        v0Var.S(dVar.f68109x90a9378, dVar.f68113xeb1a61d6, l0Var);
    }
}
