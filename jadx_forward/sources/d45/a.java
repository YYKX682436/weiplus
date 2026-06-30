package d45;

/* loaded from: classes2.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f307964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f307965e;

    public a(android.view.View view, android.view.View view2) {
        this.f307964d = view;
        this.f307965e = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f307964d;
        view.getHitRect(rect);
        rect.left -= i65.a.b(view.getContext(), 20);
        rect.top -= i65.a.b(view.getContext(), 20);
        rect.right += i65.a.b(view.getContext(), 20);
        rect.bottom += i65.a.b(view.getContext(), 20);
        this.f307965e.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
