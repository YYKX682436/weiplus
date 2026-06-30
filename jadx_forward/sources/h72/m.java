package h72;

/* loaded from: classes14.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h72.n f360982d;

    public m(h72.n nVar) {
        this.f360982d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        h72.s sVar = h72.s.f360997r;
        this.f360982d.f360986g.j("MicroMsg.FaceVideoRecorder", "mediaRecorder stop success", new java.lang.Object[0]);
        synchronized (this.f360982d.f360986g.f361001b) {
            this.f360982d.f360986g.j("MicroMsg.FaceVideoRecorder", "carson: begin to stop" + this.f360982d.f360984e, new java.lang.Object[0]);
            h72.n nVar = this.f360982d;
            nVar.f360986g.f361003d = h72.q.STOPPED;
            com.p314xaae8f345.mm.vfs.w6.h(nVar.f360985f);
            h72.n nVar2 = this.f360982d;
            h72.r rVar = nVar2.f360986g.f361008i;
            if (rVar != null) {
                rVar.a(nVar2.f360984e);
                this.f360982d.f360986g.f361008i = null;
            }
        }
    }
}
