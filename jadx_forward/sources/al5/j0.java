package al5;

/* loaded from: classes3.dex */
public final class j0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c f87464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f87465e;

    public j0(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c, yz5.a aVar) {
        this.f87464d = c22613xe7040d9c;
        this.f87465e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        yz5.l onVisibilityListener;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f87464d;
        boolean z17 = c22613xe7040d9c.isShowing;
        c22613xe7040d9c.m81308x2c770903(false);
        if (z17 && (onVisibilityListener = c22613xe7040d9c.getOnVisibilityListener()) != null) {
            onVisibilityListener.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        yz5.a aVar = this.f87465e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
