package ph1;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public volatile int f435863a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f435864b = new java.util.LinkedList();

    public i(int i17) {
        this.f435863a = i17;
    }

    public void a(java.lang.Runnable runnable) {
        java.util.LinkedList linkedList;
        synchronized (this) {
            if (runnable != null) {
                this.f435864b.addLast(runnable);
            }
            int i17 = this.f435863a - 1;
            this.f435863a = i17;
            if (i17 > 0 || this.f435864b.size() <= 0) {
                linkedList = null;
            } else {
                linkedList = new java.util.LinkedList();
                linkedList.addAll(this.f435864b);
                this.f435864b.clear();
            }
        }
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
        }
    }
}
