package zx2;

/* loaded from: classes15.dex */
public class r implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f558597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f558598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f558599f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f558600g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zx2.t f558601h;

    public r(zx2.t tVar, int i17, int i18, int i19, int i27) {
        this.f558601h = tVar;
        this.f558597d = i17;
        this.f558598e = i18;
        this.f558599f = i19;
        this.f558600g = i27;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        zx2.t tVar = this.f558601h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = tVar.f558613p;
        m3.e eVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79.f214631x0;
        c15436x4c00d79.getClass();
        int i17 = this.f558598e;
        int round = this.f558597d + java.lang.Math.round((i17 - r2) * animatedFraction);
        tVar.f558613p.getClass();
        int i18 = this.f558600g;
        tVar.d(round, this.f558599f + java.lang.Math.round(animatedFraction * (i18 - r3)));
    }
}
