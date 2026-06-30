package d04;

/* loaded from: classes14.dex */
public final class a3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 f306908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f306909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f306910f;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 c17337xb9c9eb33, boolean z17, yz5.a aVar) {
        this.f306908d = c17337xb9c9eb33;
        this.f306909e = z17;
        this.f306910f = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationCancel(animation);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33.G;
        this.f306908d.l(this.f306909e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33.G;
        this.f306908d.l(this.f306909e);
        yz5.a aVar = this.f306910f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
