package nt3;

/* loaded from: classes10.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.f f421299d;

    public e(nt3.f fVar) {
        this.f421299d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        nt3.f fVar = this.f421299d;
        fVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Story.GLThread", "destoryGL");
        rs0.i.f480829a.u(fVar.f421311d);
        fVar.f421312e.quit();
        fVar.f421310c.c();
    }
}
