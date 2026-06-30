package g63;

/* loaded from: classes8.dex */
public final class a0 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.f0 f350625d;

    public a0(g63.f0 f0Var) {
        this.f350625d = f0Var;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public final void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        java.lang.Object obj = w0Var.f398509d;
        if (obj instanceof z53.i) {
            int i17 = w0Var.f398507b;
            z53.n nVar = z53.o.f551794a;
            g63.f0 f0Var = this.f350625d;
            if (i17 == 1 || i17 == 2) {
                nVar.b((z53.i) obj, new g63.x(f0Var));
            } else if (i17 == 3) {
                g63.j jVar = f0Var.f350640b;
                z53.i conversation = (z53.i) obj;
                jVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conversation, "conversation");
                pm0.v.X(new g63.e(jVar, conversation));
                pm0.v.X(new g63.t(f0Var));
            } else if (i17 == 4 || i17 == 5) {
                nVar.b((z53.i) obj, new g63.y(f0Var));
            } else if (i17 == 8) {
                nVar.c(0, f0Var.f350640b.x(), new g63.z(f0Var));
            }
            java.util.Objects.toString(w0Var.f398509d);
        }
    }
}
