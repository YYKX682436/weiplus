package vg0;

/* loaded from: classes8.dex */
public final class f implements ou4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f517983a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f517984b;

    public f(java.lang.ref.WeakReference callbackRef) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackRef, "callbackRef");
        this.f517983a = callbackRef;
        this.f517984b = "nextFrameRenderFinishedCallback";
    }

    @Override // ou4.c0
    public void a(java.util.Map map, ou4.b0 callback) {
        android.view.ViewGroup viewGroup;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        tg0.q1 q1Var = (tg0.q1) this.f517983a.get();
        if (q1Var != null && (viewGroup = ((rx4.e) q1Var).f482668b.f266174e) != null) {
            viewGroup.setVisibility(0);
        }
        ou4.b0.c(callback, null, 1, null);
    }

    @Override // ou4.c0
    public java.lang.String b() {
        return this.f517984b;
    }
}
