package n21;

/* loaded from: classes8.dex */
public class l implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n21.m f415806d;

    public l(n21.m mVar) {
        this.f415806d = mVar;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        n21.o oVar = this.f415806d.f415807d;
        oVar.f415810a.a(new n21.k(this));
        return false;
    }
}
