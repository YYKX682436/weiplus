package ap0;

/* loaded from: classes2.dex */
public final class g implements ep0.d {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.animation.Animation f12595a;

    /* renamed from: b, reason: collision with root package name */
    public final cp0.n f12596b;

    public g(android.view.animation.Animation animation, cp0.n nVar, int i17, kotlin.jvm.internal.i iVar) {
        animation = (i17 & 1) != 0 ? new android.view.animation.AlphaAnimation(0.0f, 1.0f) : animation;
        nVar = (i17 & 2) != 0 ? null : nVar;
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f12595a = animation;
        this.f12596b = nVar;
    }
}
