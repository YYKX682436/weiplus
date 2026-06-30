package s56;

/* loaded from: classes16.dex */
public class r extends p56.r {

    /* renamed from: h, reason: collision with root package name */
    public boolean f484769h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p56.r f484770i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s56.s f484771m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s56.s sVar, p56.r rVar, p56.r rVar2) {
        super(rVar, true);
        this.f484771m = sVar;
        this.f484770i = rVar2;
    }

    @Override // p56.m
    public void a(java.lang.Object obj) {
        if (this.f484769h) {
            return;
        }
        try {
            this.f484771m.f484772a.a(obj);
            this.f484770i.a(obj);
        } catch (java.lang.Throwable th6) {
            q56.f.d(th6, this, obj);
        }
    }

    @Override // p56.m
    /* renamed from: onCompleted */
    public void mo157868xaa8b332c() {
        if (this.f484769h) {
            return;
        }
        try {
            this.f484771m.f484772a.mo157868xaa8b332c();
            this.f484769h = true;
            this.f484770i.mo157868xaa8b332c();
        } catch (java.lang.Throwable th6) {
            q56.f.c(th6, this);
        }
    }

    @Override // p56.m
    /* renamed from: onError */
    public void mo157869xaf8aa769(java.lang.Throwable th6) {
        p56.r rVar = this.f484770i;
        q56.f.b(th6);
        if (this.f484769h) {
            return;
        }
        this.f484769h = true;
        try {
            this.f484771m.f484772a.mo157869xaf8aa769(th6);
            rVar.mo157869xaf8aa769(th6);
        } catch (java.lang.Throwable th7) {
            q56.f.b(th7);
            rVar.mo157869xaf8aa769(new q56.e(java.util.Arrays.asList(th6, th7)));
        }
    }
}
