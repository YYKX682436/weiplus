package m36;

/* loaded from: classes14.dex */
public class d implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f404918e;

    public d(java.lang.String str, boolean z17) {
        this.f404917d = str;
        this.f404918e = z17;
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, this.f404917d);
        thread.setDaemon(this.f404918e);
        return thread;
    }
}
