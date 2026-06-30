package jo5;

/* loaded from: classes14.dex */
public final class d implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jo5.i f382473d;

    public d(jo5.i iVar) {
        this.f382473d = iVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.f382473d.b().post(runnable);
    }
}
