package ln5;

/* loaded from: classes15.dex */
public final class b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 f401451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f401452e;

    public b(com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864, boolean z17) {
        this.f401451d = c22851x22587864;
        this.f401452e = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        if (animation.getDuration() == 0) {
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = this.f401451d;
        c22851x22587864.A.f502405e = null;
        on5.g headerPlugin = c22851x22587864.getHeaderPlugin();
        tn5.a aVar = c22851x22587864.f295271h;
        if (headerPlugin == null) {
            aVar.e(sn5.b.f491690p);
            return;
        }
        sn5.b bVar = aVar.f502384b;
        sn5.b bVar2 = sn5.b.f491699y;
        if (!(bVar == bVar2)) {
            aVar.e(bVar2);
        }
        boolean z17 = this.f401452e;
        c22851x22587864.m82947x7297cce8(z17);
        c22851x22587864.x(z17);
    }
}
