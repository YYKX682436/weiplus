package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes3.dex */
public final class a5 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 f92043d;

    public a5(p3325xe03a0797.p3326xc267989b.r2 r2Var) {
        this.f92043d = r2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        v17.removeOnAttachStateChangeListener(this);
        p3325xe03a0797.p3326xc267989b.p2.a(this.f92043d, null, 1, null);
    }
}
