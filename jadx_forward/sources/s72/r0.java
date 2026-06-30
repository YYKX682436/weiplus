package s72;

/* loaded from: classes11.dex */
public final class r0 {

    /* renamed from: b, reason: collision with root package name */
    public static s72.r0 f485676b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f485677a = new java.util.LinkedList();

    public static s72.r0 a() {
        if (f485676b == null) {
            synchronized (s72.r0.class) {
                if (f485676b == null) {
                    f485676b = new s72.r0();
                }
            }
        }
        return f485676b;
    }

    public void b() {
        synchronized (this.f485677a) {
            java.util.Iterator it = this.f485677a.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q) ((s72.q0) it.next())).h();
            }
        }
    }
}
