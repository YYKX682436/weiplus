package yt2;

/* loaded from: classes3.dex */
public final class p extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.p1634x90ae7bab.C14986x9295a1e4 f546850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f546851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f546852f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f546853g;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.p1634x90ae7bab.C14986x9295a1e4 c14986x9295a1e4, float f17, float f18, float f19, float f27) {
        this.f546850d = c14986x9295a1e4;
        this.f546851e = f18;
        this.f546852f = f19;
        this.f546853g = f27;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.p1634x90ae7bab.C14986x9295a1e4 c14986x9295a1e4 = this.f546850d;
        c14986x9295a1e4.f207881f.setPivotX(0.0f);
        c14986x9295a1e4.f207881f.setPivotY(this.f546851e);
        c14986x9295a1e4.f207881f.setTranslationX(this.f546852f);
        c14986x9295a1e4.f207881f.setTranslationY(this.f546853g);
    }
}
