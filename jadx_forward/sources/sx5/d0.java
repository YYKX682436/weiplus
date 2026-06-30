package sx5;

/* loaded from: classes13.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f495256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f495257e;

    public d0(sx5.a1 a1Var, boolean z17) {
        this.f495257e = a1Var;
        this.f495256d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        sx5.a1 a1Var = this.f495257e;
        android.widget.ImageView imageView = a1Var.A;
        if (imageView != null) {
            if (this.f495256d) {
                imageView.setImageResource(com.p314xaae8f345.p3222x9cba06de.R.C27874xcebc809e.f61271x2991b23b);
                a1Var.A.setContentDescription(a1Var.p().getString(com.p314xaae8f345.p3222x9cba06de.R.C27876xcad56011.f61404x55c30551));
            } else {
                imageView.setImageResource(com.p314xaae8f345.p3222x9cba06de.R.C27874xcebc809e.f61270x89fdfcf);
                a1Var.A.setContentDescription(a1Var.p().getString(com.p314xaae8f345.p3222x9cba06de.R.C27876xcad56011.f61403x6298ef79));
            }
        }
    }
}
