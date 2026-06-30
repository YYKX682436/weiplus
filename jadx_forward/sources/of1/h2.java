package of1;

/* loaded from: classes8.dex */
public class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f426467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ of1.m2 f426468f;

    public h2(of1.m2 m2Var, java.lang.String str, int i17) {
        this.f426468f = m2Var;
        this.f426466d = str;
        this.f426467e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f426468f.f426508e;
        if (nVar != null) {
            nVar.Q(this.f426466d, this.f426467e);
        }
    }
}
