package ei3;

/* loaded from: classes10.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f334528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei3.k0 f334529e;

    public b0(ei3.k0 k0Var, java.lang.Runnable runnable) {
        this.f334529e = k0Var;
        this.f334528d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        ei3.k0.z(this.f334529e, this.f334528d);
    }
}
