package mh2;

/* loaded from: classes3.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f407973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mh2.f1 f407974e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f407975f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(int i17, mh2.f1 f1Var, int i18) {
        super(0);
        this.f407973d = i17;
        this.f407974e = f1Var;
        this.f407975f = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f407973d;
        boolean z17 = i17 < 85 && 70 <= i17;
        int i18 = this.f407975f;
        mh2.f1 f1Var = this.f407974e;
        if (z17) {
            f1Var.f407880v = 0;
            mh2.f1.g(f1Var, mh2.p0.f407968d, i18);
        } else if (i17 >= 85) {
            int i19 = f1Var.f407880v + 1;
            f1Var.f407880v = i19;
            android.widget.TextView textView = f1Var.f407868j;
            if (i19 > 1) {
                textView.setText("x" + i19);
                textView.setVisibility(0);
                textView.setScaleX(0.2f);
                textView.setScaleY(0.2f);
                textView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(240L).start();
            } else {
                textView.setText("");
                textView.setVisibility(8);
            }
            mh2.f1.g(f1Var, mh2.p0.f407969e, i18);
        } else {
            f1Var.f407880v = 0;
        }
        return jz5.f0.f384359a;
    }
}
