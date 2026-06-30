package xi;

/* loaded from: classes12.dex */
public class a implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Toast f536179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xi.b f536180e;

    public a(xi.b bVar, android.widget.Toast toast) {
        this.f536180e = bVar;
        this.f536179d = toast;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        bj.a aVar = this.f536180e.f536181d;
        aVar.f102633a.set(this.f536179d);
        aVar.f102634b.countDown();
        return false;
    }
}
