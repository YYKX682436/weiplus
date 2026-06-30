package n72;

/* loaded from: classes14.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n72.q f416795d;

    public j(n72.q qVar) {
        this.f416795d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        n72.q qVar = this.f416795d;
        qVar.E = qVar.f416805d.getBitmap();
        s75.d.b(new n72.l(qVar), "saveFaceBitmap");
    }
}
