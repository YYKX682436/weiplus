package lm5;

/* loaded from: classes16.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gm5.a f401136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f401137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.RuntimeException f401138f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ lm5.h f401139g;

    public f(lm5.h hVar, gm5.a aVar, java.lang.Object obj, java.lang.RuntimeException runtimeException) {
        this.f401139g = hVar;
        this.f401136d = aVar;
        this.f401137e = obj;
        this.f401138f = runtimeException;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f401139g.f401141b != null) {
            km5.h hVar = (km5.h) this.f401139g.f401141b;
            hVar.getClass();
            java.lang.ThreadLocal threadLocal = km5.r.f390898b.f390899a;
            java.util.Stack stack = (java.util.Stack) threadLocal.get();
            if (stack == null) {
                stack = new java.util.Stack();
                threadLocal.set(stack);
            }
            stack.push(hVar.f390855a);
        }
        try {
            java.lang.Object mo1059x2e7a5e = this.f401136d.mo1059x2e7a5e(this.f401137e);
            if (this.f401139g.f401141b != null) {
                km5.h hVar2 = (km5.h) this.f401139g.f401141b;
                hVar2.getClass();
                ((java.util.Stack) km5.r.f390898b.f390899a.get()).pop();
                synchronized (hVar2.f390855a) {
                    km5.q qVar = hVar2.f390855a;
                    km5.m mVar = qVar.f390886o;
                    qVar.f390886o = null;
                    if (!qVar.f390883i) {
                        hVar2.f390855a.A(mo1059x2e7a5e);
                    }
                    hVar2.f390855a.getClass();
                    if (hVar2.f390855a.f390879e == km5.p.Interrupted) {
                        jm5.b.b("Vending.Pipeline", "interrupted, just return", new java.lang.Object[0]);
                        return;
                    }
                    if (hVar2.f390855a.f390879e == km5.p.Pausing) {
                        jm5.b.b("Vending.Pipeline", "pausing, just return.", new java.lang.Object[0]);
                        return;
                    }
                    jm5.b.b("Vending.Pipeline", "last one resolved, dequeue next.", new java.lang.Object[0]);
                    hVar2.f390855a.f390879e = km5.p.Resolved;
                    synchronized (hVar2.f390855a) {
                    }
                    hVar2.f390855a.d();
                }
            }
        } catch (java.lang.ClassCastException e17) {
            this.f401138f.initCause(e17);
            throw this.f401138f;
        }
    }
}
