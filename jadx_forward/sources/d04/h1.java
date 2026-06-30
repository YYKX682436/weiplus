package d04;

/* loaded from: classes13.dex */
public final class h1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17329xab0bbc34 f306959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f306960e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f306961f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f306962g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f306963h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f306964i;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17329xab0bbc34 c17329xab0bbc34, int i17, int i18, int i19, boolean z17, yz5.l lVar) {
        this.f306959d = c17329xab0bbc34;
        this.f306960e = i17;
        this.f306961f = i18;
        this.f306962g = i19;
        this.f306963h = z17;
        this.f306964i = lVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17329xab0bbc34 c17329xab0bbc34 = this.f306959d;
        c17329xab0bbc34.m68798x9e6c4d1c(false);
        int i17 = this.f306961f;
        int i18 = this.f306960e;
        int i19 = i18 - i17;
        boolean z17 = this.f306963h;
        int i27 = this.f306962g;
        if (z17) {
            i27 -= i19;
        }
        c17329xab0bbc34.g(i18, i27);
        this.f306964i.mo146xb9724478(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanNewProductListLayout", "onAnimationEnd");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }
}
