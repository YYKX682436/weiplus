package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f93626d;

    /* renamed from: e, reason: collision with root package name */
    public int f93627e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.OverScroller f93628f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.animation.Interpolator f93629g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f93630h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f93631i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f93632m;

    public j3(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f93632m = c1163xf1deaba4;
        android.view.animation.Interpolator interpolator = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.f93418a2;
        this.f93629g = interpolator;
        this.f93630h = false;
        this.f93631i = false;
        this.f93628f = new android.widget.OverScroller(c1163xf1deaba4.getContext(), interpolator);
    }

    public final int a(int i17, int i18, int i19, int i27) {
        int i28;
        int abs = java.lang.Math.abs(i17);
        int abs2 = java.lang.Math.abs(i18);
        boolean z17 = abs > abs2;
        int sqrt = (int) java.lang.Math.sqrt((i19 * i19) + (i27 * i27));
        int sqrt2 = (int) java.lang.Math.sqrt((i17 * i17) + (i18 * i18));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93632m;
        int width = z17 ? c1163xf1deaba4.getWidth() : c1163xf1deaba4.getHeight();
        int i29 = width / 2;
        float f17 = width;
        float f18 = i29;
        float sin = f18 + (((float) java.lang.Math.sin((java.lang.Math.min(1.0f, (sqrt2 * 1.0f) / f17) - 0.5f) * 0.47123894f)) * f18);
        if (sqrt > 0) {
            i28 = java.lang.Math.round(java.lang.Math.abs(sin / sqrt) * 1000.0f) * 4;
        } else {
            if (!z17) {
                abs = abs2;
            }
            i28 = (int) (((abs / f17) + 1.0f) * 300.0f);
        }
        return java.lang.Math.min(i28, 2000);
    }

    public void b() {
        if (this.f93630h) {
            this.f93631i = true;
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93632m;
        c1163xf1deaba4.removeCallbacks(this);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.m(c1163xf1deaba4, this);
    }

    public void c(int i17, int i18, int i19, android.view.animation.Interpolator interpolator) {
        android.view.animation.Interpolator interpolator2 = this.f93629g;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93632m;
        if (interpolator2 != interpolator) {
            this.f93629g = interpolator;
            this.f93628f = new android.widget.OverScroller(c1163xf1deaba4.getContext(), interpolator);
        }
        c1163xf1deaba4.m7973xeaaee002(2);
        this.f93627e = 0;
        this.f93626d = 0;
        this.f93628f.startScroll(0, 0, i17, i18, i19);
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00da, code lost:
    
        if (r10 > 0) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.j3.run():void");
    }
}
