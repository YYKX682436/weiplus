package gi5;

/* loaded from: classes12.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f353832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gp0 f353833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ai5.c f353834f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gi5.g f353835g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mf3.k f353836h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353837i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f353838m;

    public d(java.util.List list, r45.gp0 gp0Var, ai5.c cVar, gi5.g gVar, mf3.k kVar, java.lang.String str, java.lang.Runnable runnable) {
        this.f353832d = list;
        this.f353833e = gp0Var;
        this.f353834f = cVar;
        this.f353835g = gVar;
        this.f353836h = kVar;
        this.f353837i = str;
        this.f353838m = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (java.lang.String str : this.f353832d) {
            c01.h7 h7Var = new c01.h7();
            h7Var.f118764f = this.f353833e.f456964q2;
            ai5.c cVar = this.f353834f;
            h7Var.f118760b = cVar.f86741b;
            h7Var.f118762d = cVar.f86742c;
            ((dk5.s5) tg3.t1.a()).Vi(this.f353835g.m158354x19263085(), str, this.f353836h.g(), 0, "", "", h7Var);
            ((dk5.s5) tg3.t1.a()).Ui(this.f353837i, str);
        }
        ((ku5.t0) ku5.t0.f394148d).B(new gi5.c(this.f353838m, this.f353835g));
    }
}
