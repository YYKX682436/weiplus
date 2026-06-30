package rp1;

/* loaded from: classes14.dex */
public class i1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f479952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f479953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f479954f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f479955g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f479956h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f479957i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f479958m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f479959n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f479960o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f479961p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f479962q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 f479963r;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0, int i17, int i18, int i19, int i27, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, float f17, float f18) {
        this.f479963r = c12929x567537a0;
        this.f479952d = i17;
        this.f479953e = i18;
        this.f479954f = i19;
        this.f479955g = i27;
        this.f479956h = z17;
        this.f479957i = z18;
        this.f479958m = z19;
        this.f479959n = z27;
        this.f479960o = z28;
        this.f479961p = f17;
        this.f479962q = f18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        float f17 = this.f479953e;
        int i17 = this.f479952d;
        float f18 = i17;
        int i18 = ((int) (((f17 * 1.0f) - f18) * floatValue)) + i17;
        int i19 = this.f479954f;
        int i27 = ((int) (((this.f479955g * 1.0f) - i19) * floatValue)) + i19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = this.f479963r;
        boolean z17 = this.f479956h;
        if (z17) {
            int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0.f175047u2;
            c12929x567537a0.I0(c12929x567537a0.Z(i18), i18, i27, false, false);
        }
        this.f479963r.z0(i18, i27, false, false, true, this.f479957i);
        if (this.f479958m && !c12929x567537a0.f175076n2 && floatValue > 0.5f) {
            boolean z18 = this.f479959n;
            if (z18 && c12929x567537a0.K != 0) {
                c12929x567537a0.K = 0;
                c12929x567537a0.f175053J.setRotation(0);
            } else if (!z18 && c12929x567537a0.K != 180) {
                c12929x567537a0.K = 180;
                c12929x567537a0.f175053J.setRotation(180);
            }
        }
        if (!this.f479960o || z17) {
            return;
        }
        float f19 = i18;
        c12929x567537a0.getClass();
        java.lang.Boolean bool = qp1.w.f447288a;
        float max = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, (f19 - f18) / (f17 - f18)));
        float f27 = this.f479962q;
        float f28 = this.f479961p;
        c12929x567537a0.Y0(f28 + (max * (f27 - f28)));
    }
}
