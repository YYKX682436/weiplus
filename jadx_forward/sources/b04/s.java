package b04;

/* loaded from: classes4.dex */
public final class s extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f98465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f98466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b04.z f98467f;

    public s(android.widget.LinearLayout linearLayout, android.view.View view, b04.z zVar) {
        this.f98465d = linearLayout;
        this.f98466e = view;
        this.f98467f = zVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f98465d.getLayoutParams().height = -2;
        this.f98466e.getLayoutParams().height = -2;
        b04.z zVar = this.f98467f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185 = zVar.f98483g;
        if (c22675xc8629185 != null) {
            c22675xc8629185.m81865xb81c4172(null);
        }
        zVar.f98494u = null;
    }
}
