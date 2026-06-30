package tr5;

/* loaded from: classes13.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f503006a = java.util.Collections.emptyList();

    /* renamed from: b, reason: collision with root package name */
    public java.util.concurrent.CountDownLatch f503007b = null;

    public synchronized tr5.f a(java.lang.Runnable runnable, boolean z17) {
        if (runnable == null) {
            throw new java.lang.IllegalArgumentException("task".concat(" can not be null"));
        }
        if (java.util.Collections.emptyList() == this.f503006a) {
            this.f503006a = new java.util.ArrayList();
        }
        this.f503006a.add(new tr5.e(runnable, z17));
        return this;
    }

    public java.util.concurrent.CountDownLatch b() {
        java.util.concurrent.CountDownLatch countDownLatch = this.f503007b;
        if (countDownLatch == null) {
            java.util.Iterator it = this.f503006a.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                if (!((tr5.e) it.next()).f502991e) {
                    i17++;
                }
            }
            countDownLatch = new java.util.concurrent.CountDownLatch(i17);
        }
        for (tr5.e eVar : this.f503006a) {
            ((lr5.d) lr5.e.f402303c).execute(new tr5.d(eVar, countDownLatch));
        }
        this.f503006a.clear();
        this.f503007b = countDownLatch;
        return countDownLatch;
    }
}
