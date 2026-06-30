package uw2;

/* loaded from: classes2.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f513232d;

    public n(android.view.View view) {
        this.f513232d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f513232d;
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }
}
