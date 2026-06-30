package rc5;

/* loaded from: classes5.dex */
public final class g extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f475691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rc5.m f475692e;

    public g(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, rc5.m mVar) {
        this.f475691d = h0Var;
        this.f475692e = mVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f475692e.f475716v = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        int y17;
        android.view.View mo7935xa188593e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        rc5.x xVar = this.f475692e.f475703f;
        jz5.g gVar = rc5.x.D;
        java.lang.Object m79872xcc101dd9 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) xVar.W6().f279685f.f542252n).B.m79872xcc101dd9();
        jz5.l lVar = null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = m79872xcc101dd9 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) m79872xcc101dd9 : null;
        if (c1163xf1deaba4 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
            if (c1162x665295de != null && (mo7935xa188593e = c1162x665295de.mo7935xa188593e((y17 = c1162x665295de.y()))) != null) {
                lVar = new jz5.l(java.lang.Integer.valueOf(y17), java.lang.Integer.valueOf(c1163xf1deaba4.getHeight() - mo7935xa188593e.getBottom()));
            }
        }
        this.f475691d.f391656d = lVar;
    }
}
