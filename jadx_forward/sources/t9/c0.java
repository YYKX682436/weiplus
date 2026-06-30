package t9;

/* loaded from: classes13.dex */
public final class c0 implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f498029d;

    public c0(java.lang.String str) {
        this.f498029d = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, this.f498029d);
    }
}
