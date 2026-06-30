package vg0;

/* loaded from: classes8.dex */
public final class e implements ou4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f517981a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f517982b;

    public e(java.lang.ref.WeakReference callbackRef) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackRef, "callbackRef");
        this.f517981a = callbackRef;
        this.f517982b = qc1.e.f76432x24728b;
    }

    @Override // ou4.c0
    public void a(java.util.Map map, ou4.b0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        tg0.q1 q1Var = (tg0.q1) this.f517981a.get();
        if (q1Var != null) {
            ((rx4.e) q1Var).f482668b.m174141x36654fab();
        }
        ou4.b0.c(callback, null, 1, null);
    }

    @Override // ou4.c0
    public java.lang.String b() {
        return this.f517982b;
    }
}
