package bb2;

/* loaded from: classes5.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.q0 f19077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(bb2.q0 q0Var) {
        super(0);
        this.f19077d = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bb2.q0 q0Var = this.f19077d;
        if (q0Var.f18951d.getParent() != null) {
            android.view.View view = q0Var.f18951d;
            if (view.getParent() instanceof android.view.ViewGroup) {
                q0Var.f();
                android.view.ViewParent parent = view.getParent();
                kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent).removeView(view);
            }
        }
        return jz5.f0.f302826a;
    }
}
