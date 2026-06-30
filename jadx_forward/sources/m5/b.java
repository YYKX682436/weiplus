package m5;

/* loaded from: classes13.dex */
public class b implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m5.c f405002d;

    public b(m5.c cVar) {
        this.f405002d = cVar;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.f405002d.f405004b.post(runnable);
    }
}
