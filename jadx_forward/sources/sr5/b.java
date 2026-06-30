package sr5;

/* loaded from: classes13.dex */
public class b extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr5.c f493400d;

    public b(sr5.c cVar) {
        this.f493400d = cVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        sr5.c cVar = this.f493400d;
        cVar.f493401a = null;
        cVar.f493403c.run();
    }
}
