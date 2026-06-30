package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296;

/* loaded from: classes15.dex */
public class t extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v f90524a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v vVar, android.os.Looper looper) {
        super(looper);
        this.f90524a = vVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.w wVar;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v vVar;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.t tVar;
        if (message.what == 1) {
            synchronized (this.f90524a.f90526a) {
                wVar = (p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.w) this.f90524a.f90529d.get();
                vVar = this.f90524a;
                tVar = vVar.f90530e;
            }
            if (wVar == null || vVar != wVar.mo2492x71965dbb() || tVar == null) {
                return;
            }
            wVar.b((c4.o0) message.obj);
            this.f90524a.a(wVar, tVar);
            wVar.b(null);
        }
    }
}
