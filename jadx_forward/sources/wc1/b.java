package wc1;

/* loaded from: classes7.dex */
public final class b implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f525995d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f525996e = new java.util.concurrent.atomic.AtomicBoolean(true);

    public final void a() {
        java.util.LinkedList linkedList;
        if (this.f525996e.getAndSet(false)) {
            synchronized (this.f525995d) {
                linkedList = new java.util.LinkedList(this.f525995d);
                this.f525995d.clear();
            }
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable command) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(command, "command");
        if (!this.f525996e.get()) {
            command.run();
            return;
        }
        synchronized (this.f525995d) {
            this.f525995d.offer(command);
        }
    }
}
