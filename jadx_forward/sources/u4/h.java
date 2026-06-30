package u4;

/* loaded from: classes13.dex */
public class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f506014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f506015e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f506016f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f506017g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f506018h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f506019i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f506020m;

    public h(p012xc85e97e9.p112x993b6d55.C1173xe703c6a5 c1173xe703c6a5, android.view.View view, android.graphics.Rect rect, int i17, int i18, int i19, int i27) {
        this.f506015e = view;
        this.f506016f = rect;
        this.f506017g = i17;
        this.f506018h = i18;
        this.f506019i = i19;
        this.f506020m = i27;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f506014d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        if (this.f506014d) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        android.view.View view = this.f506015e;
        n3.w0.c(view, this.f506016f);
        u4.w1.b(view, this.f506017g, this.f506018h, this.f506019i, this.f506020m);
    }
}
