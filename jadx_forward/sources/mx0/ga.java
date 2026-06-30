package mx0;

/* loaded from: classes5.dex */
public final class ga implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.ja f413547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f413548e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f413549f;

    public ga(mx0.ja jaVar, int i17, boolean z17) {
        this.f413547d = jaVar;
        this.f413548e = i17;
        this.f413549f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mx0.ja jaVar = this.f413547d;
        jaVar.f413608d.mo7976xc291bbd2(1, 0);
        dy0.o.a(jaVar.f413608d, this.f413548e, this.f413549f);
    }
}
