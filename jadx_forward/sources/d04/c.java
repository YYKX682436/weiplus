package d04;

/* loaded from: classes8.dex */
public final class c implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f306918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17325xac7c40dc f306919e;

    public c(yz5.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17325xac7c40dc c17325xac7c40dc) {
        this.f306918d = aVar;
        this.f306919e = c17325xac7c40dc;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f306918d.mo152xb9724478();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17325xac7c40dc c17325xac7c40dc = this.f306919e;
        c17325xac7c40dc.f241205m = -1;
        c17325xac7c40dc.f241206n = false;
        android.widget.LinearLayout linearLayout = c17325xac7c40dc.f241199d;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
            throw null;
        }
        linearLayout.getTranslationX();
        if (c17325xac7c40dc.f241212t != 1) {
            c17325xac7c40dc.f241212t = 1;
            d04.i3 i3Var = c17325xac7c40dc.f241211s;
            if (i3Var != null) {
                i3Var.a(1);
            }
        }
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
