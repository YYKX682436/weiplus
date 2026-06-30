package rt5;

/* loaded from: classes12.dex */
public class b implements rt5.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f481078a = java.util.concurrent.Executors.newSingleThreadExecutor();

    @Override // rt5.a
    /* renamed from: submit */
    public void mo126587xcadc4018(java.lang.Runnable runnable) {
        this.f481078a.submit(runnable);
    }
}
