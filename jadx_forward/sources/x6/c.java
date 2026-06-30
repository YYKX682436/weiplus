package x6;

/* loaded from: classes13.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Queue f533680a;

    public c() {
        char[] cArr = q7.p.f441843a;
        this.f533680a = new java.util.ArrayDeque(20);
    }

    public abstract x6.q a();

    public x6.q b() {
        x6.q qVar = (x6.q) ((java.util.ArrayDeque) this.f533680a).poll();
        return qVar == null ? a() : qVar;
    }

    public void c(x6.q qVar) {
        java.util.Queue queue = this.f533680a;
        if (((java.util.ArrayDeque) queue).size() < 20) {
            ((java.util.ArrayDeque) queue).offer(qVar);
        }
    }
}
