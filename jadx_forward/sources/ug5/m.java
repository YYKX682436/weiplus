package ug5;

/* loaded from: classes3.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug5.v f509164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f509165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f509166f;

    public m(ug5.v vVar, android.view.Window window, android.widget.FrameLayout frameLayout) {
        this.f509164d = vVar;
        this.f509165e = window;
        this.f509166f = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.SurfaceView surfaceView;
        if (this.f509164d.f509191a.f509120a == ug5.b.f509115e) {
            android.content.Context context = this.f509165e.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            android.util.TypedValue typedValue = new android.util.TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.windowIsTranslucent, typedValue, true);
            if (!(typedValue.data != 0) || (surfaceView = (android.view.SurfaceView) this.f509166f.findViewById(com.p314xaae8f345.mm.R.id.r8u)) == null) {
                return;
            }
            surfaceView.setVisibility(8);
        }
    }
}
