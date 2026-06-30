package qs3;

/* loaded from: classes8.dex */
public final class x implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16950xf026cd07 f447938a;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16950xf026cd07 c16950xf026cd07) {
        this.f447938a = c16950xf026cd07;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16950xf026cd07.f236539h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16950xf026cd07 c16950xf026cd07 = this.f447938a;
        c16950xf026cd07.getClass();
        c16950xf026cd07.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }
}
