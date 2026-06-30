package xu5;

/* loaded from: classes12.dex */
public class e extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xu5.o f538837a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(xu5.o oVar, android.os.Looper looper) {
        super(looper);
        this.f538837a = oVar;
    }

    @Override // android.os.Handler
    public void dispatchMessage(android.os.Message message) {
        this.f538837a.mo50277x8245362d(message);
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        this.f538837a.b(message);
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(android.os.Message message, long j17) {
        xu5.o oVar = this.f538837a;
        message.setTarget(oVar.f538865f);
        return oVar.mo50310xc5d0e9df(message, j17);
    }

    @Override // android.os.Handler
    public java.lang.String toString() {
        return this.f538837a.m176002x9616526c();
    }
}
