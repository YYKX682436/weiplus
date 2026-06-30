package gy;

/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f359027a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f359028b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Timer f359029c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f359030d;

    public j(yz5.l decibelCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(decibelCallback, "decibelCallback");
        this.f359027a = decibelCallback;
        this.f359028b = jz5.h.b(gy.h.f359025d);
    }

    public final java.util.LinkedList a() {
        return (java.util.LinkedList) ((jz5.n) this.f359028b).mo141623x754a37bb();
    }

    public final synchronized void b() {
        if (this.f359030d) {
            return;
        }
        this.f359030d = true;
        java.util.Timer timer = new java.util.Timer(false);
        timer.schedule(new gy.i(this), 0L, 100L);
        this.f359029c = timer;
    }

    public final synchronized void c() {
        if (this.f359030d) {
            this.f359030d = false;
            java.util.Timer timer = this.f359029c;
            if (timer != null) {
                timer.cancel();
            }
            this.f359029c = null;
            a().clear();
        }
    }
}
