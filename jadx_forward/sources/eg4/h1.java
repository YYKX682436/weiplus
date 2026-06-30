package eg4;

/* loaded from: classes11.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg4.s1 f334256d;

    public h1(eg4.t1 t1Var, eg4.s1 s1Var) {
        this.f334256d = s1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        eg4.s1 s1Var = this.f334256d;
        android.text.Layout layout = s1Var.f334333i.getLayout();
        if (layout != null) {
            if (layout.getEllipsisCount(0) > 0) {
                s1Var.f334334j.setVisibility(0);
            } else {
                s1Var.f334334j.setVisibility(8);
            }
        }
    }
}
