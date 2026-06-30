package tg2;

/* loaded from: classes10.dex */
public final class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tg2.g f500695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f500696e;

    public d(tg2.g gVar, android.widget.ImageView imageView) {
        this.f500695d = gVar;
        this.f500696e = imageView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        this.f500695d.f500707a.removeView(this.f500696e);
    }
}
