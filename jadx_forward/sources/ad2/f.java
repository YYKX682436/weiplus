package ad2;

/* loaded from: classes2.dex */
public final class f extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad2.h f84661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f84662e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f84663f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f84664g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f84665h;

    public f(ad2.h hVar, android.view.View view, yz5.a aVar, int i17, int i18) {
        this.f84661d = hVar;
        this.f84662e = view;
        this.f84663f = aVar;
        this.f84664g = i17;
        this.f84665h = i18;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f84661d.getClass();
        android.view.View view = this.f84662e;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = this.f84664g;
        layoutParams.height = this.f84665h;
        view.setLayoutParams(layoutParams);
        yz5.a aVar = this.f84663f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
