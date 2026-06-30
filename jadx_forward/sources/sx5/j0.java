package sx5;

/* loaded from: classes13.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f495275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f495276e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f495277f;

    public j0(sx5.a1 a1Var, double d17, double d18) {
        this.f495277f = a1Var;
        this.f495275d = d17;
        this.f495276e = d18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f495277f.u((int) this.f495275d, (int) this.f495276e);
    }
}
