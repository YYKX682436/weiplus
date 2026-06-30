package l85;

/* loaded from: classes12.dex */
public class k1 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        for (java.util.Map.Entry entry : l85.l1.f398725b.entrySet()) {
            long andSet = ((java.util.concurrent.atomic.AtomicLong) entry.getValue()).getAndSet(0L);
            if (andSet > 0) {
                jx3.f.INSTANCE.mo68477x336bdfd8(963L, ((java.lang.Long) entry.getKey()).longValue(), andSet, false);
            }
        }
        l85.l1.f398724a.set(false);
    }
}
