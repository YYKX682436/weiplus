package tn0;

/* loaded from: classes3.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.j1 f502191d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(tn0.j1 j1Var) {
        super(1);
        this.f502191d = j1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        go0.v0 it = (go0.v0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.view.Surface surface = it.f355417k;
        tn0.j1 j1Var = this.f502191d;
        if (surface != null) {
            j1Var.f502234d = surface;
        }
        it.f355416j = new tn0.b1(it, j1Var);
        return jz5.f0.f384359a;
    }
}
