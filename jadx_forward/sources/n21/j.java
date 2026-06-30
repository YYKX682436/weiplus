package n21;

/* loaded from: classes8.dex */
public class j implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n21.o f415804d;

    public j(n21.o oVar) {
        this.f415804d = oVar;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        if (gm0.j1.d().f152304n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SpeexUploadCore", "skiped resume speex uploader, not foreground");
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = this.f415804d.f415810a;
        synchronized (i6Var.f274277f) {
            i6Var.f274273b = false;
            synchronized (i6Var.f274277f) {
                i6Var.f274277f.notifyAll();
            }
        }
        return false;
    }
}
