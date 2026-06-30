package oa;

/* loaded from: classes15.dex */
public class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f425295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f425296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f425297f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f425298g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oa.h f425299h;

    public f(oa.h hVar, int i17, int i18, int i19, int i27) {
        this.f425299h = hVar;
        this.f425295d = i17;
        this.f425296e = i18;
        this.f425297f = i19;
        this.f425298g = i27;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        android.animation.TimeInterpolator timeInterpolator = w9.a.f525567a;
        int i17 = this.f425296e;
        int round = this.f425295d + java.lang.Math.round((i17 - r1) * animatedFraction);
        int i18 = this.f425298g;
        int round2 = this.f425297f + java.lang.Math.round(animatedFraction * (i18 - r2));
        oa.h hVar = this.f425299h;
        if (round == hVar.f425307i && round2 == hVar.f425308m) {
            return;
        }
        hVar.f425307i = round;
        hVar.f425308m = round2;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.k(hVar);
    }
}
