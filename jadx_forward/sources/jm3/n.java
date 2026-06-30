package jm3;

/* loaded from: classes3.dex */
public final class n extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a f381869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f381870e;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activityC16653xffd2636a, yz5.a aVar) {
        this.f381869d = activityC16653xffd2636a;
        this.f381870e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a.f232401u;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activityC16653xffd2636a = this.f381869d;
        activityC16653xffd2636a.Y6().animate().alpha(0.0f).setDuration(200L).withEndAction(new jm3.m(activityC16653xffd2636a)).start();
        yz5.a aVar = this.f381870e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
