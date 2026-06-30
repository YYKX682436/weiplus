package bg2;

/* loaded from: classes2.dex */
public final class u4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.a5 f20553d;

    public u4(bg2.a5 a5Var) {
        this.f20553d = a5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View childAt;
        bg2.a5 a5Var = this.f20553d;
        android.view.ViewGroup Z6 = a5Var.Z6();
        boolean z17 = false;
        int childCount = Z6 != null ? Z6.getChildCount() : 0;
        int i17 = 0;
        while (true) {
            if (i17 >= childCount) {
                z17 = true;
                break;
            }
            android.view.ViewGroup Z62 = a5Var.Z6();
            if ((Z62 == null || (childAt = Z62.getChildAt(i17)) == null || childAt.getVisibility() != 0) ? false : true) {
                break;
            } else {
                i17++;
            }
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i(a5Var.f19918e, "all toast view done, hide root view");
            android.view.ViewGroup Z63 = a5Var.Z6();
            if (Z63 != null) {
                Z63.removeAllViews();
            }
            a5Var.f19920g = null;
            bg2.c5 c5Var = (bg2.c5) a5Var.N6(bg2.c5.class);
            if (c5Var != null) {
                c5Var.Z6();
                c5Var.Y6();
            }
        }
    }
}
