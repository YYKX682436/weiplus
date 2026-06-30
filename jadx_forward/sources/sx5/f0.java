package sx5;

/* loaded from: classes13.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f495261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f495262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f495263f;

    public f0(sx5.a1 a1Var, boolean z17, double d17) {
        this.f495263f = a1Var;
        this.f495261d = z17;
        this.f495262e = d17;
    }

    @Override // java.lang.Runnable
    public void run() {
        sx5.a1 a1Var = this.f495263f;
        sx5.d dVar = a1Var.I;
        double d17 = this.f495262e;
        if (dVar != null && this.f495261d) {
            double d18 = a1Var.N;
            if (d18 != 0.0d) {
                dVar.a((float) ((100.0d * d17) / d18), false);
            }
        }
        android.widget.TextView textView = a1Var.f495217r;
        if (textView != null) {
            textView.setText(a1Var.q(d17, a1Var.N));
        }
        android.widget.TextView textView2 = a1Var.f495218s;
        if (textView2 != null) {
            double d19 = a1Var.N;
            textView2.setText(a1Var.q(d19, d19));
        }
    }
}
