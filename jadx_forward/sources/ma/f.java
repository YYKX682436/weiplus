package ma;

/* loaded from: classes14.dex */
public class f implements android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ma.g f406659d;

    public f(ma.g gVar) {
        this.f406659d = gVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what != 0) {
            return false;
        }
        ma.g gVar = this.f406659d;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(message.obj);
        synchronized (gVar.f406661a) {
            throw null;
        }
    }
}
