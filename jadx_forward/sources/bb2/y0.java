package bb2;

/* loaded from: classes5.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.q0 f100610d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(bb2.q0 q0Var) {
        super(0);
        this.f100610d = q0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bb2.q0 q0Var = this.f100610d;
        if (q0Var.f100484d.getParent() != null) {
            android.view.View view = q0Var.f100484d;
            if (view.getParent() instanceof android.view.ViewGroup) {
                q0Var.f();
                android.view.ViewParent parent = view.getParent();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent).removeView(view);
            }
        }
        return jz5.f0.f384359a;
    }
}
