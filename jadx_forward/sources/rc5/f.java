package rc5;

/* loaded from: classes11.dex */
public final class f extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc5.m f475689d;

    public f(rc5.m mVar) {
        this.f475689d = mVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        rc5.m mVar = this.f475689d;
        mVar.a();
        jz5.g gVar = rc5.x.D;
        android.view.Window window = mVar.f475703f.m158354x19263085().getWindow();
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.0f;
        window.setAttributes(attributes);
        window.clearFlags(2);
        rc5.n nVar = mVar.f475710p;
        if (nVar != null) {
            rc5.x xVar = ((rc5.q) nVar).f475721a;
            xVar.m158359x1e885992().putExtra("KIsHalfScreen", false);
            xVar.W6().mo7562xe26dab14(xVar.m158359x1e885992().getExtras());
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) xVar.W6().f279685f.f542241c.a(sb5.z0.class))).E0();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe peVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) xVar.W6().f279685f.f542241c.a(sb5.z0.class));
            peVar.x0(peVar.D);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f475689d.f475715u = true;
    }
}
