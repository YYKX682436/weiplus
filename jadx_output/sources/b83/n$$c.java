package b83;

/* loaded from: classes7.dex */
public final /* synthetic */ class n$$c implements java.util.concurrent.ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, "tinker-suicide-sync-check");
    }
}
