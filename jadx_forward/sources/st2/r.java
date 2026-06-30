package st2;

/* loaded from: classes3.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f493964d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(st2.h1 h1Var) {
        super(0);
        this.f493964d = h1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        st2.h1 h1Var = this.f493964d;
        java.util.Iterator it = ((java.util.ArrayList) h1Var.f493887y0).iterator();
        while (true) {
            if (!it.hasNext()) {
                h1Var.W = null;
                return jz5.f0.f384359a;
            }
            android.view.View view = (android.view.View) it.next();
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            ((java.util.ArrayList) h1Var.f493887y0).remove(view);
        }
    }
}
