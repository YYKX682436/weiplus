package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes10.dex */
public class o1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.g3 {

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.PointF f93710j;

    /* renamed from: k, reason: collision with root package name */
    public final float f93711k;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.animation.LinearInterpolator f93708h = new android.view.animation.LinearInterpolator();

    /* renamed from: i, reason: collision with root package name */
    public final android.view.animation.DecelerateInterpolator f93709i = new android.view.animation.DecelerateInterpolator();

    /* renamed from: l, reason: collision with root package name */
    public int f93712l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f93713m = 0;

    public o1(android.content.Context context) {
        this.f93711k = j(context.getResources().getDisplayMetrics());
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public void c() {
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public void d() {
        this.f93713m = 0;
        this.f93712l = 0;
        this.f93710j = null;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public void e(android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.e3 e3Var) {
        int h17 = h(view, m());
        int i17 = i(view, n());
        int k17 = k((int) java.lang.Math.sqrt((h17 * h17) + (i17 * i17)));
        if (k17 > 0) {
            e3Var.b(-h17, -i17, k17, this.f93709i);
        }
    }

    public int g(int i17, int i18, int i19, int i27, int i28) {
        if (i28 == -1) {
            return i19 - i17;
        }
        if (i28 != 0) {
            if (i28 == 1) {
                return i27 - i18;
            }
            throw new java.lang.IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i29 = i19 - i17;
        if (i29 > 0) {
            return i29;
        }
        int i37 = i27 - i18;
        if (i37 < 0) {
            return i37;
        }
        return 0;
    }

    public int h(android.view.View view, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93584c;
        if (layoutManager == null || !layoutManager.mo2416xc6ea780e()) {
            return 0;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams();
        return g(layoutManager.m8012x7f0ab3e8(view) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin, layoutManager.m8015x62a22a5b(view) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin, layoutManager.m8028x805c2682(), layoutManager.m8037x755bd410() - layoutManager.m8029x8b7f0b01(), i17);
    }

    public int i(android.view.View view, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93584c;
        if (layoutManager == null || !layoutManager.mo7926x215ffa20()) {
            return 0;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams();
        return g(layoutManager.m8016xfbd72d54(view) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutManager.m8010xd6b039cc(view) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutManager.m8031xf39fff7a(), layoutManager.m8018x1c4fb41d() - layoutManager.m8026xc96f6de6(), i17);
    }

    public float j(android.util.DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int k(int i17) {
        return (int) java.lang.Math.ceil(l(i17) / 0.3356d);
    }

    public int l(int i17) {
        return (int) java.lang.Math.ceil(java.lang.Math.abs(i17) * this.f93711k);
    }

    public int m() {
        android.graphics.PointF pointF = this.f93710j;
        if (pointF != null) {
            float f17 = pointF.x;
            if (f17 != 0.0f) {
                return f17 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public int n() {
        android.graphics.PointF pointF = this.f93710j;
        if (pointF != null) {
            float f17 = pointF.y;
            if (f17 != 0.0f) {
                return f17 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
