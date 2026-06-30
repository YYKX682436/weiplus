package ad2;

/* loaded from: classes2.dex */
public final class f extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad2.h f3128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f3129e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f3130f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3131g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3132h;

    public f(ad2.h hVar, android.view.View view, yz5.a aVar, int i17, int i18) {
        this.f3128d = hVar;
        this.f3129e = view;
        this.f3130f = aVar;
        this.f3131g = i17;
        this.f3132h = i18;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f3128d.getClass();
        android.view.View view = this.f3129e;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = this.f3131g;
        layoutParams.height = this.f3132h;
        view.setLayoutParams(layoutParams);
        yz5.a aVar = this.f3130f;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
