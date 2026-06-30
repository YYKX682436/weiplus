package of1;

/* loaded from: classes8.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f426474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ of1.m2 f426475f;

    public i2(of1.m2 m2Var, java.lang.String str, int i17) {
        this.f426475f = m2Var;
        this.f426473d = str;
        this.f426474e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f426475f.f426508e;
        if (nVar != null) {
            nVar.P(this.f426473d, this.f426474e);
        }
    }
}
