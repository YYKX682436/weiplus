package x41;

/* loaded from: classes15.dex */
public final class k implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p986x373aa5.AbstractC11221xf21fe5de f533312d;

    public k(com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p986x373aa5.AbstractC11221xf21fe5de abstractC11221xf21fe5de, float f17, float f18) {
        this.f533312d = abstractC11221xf21fe5de;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f533312d.N = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        ah5.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p986x373aa5.AbstractC11221xf21fe5de abstractC11221xf21fe5de = this.f533312d;
        x41.n nVar = abstractC11221xf21fe5de.f153848q;
        if (nVar != null && (aVar = ((w41.h) nVar).f524391a.f524394g) != null) {
            aVar.a();
        }
        abstractC11221xf21fe5de.P = true;
        abstractC11221xf21fe5de.N = false;
        android.view.View view = abstractC11221xf21fe5de.f153844n;
        if (view != null) {
            view.getTranslationY();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dialogContainer");
            throw null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p986x373aa5.AbstractC11221xf21fe5de abstractC11221xf21fe5de = this.f533312d;
        x41.n nVar = abstractC11221xf21fe5de.f153848q;
        if (nVar != null) {
            int i17 = abstractC11221xf21fe5de.f153850s;
            int i18 = abstractC11221xf21fe5de.I;
            w41.j jVar = ((w41.h) nVar).f524391a;
            jVar.getClass();
            jVar.f524399o = i18;
            ah5.a aVar = jVar.f524394g;
            if (aVar != null) {
                aVar.e();
            }
        }
    }
}
