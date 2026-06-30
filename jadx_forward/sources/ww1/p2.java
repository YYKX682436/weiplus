package ww1;

/* loaded from: classes15.dex */
public class p2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.q2 f531802d;

    public p2(ww1.q2 q2Var) {
        this.f531802d = q2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ww1.q2 q2Var = this.f531802d;
        android.view.ViewGroup.LayoutParams layoutParams = q2Var.f531804d.O.getLayoutParams();
        layoutParams.height = q2Var.f531804d.f531670i.getHeight();
        q2Var.f531804d.O.setLayoutParams(layoutParams);
    }
}
