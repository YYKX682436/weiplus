package lw2;

/* loaded from: classes2.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw2.o f403120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f403121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f403122f;

    public n(lw2.o oVar, android.view.View view, android.util.Size size) {
        this.f403120d = oVar;
        this.f403121e = view;
        this.f403122f = size;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f403121e;
        this.f403120d.d(view.getMeasuredWidth(), view.getMeasuredHeight(), this.f403122f);
    }
}
