package of1;

/* loaded from: classes8.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f426489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ of1.m2 f426490f;

    public k2(of1.m2 m2Var, java.lang.String str, int i17) {
        this.f426490f = m2Var;
        this.f426488d = str;
        this.f426489e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f426490f.f426508e;
        if (nVar != null) {
            nVar.p0(this.f426488d, this.f426489e);
        }
    }
}
