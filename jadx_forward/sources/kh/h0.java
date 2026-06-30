package kh;

/* loaded from: classes12.dex */
public final class h0 implements android.view.Choreographer.VsyncCallback {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.Choreographer.VsyncCallback f389355a;

    public h0(android.view.Choreographer.VsyncCallback callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f389355a = callback;
    }

    /* renamed from: equals */
    public boolean m143421xb2c87fbf(java.lang.Object obj) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f389355a, obj);
    }

    /* renamed from: hashCode */
    public int m143422x8cdac1b() {
        return this.f389355a.hashCode();
    }

    @Override // android.view.Choreographer.VsyncCallback
    public void onVsync(android.view.Choreographer.FrameData data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        kh.b0.f389289f.h(this.f389355a.getClass().getName(), this.f389355a.hashCode(), new kh.g0(this, data));
    }
}
