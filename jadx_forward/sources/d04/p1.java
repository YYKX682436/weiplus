package d04;

/* loaded from: classes13.dex */
public final class p1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f307017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f307018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f307019f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17332xd90aa69a f307020g;

    public p1(int i17, int i18, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17332xd90aa69a c17332xd90aa69a) {
        this.f307017d = i17;
        this.f307018e = i18;
        this.f307019f = z17;
        this.f307020g = c17332xd90aa69a;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        int i17 = intValue - this.f307017d;
        boolean z17 = this.f307019f;
        int i18 = this.f307018e;
        if (z17) {
            i18 -= i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductListLayout", "smoothScrollTo  onAnimationUpdate  value:" + intValue + ", currentPaddingBottom:" + i18);
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17332xd90aa69a.C;
        this.f307020g.g(intValue, i18);
    }
}
