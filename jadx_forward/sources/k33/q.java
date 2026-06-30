package k33;

/* loaded from: classes5.dex */
public final class q implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f385409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f385410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15676xd39461ed f385411f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f385412g;

    public q(android.util.Size size, android.util.Size size2, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15676xd39461ed c15676xd39461ed, yz5.l lVar) {
        this.f385409d = size;
        this.f385410e = size2;
        this.f385411f = c15676xd39461ed;
        this.f385412g = lVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float width = this.f385409d.getWidth();
        android.util.Size size = this.f385410e;
        float width2 = width + ((size.getWidth() - r0.getWidth()) * floatValue);
        float height = r0.getHeight() + ((size.getHeight() - r0.getHeight()) * floatValue);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15676xd39461ed c15676xd39461ed = this.f385411f;
        c15676xd39461ed.f220213p = width2;
        c15676xd39461ed.f220214q = height;
        c15676xd39461ed.getLayoutParams().width = (int) width2;
        c15676xd39461ed.getLayoutParams().height = (int) height;
        yz5.l lVar = this.f385412g;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Float.valueOf(floatValue));
        }
        c15676xd39461ed.requestLayout();
        c15676xd39461ed.invalidate();
    }
}
