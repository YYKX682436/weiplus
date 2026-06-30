package o12;

/* loaded from: classes10.dex */
public final class s extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13260x7cd1df1e f423712d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13260x7cd1df1e c13260x7cd1df1e) {
        this.f423712d = c13260x7cd1df1e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        yz5.a onAnimateResetEnd = this.f423712d.getOnAnimateResetEnd();
        if (onAnimateResetEnd != null) {
            onAnimateResetEnd.mo152xb9724478();
        }
    }
}
