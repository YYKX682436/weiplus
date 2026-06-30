package zl2;

/* loaded from: classes2.dex */
public final class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f555423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f555424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f555425f;

    public m3(android.view.View view, int i17, int i18) {
        this.f555423d = view;
        this.f555424e = i17;
        this.f555425f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f555423d;
        view.getHitRect(rect);
        rect.inset(-this.f555424e, -this.f555425f);
        java.lang.Object parent = view.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
