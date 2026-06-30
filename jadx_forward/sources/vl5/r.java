package vl5;

/* loaded from: classes15.dex */
public class r extends vl5.t {

    /* renamed from: p, reason: collision with root package name */
    public float f519483p;

    /* renamed from: q, reason: collision with root package name */
    public float f519484q;

    /* renamed from: r, reason: collision with root package name */
    public float f519485r;

    /* renamed from: s, reason: collision with root package name */
    public int f519486s;

    /* renamed from: t, reason: collision with root package name */
    public int f519487t;

    /* renamed from: u, reason: collision with root package name */
    public int f519488u;

    /* renamed from: v, reason: collision with root package name */
    public int f519489v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 f519490w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395, float f17, int i17, vl5.e eVar) {
        super(c22722xd3be5395, f17, i17, null);
        this.f519490w = c22722xd3be5395;
        this.f519486s = -1;
        this.f519487t = -1;
    }

    @Override // vl5.t
    public void a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395 = this.f519490w;
        c22722xd3be5395.l(c22722xd3be5395.f294037s - c22722xd3be5395.getHeaderViewsCount());
    }

    @Override // vl5.t
    public void b(float f17, float f18) {
        android.view.View childAt;
        float f19 = 1.0f - f18;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395 = this.f519490w;
        int firstVisiblePosition = c22722xd3be5395.getFirstVisiblePosition();
        android.view.View childAt2 = c22722xd3be5395.getChildAt(this.f519488u - firstVisiblePosition);
        if (c22722xd3be5395.F1) {
            float uptimeMillis = ((float) (android.os.SystemClock.uptimeMillis() - this.f519491d)) / 1000.0f;
            if (uptimeMillis == 0.0f) {
                return;
            }
            float f27 = c22722xd3be5395.G1 * uptimeMillis;
            int width = c22722xd3be5395.getWidth();
            float f28 = c22722xd3be5395.G1;
            float f29 = (f28 > 0.0f ? 1 : -1) * uptimeMillis;
            float f37 = width;
            c22722xd3be5395.G1 = f28 + (f29 * f37);
            float f38 = this.f519483p + f27;
            this.f519483p = f38;
            c22722xd3be5395.f294023e.x = (int) f38;
            if (f38 < f37 && f38 > (-width)) {
                this.f519491d = android.os.SystemClock.uptimeMillis();
                c22722xd3be5395.k(true);
                return;
            }
        }
        if (childAt2 != null) {
            if (this.f519486s == -1) {
                this.f519486s = c22722xd3be5395.p(this.f519488u, childAt2, false);
                this.f519484q = childAt2.getHeight() - this.f519486s;
            }
            int max = java.lang.Math.max((int) (this.f519484q * f19), 1);
            android.view.ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
            layoutParams.height = this.f519486s + max;
            childAt2.setLayoutParams(layoutParams);
        }
        int i17 = this.f519489v;
        if (i17 == this.f519488u || (childAt = c22722xd3be5395.getChildAt(i17 - firstVisiblePosition)) == null) {
            return;
        }
        if (this.f519487t == -1) {
            this.f519487t = c22722xd3be5395.p(this.f519489v, childAt, false);
            this.f519485r = childAt.getHeight() - this.f519487t;
        }
        int max2 = java.lang.Math.max((int) (f19 * this.f519485r), 1);
        android.view.ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
        layoutParams2.height = this.f519487t + max2;
        childAt.setLayoutParams(layoutParams2);
    }

    public void c() {
        this.f519486s = -1;
        this.f519487t = -1;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395 = this.f519490w;
        this.f519488u = c22722xd3be5395.f294032p;
        this.f519489v = c22722xd3be5395.f294035q;
        c22722xd3be5395.f294048z = 1;
        this.f519483p = c22722xd3be5395.f294023e.x;
        if (!c22722xd3be5395.F1) {
            c22722xd3be5395.h();
            return;
        }
        float width = c22722xd3be5395.getWidth() * 2.0f;
        float f17 = c22722xd3be5395.G1;
        if (f17 == 0.0f) {
            c22722xd3be5395.G1 = (this.f519483p >= 0.0f ? 1 : -1) * width;
            return;
        }
        float f18 = width * 2.0f;
        if (f17 < 0.0f) {
            float f19 = -f18;
            if (f17 > f19) {
                c22722xd3be5395.G1 = f19;
                return;
            }
        }
        if (f17 <= 0.0f || f17 >= f18) {
            return;
        }
        c22722xd3be5395.G1 = f18;
    }
}
