package cj5;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.a0 f42277d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(cj5.a0 a0Var) {
        super(1);
        this.f42277d = a0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        if (((wi5.e) state.a(wi5.e.class)) != null) {
            state.f446314g |= 64;
        }
        if (((wi5.b) state.a(wi5.b.class)) != null) {
            state.f446314g &= -65;
            state.f446319o.clear();
            androidx.appcompat.app.AppCompatActivity activity = this.f42277d.getActivity();
            com.tencent.mm.ui.vas.VASActivity vASActivity = activity instanceof com.tencent.mm.ui.vas.VASActivity ? (com.tencent.mm.ui.vas.VASActivity) activity : null;
            if (vASActivity != null && (swipeBackLayout = vASActivity.getSwipeBackLayout()) != null) {
                swipeBackLayout.setEnableGesture(true);
            }
        }
        return jz5.f0.f302826a;
    }
}
