package yw3;

/* loaded from: classes2.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f548238d;

    public c0(android.view.View view) {
        this.f548238d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f548238d;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
    }
}
