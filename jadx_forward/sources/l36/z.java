package l36;

/* loaded from: classes16.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f397220a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Deque f397221b = new java.util.ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Deque f397222c = new java.util.ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Deque f397223d = new java.util.ArrayDeque();

    public void a(l36.t0 t0Var) {
        java.util.Deque deque = this.f397222c;
        synchronized (this) {
            if (!((java.util.ArrayDeque) deque).remove(t0Var)) {
                throw new java.lang.AssertionError("Call wasn't in-flight!");
            }
        }
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l36.z.b():boolean");
    }
}
