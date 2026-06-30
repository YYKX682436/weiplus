package uj3;

/* loaded from: classes9.dex */
public final class q implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.z f509870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f509871e;

    public q(uj3.z zVar, java.lang.String str) {
        this.f509870d = zVar;
        this.f509871e = str;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        uj3.z zVar = this.f509870d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a = zVar.f509929c;
        if (c18930xb402610a != null) {
            c18930xb402610a.setVisibility(8);
        }
        zVar.f509940n = false;
        android.widget.ImageView imageView = zVar.f509930d;
        if (imageView != null) {
            imageView.setAlpha(1.0f);
        }
        android.widget.ImageView imageView2 = zVar.f509930d;
        if (imageView2 == null) {
            return;
        }
        imageView2.setVisibility(0);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        uj3.z zVar = this.f509870d;
        android.widget.RelativeLayout relativeLayout = zVar.f509927a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        android.content.Context context = zVar.f509936j;
        sb6.append(context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6r) : null);
        sb6.append(',');
        sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f509871e, true).P0());
        relativeLayout.setContentDescription(sb6.toString());
    }
}
