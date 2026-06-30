package n3;

/* loaded from: classes14.dex */
public class q0 extends n3.p0 {

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f415923b;

    public q0(android.view.View view) {
        super(view);
        this.f415923b = view;
    }

    @Override // n3.p0, n3.r0
    public void a() {
        android.view.View view = this.f415923b;
        android.view.WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.a();
            return;
        }
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        android.view.WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new android.view.WindowInsetsController.OnControllableInsetsChangedListener() { // from class: n3.q0$$a
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(android.view.WindowInsetsController windowInsetsController2, int i17) {
                atomicBoolean.set((i17 & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        if (!atomicBoolean.get() && view != null) {
            ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        windowInsetsController.hide(android.view.WindowInsets.Type.ime());
    }

    @Override // n3.p0, n3.r0
    public void b() {
        android.view.View view = this.f415923b;
        if (view != null && android.os.Build.VERSION.SDK_INT < 33) {
            ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        android.view.WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController != null) {
            windowInsetsController.show(android.view.WindowInsets.Type.ime());
        } else {
            super.b();
        }
    }
}
