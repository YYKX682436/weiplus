package my2;

/* loaded from: classes3.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f414305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f414306e;

    public x(android.view.View view, float f17) {
        this.f414305d = view;
        this.f414306e = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f414305d;
        float f17 = this.f414306e;
        view.setScaleX(f17);
        view.setScaleY(f17);
        view.setPivotX(0.0f);
    }
}
