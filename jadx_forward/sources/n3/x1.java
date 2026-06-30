package n3;

/* loaded from: classes5.dex */
public final class x1 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f415969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f415970e;

    public x1(android.view.View view, yz5.l lVar) {
        this.f415969d = view;
        this.f415970e = lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f415969d.removeOnAttachStateChangeListener(this);
        this.f415970e.mo146xb9724478(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
