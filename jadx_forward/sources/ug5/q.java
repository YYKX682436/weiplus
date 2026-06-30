package ug5;

/* loaded from: classes3.dex */
public final class q implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f509173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug5.i f509174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f509175f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f509176g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ug5.v f509177h;

    public q(android.view.View view, ug5.i iVar, android.view.View view2, android.widget.FrameLayout frameLayout, ug5.v vVar) {
        this.f509173d = view;
        this.f509174e = iVar;
        this.f509175f = view2;
        this.f509176g = frameLayout;
        this.f509177h = vVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.f509173d.removeOnAttachStateChangeListener(this);
        android.view.View view2 = this.f509175f;
        android.content.Context context = view2.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f509174e.a(context, view2, this.f509176g, this.f509177h);
    }
}
