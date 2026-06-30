package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes10.dex */
public class e3 {

    /* renamed from: a, reason: collision with root package name */
    public int f93544a;

    /* renamed from: b, reason: collision with root package name */
    public int f93545b;

    /* renamed from: d, reason: collision with root package name */
    public int f93547d = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f93549f = false;

    /* renamed from: c, reason: collision with root package name */
    public int f93546c = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public android.view.animation.Interpolator f93548e = null;

    public e3(int i17, int i18) {
        this.f93544a = i17;
        this.f93545b = i18;
    }

    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        int i17 = this.f93547d;
        if (i17 >= 0) {
            this.f93547d = -1;
            c1163xf1deaba4.F0(i17);
            this.f93549f = false;
            return;
        }
        if (this.f93549f) {
            android.view.animation.Interpolator interpolator = this.f93548e;
            if (interpolator != null && this.f93546c < 1) {
                throw new java.lang.IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i18 = this.f93546c;
            if (i18 < 1) {
                throw new java.lang.IllegalStateException("Scroll duration must be a positive number");
            }
            if (interpolator != null) {
                c1163xf1deaba4.C1.c(this.f93544a, this.f93545b, i18, interpolator);
            } else if (i18 == Integer.MIN_VALUE) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.j3 j3Var = c1163xf1deaba4.C1;
                int i19 = this.f93544a;
                int i27 = this.f93545b;
                j3Var.c(i19, i27, j3Var.a(i19, i27, 0, 0), p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.f93418a2);
            } else {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.j3 j3Var2 = c1163xf1deaba4.C1;
                int i28 = this.f93544a;
                int i29 = this.f93545b;
                j3Var2.getClass();
                j3Var2.c(i28, i29, i18, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.f93418a2);
            }
            this.f93549f = false;
        }
    }

    public void b(int i17, int i18, int i19, android.view.animation.Interpolator interpolator) {
        this.f93544a = i17;
        this.f93545b = i18;
        this.f93546c = i19;
        this.f93548e = interpolator;
        this.f93549f = true;
    }
}
