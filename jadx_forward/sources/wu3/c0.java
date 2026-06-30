package wu3;

/* loaded from: classes.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f531252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f531253e;

    public c0(android.view.View view, int i17) {
        this.f531252d = view;
        this.f531253e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f531252d;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.f531253e);
        view.requestLayout();
    }
}
