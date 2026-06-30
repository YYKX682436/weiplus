package km3;

/* loaded from: classes2.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f390774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f390775e;

    public f(android.view.View view, android.view.View view2) {
        this.f390774d = view;
        this.f390775e = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f390774d;
        view.getHitRect(rect);
        rect.left -= i65.a.b(view.getContext(), 20);
        rect.top -= i65.a.b(view.getContext(), 20);
        rect.right += i65.a.b(view.getContext(), 20);
        rect.bottom += i65.a.b(view.getContext(), 20);
        this.f390775e.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
