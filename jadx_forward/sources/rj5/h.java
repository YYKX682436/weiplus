package rj5;

/* loaded from: classes10.dex */
public final class h implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rj5.k f477917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewTreeObserver.OnScrollChangedListener f477918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f477919f;

    public h(rj5.k kVar, android.view.ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, java.lang.Runnable runnable) {
        this.f477917d = kVar;
        this.f477918e = onScrollChangedListener;
        this.f477919f = runnable;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        rj5.k kVar = this.f477917d;
        android.view.ViewTreeObserver viewTreeObserver = kVar.f477926d.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.f477918e);
        }
        kVar.f477926d.removeCallbacks(this.f477919f);
        kVar.f477926d.removeOnAttachStateChangeListener(this);
    }
}
