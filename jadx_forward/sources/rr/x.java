package rr;

/* loaded from: classes13.dex */
public final class x implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rr.z f480688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ va0.n f480689e;

    public x(rr.z zVar, va0.n nVar) {
        this.f480688d = zVar;
        this.f480689e = nVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        rr.z zVar = this.f480688d;
        zVar.f480694h.removeOnAttachStateChangeListener(this);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.p) this.f480689e).r(zVar);
    }
}
