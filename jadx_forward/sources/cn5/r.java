package cn5;

/* loaded from: classes8.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22824x40bb30c2 f125227d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22824x40bb30c2 c22824x40bb30c2) {
        super(1);
        this.f125227d = c22824x40bb30c2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yz5.a it = (yz5.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22824x40bb30c2 c22824x40bb30c2 = this.f125227d;
        if (!c22824x40bb30c2.isClosing) {
            c22824x40bb30c2.clearAnimation();
            c22824x40bb30c2.animate().cancel();
            c22824x40bb30c2.animate().setInterpolator(new android.view.animation.DecelerateInterpolator(1.5f)).translationY(0.0f).withEndAction(new cn5.p(it)).setUpdateListener(new cn5.q(c22824x40bb30c2)).setDuration(300L).start();
        }
        return jz5.f0.f384359a;
    }
}
