package ku3;

/* loaded from: classes3.dex */
public final class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.y3 f393762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f393763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f393764f;

    public f3(ku3.y3 y3Var, int i17, int i18) {
        this.f393762d = y3Var;
        this.f393763e = i17;
        this.f393764f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ku3.y3 y3Var = this.f393762d;
        android.view.ViewGroup.LayoutParams layoutParams = y3Var.g().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        int i17 = y3Var.f394005g;
        int i18 = this.f393764f;
        int i19 = this.f393763e;
        if (i17 == 1) {
            layoutParams2.removeRule(13);
            layoutParams2.addRule(14);
            layoutParams2.addRule(10);
            layoutParams2.topMargin = i19 + ((i18 - y3Var.g().getHeight()) / 2);
            y3Var.g().setLayoutParams(layoutParams2);
            return;
        }
        if (i17 == 2) {
            layoutParams2.addRule(13);
            layoutParams2.removeRule(14);
            layoutParams2.removeRule(10);
            y3Var.g().setLayoutParams(layoutParams2);
            return;
        }
        if (i17 != 3) {
            return;
        }
        layoutParams2.removeRule(13);
        layoutParams2.removeRule(14);
        layoutParams2.addRule(12);
        layoutParams2.topMargin = i19 + ((i18 - y3Var.g().getHeight()) / 2);
        y3Var.g().setLayoutParams(layoutParams2);
    }
}
