package wu3;

/* loaded from: classes.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f531296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f531297e;

    public h1(android.view.View view, int i17) {
        this.f531296d = view;
        this.f531297e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f531296d;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.f531297e);
        view.requestLayout();
    }
}
