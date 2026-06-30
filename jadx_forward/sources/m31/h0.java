package m31;

/* loaded from: classes3.dex */
public final class h0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m31.p1 f404681d;

    public h0(m31.p1 p1Var) {
        this.f404681d = p1Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m31.p1 p1Var = this.f404681d;
        android.view.ViewParent parent = p1Var.f404716g.getParent();
        if (parent != null) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            android.content.Context context = p1Var.f404713d;
            java.lang.Object systemService = context.getSystemService("window");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            int rotation = ((android.view.WindowManager) systemService).getDefaultDisplay().getRotation();
            android.view.View view = p1Var.f404716g;
            if (rotation == 1 || rotation == 3) {
                if (view.getLayoutParams().height != -2) {
                    view.getLayoutParams().height = -2;
                    view.requestLayout();
                    return;
                }
                return;
            }
            int k17 = (i65.a.k(context) * 3) / 4;
            boolean z17 = view.getHeight() > k17;
            p1Var.K = z17;
            if (z17) {
                android.content.Context context2 = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                p1Var.b(context2);
                view.getLayoutParams().height = java.lang.Math.min(k17, view.getHeight());
                view.requestLayout();
            }
        }
    }
}
