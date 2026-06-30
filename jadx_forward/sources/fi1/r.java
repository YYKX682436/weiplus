package fi1;

/* loaded from: classes8.dex */
public class r implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12478x3e6e5e12 f344328d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12478x3e6e5e12 c12478x3e6e5e12) {
        this.f344328d = c12478x3e6e5e12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12478x3e6e5e12 c12478x3e6e5e12 = this.f344328d;
        c12478x3e6e5e12.A = c12478x3e6e5e12.f167806d.getTranslationY();
        float f17 = c12478x3e6e5e12.A;
        c12478x3e6e5e12.c();
    }
}
