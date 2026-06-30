package xt2;

/* loaded from: classes3.dex */
public final class c5 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14980xd3f2584a f538196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f538197e;

    public c5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14980xd3f2584a c14980xd3f2584a, yz5.a aVar) {
        this.f538196d = c14980xd3f2584a;
        this.f538197e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14980xd3f2584a c14980xd3f2584a = this.f538196d;
        c14980xd3f2584a.m81308x2c770903(false);
        yz5.l onVisibilityListener = c14980xd3f2584a.getOnVisibilityListener();
        if (onVisibilityListener != null) {
            onVisibilityListener.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        yz5.a aVar = this.f538197e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
