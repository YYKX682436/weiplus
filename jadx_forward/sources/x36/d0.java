package x36;

/* loaded from: classes16.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x36.c0 f533197a = new x36.c0(new byte[0], 0, 0, false, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f533198b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference[] f533199c;

    static {
        int highestOneBit = java.lang.Integer.highestOneBit((java.lang.Runtime.getRuntime().availableProcessors() * 2) - 1);
        f533198b = highestOneBit;
        java.util.concurrent.atomic.AtomicReference[] atomicReferenceArr = new java.util.concurrent.atomic.AtomicReference[highestOneBit];
        for (int i17 = 0; i17 < highestOneBit; i17++) {
            atomicReferenceArr[i17] = new java.util.concurrent.atomic.AtomicReference();
        }
        f533199c = atomicReferenceArr;
    }

    public static final void a(x36.c0 segment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
        boolean z17 = true;
        if (!(segment.f533195f == null && segment.f533196g == null)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.f533193d) {
            return;
        }
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(currentThread, "Thread.currentThread()");
        java.util.concurrent.atomic.AtomicReference atomicReference = f533199c[(int) (currentThread.getId() & (f533198b - 1))];
        x36.c0 c0Var = (x36.c0) atomicReference.get();
        if (c0Var == f533197a) {
            return;
        }
        int i17 = c0Var != null ? c0Var.f533192c : 0;
        if (i17 >= 65536) {
            return;
        }
        segment.f533195f = c0Var;
        segment.f533191b = 0;
        segment.f533192c = i17 + 8192;
        while (true) {
            if (atomicReference.compareAndSet(c0Var, segment)) {
                break;
            } else if (atomicReference.get() != c0Var) {
                z17 = false;
                break;
            }
        }
        if (z17) {
            return;
        }
        segment.f533195f = null;
    }

    public static final x36.c0 b() {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(currentThread, "Thread.currentThread()");
        java.util.concurrent.atomic.AtomicReference atomicReference = f533199c[(int) (currentThread.getId() & (f533198b - 1))];
        x36.c0 c0Var = f533197a;
        x36.c0 c0Var2 = (x36.c0) atomicReference.getAndSet(c0Var);
        if (c0Var2 == c0Var) {
            return new x36.c0();
        }
        if (c0Var2 == null) {
            atomicReference.set(null);
            return new x36.c0();
        }
        atomicReference.set(c0Var2.f533195f);
        c0Var2.f533195f = null;
        c0Var2.f533192c = 0;
        return c0Var2;
    }
}
