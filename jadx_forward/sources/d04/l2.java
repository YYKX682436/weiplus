package d04;

/* loaded from: classes8.dex */
public final class l2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d04.g f306990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10 f306991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sz3.c1 f306992f;

    public l2(d04.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10 c17334xac4daa10, sz3.c1 c1Var) {
        this.f306990d = gVar;
        this.f306991e = c17334xac4daa10;
        this.f306992f = c1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17346xe5e5429e m68831xf5018f80;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10 c17334xac4daa10 = this.f306991e;
        m68831xf5018f80 = c17334xac4daa10.m68831xf5018f80();
        m68831xf5018f80.setVisibility(8);
        this.f306990d.a();
        d04.h hVar = c17334xac4daa10.f241313t;
        if (hVar != null) {
            hVar.b(this.f306992f.f495510d, 99998);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationStart(animation);
        this.f306990d.b();
    }
}
