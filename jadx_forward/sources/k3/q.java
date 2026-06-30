package k3;

/* loaded from: classes13.dex */
public class q implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f385342d;

    /* renamed from: e, reason: collision with root package name */
    public final int f385343e;

    public q(java.lang.String str, int i17) {
        this.f385342d = str;
        this.f385343e = i17;
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new k3.p(runnable, this.f385342d, this.f385343e);
    }
}
