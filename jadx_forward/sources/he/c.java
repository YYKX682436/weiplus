package he;

/* loaded from: classes7.dex */
public abstract class c implements m3.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f362190a = new java.util.concurrent.ConcurrentLinkedQueue();

    @Override // m3.e
    public java.lang.Object a() {
        java.lang.Object poll = this.f362190a.poll();
        return poll == null ? new yd.s(null) : poll;
    }

    @Override // m3.e
    public boolean b(java.lang.Object obj) {
        return this.f362190a.offer(obj);
    }
}
