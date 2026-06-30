package m31;

/* loaded from: classes2.dex */
public final class x implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f404762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f404763e;

    public x(android.view.View view, yz5.a aVar) {
        this.f404762d = view;
        this.f404763e = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.View view = this.f404762d;
        if (view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f404763e.mo152xb9724478();
        return false;
    }
}
