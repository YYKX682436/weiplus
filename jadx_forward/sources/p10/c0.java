package p10;

/* loaded from: classes7.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f432465a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f432466b;

    /* renamed from: c, reason: collision with root package name */
    public final p10.y f432467c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f432468d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f432469e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f432470f;

    public c0(android.app.Activity activity, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 handler, p10.y callbacks) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbacks, "callbacks");
        this.f432465a = activity;
        this.f432466b = handler;
        this.f432467c = callbacks;
        this.f432470f = new p10.z(this);
    }

    public final void a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        java.lang.Runnable runnable = this.f432470f;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f432466b;
        n3Var.mo50300x3fa464aa(runnable);
        java.lang.Runnable runnable2 = this.f432469e;
        if (runnable2 != null) {
            n3Var.mo50300x3fa464aa(runnable2);
        }
        java.lang.ref.WeakReference weakReference = this.f432468d;
        if (weakReference == null || (u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) weakReference.get()) == null) {
            return;
        }
        u3Var.dismiss();
    }
}
