package t23;

/* loaded from: classes10.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f496816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t23.x0 f496817e;

    public w0(t23.x0 x0Var, boolean z17) {
        this.f496817e = x0Var;
        this.f496816d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        t23.h hVar = this.f496817e.f496823d;
        t23.j jVar = hVar.f496698n;
        jVar.f496725g.remove(hVar);
        jVar.f496723e++;
        jVar.j();
        if (this.f496816d) {
            jVar.f496719a.d(hVar.f496691d, hVar.f496696i, 12288, null, true, -1, hVar.f496697m);
        }
    }
}
