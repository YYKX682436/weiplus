package d04;

/* loaded from: classes13.dex */
public final class i1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f306971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f306972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f306973f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17329xab0bbc34 f306974g;

    public i1(int i17, int i18, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17329xab0bbc34 c17329xab0bbc34) {
        this.f306971d = i17;
        this.f306972e = i18;
        this.f306973f = z17;
        this.f306974g = c17329xab0bbc34;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        int i17 = intValue - this.f306971d;
        boolean z17 = this.f306973f;
        int i18 = this.f306972e;
        if (z17) {
            i18 -= i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanNewProductListLayout", "smoothScrollTo  onAnimationUpdate  value:" + intValue + ", currentPaddingBottom:" + i18);
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17329xab0bbc34.C;
        this.f306974g.g(intValue, i18);
    }
}
