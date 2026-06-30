package p13;

/* loaded from: classes12.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p13.t f432667d;

    public s(p13.t tVar) {
        this.f432667d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        p13.t tVar = this.f432667d;
        o13.x xVar = (o13.x) tVar.f432670p.get();
        if (xVar != null) {
            xVar.X2(tVar.f432669o);
        }
    }
}
