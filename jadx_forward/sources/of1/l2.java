package of1;

/* loaded from: classes8.dex */
public class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f426495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ of1.m2 f426496f;

    public l2(of1.m2 m2Var, java.lang.String str, int i17) {
        this.f426496f = m2Var;
        this.f426494d = str;
        this.f426495e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f426496f.f426508e;
        if (nVar != null) {
            nVar.o0(this.f426494d, this.f426495e);
        }
    }
}
