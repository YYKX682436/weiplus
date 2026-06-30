package cp0;

/* loaded from: classes15.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final cp0.n f302278a;

    public f(cp0.n weakHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakHolder, "weakHolder");
        this.f302278a = weakHolder;
    }

    public final void a(java.lang.Object obj, cp0.b waitUI) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(waitUI, "waitUI");
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            waitUI.a(b(obj, this.f302278a));
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new cp0.e(waitUI, this, obj));
        }
    }

    public abstract boolean b(java.lang.Object obj, cp0.n nVar);

    public abstract int c();

    public abstract void d(cp0.n nVar, vo0.h hVar);
}
