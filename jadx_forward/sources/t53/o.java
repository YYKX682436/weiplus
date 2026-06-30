package t53;

/* loaded from: classes3.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f497347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f497348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f497349f;

    public o(java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.LinkedList linkedList, yz5.l lVar) {
        this.f497347d = atomicInteger;
        this.f497348e = linkedList;
        this.f497349f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f497347d.incrementAndGet() == 2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkSessionIdAndContact success: ");
            java.util.LinkedList linkedList = this.f497348e;
            sb6.append((java.lang.String) linkedList.get(0));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.PluginGameLife", sb6.toString());
            this.f497349f.mo146xb9724478(linkedList.get(0));
        }
    }
}
