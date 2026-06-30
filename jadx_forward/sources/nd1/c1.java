package nd1;

/* loaded from: classes7.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f417808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417809e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f417810f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f417811g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f417812h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417813i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ nd1.d1 f417814m;

    public c1(nd1.d1 d1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, int i18, int i19, int i27, java.lang.String str) {
        this.f417814m = d1Var;
        this.f417808d = yVar;
        this.f417809e = i17;
        this.f417810f = i18;
        this.f417811g = i19;
        this.f417812h = i27;
        this.f417813i = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f417808d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gg.a(yVar);
        if (a17 == null) {
            yVar.a(this.f417809e, this.f417814m.o("fail:page don't exist"));
            return;
        }
        if (a17.mo50262x39e05d35()) {
            boolean P0 = a17.t3().P0();
            int i17 = this.f417811g;
            int i18 = this.f417810f;
            if (P0) {
                android.view.View findViewById = a17.t3().x0().getRootView().findViewById(com.p314xaae8f345.mm.R.id.w_);
                if (findViewById != null) {
                    findViewById.setBackgroundColor(i18);
                    a17.c3(i17);
                    return;
                }
                return;
            }
            if (!a17.g2() || a17.n2()) {
                a17.f1();
                int i19 = this.f417812h;
                if (i19 <= 0) {
                    a17.c3(i17);
                    a17.Z2(i18);
                    return;
                }
                int f87324d = a17.r1().getF87324d();
                int m2211xbe2bf9aa = a17.r1().m2211xbe2bf9aa();
                java.lang.String str = this.f417813i;
                android.animation.TimeInterpolator linearInterpolator = "linear".equals(str) ? new android.view.animation.LinearInterpolator() : "easeIn".equals(str) ? new android.view.animation.AccelerateInterpolator() : "easeOut".equals(str) ? new android.view.animation.DecelerateInterpolator() : "easeInOut".equals(str) ? new android.view.animation.AccelerateDecelerateInterpolator() : null;
                android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
                valueAnimator.setIntValues(f87324d, i18);
                valueAnimator.setEvaluator(new android.animation.ArgbEvaluator());
                valueAnimator.setDuration(i19);
                valueAnimator.setInterpolator(linearInterpolator);
                valueAnimator.addUpdateListener(new nd1.a1(this, a17));
                android.animation.ValueAnimator valueAnimator2 = new android.animation.ValueAnimator();
                valueAnimator2.setIntValues(m2211xbe2bf9aa, i17);
                valueAnimator2.setEvaluator(new android.animation.ArgbEvaluator());
                valueAnimator2.setDuration(i19);
                valueAnimator2.setInterpolator(linearInterpolator);
                valueAnimator2.addUpdateListener(new nd1.b1(this, a17));
                valueAnimator.start();
                valueAnimator2.start();
                a17.d1(valueAnimator, valueAnimator2);
            }
        }
    }
}
