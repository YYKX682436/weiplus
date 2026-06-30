package bt3;

/* loaded from: classes9.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs3.t f24383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bt3.t1 f24384e;

    public r1(bt3.t1 t1Var, zs3.t tVar) {
        this.f24384e = t1Var;
        this.f24383d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f24384e.f24411e.remove(this.f24383d);
    }
}
