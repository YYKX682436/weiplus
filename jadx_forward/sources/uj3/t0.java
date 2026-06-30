package uj3;

/* loaded from: classes14.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.v0 f509883d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(uj3.v0 v0Var) {
        super(1);
        this.f509883d = v0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yj3.g it = (yj3.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.view.Surface surface = it.f544216i;
        uj3.v0 v0Var = this.f509883d;
        if (surface != null) {
            v0Var.m168138x599e34a6(surface);
        }
        it.f544215h = new uj3.s0(v0Var, it);
        return jz5.f0.f384359a;
    }
}
