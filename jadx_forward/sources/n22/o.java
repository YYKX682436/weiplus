package n22;

/* loaded from: classes2.dex */
public final class o implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f415834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f415835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f415836f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f415837g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f415838h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f415839i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f415840m;

    public o(android.graphics.Rect rect, android.graphics.Rect rect2, int i17, int i18, int i19, int i27, yz5.a aVar) {
        this.f415834d = rect;
        this.f415835e = rect2;
        this.f415836f = i17;
        this.f415837g = i18;
        this.f415838h = i19;
        this.f415839i = i27;
        this.f415840m = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.graphics.Rect rect = this.f415835e;
        this.f415834d.set((int) (rect.left + (this.f415836f * floatValue)), (int) (rect.top + (this.f415837g * floatValue)), (int) (rect.right + (this.f415838h * floatValue)), (int) (rect.bottom + (this.f415839i * floatValue)));
        this.f415840m.mo152xb9724478();
    }
}
