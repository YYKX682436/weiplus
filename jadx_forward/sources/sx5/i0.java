package sx5;

/* loaded from: classes13.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f495273d;

    public i0(sx5.a1 a1Var) {
        this.f495273d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.ViewGroup viewGroup = this.f495273d.f495211n;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }
}
