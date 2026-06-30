package yt2;

/* loaded from: classes3.dex */
public final class l extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.p1634x90ae7bab.C14986x9295a1e4 f546846d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.p1634x90ae7bab.C14986x9295a1e4 c14986x9295a1e4) {
        this.f546846d = c14986x9295a1e4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.p1634x90ae7bab.C14986x9295a1e4.F;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.p1634x90ae7bab.C14986x9295a1e4 c14986x9295a1e4 = this.f546846d;
        c14986x9295a1e4.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SubsidyOverlay", "enter anim finished, start hold 2000ms");
        c14986x9295a1e4.D = true;
        c14986x9295a1e4.setClickable(true);
        yt2.k kVar = new yt2.k(c14986x9295a1e4);
        c14986x9295a1e4.f207892t = kVar;
        c14986x9295a1e4.postDelayed(kVar, 2000L);
    }
}
