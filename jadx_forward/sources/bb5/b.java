package bb5;

/* loaded from: classes15.dex */
public class b implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb5.g f100659d;

    public b(bb5.g gVar) {
        this.f100659d = gVar;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        while (true) {
            bb5.g gVar = this.f100659d;
            if (gVar.f100665c.size() <= 0) {
                return true;
            }
            gVar.f100667e.a((java.lang.String) gVar.f100665c.removeFirst());
        }
    }
}
