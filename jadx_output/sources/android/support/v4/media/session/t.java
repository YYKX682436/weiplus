package android.support.v4.media.session;

/* loaded from: classes15.dex */
public class t extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.session.v f8991a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.support.v4.media.session.v vVar, android.os.Looper looper) {
        super(looper);
        this.f8991a = vVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        android.support.v4.media.session.w wVar;
        android.support.v4.media.session.v vVar;
        android.support.v4.media.session.t tVar;
        if (message.what == 1) {
            synchronized (this.f8991a.f8993a) {
                wVar = (android.support.v4.media.session.w) this.f8991a.f8996d.get();
                vVar = this.f8991a;
                tVar = vVar.f8997e;
            }
            if (wVar == null || vVar != wVar.getCallback() || tVar == null) {
                return;
            }
            wVar.b((c4.o0) message.obj);
            this.f8991a.a(wVar, tVar);
            wVar.b(null);
        }
    }
}
