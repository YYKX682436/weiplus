package d04;

/* loaded from: classes13.dex */
public final class o1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17332xd90aa69a f307008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f307009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f307010f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f307011g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f307012h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f307013i;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17332xd90aa69a c17332xd90aa69a, int i17, int i18, int i19, boolean z17, yz5.l lVar) {
        this.f307008d = c17332xd90aa69a;
        this.f307009e = i17;
        this.f307010f = i18;
        this.f307011g = i19;
        this.f307012h = z17;
        this.f307013i = lVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17332xd90aa69a c17332xd90aa69a = this.f307008d;
        c17332xd90aa69a.m68812x9e6c4d1c(false);
        int i17 = this.f307010f;
        int i18 = this.f307009e;
        int i19 = i18 - i17;
        boolean z17 = this.f307012h;
        int i27 = this.f307011g;
        if (z17) {
            i27 -= i19;
        }
        c17332xd90aa69a.g(i18, i27);
        this.f307013i.mo146xb9724478(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanProductListLayout", "onAnimationEnd");
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
