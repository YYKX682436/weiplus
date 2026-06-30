package nt3;

/* loaded from: classes10.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.f f421291d;

    public d(nt3.f fVar) {
        this.f421291d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        nt3.f fVar = this.f421291d;
        fVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Story.GLThread", "draw");
        nt3.f0 f0Var = fVar.f421310c;
        if (f0Var != null) {
            f0Var.b();
        }
        rs0.g gVar = rs0.i.f480829a;
        rs0.h hVar = fVar.f421311d;
        gVar.x(hVar.f480825a, hVar.f480826b);
    }
}
