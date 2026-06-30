package lx;

/* loaded from: classes11.dex */
public final class p2 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx.v2 f403436d;

    public p2(lx.v2 v2Var) {
        this.f403436d = v2Var;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        java.lang.Object obj;
        if (w0Var == null || (obj = w0Var.f398509d) == null) {
            return;
        }
        hr1.a aVar = obj instanceof hr1.a ? (hr1.a) obj : null;
        if (aVar == null) {
            return;
        }
        lx.v2 v2Var = this.f403436d;
        v2Var.f403514g.post(new lx.o2(aVar, v2Var));
    }
}
