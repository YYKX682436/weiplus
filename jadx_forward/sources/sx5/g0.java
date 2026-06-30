package sx5;

/* loaded from: classes13.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f495264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double[] f495265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f495266f;

    public g0(sx5.a1 a1Var, double d17, double[] dArr) {
        this.f495266f = a1Var;
        this.f495264d = d17;
        this.f495265e = dArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        sx5.d dVar = this.f495266f.I;
        if (dVar == null) {
            return;
        }
        dVar.getClass();
        double d17 = 0.0d;
        int i17 = 0;
        while (true) {
            double[] dArr = this.f495265e;
            if (i17 >= dArr.length) {
                android.widget.ImageView imageView = dVar.f495250d;
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams.width = (int) ((d17 / 100.0d) * dVar.f495249c.getWidth());
                imageView.setLayoutParams(layoutParams);
                imageView.requestLayout();
                return;
            }
            int i18 = i17 + 1;
            if (dArr.length > i18) {
                double d18 = dArr[i17];
                double d19 = this.f495264d;
                double d27 = (d18 / d19) * 100.0d;
                double d28 = dVar.f495255i;
                if (d27 <= d28) {
                    double d29 = (dArr[i18] / d19) * 100.0d;
                    if (d29 > d28) {
                        d17 = d29;
                    }
                }
            }
            i17 += 2;
        }
    }
}
