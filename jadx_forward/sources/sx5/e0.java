package sx5;

/* loaded from: classes13.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f495258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f495259e;

    public e0(sx5.a1 a1Var, boolean z17) {
        this.f495259e = a1Var;
        this.f495258d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        sx5.a1 a1Var = this.f495259e;
        android.widget.ImageView imageView = a1Var.f495226y;
        if (imageView != null) {
            if (this.f495258d) {
                imageView.setImageResource(com.p314xaae8f345.p3222x9cba06de.R.C27874xcebc809e.f61266x15801b6d);
                a1Var.f495226y.setContentDescription(a1Var.p().getString(com.p314xaae8f345.p3222x9cba06de.R.C27876xcad56011.f61401xcb219de6));
            } else {
                imageView.setImageResource(com.p314xaae8f345.p3222x9cba06de.R.C27874xcebc809e.f61267xae1ce821);
                a1Var.f495226y.setContentDescription(a1Var.p().getString(com.p314xaae8f345.p3222x9cba06de.R.C27876xcad56011.f61402xa374b288));
            }
        }
    }
}
