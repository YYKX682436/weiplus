package bb5;

/* loaded from: classes15.dex */
public class b implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb5.g f19126d;

    public b(bb5.g gVar) {
        this.f19126d = gVar;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        while (true) {
            bb5.g gVar = this.f19126d;
            if (gVar.f19132c.size() <= 0) {
                return true;
            }
            gVar.f19134e.a((java.lang.String) gVar.f19132c.removeFirst());
        }
    }
}
