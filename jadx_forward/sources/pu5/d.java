package pu5;

/* loaded from: classes12.dex */
public final class d extends java.lang.Thread {
    @Override // java.lang.Thread
    public void interrupt() {
        super.interrupt();
        pu5.f.f440003a.remove(java.lang.Long.valueOf(getId()));
        ku5.o.f394131b.a(this, getName(), getId());
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        super.start();
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = pu5.f.f440003a;
        if (!concurrentLinkedQueue.contains(java.lang.Long.valueOf(getId()))) {
            concurrentLinkedQueue.add(java.lang.Long.valueOf(getId()));
        }
        ku5.o.f394131b.c(this, getName(), getId());
    }
}
