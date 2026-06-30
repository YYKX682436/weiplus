package al5;

/* loaded from: classes15.dex */
public class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al5.n3 f5927d;

    public i3(al5.n3 n3Var) {
        this.f5927d = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        al5.n3 n3Var = this.f5927d;
        if (n3Var.f5968d.I != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SwipeBackLayout", "ashutest:: on popOut");
            if (n3Var.f5968d.getContext() instanceof android.app.Activity) {
                com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = n3Var.f5968d;
                if (swipeBackLayout.f211445z != null) {
                    if (swipeBackLayout.H) {
                        ((android.app.Activity) swipeBackLayout.getContext()).getWindow().getDecorView().setBackground(n3Var.f5968d.f211445z);
                    }
                    n3Var.f5968d.f211445z = null;
                }
            }
            n3Var.f5968d.I.onSwipeBack();
        }
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout2 = n3Var.f5968d;
        swipeBackLayout2.f211441v = false;
        swipeBackLayout2.F = false;
    }
}
