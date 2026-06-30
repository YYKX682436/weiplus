package gx4;

/* loaded from: classes8.dex */
public class a0 extends dp1.u implements al5.m2 {

    /* renamed from: m, reason: collision with root package name */
    public final boolean f358929m;

    public a0(android.app.Activity activity) {
        super(activity);
        this.f358929m = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Di();
    }

    @Override // al5.m2
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
    }

    @Override // al5.m2
    public void e(int i17, int i18, boolean z17, boolean z18, android.view.View view) {
    }

    @Override // dp1.u, dp1.x
    public boolean h() {
        return this.f358929m;
    }

    @Override // dp1.u, dp1.x
    public boolean i() {
        return this.f358929m;
    }

    @Override // al5.m2
    public boolean m(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17) {
        if (!this.f358929m) {
            return false;
        }
        if (((i19 != 0 || i17 >= 0) && (java.lang.Math.abs(i19 - i28) >= 160 || i17 >= 0)) || i18 != 0) {
            return false;
        }
        y();
        return false;
    }

    @Override // dp1.u, dp1.x
    public boolean p() {
        return true;
    }

    @Override // dp1.u, dp1.x
    public boolean t() {
        return this.f358929m;
    }

    @Override // dp1.u
    public boolean w() {
        return !this.f358929m;
    }

    @Override // dp1.u
    public boolean x() {
        return this.f358929m;
    }
}
