package sx5;

/* loaded from: classes13.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f495295d;

    public w(sx5.a1 a1Var) {
        this.f495295d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        sx5.a1 a1Var = this.f495295d;
        android.view.ViewGroup viewGroup = a1Var.f495211n;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            a1Var.f495221v.setVisibility(0);
            a1Var.f495220u.setVisibility(0);
            a1Var.y();
        }
    }
}
