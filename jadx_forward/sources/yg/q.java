package yg;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f543647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 f543648e;

    public q(com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83, java.lang.Runnable runnable) {
        this.f543648e = abstractC4208x204d5c83;
        this.f543647d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f543648e.f130110a == 0) {
            return;
        }
        this.f543647d.run();
    }
}
