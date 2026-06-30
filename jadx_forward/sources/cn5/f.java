package cn5;

/* loaded from: classes8.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781 f125215d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781 c22822xceb63781) {
        super(1);
        this.f125215d = c22822xceb63781;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yz5.a it = (yz5.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781 c22822xceb63781 = this.f125215d;
        if (!c22822xceb63781.isClosing) {
            c22822xceb63781.clearAnimation();
            c22822xceb63781.animate().cancel();
            c22822xceb63781.animate().setInterpolator(new android.view.animation.DecelerateInterpolator(1.5f)).translationY(0.0f).withEndAction(new cn5.e(it)).setUpdateListener(new com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.e(c22822xceb63781)).setDuration(300L).start();
        }
        return jz5.f0.f384359a;
    }
}
