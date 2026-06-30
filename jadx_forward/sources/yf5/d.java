package yf5;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f543392a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Queue f543393b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f543394c = new java.util.concurrent.atomic.AtomicBoolean(false);

    public d(android.content.Context context, int i17) {
        this.f543392a = context;
        this.f543393b = new java.util.ArrayDeque(i17);
        ((ku5.t0) ku5.t0.f394148d).q(new yf5.b(this));
    }

    public final synchronized android.view.View a() {
        android.view.View view;
        view = (android.view.View) ((java.util.ArrayDeque) this.f543393b).poll();
        if (((java.util.ArrayDeque) this.f543393b).size() < 9 && !this.f543394c.getAndSet(true)) {
            int size = 18 - ((java.util.ArrayDeque) this.f543393b).size();
            ((ku5.t0) ku5.t0.f394148d).q(new yf5.c(size, this));
        }
        if (view == null) {
            view = b();
        }
        return view;
    }

    public final android.view.View b() {
        android.view.View inflate = android.view.LayoutInflater.from(this.f543392a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570222e40, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return inflate;
    }
}
