package bt3;

/* loaded from: classes9.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs3.t f105916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bt3.t1 f105917e;

    public r1(bt3.t1 t1Var, zs3.t tVar) {
        this.f105917e = t1Var;
        this.f105916d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f105917e.f105944e.remove(this.f105916d);
    }
}
