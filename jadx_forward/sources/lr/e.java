package lr;

/* loaded from: classes15.dex */
public final class e implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lr.g f402043d;

    public e(lr.g gVar) {
        this.f402043d = gVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        lr.g gVar = this.f402043d;
        lr.g.j(gVar).f(gVar.f402054f);
        if (lr.g.j(gVar).c()) {
            lr.g.j(gVar).e();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        lr.g gVar = this.f402043d;
        lr.g.j(gVar).d(gVar.f402054f);
    }
}
