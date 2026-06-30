package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes11.dex */
public class j implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f93615d = new android.os.Handler(android.os.Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.f93615d.post(runnable);
    }
}
