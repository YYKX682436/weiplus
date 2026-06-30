package hc2;

/* loaded from: classes2.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f361864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f361865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f361866f;

    public n(android.view.View view, int i17, int i18) {
        this.f361864d = view;
        this.f361865e = i17;
        this.f361866f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f361864d;
        view.getHitRect(rect);
        rect.inset(-this.f361865e, -this.f361866f);
        java.lang.Object parent = view.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
