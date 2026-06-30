package df2;

/* loaded from: classes3.dex */
public final class z2 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public float f313452a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public int f313453b;

    /* renamed from: c, reason: collision with root package name */
    public int f313454c;

    /* renamed from: d, reason: collision with root package name */
    public int f313455d;

    /* renamed from: e, reason: collision with root package name */
    public int f313456e;

    /* renamed from: f, reason: collision with root package name */
    public float f313457f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.a3 f313458g;

    public z2(df2.a3 a3Var) {
        this.f313458g = a3Var;
    }

    public final void a(android.view.View view, android.view.View target) {
        android.graphics.Rect rect;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        int width = target.getWidth();
        int height = target.getHeight();
        if (view == null || view.getWidth() <= 0) {
            rect = null;
        } else {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr);
            target.getLocationOnScreen(iArr2);
            int i17 = iArr[0] - iArr2[0];
            int i18 = iArr[1] - iArr2[1];
            rect = new android.graphics.Rect(i17, i18, view.getWidth() + i17, view.getHeight() + i18);
        }
        if (rect == null || !rect.intersects(0, 0, width, height)) {
            if (rect == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCenterFadingAnimator", "calibrate: anchor unavailable, fallback to center");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCenterFadingAnimator", "calibrate: anchor out of target bounds, fallback to center");
            }
            int i19 = width / 2;
            int i27 = height / 2;
            this.f313453b = i19;
            this.f313454c = i27;
            this.f313455d = i19;
            this.f313456e = i27;
            this.f313457f = this.f313458g.f311202i;
            return;
        }
        this.f313453b = rect.left;
        this.f313454c = rect.top;
        this.f313455d = rect.right;
        this.f313456e = rect.bottom;
        float f17 = target.getResources().getDisplayMetrics().density;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCenterFadingAnimator", "calibrate: anchor=" + view + ", target=" + target + ", rect=[" + this.f313453b + ',' + this.f313454c + ',' + this.f313455d + ',' + this.f313456e + "], dp=[" + (this.f313453b / f17) + ", " + (this.f313454c / f17) + ", " + (this.f313455d / f17) + ", " + (this.f313456e / f17) + ']');
        this.f313457f = ((float) target.getHeight()) / 2.0f;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        int width = view.getWidth();
        int height = view.getHeight();
        float f17 = this.f313452a;
        int f18 = e06.p.f((int) (this.f313453b + ((0 - r2) * f17)), 0, width);
        int f19 = e06.p.f((int) (this.f313454c + ((0 - r2) * f17)), 0, height);
        int f27 = e06.p.f((int) (this.f313455d + ((width - r2) * f17)), 0, width);
        int f28 = e06.p.f((int) (this.f313456e + ((height - r0) * f17)), 0, height);
        float f29 = this.f313457f;
        float f37 = this.f313458g.f311202i;
        outline.setRoundRect(f18, f19, f27, f28, e06.p.e(f29 + ((f37 - f29) * f17), 0.0f, f37));
    }
}
