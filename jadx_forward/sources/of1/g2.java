package of1;

/* loaded from: classes8.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f426456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f426457f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f426458g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ of1.m2 f426459h;

    public g2(of1.m2 m2Var, java.lang.String str, long j17, int i17, float f17) {
        this.f426459h = m2Var;
        this.f426455d = str;
        this.f426456e = j17;
        this.f426457f = i17;
        this.f426458g = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar;
        of1.m2 m2Var = this.f426459h;
        if (m2Var.f426508e == null || (wVar = m2Var.f426509f) == null || !wVar.c().f(42)) {
            return;
        }
        m2Var.f426508e.C(this.f426455d, this.f426456e, this.f426457f, this.f426458g);
    }
}
