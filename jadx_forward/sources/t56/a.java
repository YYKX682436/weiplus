package t56;

/* loaded from: classes13.dex */
public class a implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ThreadFactory f497383d;

    public a(t56.c cVar, java.util.concurrent.ThreadFactory threadFactory) {
        this.f497383d = threadFactory;
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread newThread = this.f497383d.newThread(runnable);
        newThread.setName(newThread.getName() + " (Evictor)");
        return newThread;
    }
}
