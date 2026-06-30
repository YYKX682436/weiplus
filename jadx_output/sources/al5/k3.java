package al5;

/* loaded from: classes15.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al5.l3 f5940d;

    public k3(al5.l3 l3Var) {
        this.f5940d = l3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        al5.l3 l3Var = this.f5940d;
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = l3Var.f5946a.f5955e.f5968d;
        if (swipeBackLayout.I != null) {
            if (swipeBackLayout.getContext() instanceof android.app.Activity) {
                com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout2 = l3Var.f5946a.f5955e.f5968d;
                if (swipeBackLayout2.f211445z != null) {
                    if (swipeBackLayout2.H) {
                        ((android.app.Activity) swipeBackLayout2.getContext()).getWindow().getDecorView().setBackground(l3Var.f5946a.f5955e.f5968d.f211445z);
                    }
                    l3Var.f5946a.f5955e.f5968d.f211445z = null;
                }
            }
            l3Var.f5946a.f5955e.f5968d.I.onSwipeBack();
        }
        l3Var.f5946a.f5955e.f5968d.e(1.0f);
        l3Var.f5946a.f5955e.f5968d.f211441v = false;
    }
}
