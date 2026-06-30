package pm0;

/* loaded from: classes8.dex */
public final class h implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pm0.g f438305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f438306e;

    public h(pm0.g gVar, android.view.View view) {
        this.f438305d = gVar;
        this.f438306e = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        this.f438305d.onLayoutChange(null, 0, 0, 0, 0, 0, 0, 0, 0);
        this.f438306e.removeOnLayoutChangeListener(this.f438305d);
    }
}
