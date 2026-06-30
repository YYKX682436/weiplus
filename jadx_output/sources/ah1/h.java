package ah1;

/* loaded from: classes7.dex */
public final class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f4828d;

    public h(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f4828d = lVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.app.Activity a17 = q75.a.a(((com.tencent.mm.plugin.appbrand.y) this.f4828d).getContext());
        if (a17 != null) {
            vj5.n.b(a17).e();
        }
    }
}
