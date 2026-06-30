package gf;

/* loaded from: classes7.dex */
public final class w1 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.a2 f352718d;

    public w1(gf.a2 a2Var) {
        this.f352718d = a2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        v17.post(new gf.v1(this.f352718d));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
    }
}
